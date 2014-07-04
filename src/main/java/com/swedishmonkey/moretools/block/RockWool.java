package com.swedishmonkey.moretools.block;

import com.swedishmonkey.moretools.common.MoreTools;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RockWool extends Block {

    public RockWool(int i, Material p_i45394_1_) {
        super(p_i45394_1_);
        this.setCreativeTab(MoreTools.tabTools);
        this.setResistance(3.0F);
        this.setHardness(1.5F);
    }

}
