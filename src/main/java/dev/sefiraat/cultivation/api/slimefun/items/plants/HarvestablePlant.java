package dev.sefiraat.cultivation.api.slimefun.items.plants;

import dev.sefiraat.cultivation.Cultivation;
import dev.sefiraat.cultivation.api.interfaces.CultivationHarvestable;
import dev.sefiraat.cultivation.api.slimefun.plant.Growth;
import io.github.bakedlibs.dough.collections.RandomizedSet;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.settings.DoubleRangeSetting;
import io.github.thebusybiscuit.slimefun4.api.items.settings.IntRangeSetting;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.OverridingMethodsMustInvokeSuper;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Locale;
import java.util.Optional;

public class HarvestablePlant extends CultivationPlant implements CultivationHarvestable {

    private static final String KEY_GROWTH_RATE = "growth-rate";
    private final RandomizedSet<ItemStack> harvestItems = new RandomizedSet<>();

    @ParametersAreNonnullByDefault
    public HarvestablePlant(SlimefunItemStack item, Growth growth) {
        super(item, growth);
        addItemSetting(new DoubleRangeSetting(this, KEY_GROWTH_RATE, 0.001, growth.getGrowthRate(), 1D));
        Optional<ItemSetting<Double>> doubleOptional = getItemSetting(KEY_GROWTH_RATE, double.class);
        doubleOptional.ifPresent(doubleItemSetting -> this.growth.setGrowthRate(doubleItemSetting.getValue()));
    }

    @Nonnull
    public HarvestablePlant addHarvestingResult(@Nonnull ItemStack harvestStack) {
        return addHarvestingResult(harvestStack, 1);
    }

    @Nonnull
    public HarvestablePlant addHarvestingResult(@Nonnull ItemStack harvestStack, int weight) {
        String amountKey = "drop-" + harvestStack.getType().name().toLowerCase(Locale.ROOT) + "-amount";
        String weightKey = "drop-" + harvestStack.getType().name().toLowerCase(Locale.ROOT) + "-weight";
        int defaultAmount = harvestStack.getAmount();

        addItemSetting(new IntRangeSetting(this, amountKey, 1, defaultAmount, 64));
        addItemSetting(new IntRangeSetting(this, weightKey, 1, weight, 999));

        Optional<ItemSetting<Integer>> setAmount = getItemSetting(amountKey, int.class);
        Optional<ItemSetting<Integer>> setWeight = getItemSetting(weightKey, int.class);

        int finalAmount = setAmount.map(ItemSetting::getValue).orElse(defaultAmount);
        int finalWeight = setWeight.map(ItemSetting::getValue).orElse(weight);

        harvestStack.setAmount(finalAmount);

        this.harvestItems.add(harvestStack, finalWeight);
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
            Cultivation.logWarning(this.getId() + " has no ItemStack(s) for harvesting, it will not be registered.");
            return false;
        }
        return true;
    }
}
