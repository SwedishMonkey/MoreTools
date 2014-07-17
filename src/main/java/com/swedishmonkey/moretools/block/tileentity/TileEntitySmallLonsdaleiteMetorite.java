package com.swedishmonkey.moretools.block.tileentity;

import com.swedishmonkey.moretools.common.MoreTools;
import com.swedishmonkey.moretools.entity.EntitySmallLonsdaleiteMetorite;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntitySmallLonsdaleiteMetorite extends BlockContainer {
    public TileEntitySmallLonsdaleiteMetorite(int i, Material p_i45386_1_) {
        super(p_i45386_1_);
        this.setCreativeTab(MoreTools.tabTools);
        this.setBlockBounds(0.375F, 0.0F, 0.375F, 0.625F, 0.25F, 0.625F);
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new EntitySmallLonsdaleiteMetorite();
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public void registerIcons(IIconRegister icon) {
        this.blockIcon = icon.registerIcon("MoreTools:SmallLonsdaleiteMetoriteIcon");
    }
}
