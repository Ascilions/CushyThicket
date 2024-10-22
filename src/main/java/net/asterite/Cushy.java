package net.asterite;

import net.asterite.block.CushyBlocks;
import net.asterite.item.CushyItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cushy implements ModInitializer {
	public static final String MOD_ID = "cushy";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CushyItems.initialize();
		CushyBlocks.initialize();
		LOGGER.info("Hello Fabric world!");
	}
}