package dev.sefiraat.cultivation.api.slimefun.items.bushes;

import dev.sefiraat.cultivation.Cultivation;
import dev.sefiraat.cultivation.api.interfaces.CultivationHarvestable;
import dev.sefiraat.cultivation.api.slimefun.plant.Growth;
import io.github.bakedlibs.dough.collections.RandomizedSet;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.OverridingMethodsMustInvokeSuper;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * This bush can be harvested by right-clicking with an open hand
 * The bush then reverts to its first stage.
 */
public class HarvestableBush extends CultivationBush implements CultivationHarvestable {

    /*
        TODO Plants and Bushes now behave so similarly they can likely be made generic.
            Remembering:
            Plants have LevelProfiles, bushes do not
            Max Growth Stages need to be taken better care of, while noting 0 and 1 have unique effects.
     */
    private final RandomizedSet<ItemStack> harvestItems = new RandomizedSet<>();

    @ParametersAreNonnullByDefault
    public HarvestableBush(SlimefunItemStack item, Growth growth) {
        super(item, growth);
    }

    @Override
    public void whenPlaced(@NotNull BlockPlaceEvent event) {
        super.whenPlaced(event);
        addDisplayBush(event.getBlock().getLocation());
        event.getBlock().setType(Material.AIR);
    }

    @Nonnull
    public HarvestableBush addHarvestingResult(@Nonnull ItemStack harvestStack) {
        return addHarvestingResult(harvestStack, 1);
    }

    @Nonnull
    public HarvestableBush addHarvestingResult(@Nonnull ItemStack harvestStack, int weight) {
        this.harvestItems.add(harvestStack, weight);
        return this;
    }

    @Nonnull
    @Override
    public RandomizedSet<ItemStack> getHarvestingResults() {
        return this.harvestItems;
    }

    @Override
    @OverridingMethodsMustInvokeSuper
    protected boolean validateFlora() {
        if (this.harvestItems.isEmpty()) {
            Cultivation.logWarning(this.getId() + " has no ItemStack for harvesting, it will not be registered.");
            return false;
        }
        return true;
    }
}
