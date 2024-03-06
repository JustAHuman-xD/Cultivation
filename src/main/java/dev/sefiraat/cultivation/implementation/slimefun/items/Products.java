package dev.sefiraat.cultivation.implementation.slimefun.items;

import dev.sefiraat.cultivation.Cultivation;
import dev.sefiraat.cultivation.api.slimefun.RecipeTypes;
import dev.sefiraat.cultivation.api.slimefun.groups.CultivationGroups;
import dev.sefiraat.cultivation.api.slimefun.items.produce.ProduceCore;
import dev.sefiraat.cultivation.api.slimefun.items.produce.ProduceVanilla;
import dev.sefiraat.cultivation.implementation.slimefun.CultivationStacks;
import org.bukkit.Material;

public final class Products {

    private Products() {
        throw new IllegalStateException("Utility class");
    }

    // region Grown/found produce

    public static final ProduceCore BANANA = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.BANANA,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore LEMON = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.LEMON,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore ORANGE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.ORANGE,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore GREEN_APPLE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.GREEN_APPLE,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore PINEAPPLE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.PINEAPPLE,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore MANGO = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.MANGO,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore PEACH = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.PEACH,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore APRICOT = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.APRICOT,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore PEAR = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.PEAR,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CHERRY = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CHERRY,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore KIWI = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.KIWI,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore LIME = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.LIME,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CHESTNUT = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CHESTNUT,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore HAZELNUT = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.HAZELNUT,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore PECAN = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.PECAN,
        RecipeTypes.TREE
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore GRAPE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.GRAPE,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore STRAWBERRY = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.STRAWBERRY,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore PEANUT = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.PEANUT,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore RICE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.RICE,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore GARLIC = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.GARLIC,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CAYENNE_PEPPER = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CAYENNE_PEPPER,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore TOMATO = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.TOMATO,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore BELL_PEPPER = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.BELL_PEPPER,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore ONION = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.ONION,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore PEA = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.PEA,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore RAPESEED = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.RAPESEED,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore LETTUCE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.LETTUCE,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore MUSTARD_SEEDS = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.MUSTARD_SEEDS,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore BROCCOLI = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.BROCCOLI,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CINNAMON = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CINNAMON,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore BASIL = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.BASIL,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore BAY_LEAF = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.BAY_LEAF,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CILANTRO = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CILANTRO,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CHICORY = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CHICORY,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CHIVES = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CHIVES,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CLOVE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CLOVE,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CUMIN = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CUMIN,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CHILLI_PEPPER = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CHILLI_PEPPER,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CURRY_LEAF = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CURRY_LEAF,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore DILL = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.DILL,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore FENNEL = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.FENNEL,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore GINGER = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.GINGER,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore HORSERADISH = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.HORSERADISH,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore JASMINE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.JASMINE,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore JUNIPER_BERRY = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.JUNIPER_BERRY,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore KAFFIR_LIME = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.KAFFIR_LIME,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore LAVENDER = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.LAVENDER,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore LICORICE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.LICORICE,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore MACE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.MACE,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore MARJORAM = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.MARJORAM,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore MINT = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.MINT,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore OREGANO = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.OREGANO,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore PARSLEY = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.PARSLEY,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore ROSEMARY = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.ROSEMARY,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore SASSAFRAS = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.SASSAFRAS,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore SHISO = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.SHISO,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore STAR_ANISE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.STAR_ANISE,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore TARRAGON = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.TARRAGON,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore THYME = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.THYME,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore TURMERIC = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.TURMERIC,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore VANILLA = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.VANILLA,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore WASABI = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.WASABI,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore ARTICHOKE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.ARTICHOKE,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore AUBERGINE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.AUBERGINE,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore ASPARAGUS = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.ASPARAGUS,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore BRUSSELS_SPROUTS = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.BRUSSELS_SPROUTS,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CABBAGE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CABBAGE,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CAULIFLOWER = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CAULIFLOWER,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CELERY = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CELERY,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore KALE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.KALE,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore SPINACH = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.SPINACH,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore BLACK_BEANS = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.BLACK_BEANS,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore GREEN_BEANS = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.GREEN_BEANS,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CHICKPEAS = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CHICKPEAS,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore SOY_BEANS = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.SOY_BEANS,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore PINTO_BEANS = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.PINTO_BEANS,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore RUNNER_BEANS = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.RUNNER_BEANS,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore NETTLES = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.NETTLES,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore OKRA = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.OKRA,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore LEEK = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.LEEK,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore SHALLOT = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.SHALLOT,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore JALAPENO = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.JALAPENO,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore RADICCHIO = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.RADICCHIO,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore RHUBARB = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.RHUBARB,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CELERIAC = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CELERIAC,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore PARSNIP = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.PARSNIP,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore RUTABAGA = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.RUTABAGA,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore RADDISH = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.RADDISH,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore SWEET_POTATO = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.SWEET_POTATO,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore TURNIP = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.TURNIP,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore SWEETCORN = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.SWEETCORN,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore COURGETTE = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.COURGETTE,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore CUCUMBER = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.CUCUMBER,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore MARROW = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.MARROW,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore AVOCADO = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.AVOCADO,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore GREEN_ONION = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.GREEN_ONION,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    public static final ProduceCore BLACK_PEPPER = new ProduceCore(
        CultivationGroups.HIDDEN_CONTENT,
        CultivationStacks.BLACK_PEPPER,
        RecipeTypes.BUSH
    ).buildRegister(Cultivation.getInstance());

