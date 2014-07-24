package com.xetosphere.manacraft.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.xetosphere.manacraft.init.ModItems;
import com.xetosphere.manacraft.reference.Reference;

public class CreativeTabsXMC {

	public static final CreativeTabs XMC_TAB = new CreativeTabs(Reference.MOD_ID) {

		@Override
		public Item getTabIconItem() {

			return ModItems.wand;
		}
	};
}
