package com.wailord444.wailsmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelZombie - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelBrewer extends ModelBase {
    public ModelRenderer BrewerRightArm;
    public ModelRenderer BrewerRightLeg;
    public ModelRenderer field_78116_c;
    public ModelRenderer BrewerBody;
    public ModelRenderer BrewerRightArm_1;
    public ModelRenderer BrewerLeftLeg;
    public ModelRenderer BrewerHead;

    public ModelBrewer() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.BrewerHead = new ModelRenderer(this, 32, 0);
        this.BrewerHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BrewerHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.BrewerBody = new ModelRenderer(this, 16, 16);
        this.BrewerBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BrewerBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.setRotateAngle(BrewerBody, -0.045553093477052F, 0.0F, -0.01064650843716541F);
        this.BrewerLeftLeg = new ModelRenderer(this, 0, 16);
        this.BrewerLeftLeg.mirror = true;
        this.BrewerLeftLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.BrewerLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(BrewerLeftLeg, -0.0F, 0.0F, -0.528485697503883F);
        this.BrewerRightArm = new ModelRenderer(this, 40, 16);
        this.BrewerRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.BrewerRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(BrewerRightArm, -1.9036306151502151F, 1.4742796191596101F, 0.10000736613927509F);
        this.BrewerRightArm_1 = new ModelRenderer(this, 40, 16);
        this.BrewerRightArm_1.mirror = true;
        this.BrewerRightArm_1.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.BrewerRightArm_1.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(BrewerRightArm_1, -2.0989329584483807F, 1.293987107428596F, -0.10000736613927509F);
        this.BrewerRightLeg = new ModelRenderer(this, 0, 16);
        this.BrewerRightLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.BrewerRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(BrewerRightLeg, 0.0F, 0.0F, 0.6658431096358367F);
        this.field_78116_c = new ModelRenderer(this, 0, 0);
        this.field_78116_c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_c.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.BrewerHead.render(f5);
        this.BrewerBody.render(f5);
        this.BrewerLeftLeg.render(f5);
        this.BrewerRightArm.render(f5);
        this.BrewerRightArm_1.render(f5);
        this.BrewerRightLeg.render(f5);
        this.field_78116_c.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
    		float headPitch, float scaleFactor, Entity entityIn) 
    {
    	//legs
    	this.BrewerLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.BrewerRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	
    	//head
    	this.BrewerHead.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.BrewerHead.rotateAngleX = headPitch * 0.017453292F;
    }
}
