package net.empire.plenaria.item;

import net.empire.plenaria.Plenaria;
import net.empire.plenaria.block.ModBlocks;
import net.empire.plenaria.item.custom.JamJarItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import vectorwing.farmersdelight.common.item.ConsumableItem;


public class  ModItems {
    public static final Item CUCUMBER_SEEDS = registerItem("cucumber_seeds",
            new AliasedBlockItem(ModBlocks.CUCUMBERS, new FabricItemSettings()));
    public static final Item CORN_KERNELS = registerItem("corn_kernels",
            new AliasedBlockItem(ModBlocks.CORN, new FabricItemSettings()));
    public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds",
            new AliasedBlockItem(ModBlocks.EGGPLANTS, new FabricItemSettings()));



    public static final Item AVOCADO = registerItem("avocado",
            new Item(new FabricItemSettings().food(ModFoods.AVOCADO)));
    public static final Item CUCUMBER = registerItem("cucumber",
            new Item(new FabricItemSettings().food(ModFoods.CUCUMBER)));
    public static final Item PICKLE = registerItem("pickle",
            new Item(new FabricItemSettings().food(ModFoods.PICKLE)));
    public static final Item EGGPLANT = registerItem("eggplant",
            new Item(new FabricItemSettings().food(ModFoods.EGGPLANT)));
    public static final Item SMOKED_TOMATO = registerItem("smoked_tomato",
            new Item(new FabricItemSettings().food(ModFoods.SMOKED_TOMATO)));
    public static final Item SMOKED_EGGPLANT = registerItem("smoked_eggplant",
            new Item(new FabricItemSettings().food(ModFoods.SMOKED_EGGPLANT)));
    public static final Item SMOKED_WHITE_EGGPLANT = registerItem("smoked_white_eggplant",
            new Item(new FabricItemSettings().food(ModFoods.SMOKED_WHITE_EGGPLANT)));
    public static final Item WHITE_EGGPLANT = registerItem("white_eggplant",
            new Item(new FabricItemSettings().food(ModFoods.WHITE_EGGPLANT)));
    public static final Item CORN_COB = registerItem("corn_cob",
            new Item(new FabricItemSettings().food(ModFoods.CORN_COB)));
    public static final Item GINGER = registerItem("ginger",
            new Item(new FabricItemSettings().food(ModFoods.GINGER)));
    public static final Item SQUID = registerItem("squid",
            new Item(new FabricItemSettings().food(ModFoods.SQUID)));
    public static final Item COOKED_SQUID = registerItem("cooked_squid",
            new Item(new FabricItemSettings().food(ModFoods.COOKED_SQUID)));
    public static final Item GLOW_SQUID = registerItem("glow_squid",
            new Item(new FabricItemSettings().food(ModFoods.GLOW_SQUID)));
    public static final Item RAW_CALAMARI = registerItem("raw_calamari",
            new Item(new FabricItemSettings().food(ModFoods.RAW_CALAMARI)));
    public static final Item COOKED_CALAMARI = registerItem("cooked_calamari",
            new Item(new FabricItemSettings().food(ModFoods.COOKED_CALAMARI)));
    public static final Item CUT_AVOCADO = registerItem("cut_avocado",
            new Item(new FabricItemSettings().food(ModFoods.CUT_AVOCADO)));
    public static final Item CUT_CUCUMBER = registerItem("cut_cucumber",
            new Item(new FabricItemSettings().food(ModFoods.CUT_CUCUMBER)));
    public static final Item CUT_PICKLE = registerItem("cut_pickle",
            new Item(new FabricItemSettings().food(ModFoods.CUT_PICKLE)));
    public static final Item CUT_EGGPLANT = registerItem("cut_eggplant",
            new Item(new FabricItemSettings().food(ModFoods.CUT_EGGPLANT)));
    public static final Item SMOKED_CUT_EGGPLANT = registerItem("smoked_cut_eggplant",
            new Item(new FabricItemSettings().food(ModFoods.SMOKED_CUT_EGGPLANT)));
    public static final Item MIDORI_ROLL = registerItem("midori_roll",
            new Item(new FabricItemSettings().food(ModFoods.MIDORI_ROLL)));
    public static final Item MIDORI_ROLL_SLICE = registerItem("midori_roll_slice",
            new Item(new FabricItemSettings().food(ModFoods.MIDORI_ROLL_SLICE)));
    public static final Item EGG_ROLL = registerItem("egg_roll",
            new Item(new FabricItemSettings().food(ModFoods.EGG_ROLL)));
    public static final Item CHICKEN_ROLL = registerItem("chicken_roll",
            new Item(new FabricItemSettings().food(ModFoods.CHICKEN_ROLL)));
    public static final Item CHICKEN_ROLL_SLICE = registerItem("chicken_roll_slice",
            new Item(new FabricItemSettings().food(ModFoods.CHICKEN_ROLL_SLICE)));
    public static final Item PUFFERFISH_ROLL = registerItem("pufferfish_roll",
            new Item(new FabricItemSettings().food(ModFoods.PUFFERFISH_ROLL)));
    public static final Item TROPICAL_ROLL = registerItem("tropical_roll",
            new Item(new FabricItemSettings().food(ModFoods.TROPICAL_ROLL)));
    public static final Item RICE_BALL = registerItem("rice_ball",
            new Item(new FabricItemSettings().food(ModFoods.RICE_BALL)));
    public static final Item CALAMARI_ROLL = registerItem("calamari_roll",
            new Item(new FabricItemSettings().food(ModFoods.CALAMARI_ROLL)));


    public static final Item CORN_DOUGH = registerItem("corn_dough",
            new Item(new FabricItemSettings().food(ModFoods.CORN_DOUGH)));
    public static final Item TORTILLA = registerItem("tortilla",
            new Item(new FabricItemSettings().food(ModFoods.TORTILLA)));
    public static final Item POPCORN = registerItem("popcorn",
            new Item(new FabricItemSettings().food(ModFoods.POPCORN)));
    public static final Item TORTILLA_CHIPS = registerItem("tortilla_chips",
            new Item(new FabricItemSettings().food(ModFoods.TORTILLA_CHIPS)));
    public static final Item ELOTE = registerItem("elote",
            new Item(new FabricItemSettings().food(ModFoods.ELOTE)));
    public static final Item EMPANADA = registerItem("empanada",
            new Item(new FabricItemSettings().food(ModFoods.EMPANADA)));
    public static final Item BEEF_BURRITO = registerItem("beef_burrito",
            new Item(new FabricItemSettings().food(ModFoods.BEEF_BURRITO)));
    public static final Item MUTTON_SANDWICH = registerItem("mutton_sandwich",
            new Item(new FabricItemSettings().food(ModFoods.MUTTON_SANDWICH)));
    public static final Item AVOCADO_TOAST = registerItem("avocado_toast",
            new Item(new FabricItemSettings().food(ModFoods.AVOCADO_TOAST)));

    public static final Item CREAMED_CORN = registerItem("creamed_corn",
            new BowlReturningFoodItem(new Item.Settings().maxCount(16).food(ModFoods.CREAMED_CORN), null));
    public static final Item HEARTY_SALAD = registerItem("hearty_salad",
            new BowlReturningFoodItem(new Item.Settings().maxCount(16).food(ModFoods.HEARTY_SALAD),
                    "tooltip.plenaria.hearty_salad.nourishment"));
    public static final Item SPICY_CURRY = registerItem("spicy_curry",
            new BowlReturningFoodItem(new Item.Settings().maxCount(16).food(ModFoods.SPICY_CURRY),
                    "tooltip.plenaria.spicy_curry.nourishment"));
    public static final Item POACHED_EGGPLANTS = registerItem("poached_eggplants",
            new BowlReturningFoodItem(new Item.Settings().maxCount(16).food(ModFoods.POACHED_EGGPLANTS),
                    "tooltip.plenaria.poached_eggplants.nourishment"));
    public static final Item EGGPLANT_PARMESAN = registerItem("eggplant_parmesan",
            new BowlReturningFoodItem(new Item.Settings().maxCount(16).food(ModFoods.EGGPLANT_PARMESAN),
                    "tooltip.plenaria.eggplant_parmesan.nourishment"));
    public static final Item EGGPLANT_BURGER = registerItem("eggplant_burger",
            new Item(new Item.Settings().food(ModFoods.EGGPLANT_BURGER)));

    public static final Item CHICKEN_TACO = registerItem("chicken_taco",
            new Item(new FabricItemSettings().food(ModFoods.CHICKEN_TACO)));
    public static final Item PORK_WRAP = registerItem("pork_wrap",
            new Item(new FabricItemSettings().food(ModFoods.PORK_WRAP)));
    public static final Item FISH_TACO = registerItem("fish_taco",
            new Item(new FabricItemSettings().food(ModFoods.FISH_TACO)));

