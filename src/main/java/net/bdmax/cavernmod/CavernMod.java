package net.bdmax.cavernmod;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CavernMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("modid");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}
