package net.parsa.learningmod;

import net.fabricmc.api.ModInitializer;

import net.parsa.learningmod.block.ModBlocks;
import net.parsa.learningmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearningMod implements ModInitializer {

	public static final String MOD_ID = "learningmod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}