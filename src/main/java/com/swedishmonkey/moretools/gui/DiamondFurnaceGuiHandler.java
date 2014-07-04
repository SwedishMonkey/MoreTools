package com.swedishmonkey.moretools.gui;

import com.swedishmonkey.moretools.block.tileentity.DiamondFurnaceTileEntity;
import com.swedishmonkey.moretools.gui.container.DiamondFurnaceContainer;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class DiamondFurnaceGuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world,
                                      int x, int y, int z) {

        TileEntity entity = world.getTileEntity(x, y, z);
        switch (ID) {
            case 0:
                if (entity != null && entity instanceof DiamondFurnaceTileEntity) {
                    return new DiamondFurnaceContainer(player.inventory, (DiamondFurnaceTileEntity) entity);
                } else {
                    return null;
                }
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world,
                                      int x, int y, int z) {

        TileEntity entity = world.getTileEntity(x, y, z);
        switch (ID) {
            case 0:
                if (entity != null && entity instanceof DiamondFurnaceTileEntity) {
                    return new DiamondFurnaceGui(player.inventory, (DiamondFurnaceTileEntity) entity);
                }
        }
        return null;
    }

}