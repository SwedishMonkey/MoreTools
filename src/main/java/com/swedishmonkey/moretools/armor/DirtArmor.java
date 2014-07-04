package com.swedishmonkey.moretools.armor;

import com.swedishmonkey.moretools.common.MoreTools;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class DirtArmor extends ItemArmor {

    public DirtArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
        this.setCreativeTab(MoreTools.tabArmor);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
                                  String type) {
        if (stack.getItem() == MoreTools.DirtHelmet
                || stack.getItem() == MoreTools.DirtChestplate
                || stack.getItem() == MoreTools.DirtBoots) {
            return "MoreTools:textures/armor/dirt_1.png";
        }
        if (stack.getItem() == MoreTools.DirtLeggings) {
            return "MoreTools:textures/armor/dirt_2.png";
        } else
            return null;

    }

    ;


}
