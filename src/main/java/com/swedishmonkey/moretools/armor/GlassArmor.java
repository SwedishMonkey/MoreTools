package com.swedishmonkey.moretools.armor;

import com.swedishmonkey.moretools.common.MoreTools;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class GlassArmor extends ItemArmor {

    public GlassArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
        this.setCreativeTab(MoreTools.tabArmor);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
                                  String type) {
        if (stack.getItem() == MoreTools.GlassHelmet
                || stack.getItem() == MoreTools.GlassChestplate
                || stack.getItem() == MoreTools.GlassBoots) {
            return "MoreTools:textures/armor/glass_1.png";
        }
        if (stack.getItem() == MoreTools.GlassLeggings) {
            return "MoreTools:textures/armor/glass_2.png";
        } else
            return null;

    }

    ;


}
