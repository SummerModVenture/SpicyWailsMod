package com.wailord444.wailsmod.entity.render;

import com.wailord444.wailsmod.entity.EntityBrewer;
import com.wailord444.wailsmod.entity.model.ModelBrewer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrewer extends RenderLiving<EntityBrewer>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation("wailsmod:textures/entity/brewer.png");
	
	public RenderBrewer(RenderManager manager) 
	{
		super(manager, new ModelBrewer(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBrewer entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityBrewer entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
