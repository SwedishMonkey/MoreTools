package com.swedishmonkey.moretools.armor;

import com.swedishmonkey.moretools.common.MoreTools;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class BedrockArmor extends ItemArmor {

    public BedrockArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
                        int p_i45325_3_) {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
        this.setCreativeTab(MoreTools.tabArmor);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
                                  String type) {
        if (stack.getItem() == MoreTools.BedrockHelmet
                || stack.getItem() == MoreTools.BedrockChestplate
                || stack.getItem() == MoreTools.BedrockBoots) {
            return "MoreTools:textures/armor/bedrock_1.png";
        }
        if (stack.getItem() == MoreTools.BedrockLeggings) {
            return "MoreTools:textures/armor/bedrock_2.png";
        } else
            return null;

    }

    ;

}
