package dev.sefiraat.cultivation.api.slimefun.groups;

import dev.sefiraat.cultivation.Cultivation;
import dev.sefiraat.cultivation.implementation.utils.Keys;
import dev.sefiraat.sefilib.slimefun.itemgroup.DummyItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;

/**
 * This class is used to store the ItemGroups used in this addon
 */
public final class CultivationGroups {

    private CultivationGroups() {
        throw new IllegalStateException("Utility class");
    }

    public static final DummyItemGroup HIDDEN_CONTENT = new DummyItemGroup(
        Keys.newKey("hidden"),
        new CustomItemStack(
            Material.BARRIER,
            "Hidden",
            "Items that should not be accessed directly."
        )
    );

    static {
        Cultivation plugin = Cultivation.getInstance();
        HIDDEN_CONTENT.register(plugin);
    }
}
