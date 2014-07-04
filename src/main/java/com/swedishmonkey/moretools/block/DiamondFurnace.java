package com.swedishmonkey.moretools.block;

import com.swedishmonkey.moretools.block.tileentity.DiamondFurnaceTileEntity;
import com.swedishmonkey.moretools.common.MoreTools;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class DiamondFurnace extends BlockContainer {

    @SideOnly(Side.CLIENT)
    public static IIcon topIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon sideIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon frontIcon;

    public DiamondFurnace(int i, Material p_i45386_1_) {
        super(p_i45386_1_);
        this.setCreativeTab(MoreTools.tabTools);
        this.setResistance(20.0F);
        this.setHardness(8.0F);
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new DiamondFurnaceTileEntity();
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) {
        topIcon = icon.registerIcon("MoreTools:Furnace_Top");
        sideIcon = icon.registerIcon("MoreTools:Furnace_Side");
        frontIcon = icon.registerIcon("MoreTools:Furnace_Front");
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        if (side == 0 || side == 1) {
            return topIcon;
        } else if (side != meta) {
            return sideIcon;
        } else {
            return frontIcon;
        }
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        func_149930_e(world, x, y, z);
    }

    private void func_149930_e(World world, int x, int y, int z) {
        if (world.isRemote) {
            Block block = world.getBlock(x, y, z - 1);
            Block block1 = world.getBlock(x, y, z + 1);
            Block block2 = world.getBlock(x - 1, y, z);
            Block block3 = world.getBlock(x + 1, y, z);
            byte b0 = 3;
            if (block.func_149730_j() && !block1.func_149730_j()) {
                b0 = 3;
            }
            if (block1.func_149730_j() && !block.func_149730_j()) {
                b0 = 2;
            }
            if (block2.func_149730_j() && !block3.func_149730_j()) {
                b0 = 5;
            }
            if (block3.func_149730_j() && !block2.func_149730_j()) {
                b0 = 4;
            }
            world.setBlockMetadataWithNotify(x, y, z, b0, 2);
        }
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entity, ItemStack itemstack) {
        int rotation = MathHelper.floor_double((double) (entity.rotationYaw * 4F / 360F) + 0.5D) & 3;
        if (rotation == 0) {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }
        if (rotation == 1) {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }
        if (rotation == 2) {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }
        if (rotation == 3) {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        player.openGui(MoreTools.instance, 0, world, x, y, z);
        System.out.println("BLOCK HAS BEEN ACTIVATED");
        return true;

    }


}
