package dev.sefiraat.cultivation.implementation.slimefun.machines;

import dev.sefiraat.sefilib.entity.display.DisplayGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Location;
import org.bukkit.entity.Display;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;
import java.util.function.Function;

public abstract class KitchenRecipeMachineSimple extends KitchenObject {

    protected KitchenRecipeMachineSimple(ItemGroup itemGroup,
                                         SlimefunItemStack item,
                                         RecipeType recipeType,
                                         ItemStack[] recipe,
                                         Function<Location, DisplayGroup> displayGroupFunction
    ) {
        super(itemGroup, item, recipeType, recipe, displayGroupFunction);
    }

    public void addRecipe(@Nonnull String input, @Nonnull ItemStack output) {
        getRecipes().put(input, output);
    }

    @Nullable
    public ItemStack testRecipe(@Nonnull String input) {
        ItemStack itemStack = getRecipes().get(input);
        if (itemStack == null) {
            return null;
        }
        return itemStack.clone();
    }

    @Nonnull
    protected abstract Map<String, ItemStack> getRecipes();
}
