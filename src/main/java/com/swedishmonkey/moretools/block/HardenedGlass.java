package com.swedishmonkey.moretools.block;

import com.swedishmonkey.moretools.common.MoreTools;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class HardenedGlass extends Block {

    public HardenedGlass(int i, Material p_i45394_1_) {
        super(p_i45394_1_);
        this.setCreativeTab(MoreTools.tabTools);
    }

    public boolean isOpaqueCube() {
        return false;
    }

}
