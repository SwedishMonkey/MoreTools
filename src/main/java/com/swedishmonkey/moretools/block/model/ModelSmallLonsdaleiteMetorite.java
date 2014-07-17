package com.swedishmonkey.moretools.block.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSmallLonsdaleiteMetorite extends ModelBase {
    //fields
    ModelRenderer Middle;
    ModelRenderer Side1;
    ModelRenderer Side2;
    ModelRenderer Side3;
    ModelRenderer Side4;

    public ModelSmallLonsdaleiteMetorite() {
        textureWidth = 64;
        textureHeight = 64;

        Middle = new ModelRenderer(this, 7, 5);
        Middle.addBox(0F, 0F, 0F, 2, 4, 2);
        Middle.setRotationPoint(-1F, 20F, -1F);
        Middle.setTextureSize(64, 64);
        Middle.mirror = true;
        setRotation(Middle, 0F, 0F, 0F);
        Side1 = new ModelRenderer(this, 0, 6);
        Side1.addBox(0F, 0F, 0F, 2, 2, 1);
        Side1.setRotationPoint(-1F, 21F, -2F);
        Side1.setTextureSize(64, 64);
        Side1.mirror = true;
        setRotation(Side1, 0F, 0F, 0F);
        Side2 = new ModelRenderer(this, 8, 0);
        Side2.addBox(0F, 0F, 0F, 1, 2, 2);
        Side2.setRotationPoint(1F, 21F, -1F);
        Side2.setTextureSize(64, 64);
        Side2.mirror = true;
        setRotation(Side2, 0F, 0F, 0F);
        Side3 = new ModelRenderer(this, 16, 6);
        Side3.addBox(0F, 0F, 0F, 2, 2, 1);
        Side3.setRotationPoint(-1F, 21F, 1F);
        Side3.setTextureSize(64, 64);
        Side3.mirror = true;
        setRotation(Side3, 0F, 0F, 0F);
        Side4 = new ModelRenderer(this, 8, 12);
        Side4.addBox(0F, 0F, 0F, 1, 2, 2);
        Side4.setRotationPoint(-2F, 21F, -1F);
        Side4.setTextureSize(64, 64);
        Side4.mirror = true;
        setRotation(Side4, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Middle.render(f5);
        Side1.render(f5);
        Side2.render(f5);
        Side3.render(f5);
        Side4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
