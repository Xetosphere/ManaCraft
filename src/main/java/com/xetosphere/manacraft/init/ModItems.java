package com.xetosphere.manacraft.init;

import com.xetosphere.manacraft.item.ItemSpellBook;
import com.xetosphere.manacraft.item.ItemWand;
import com.xetosphere.manacraft.item.ItemXMC;
import com.xetosphere.manacraft.reference.Names;
import com.xetosphere.manacraft.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Reference.MOD_ID)
public class ModItems {

	public static final ItemXMC wand = new ItemWand();
	public static final ItemXMC spellBook = new ItemSpellBook();

	public static void init() {

		GameRegistry.registerItem(wand, Names.Items.WAND);
		GameRegistry.registerItem(spellBook, Names.Items.SPELL_BOOK);
	}
}
