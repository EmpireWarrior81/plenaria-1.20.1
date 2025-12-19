package net.empire.plenaria.item;

import net.empire.plenaria.Plenaria;
import net.empire.plenaria.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


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
            new BowlReturningFoodItem(new Item.Settings().food(ModFoods.CREAMED_CORN)));
    public static final Item HEARTY_SALAD = registerItem("hearty_salad",
            new BowlReturningFoodItem(new Item.Settings().food(ModFoods.HEARTY_SALAD)));
    public static final Item SPICY_CURRY = registerItem("spicy_curry",
            new BowlReturningFoodItem(new Item.Settings().food(ModFoods.SPICY_CURRY)));
    public static final Item POACHED_EGGPLANTS = registerItem("poached_eggplants",
            new BowlReturningFoodItem(new Item.Settings().food(ModFoods.POACHED_EGGPLANTS)));
    public static final Item EGGPLANT_PARMESAN = registerItem("eggplant_parmesan",
            new BowlReturningFoodItem(new Item.Settings().food(ModFoods.EGGPLANT_PARMESAN)));
    public static final Item EGGPLANT_BURGER = registerItem("eggplant_burger",
            new BowlReturningFoodItem(new Item.Settings().food(ModFoods.EGGPLANT_BURGER)));

    public static final Item CHICKEN_TACO = registerItem("chicken_taco",
            new Item(new FabricItemSettings().food(ModFoods.CHICKEN_TACO)));
    public static final Item PORK_WRAP = registerItem("pork_wrap",
            new Item(new FabricItemSettings().food(ModFoods.PORK_WRAP)));
    public static final Item FISH_TACO = registerItem("fish_taco",
            new Item(new FabricItemSettings().food(ModFoods.FISH_TACO)));


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
