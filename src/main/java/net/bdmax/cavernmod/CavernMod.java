package net.bdmax.cavernmod;

import net.bdmax.cavernmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CavernMod implements ModInitializer {
	public static final String MOD_ID = "cavernmod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