    // endregion

    // region Vanilla Registrations

    public static final ProduceVanilla BEEF = new ProduceVanilla(Material.BEEF);
    public static final ProduceVanilla CHICKEN = new ProduceVanilla(Material.CHICKEN);
    public static final ProduceVanilla PORK = new ProduceVanilla(Material.PORKCHOP);
    public static final ProduceVanilla MUTTON = new ProduceVanilla(Material.MUTTON);
    public static final ProduceVanilla RABBIT = new ProduceVanilla(Material.RABBIT);
    public static final ProduceVanilla COD = new ProduceVanilla(Material.COD);
    public static final ProduceVanilla SALMON = new ProduceVanilla(Material.SALMON);
    public static final ProduceVanilla APPLE = new ProduceVanilla(Material.APPLE);
    public static final ProduceVanilla SWEET_BERRY = new ProduceVanilla(Material.SWEET_BERRIES);
    public static final ProduceVanilla GLOW_BERRY = new ProduceVanilla(Material.GLOW_BERRIES);
    public static final ProduceVanilla BEETROOT = new ProduceVanilla(Material.BEETROOT);
    public static final ProduceVanilla GOLDEN_APPLE = new ProduceVanilla(Material.GOLDEN_APPLE);
    public static final ProduceVanilla NOTCH_APPLE = new ProduceVanilla(Material.ENCHANTED_GOLDEN_APPLE);
    public static final ProduceVanilla CARROT = new ProduceVanilla(Material.CARROT);
    public static final ProduceVanilla GOLDEN_CARROT = new ProduceVanilla(Material.GOLDEN_CARROT);
    public static final ProduceVanilla EGG = new ProduceVanilla(Material.EGG);
    public static final ProduceVanilla POTATO = new ProduceVanilla(Material.POTATO);
    public static final ProduceVanilla CHORUS_FRUIT = new ProduceVanilla(Material.CHORUS_FRUIT);
    public static final ProduceVanilla MELON = new ProduceVanilla(Material.MELON);
    public static final ProduceVanilla PUMPKIN = new ProduceVanilla(Material.PUMPKIN);
    public static final ProduceVanilla ROTTEN_FLESH = new ProduceVanilla(Material.ROTTEN_FLESH);
    public static final ProduceVanilla COCOA = new ProduceVanilla(Material.COCOA_BEANS);
    public static final ProduceVanilla BROWN_MUSHROOM = new ProduceVanilla(Material.BROWN_MUSHROOM);
    public static final ProduceVanilla RED_MUSHROOM = new ProduceVanilla(Material.RED_MUSHROOM);
    public static final ProduceVanilla WHEAT = new ProduceVanilla(Material.WHEAT);
    public static final ProduceVanilla PUFFERFISH = new ProduceVanilla(Material.PUFFERFISH);
    public static final ProduceVanilla BREAD = new ProduceVanilla(Material.BREAD);
    public static final ProduceVanilla SUGAR = new ProduceVanilla(Material.SUGAR);
    public static final ProduceVanilla SEAWEED = new ProduceVanilla(Material.KELP);

    // endregion

    public static void setup(Cultivation addon) {

    }
}
