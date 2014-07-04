package com.swedishmonkey.moretools.gui;

import com.swedishmonkey.moretools.block.tileentity.DiamondFurnaceTileEntity;
import com.swedishmonkey.moretools.gui.container.DiamondFurnaceContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.io.IOException;

public class DiamondFurnaceGui extends GuiContainer {

    public static final ResourceLocation texture = new ResourceLocation("MoreTools:/textures/gui/DiamondFurnaceGui.png");

    public DiamondFurnaceGui(InventoryPlayer playerinv, DiamondFurnaceTileEntity tileentity) {
        super(new DiamondFurnaceContainer(playerinv, tileentity));

        //xSize = 176;
        //ySize = 165;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2,
                                                   int var3) {
        GL11.glColor4f(1F, 1F, 1F, 1F);
        try {
            Minecraft.getMinecraft().getResourceManager().getResource(texture);
        } catch (IOException e) {
            System.out.println("ERROR WITH TEXTURE!");
            e.printStackTrace();
        }

        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize); //this.xSize, this.ySize

    }

}
