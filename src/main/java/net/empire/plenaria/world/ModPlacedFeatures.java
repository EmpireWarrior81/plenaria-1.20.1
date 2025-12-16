package net.empire.plenaria.world;

import net.empire.plenaria.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

//TODO This is for datagen option

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> AVOCADO_TREE_PLACED =
            registerKey("avocado_tree_placed");

    public static final RegistryKey<PlacedFeature> PATCH_WILD_CORN_PLACED =
            registerKey("patch_wild_corn_placed");

    public static final RegistryKey<PlacedFeature> PATCH_WILD_CORN_DRY_PLACED =
            registerKey("patch_wild_corn_dry_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {

        var configuredLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        var avocadoConfigured = configuredLookup.getOrThrow(ModConfiguredFeatures.AVOCADO_TREE);
        var cornConfigured = configuredLookup.getOrThrow(ModConfiguredFeatures.PATCH_WILD_CORN);
        var cornDryConfigured = configuredLookup.getOrThrow(ModConfiguredFeatures.PATCH_WILD_CORN_DRY);


        List<PlacementModifier> modifiers = VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(0, 0.1f, 1),
                ModBlocks.AVOCADO_SAPLING
        );

        context.register(
                AVOCADO_TREE_PLACED,
                new PlacedFeature(avocadoConfigured, modifiers)
        );

        List<PlacementModifier> cornModifiers = List.of(
                RarityFilterPlacementModifier.of(100), //Note for myself, lower is more, higher is less
                SquarePlacementModifier.of(),
                PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        context.register(
                PATCH_WILD_CORN_PLACED,
                new PlacedFeature(cornConfigured, cornModifiers)
        );

        List<PlacementModifier> cornDryModifiers = List.of(
                RarityFilterPlacementModifier.of(200),
                SquarePlacementModifier.of(),
                PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        context.register(
                PATCH_WILD_CORN_DRY_PLACED,
                new PlacedFeature(cornDryConfigured, cornDryModifiers)
        );


    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(
                RegistryKeys.PLACED_FEATURE,
                new Identifier("plenaria", name)
        );
    }
}
