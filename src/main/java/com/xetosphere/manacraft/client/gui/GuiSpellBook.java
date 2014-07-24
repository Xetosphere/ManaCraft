package com.xetosphere.manacraft.client.gui;

import org.lwjgl.opengl.GL11;

import com.xetosphere.manacraft.reference.Textures;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;

public class GuiSpellBook extends GuiScreen {

	private int xSize = 256;
	private int ySize = 212;

	EntityPlayer player;

	public GuiSpellBook(EntityPlayer player) {

		this.player = player;
	}

	@Override
	public void updateScreen() {

		super.updateScreen();
	}

	@Override
	public void drawScreen(int x, int y, float f) {

		drawDefaultBackground();

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		mc.getTextureManager().bindTexture(Textures.Gui.SPELL_BOOK);

		int posX = (width - xSize) / 2;
		int posY = (height - ySize) / 2;

		drawTexturedModalRect(posX, posY, 0, 0, xSize, ySize);

		super.drawScreen(x, y, f);
	}

	@Override
	public boolean doesGuiPauseGame() {

		return false;
	}

}
