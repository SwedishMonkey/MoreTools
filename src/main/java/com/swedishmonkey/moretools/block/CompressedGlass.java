package com.swedishmonkey.moretools.block;

import com.swedishmonkey.moretools.common.MoreTools;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CompressedGlass extends Block {

    public CompressedGlass(int i, Material p_i45394_1_) {
        super(p_i45394_1_);
        this.setCreativeTab(MoreTools.tabTools);
        this.setHardness(5F);
        this.setResistance(5F);
        this.setLightOpacity(2);
    }

    public boolean isOpaqueCube() {
        return false;
    }


}
