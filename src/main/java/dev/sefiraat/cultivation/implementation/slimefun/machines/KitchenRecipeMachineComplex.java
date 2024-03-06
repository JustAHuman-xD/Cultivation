package dev.sefiraat.cultivation.implementation.slimefun.machines;

import dev.sefiraat.sefilib.entity.display.DisplayGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;
import java.util.function.Function;

public abstract class KitchenRecipeMachineComplex extends KitchenObject {

    protected KitchenRecipeMachineComplex(ItemGroup itemGroup,
                                          SlimefunItemStack item,
                                          RecipeType recipeType,
                                          ItemStack[] recipe,
                                          Function<Location, DisplayGroup> displayGroupFunction
    ) {
        super(itemGroup, item, recipeType, recipe, displayGroupFunction);
    }

    public void addRecipe(@Nonnull ItemStack[] inputs, @Nonnull ItemStack output) {
        getRecipes().put(inputs, output);
    }

    @Nullable
    public ItemStack testRecipe(@Nonnull ItemStack[] input) {
        for (Map.Entry<ItemStack[], ItemStack> entry : this.getRecipes().entrySet()) {
            ItemStack[] itemStacks = entry.getKey();
            int misses = 0;
            for (int i = 0; i < itemStacks.length; i++) {
                ItemStack inputStack = input[i];
                ItemStack recipeStack = itemStacks[i];
                if (!SlimefunUtils.isItemSimilar(inputStack, recipeStack, false)) {
                    misses++;
                }
            }
            if (misses == 0) {
                return entry.getValue().clone();
            }
        }
        return null;
    }

    @Nonnull
    protected abstract Map<ItemStack[], ItemStack> getRecipes();
}
