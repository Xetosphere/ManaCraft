package com.xetosphere.manacraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.xetosphere.manacraft.reference.Names;

public class ItemWand extends ItemXMC {

	public ItemWand() {

		super();
		this.setUnlocalizedName(Names.Items.WAND);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {

		if (!world.isRemote) {
			
			player.addChatComponentMessage(new ChatComponentText("Pew, pew, pew!"));
		}

		return itemStack;
	}

}
