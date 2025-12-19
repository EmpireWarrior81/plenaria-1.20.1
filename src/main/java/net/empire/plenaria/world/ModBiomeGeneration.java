package net.empire.plenaria.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModBiomeGeneration {

    public static void generateBiomes() {


        //wild_patches

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.PATCH_WILD_CORN_PLACED
        );

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.SAVANNA, BiomeKeys.SAVANNA_PLATEAU),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.PATCH_WILD_CORN_DRY_PLACED
        );

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.PATCH_WILD_EGGPLANTS_PLACED
        );

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.MANGROVE_SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.PATCH_WILD_CUCUMBERS_PLACED
        );


        //trees

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.SPARSE_JUNGLE, BiomeKeys.JUNGLE,
                        BiomeKeys.BAMBOO_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.AVOCADO_TREE_PLACED
        );


    }
}
