package com.swedishmonkey.moretools.armor;

import com.swedishmonkey.moretools.common.MoreTools;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class LapisArmor extends ItemArmor {

    public LapisArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
        this.setCreativeTab(MoreTools.tabArmor);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
                                  String type) {
        if (stack.getItem() == MoreTools.LapisHelmet
                || stack.getItem() == MoreTools.LapisChestplate
                || stack.getItem() == MoreTools.LapisBoots) {
            return "MoreTools:textures/armor/lapis_1.png";
        }
        if (stack.getItem() == MoreTools.LapisLeggings) {
            return "MoreTools:textures/armor/lapis_2.png";
        } else
            return null;

    }

    ;


}