// new part of the mods and is using new method (perhaps better) for registering bowl meals

    public static final Item VEGETABLE_OMELET = registerItem("vegetable_omelet",
            new ConsumableItem(new FabricItemSettings()
                    .maxCount(16).food(ModFoods.VEGETABLE_OMELET).recipeRemainder(Items.BOWL), true));
    public static final Item CREAMY_ONION_SOUP = registerItem("creamy_onion_soup",
            new ConsumableItem(new FabricItemSettings()
                    .maxCount(16).food(ModFoods.CREAMY_ONION_SOUP).recipeRemainder(Items.BOWL), true));
    public static final Item CHEESY_PASTA = registerItem("cheesy_pasta",
            new ConsumableItem(new FabricItemSettings()
                    .maxCount(16).food(ModFoods.CHEESY_PASTA).recipeRemainder(Items.BOWL), true));
    public static final Item HORROR_LASAGNA = registerItem("horror_lasagna",
            new ConsumableItem(new FabricItemSettings()
                    .maxCount(16).food(ModFoods.HORROR_LASAGNA).recipeRemainder(Items.BOWL), true));
    public static final Item SCARLET_PIEROGI = registerItem("scarlet_pierogi",
            new ConsumableItem(new FabricItemSettings()
                    .maxCount(16).food(ModFoods.SCARLET_PIEROGI).recipeRemainder(Items.BOWL), true));

    public static final Item FIERY_FONDUE = registerItem("fiery_fondue",
            new ConsumableItem(new FabricItemSettings()
            .maxCount(16).food(ModFoods.FIERY_FONDUE).recipeRemainder(Items.BOWL), true));


    public static final Item PIZZA_SLICE = registerItem("pizza_slice",
            new Item(new FabricItemSettings().food(ModFoods.PIZZA_SLICE)));
    public static final Item QUICHE_SLICE = registerItem("quiche_slice",
            new Item(new FabricItemSettings().food(ModFoods.QUICHE_SLICE)));

    public static final Item HAM_AND_CHEESE_SANDWICH = registerItem("ham_and_cheese_sandwich",
            new Item(new FabricItemSettings().food(ModFoods.HAM_AND_CHEESE_SANDWICH)));

    public static final Item KIMCHI = registerItem("kimchi",
            new Item(new FabricItemSettings().food(ModFoods.KIMCHI)));
    public static final Item JERKY = registerItem("jerky",
            new Item(new FabricItemSettings().food(ModFoods.JERKY)));
    public static final Item PICKLED_PICKLES = registerItem("pickled_pickles",
            new Item(new FabricItemSettings().food(ModFoods.PICKLED_PICKLES)));
    public static final Item KIPPERS = registerItem("kippers",
            new Item(new FabricItemSettings().food(ModFoods.KIPPERS)));
    public static final Item COCOA_FUDGE = registerItem("cocoa_fudge",
            new ConsumableItem(new FabricItemSettings().food(ModFoods.COCOA_FUDGE)));

    public static final Item SWEET_BERRY_JAM = registerItem("sweet_berry_jam",
            new JamJarItem(new FabricItemSettings().maxCount(16).recipeRemainder(Items.GLASS_BOTTLE)
                    .food(ModFoods.SWEET_BERRY_JAM)));
    public static final Item GLOW_BERRY_MARMALADE = registerItem("glow_berry_marmalade",
            new JamJarItem(new FabricItemSettings().maxCount(16).recipeRemainder(Items.GLASS_BOTTLE)
                    .food(ModFoods.GLOW_BERRY_MARMALADE)));
    public static final Item APPLE_JELLY = registerItem("apple_jelly",
            new JamJarItem(new FabricItemSettings().maxCount(16).recipeRemainder(Items.GLASS_BOTTLE)
                    .food(ModFoods.APPLE_JELLY)));


    public static final Item FLAXEN_CHEESE_WEDGE = registerItem("flaxen_cheese_wedge",
            new Item(new FabricItemSettings().food(ModFoods.FLAXEN_CHEESE)));
    public static final Item SCARLET_CHEESE_WEDGE = registerItem("scarlet_cheese_wedge",
            new Item(new FabricItemSettings().food(ModFoods.SCARLET_CHEESE)));


    public static final Item TANKARD = registerItem("tankard",
            new Item(new FabricItemSettings()));

    //TODO In near future need to delete these two or add support for the knife with my other mod

    public static final Item BRONZE_INGOT =registerItem("bronze_ingot",
            new Item(new FabricItemSettings()));

    public static final KnifeItem BRONZE_KNIFE = registerItem("bronze_knife",
            new KnifeItem(ModToolMaterial.BRONZE, new FabricItemSettings().maxDamage(180)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }

    private static <T extends Item> T registerItem(String name, T item) {
        return Registry.register(Registries.ITEM, new Identifier(Plenaria.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Plenaria.LOGGER.info("Registering ModItems for Plenaria " + Plenaria.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
