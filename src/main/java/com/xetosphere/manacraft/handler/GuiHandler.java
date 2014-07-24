package com.xetosphere.manacraft.handler;

import com.xetosphere.manacraft.client.gui.GuiSpellBook;
import com.xetosphere.manacraft.reference.GuiId;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int id, EntityPlayer entityPlayer, World world, int x, int y, int z) {

		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer entityPlayer, World world, int x, int y, int z) {

		if (id == GuiId.SPELL_BOOK.ordinal()) {
			return new GuiSpellBook(entityPlayer);
		}

		return null;
	}

}
