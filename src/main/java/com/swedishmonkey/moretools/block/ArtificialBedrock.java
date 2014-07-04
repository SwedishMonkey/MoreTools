package com.swedishmonkey.moretools.block;

import com.swedishmonkey.moretools.common.MoreTools;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ArtificialBedrock extends Block {

    public ArtificialBedrock(int i, Material p_i45394_1_) {
        super(p_i45394_1_);
        this.setCreativeTab(MoreTools.tabTools);
        this.setHardness(5.0F);
        this.setResistance(1000.0F);
        this.setHarvestLevel("pickaxe", 10);
    }

}
