package com.xetosphere.manacraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.xetosphere.manacraft.creativetab.CreativeTabsXMC;
import com.xetosphere.manacraft.reference.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockXMC extends Block {

	public BlockXMC() {

		this(Material.rock);
	}

	public BlockXMC(Material material) {

		super(material);
		this.setCreativeTab(CreativeTabsXMC.XMC_TAB);
	}

	@Override
	public String getUnlocalizedName() {

		return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {

		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {

		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}
