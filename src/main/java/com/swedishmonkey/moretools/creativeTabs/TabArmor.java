package com.swedishmonkey.moretools.creativeTabs;

import com.swedishmonkey.moretools.common.MoreTools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabArmor extends CreativeTabs {

    public TabArmor(int par1, String par2Str) {
        super(par1, par2Str);

    }

    @Override
    public Item getTabIconItem() {
        return MoreTools.TabArmorPlaceHolder;
    }
}

