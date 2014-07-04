package com.swedishmonkey.moretools.block;

import com.swedishmonkey.moretools.common.MoreTools;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class LonsdaleiteOre extends Block {

    public LonsdaleiteOre(int i, Material p_i45394_1_) {
        super(p_i45394_1_);
        this.setHarvestLevel("pickaxe", 3);
        this.setCreativeTab(MoreTools.tabTools);
        this.setHardness(3.0F);
        this.setResistance(10.0F);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random random, int fortuneLevel) {
        return MoreTools.LonsdaleiteGem;
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
