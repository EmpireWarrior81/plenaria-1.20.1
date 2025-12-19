package net.empire.plenaria;

import net.empire.plenaria.block.ModBlocks;
import net.empire.plenaria.item.ModItemGroups;
import net.empire.plenaria.item.ModItems;
import net.empire.plenaria.world.*;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Plenaria implements ModInitializer {
	public static final String MOD_ID = "plenaria";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");

        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();

        ModBiomeGeneration.generateBiomes();

        //TODO This is for datagen option
      //  ModWorldGen.init();




	}
}