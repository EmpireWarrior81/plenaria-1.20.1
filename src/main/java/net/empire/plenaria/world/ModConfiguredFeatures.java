package net.empire.plenaria.world;

import net.empire.plenaria.block.ModBlocks;
import net.empire.plenaria.block.custom.FruitingLeaves;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.util.math.intprovider.ConstantIntProvider;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> AVOCADO_TREE = registerKey("avocado_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_WILD_CORN = registerKey("patch_wild_corn");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_WILD_CORN_DRY = registerKey("patch_wild_corn_dry");



    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        // tree feature: jungle-like logs + weighted leaves (some fruiting leaves)
        TreeFeatureConfig config = new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.AVOCADO_LOG),
                new StraightTrunkPlacer(3, 2, 0),
                BlockStateProvider.of(ModBlocks.AVOCADO_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        )
                .ignoreVines()
                .build();

        context.register(AVOCADO_TREE, new ConfiguredFeature<>(Feature.TREE, config));

        RandomPatchFeatureConfig cornConfig = new RandomPatchFeatureConfig(
                        64,
                        6,
                        3,
                        PlacedFeatures.createEntry(
                                Feature.SIMPLE_BLOCK,
                                new SimpleBlockFeatureConfig(
                                        BlockStateProvider.of(ModBlocks.WILD_CORN)
                                )
                        )
                );

        context.register(PATCH_WILD_CORN, new ConfiguredFeature<>(Feature.RANDOM_PATCH, cornConfig));

        RandomPatchFeatureConfig cornDryConfig = new RandomPatchFeatureConfig(
                        32,
                        5,
                        2,
                        PlacedFeatures.createEntry(
                                Feature.SIMPLE_BLOCK,
                                new SimpleBlockFeatureConfig(
                                        BlockStateProvider.of(ModBlocks.WILD_CORN_DRY)
                                )
                        )
                );

        context.register(PATCH_WILD_CORN_DRY, new ConfiguredFeature<>(Feature.RANDOM_PATCH, cornDryConfig));



    }

    private static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier("plenaria", name));
    }
}
