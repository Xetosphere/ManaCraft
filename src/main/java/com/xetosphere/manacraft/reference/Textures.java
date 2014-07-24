package com.xetosphere.manacraft.reference;

import net.minecraft.util.ResourceLocation;

import com.xetosphere.manacraft.utility.ResourceLocationHelper;

public class Textures {

	public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";

	public static final class Gui {

		private static final String GUI_SHEET_LOCATION = "textures/gui/";
		public static final ResourceLocation SPELL_BOOK = ResourceLocationHelper.getResourceLocation(GUI_SHEET_LOCATION + "spellBook.png");
	}

}
