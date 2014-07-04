package com.swedishmonkey.moretools.block.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class DiamondFurnaceTileEntity extends TileEntity implements IInventory {

    private ItemStack[] inventory;

    public DiamondFurnaceTileEntity() {
        inventory = new ItemStack[1];
    }

    @Override
    public int getSizeInventory() {
        return inventory.length;
    }

    @Override
    public ItemStack getStackInSlot(int var1) {
        return inventory[1];
    }

    @Override
    public ItemStack decrStackSize(int var1, int var2) {
        ItemStack itemstack = getStackInSlot(var1);
        if (itemstack != null) {
            if (itemstack.stackSize <= var2) {
                setInventorySlotContents(var1, null);
            } else {
                itemstack = itemstack.splitStack(var2);
                onInventoryChanged();
            }
        }
        return itemstack;
    }

    private void onInventoryChanged() {

    }

    @Override
    public ItemStack getStackInSlotOnClosing(int var1) {
        ItemStack itemstack = getStackInSlot(var1);
        setInventorySlotContents(var1, null);
        return itemstack;
    }

    @Override
    public void setInventorySlotContents(int var1, ItemStack var2) {
        inventory[var1] = var2;
        if (var2 != null && var2.stackSize > getInventoryStackLimit()) {
            var2.stackSize = getInventoryStackLimit();
        }
        onInventoryChanged();
    }

    @Override
    public String getInventoryName() {
        return "Redstone Furnace";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return true;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer var1) {
        if (var1.getDistanceSq(xCoord = (int) 0.5D, yCoord + 0.5D, zCoord + 0.5D) <= 64) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int var1, ItemStack var2) {
        return true;
    }


}
