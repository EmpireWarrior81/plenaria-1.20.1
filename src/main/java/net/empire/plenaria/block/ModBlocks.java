package net.empire.plenaria.block;

import net.empire.plenaria.Plenaria;
import net.empire.plenaria.block.custom.*;
import net.empire.plenaria.item.ModItems;
import net.empire.plenaria.world.ModTreeGrowers;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import vectorwing.farmersdelight.common.block.WildCropBlock;
import vectorwing.farmersdelight.common.block.FeastBlock;
import vectorwing.farmersdelight.common.block.RiceRollMedleyBlock;


public class ModBlocks {

    public static final Block WILD_CUCUMBERS = registerBlock("wild_cucumbers",
            new WildCropBlock(StatusEffects.FIRE_RESISTANCE, 6, FabricBlockSettings.copyOf(Blocks.TALL_GRASS)));

    public static final Block CUCUMBERS = registerBlockWithoutItem("cucumbers",
            new CucumberBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block WILD_EGGPLANTS = registerBlock("wild_eggplants",
            new WildCropBlock(StatusEffects.STRENGTH, 6, FabricBlockSettings.copyOf(Blocks.TALL_GRASS)));

    public static final Block EGGPLANTS = registerBlockWithoutItem("eggplants",
            new EggplantsBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block WILD_CORN = registerBlock("wild_corn",
            new WildCropBlock(StatusEffects.HUNGER, 6, FabricBlockSettings.copyOf(Blocks.TALL_GRASS)));

    public static final Block WILD_CORN_DRY = registerBlock("wild_corn_dry",
            new WildCropBlock(StatusEffects.HUNGER, 6, FabricBlockSettings.copyOf(Blocks.TALL_GRASS)));

    public static final Block CORN = registerBlockWithoutItem("corn",
            new CornBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block CORN_UPPER = registerBlockWithoutItem("corn_upper",
            new CornUpperBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block EXOTIC_ROLL_MEDLEY = registerBlock("exotic_roll_medley",
            new ExoticRollMedleyBlock(
                    FabricBlockSettings.copyOf(vectorwing.farmersdelight.common.registry.ModBlocks.RICE_ROLL_MEDLEY_BLOCK.get()),
                    () -> ModItems.PUFFERFISH_ROLL, true));


    public static final Block EGGPLANT_PARMESAN_BLOCK = registerBlock("eggplant_parmesan_block",
            new EggplantFeastBlock(
                    FabricBlockSettings.copyOf(vectorwing.farmersdelight.common.registry.ModBlocks.ROAST_CHICKEN_BLOCK.get()),
                    () -> ModItems.EGGPLANT_PARMESAN, true
            ));


    public static final Block AVOCADO_LOG = registerBlock("avocado_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG)));

     public static final Block AVOCADO_WOOD = registerBlock("avocado_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD)));

     public static final Block AVOCADO_LEAVES = registerBlock("avocado_leaves",
             new LeavesBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES)));

    public static final Block AVOCADO_SAPLING = registerBlock("avocado_sapling",
            new SaplingBlock(ModTreeGrowers.AVOCADO, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block AVOCADO_PIT = registerBlock("avocado_pit",
            new AvocadoPitBlock(ModTreeGrowers.AVOCADO, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block FRUITING_AVOCADO_LEAVES = registerBlock("fruiting_avocado_leaves",
            new FruitingLeaves(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES)
                    .nonOpaque()
                    .ticksRandomly()));


     private static Block registerBlock(String name, Block block) {
         Block registered = Registry.register(Registries.BLOCK, new Identifier(Plenaria.MOD_ID, name), block);
         Registry.register(Registries.ITEM, new Identifier(Plenaria.MOD_ID, name), new BlockItem(registered, new Item.Settings()));
         return registered;
     }

    private static Block registerBlockWithoutItem(String name, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(Plenaria.MOD_ID, name), block);
        return block;
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Plenaria.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        Plenaria.LOGGER.info("Registering ModBlocks for" +  Plenaria.MOD_ID);
    }
}

