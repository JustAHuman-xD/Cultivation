package dev.sefiraat.cultivation.api.slimefun.items;

import com.google.common.base.Preconditions;
import dev.sefiraat.cultivation.api.interfaces.CultivationFlora;
import dev.sefiraat.cultivation.api.slimefun.plant.Growth;
import dev.sefiraat.cultivation.implementation.listeners.CustomPlacementListener;
import dev.sefiraat.cultivation.implementation.utils.Keys;
import dev.sefiraat.sefilib.misc.ParticleUtils;
import dev.sefiraat.sefilib.string.Theme;
import dev.sefiraat.sefilib.world.LocationUtils;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import javax.annotation.OverridingMethodsMustInvokeSuper;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public abstract class CultivationFloraItem<T extends CultivationFloraItem<T>> extends SlimefunItem
    implements CultivationFlora, NotPlaceable {

    @Nonnull
    protected final Map<Location, UUID> ownerCache = new HashMap<>();
    @Nonnull
    protected Growth growth;

    protected CultivationFloraItem(ItemGroup itemGroup,
                                   SlimefunItemStack item,
                                   @Nonnull Growth growth
    ) {
        super(itemGroup, item, RecipeType.NULL, new ItemStack[0]);
        this.growth = growth;
    }

    @Override
    public void postRegister() {
        new BlockMenuPreset(this.getId(), this.getItemName()) {

            @Override
            public void init() {
                setSize(9);
                addMenuOpeningHandler(HumanEntity::closeInventory);
            }

            @Override
            public boolean canOpen(@Nonnull Block block, @Nonnull Player player) {
                return true;
            }

            @Override
            public int[] getSlotsAccessedByItemTransport(ItemTransportFlow itemTransportFlow) {
                return new int[0];
            }

            @Override
            public void newInstance(@Nonnull BlockMenu menu, @Nonnull Block block) {
                String owner = BlockStorage.getLocationInfo(block.getLocation(), Keys.FLORA_OWNER);
                if (owner != null) {
                    UUID uuid = UUID.fromString(owner);
                    addOwner(block.getLocation(), uuid);
                }
            }
        };
        setHidden(true);
    }

    public void addOwner(@Nonnull Location location, @Nonnull UUID uuid) {
        ownerCache.put(location, uuid);
    }

    @Nonnull
    public UUID getOwner(@Nonnull Location location) {
        UUID uuid = ownerCache.get(location);
        // Owner cannot be null if called correctly
        Preconditions.checkNotNull(uuid, "Owner is null, has this been called correctly");
        return uuid;
    }

    protected void growthDisplay(@Nonnull Location location) {
        ParticleUtils.displayParticleRandomly(LocationUtils.centre(location), 0.5, 4, getTheme().getDustOptions(1f));
    }

    @Nonnull
    @Override
    public Theme getTheme() {
        return growth.getTheme().getTheme();
    }

    @Nonnull
    @Override
    public Set<Material> getPlacements() {
        return growth.getPlacements();
    }

    @Override
    public double getDefaultGrowthRate() {
        return growth.getGrowthRate();
    }

    /**
     * This method is fired when the block is placed
     * see {@link CustomPlacementListener}
     *
     * @param event The {@link BlockPlaceEvent} triggered from the block placement
     */
    @Override
    @OverridingMethodsMustInvokeSuper
    public void whenPlaced(@Nonnull BlockPlaceEvent event) {
        final Block block = event.getBlock();
        final Block blockBelow = block.getRelative(BlockFace.DOWN);
        final Location location = block.getLocation();

        if (getPlacements().contains(blockBelow.getType())) {
            final UUID uuid = event.getPlayer().getUniqueId();
            BlockStorage.addBlockInfo(location, Keys.FLORA_GROWTH_STAGE, "0");
            BlockStorage.addBlockInfo(location, Keys.FLORA_OWNER, uuid.toString());
            ownerCache.put(location, uuid);
            return;
        }
        // Can't be placed here so cancel the event
        event.setCancelled(true);
    }

    public boolean isMature(@Nonnull Block block) {
        return isMature(block.getLocation());
    }

    @Override
    public boolean isMature(@Nonnull Location location) {
        final String stage = BlockStorage.getLocationInfo(location, Keys.FLORA_GROWTH_STAGE);
        if (stage == null) {
            return false;
        }
        final int growthStage = Integer.parseInt(stage);
        return growthStage >= getMaxGrowthStages();
    }

    /**
     * Tries to register the flora (if it passes validation) first into the Registry, then its
     * breeding pairs and finally with Slimefun.
     *
     * @param addon The addon registering this Flora
     */
    public T tryRegister(@Nonnull SlimefunAddon addon) {
        if (validateFlora()) {
            register(addon);
        }
        return (T) this;
    }

    /**
     * This method should validate a flora's fields have been initialised correctly
     * before it's registered. This will also set the Display item used.
     * Be sure to call super() if extending further
     */
    @OverridingMethodsMustInvokeSuper
    protected abstract boolean validateFlora();

}
