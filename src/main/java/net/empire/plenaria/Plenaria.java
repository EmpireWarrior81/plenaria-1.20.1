package net.empire.plenaria;

import net.empire.plenaria.block.ModBlocks;
import net.empire.plenaria.effect.ModEffects;
import net.empire.plenaria.item.ModItemGroups;
import net.empire.plenaria.item.ModItems;
import net.empire.plenaria.particle.ModParticleTypes;
import net.empire.plenaria.util.ModLootTableModifiers;
import net.empire.plenaria.world.*;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class Plenaria implements ModInitializer {
	public static final String MOD_ID = "plenaria";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {



		LOGGER.info("Hello Fabric world!");


        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
               registry.add(ModBlocks.AVOCADO_LOG, 5, 5);
               registry.add(ModBlocks.AVOCADO_WOOD, 5, 5);
               registry.add(ModBlocks.AVOCADO_LEAVES, 30, 60);
               registry.add(ModBlocks.FRUITING_AVOCADO_LEAVES, 30, 60);
               registry.add(ModBlocks.AVOCADO_SAPLING, 30, 60);


        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();

        ModEffects.registerModEffects();

        ModLootTableModifiers.modifyLootTables();

        ModParticleTypes.registerParticles();

        ModBiomeGeneration.generateBiomes();

        //TODO This is for datagen option
      //  ModWorldGen.init();




	}
}