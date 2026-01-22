package net.empire.plenaria.datagen;

import net.empire.plenaria.block.ModBlocks;
import net.empire.plenaria.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CUCUMBER_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGGPLANT_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN_KERNELS, Models.GENERATED);


        itemModelGenerator.register(ModItems.AVOCADO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUCUMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGGPLANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMOKED_EGGPLANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMOKED_WHITE_EGGPLANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_EGGPLANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN_COB, Models.GENERATED);
        itemModelGenerator.register(ModItems.GINGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SQUID, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_SQUID, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOW_SQUID, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_CALAMARI, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_CALAMARI, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUT_AVOCADO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUT_CUCUMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUT_PICKLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUT_EGGPLANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMOKED_CUT_EGGPLANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIDORI_ROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIDORI_ROLL_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_ROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKEN_ROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKEN_ROLL_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUFFERFISH_ROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.TROPICAL_ROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RICE_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CALAMARI_ROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN_DOUGH, Models.GENERATED);
        itemModelGenerator.register(ModItems.TORTILLA, Models.GENERATED);
        itemModelGenerator.register(ModItems.POPCORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TORTILLA_CHIPS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELOTE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMPANADA, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEEF_BURRITO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUTTON_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.AVOCADO_TOAST, Models.GENERATED);
        itemModelGenerator.register(ModItems.CREAMED_CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEARTY_SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPICY_CURRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.POACHED_EGGPLANTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKEN_TACO, Models.GENERATED);
        itemModelGenerator.register(ModItems.PORK_WRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.FISH_TACO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMOKED_TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGGPLANT_BURGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGGPLANT_PARMESAN, Models.GENERATED);


        itemModelGenerator.register(ModItems.FIERY_FONDUE, Models.GENERATED);
        itemModelGenerator.register(ModItems.VEGETABLE_OMELET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CREAMY_ONION_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESY_PASTA, Models.GENERATED);
        itemModelGenerator.register(ModItems.HORROR_LASAGNA, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCARLET_PIEROGI, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIZZA_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUICHE_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAM_AND_CHEESE_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.KIMCHI, Models.GENERATED);
        itemModelGenerator.register(ModItems.JERKY, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKLED_PICKLES, Models.GENERATED);
        itemModelGenerator.register(ModItems.KIPPERS, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCOA_FUDGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_BERRY_JAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOW_BERRY_MARMALADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLE_JELLY, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLAXEN_CHEESE_WEDGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCARLET_CHEESE_WEDGE, Models.GENERATED);





        itemModelGenerator.register(ModItems.BRONZE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.BRONZE_KNIFE, Models.HANDHELD);
    }
}
