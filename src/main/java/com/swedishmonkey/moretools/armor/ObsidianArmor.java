package com.swedishmonkey.moretools.armor;

import com.swedishmonkey.moretools.common.MoreTools;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ObsidianArmor extends ItemArmor {

    public ObsidianArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
        this.setCreativeTab(MoreTools.tabArmor);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
                                  String type) {
        if (stack.getItem() == MoreTools.ObsidianHelmet
                || stack.getItem() == MoreTools.ObsidianChestplate
                || stack.getItem() == MoreTools.ObsidianBoots) {
            return "MoreTools:textures/armor/obsidian_1.png";
        }
        if (stack.getItem() == MoreTools.ObsidianLeggings) {
            return "MoreTools:textures/armor/obsidian_2.png";
        } else
            return null;

    }

    ;


}


