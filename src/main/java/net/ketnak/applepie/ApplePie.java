package net.ketnak.applepie;

import net.fabricmc.api.ModInitializer;

import net.ketnak.applepie.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplePie implements ModInitializer {
	public static final String MOD_ID = "apple-pie";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}