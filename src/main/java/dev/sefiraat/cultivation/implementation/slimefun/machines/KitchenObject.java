package dev.sefiraat.cultivation.implementation.slimefun.machines;

import dev.sefiraat.sefilib.entity.display.DisplayGroup;
import dev.sefiraat.sefilib.slimefun.blocks.DisplayGroupBlock;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.Set;
import java.util.function.Function;

public abstract class KitchenObject extends DisplayGroupBlock {

    public static final Set<Material> BUCKET_ITEMS = Set.of(
        Material.BUCKET,
        Material.AXOLOTL_BUCKET,
        Material.COD_BUCKET,
        Material.LAVA_BUCKET,
        Material.MILK_BUCKET,
        Material.POWDER_SNOW_BUCKET,
        Material.PUFFERFISH_BUCKET,
        Material.SALMON_BUCKET,
        Material.TADPOLE_BUCKET,
        Material.TROPICAL_FISH_BUCKET,
        Material.WATER_BUCKET
    );

    protected KitchenObject(ItemGroup itemGroup,
                            SlimefunItemStack item,
                            RecipeType recipeType,
                            ItemStack[] recipe,
                            Function<Location, DisplayGroup> displayGroupFunction
    ) {
        super(itemGroup, item, recipeType, recipe, displayGroupFunction);
    }

    @Override
    public void preRegister() {
        super.preRegister();
    }

    public static boolean isBucket(@Nonnull ItemStack itemStack) {
        return isBucket(itemStack.getType());
    }

    public static boolean isBucket(@Nonnull Material material) {
        return BUCKET_ITEMS.contains(material);
    }

    @Nonnull
    @Override
    protected Material getBaseMaterial() {
        return Material.BARRIER;
    }
}
