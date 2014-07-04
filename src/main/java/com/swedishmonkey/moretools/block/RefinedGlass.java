package com.swedishmonkey.moretools.block;

import com.swedishmonkey.moretools.common.MoreTools;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RefinedGlass extends Block {

    public RefinedGlass(int i, Material p_i45394_1_) {
        super(p_i45394_1_);
        this.setCreativeTab(MoreTools.tabTools);
        this.setLightOpacity(0);
    }

    public boolean isOpaqueCube() {
        return false;
    }

}
