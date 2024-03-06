package dev.sefiraat.cultivation.api.slimefun.items.plants;

import dev.sefiraat.cultivation.Registry;
import dev.sefiraat.cultivation.api.datatypes.FloraLevelProfileDataType;
import dev.sefiraat.cultivation.api.datatypes.instances.FloraLevelProfile;
import dev.sefiraat.cultivation.api.interfaces.CultivationCroppable;
import dev.sefiraat.cultivation.api.interfaces.CultivationFlora;
import dev.sefiraat.cultivation.api.interfaces.CultivationLevelProfileHolder;
import dev.sefiraat.cultivation.api.interfaces.CultivationPlantHolder;
import dev.sefiraat.cultivation.api.slimefun.RecipeTypes;
import dev.sefiraat.cultivation.api.slimefun.groups.CultivationGroups;
import dev.sefiraat.cultivation.api.slimefun.items.CultivationFloraItem;
import dev.sefiraat.cultivation.api.slimefun.plant.BreedingPair;
import dev.sefiraat.cultivation.api.slimefun.plant.Growth;
import dev.sefiraat.sefilib.entity.display.DisplayInteractable;
import dev.sefiraat.sefilib.string.Theme;
import io.github.bakedlibs.dough.data.persistent.PersistentDataAPI;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import org.bukkit.Location;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This class is used to define a CultivationPlant that will grow as a {@link CultivationFlora}
 */
public abstract class CultivationPlant extends CultivationFloraItem<CultivationPlant>
    implements CultivationFlora, CultivationLevelProfileHolder, CultivationCroppable, CultivationPlantHolder,
               DisplayInteractable {

    @Nonnull
    protected Set<BreedingPair> breedingPairs = new HashSet<>();

    @ParametersAreNonnullByDefault
    protected CultivationPlant(SlimefunItemStack item, Growth growth) {
        this(item, RecipeTypes.PLANT_BREEDING, new ItemStack[0], growth);
    }

    @ParametersAreNonnullByDefault
    protected CultivationPlant(SlimefunItemStack item,
                               RecipeType recipeType,
                               ItemStack[] recipe,
                               Growth growth
    ) {
        this(item, recipeType, recipe, growth, null);
    }

    @ParametersAreNonnullByDefault
    protected CultivationPlant(SlimefunItemStack item,
                               RecipeType recipeType,
                               ItemStack[] recipe,
                               Growth growth,
                               @Nullable ItemStack recipeOutput
    ) {
        super(CultivationGroups.HIDDEN_CONTENT, item, growth);
    }

    @Override
    public void preRegister() {
        super.preRegister();
        addItemHandler(
            new BlockBreakHandler(false, false) {
                @Override
                @ParametersAreNonnullByDefault
                public void onPlayerBreak(BlockBreakEvent blockBreakEvent, ItemStack itemStack, List<ItemStack> list) {
                    onBreak(blockBreakEvent);
                }
            }
        );
    }

    @Override
    public void whenPlaced(@NotNull BlockPlaceEvent event) {
        super.whenPlaced(event);

        Location location = event.getBlock().getLocation();
        ItemStack itemStack = event.getItemInHand();
        ItemMeta itemMeta = itemStack.getItemMeta();

        FloraLevelProfile profile = PersistentDataAPI.get(
            itemMeta,
            FloraLevelProfileDataType.KEY,
            FloraLevelProfileDataType.TYPE,
            new FloraLevelProfile(1, 1, 1, false)
        );

        setLevelProfile(location, profile);
        PROFILE_MAP.put(location, profile);
    }

    @OverridingMethodsMustInvokeSuper
    public void onBreak(@NotNull BlockBreakEvent event) {
        Location location = event.getBlock().getLocation();
        ItemStack itemToDrop = getDroppedItemStack(location);
        removeCropped(location);
        removePlant(location);
        location.getWorld().dropItem(location.clone().add(0.5, 0.5, 0.5), itemToDrop);
        removeLevelProfile(location);
        event.setDropItems(false);
    }

    public ItemStack getDroppedItemStack(@Nonnull Location location) {
        return getStack(this, getLevelProfile(location));
    }

    public double getGrowthRate(@Nonnull FloraLevelProfile profile) {
        return getDefaultGrowthRate() * profile.getLevel();
    }

    /**
     * Adds a possible BreedingPair that will result in this seed as a child.
     * Can have multiple pairs resulting in the same child.
     *
     * @param mother       The ID of the potential Mother
     * @param father       The ID of the potential Mother
     * @param breedChance  The chance for the breed to return this plant
     * @param spreadChance The chance that the Mother will spread
     * @return Returns self
     */
    @Nonnull
    @ParametersAreNonnullByDefault
    public CultivationPlant addBreedingPair(String mother, String father, double breedChance, double spreadChance) {
        this.breedingPairs.add(new BreedingPair(this, mother, father, breedChance, spreadChance));
        return this;
    }

    /**
     * Gets all the possible ways this plant can be bred
     *
     * @return The {@link Set} of {@link BreedingPair}s this plant can be bred from
     */
    @Nonnull
    public Set<BreedingPair> getBreedingPairs() {
        return this.breedingPairs;
    }

    @Override
    public int getMaxGrowthStages() {
        return 2;
    }

    @Override
    public CultivationPlant tryRegister(@NotNull SlimefunAddon addon) {
        Registry.getInstance().addPlant(this);
        return super.tryRegister(addon);
    }

    public static ItemStack getStack(@Nonnull CultivationPlant plant, @Nonnull FloraLevelProfile profile) {
        ItemStack itemToDrop = plant.getItem().clone();
        ItemMeta itemMeta = itemToDrop.getItemMeta();

        PersistentDataAPI.set(
            itemMeta,
            FloraLevelProfileDataType.KEY,
            FloraLevelProfileDataType.TYPE,
            profile
        );

        if (profile.isAnalyzed()) {
            List<String> lore = itemMeta.getLore();
            lore.add("");
            lore.add(Theme.CLICK_INFO.asTitle("Drop Level", profile.getLevel()));
            lore.add(Theme.CLICK_INFO.asTitle("Speed", profile.getSpeed()));
            lore.add(Theme.CLICK_INFO.asTitle("Breed Strength", profile.getStrength()));
            itemMeta.setLore(lore);
        }

        itemToDrop.setItemMeta(itemMeta);
        return itemToDrop;
    }
}
