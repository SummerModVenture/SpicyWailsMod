package com.wailord444.wailsmod.util.handlers;

import com.wailord444.wailsmod.entity.EntityBrewer;
import com.wailord444.wailsmod.entity.render.RenderBrewer;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityBrewer.class, new IRenderFactory<EntityBrewer>()
		{

			@Override
			public Render<? super EntityBrewer> createRenderFor(RenderManager manager) 
			{
				return new RenderBrewer(manager);
			}
		
		});
	}
}
