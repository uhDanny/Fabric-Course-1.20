package net.gloomii.mccourse;

import net.fabricmc.api.ModInitializer;

import net.gloomii.mccourse.block.ModBlocks;
import net.gloomii.mccourse.item.ModItemGroup;
import net.gloomii.mccourse.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Ensure we are importing and registering our classes so they are recognized onInitialized
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}