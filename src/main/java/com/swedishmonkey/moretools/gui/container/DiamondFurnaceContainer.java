package com.swedishmonkey.moretools.gui.container;

import com.swedishmonkey.moretools.block.tileentity.DiamondFurnaceTileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class DiamondFurnaceContainer extends Container {

    private DiamondFurnaceTileEntity DiamondFurnaceTileEntity;

    public DiamondFurnaceContainer(InventoryPlayer invPlayer, DiamondFurnaceTileEntity entity) {
        this.DiamondFurnaceTileEntity = entity;
    }

    @Override
    public boolean canInteractWith(EntityPlayer var1) {
        return DiamondFurnaceTileEntity.isUseableByPlayer(var1);
    }

}
