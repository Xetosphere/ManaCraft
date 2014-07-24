package com.xetosphere.manacraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.xetosphere.manacraft.ManaCraft;
import com.xetosphere.manacraft.reference.GuiId;
import com.xetosphere.manacraft.reference.Names;

public class ItemSpellBook extends ItemXMC {

	public ItemSpellBook() {

		super();
		this.setUnlocalizedName(Names.Items.SPELL_BOOK);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {

		player.openGui(ManaCraft.instance, GuiId.SPELL_BOOK.ordinal(), world, (int) player.posX, (int) player.posY, (int) player.posZ);

		return itemStack;
	}
}
