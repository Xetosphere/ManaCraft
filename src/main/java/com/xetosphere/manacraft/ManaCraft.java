package com.xetosphere.manacraft;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.xetosphere.manacraft.handler.ConfigurationHandler;
import com.xetosphere.manacraft.handler.GuiHandler;
import com.xetosphere.manacraft.init.ModBlocks;
import com.xetosphere.manacraft.init.ModItems;
import com.xetosphere.manacraft.proxy.IProxy;
import com.xetosphere.manacraft.reference.Reference;
import com.xetosphere.manacraft.utility.LogHelper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ManaCraft {

	@Instance(Reference.MOD_ID)
	public static ManaCraft instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static IProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {

		LogHelper.info("Pre Initialization Started!");

		ConfigurationHandler.init(e.getSuggestedConfigurationFile());
		ModItems.init();
		ModBlocks.init();

		LogHelper.info("Pre Initialization Complete!");
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {

		LogHelper.info("Initialization Started!");

		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

		LogHelper.info("Initialization Complete!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {

		LogHelper.info("Post Initialization Started!");

		LogHelper.info("Post Initialization Complete!");
	}

}
