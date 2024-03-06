package dev.sefiraat.cultivation.implementation.slimefun.machines;

import dev.sefiraat.sefilib.entity.display.DisplayGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class RightClickKitchenMachine extends KitchenRecipeMachineSimple {

    private final Map<String, ItemStack> recipes = new HashMap<>();

    public RightClickKitchenMachine(ItemGroup itemGroup,
                                    SlimefunItemStack item,
                                    RecipeType recipeType,
                                    ItemStack[] recipe,
                                    Function<Location, DisplayGroup> displayGroupFunction
    ) {
        super(itemGroup, item, recipeType, recipe, displayGroupFunction);
    }

    @Nonnull
    @Override
    protected Map<String, ItemStack> getRecipes() {
        return recipes;
    }

}
