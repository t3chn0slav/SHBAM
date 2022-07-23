package net.technoslav.shbam;

import net.fabricmc.api.ModInitializer;
import net.technoslav.shbam.block.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MBV implements ModInitializer {
	public static final String MOD_ID = "shbam";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModWallBlocks.registerModWallBlocks();
		ModStairBlocks.registerModStairsBlocks();
		ModBlocks.registerModBlocks();
		ModSlabBlocks.registerModSlabBlocks();
		ModFenceBlocks.registerModFenceBlocks();
		ModPressurePlateBlock.registerModPressurePlateBlocks();
		ModButtonBlocks.registerModButtonBlocks();
	}

}
