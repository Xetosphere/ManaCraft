package com.xetosphere.manacraft.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.xetosphere.manacraft.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {

	public static Configuration config;
	public static boolean testValue = false;

	public static void init(File configFile) {

		if (config == null) {
			config = new Configuration(configFile);
		}
	}

	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent e) {

		if (e.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfiguration();
		}
	}

	public void loadConfiguration() {

		testValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example config value");

		if (config.hasChanged()) {
			config.save();
		}
	}

}
