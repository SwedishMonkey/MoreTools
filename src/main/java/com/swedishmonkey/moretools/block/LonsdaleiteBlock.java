package com.swedishmonkey.moretools.block;

import com.swedishmonkey.moretools.common.MoreTools;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LonsdaleiteBlock extends Block {

    public LonsdaleiteBlock(int i, Material p_i45394_1_) {
        super(p_i45394_1_);
        this.setCreativeTab(MoreTools.tabTools);
        this.setHardness(4.0F);
        this.setResistance(10.0F);
        this.setHarvestLevel("pickaxe", 3);
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public int getRenderBlockPass() {
        return 1;
    }

    public boolean renderasNormalBlock() {
        return false;
    }
}
