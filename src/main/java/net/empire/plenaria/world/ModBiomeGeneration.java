package net.empire.plenaria.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModBiomeGeneration {

    public static void generateBiomes() {

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.PATCH_WILD_CORN_PLACED
        );

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.SAVANNA, BiomeKeys.SAVANNA_PLATEAU),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.PATCH_WILD_CORN_DRY_PLACED
        );


/*
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.AVOCADO_TREE_PLACED
        );
*/

    }
}
