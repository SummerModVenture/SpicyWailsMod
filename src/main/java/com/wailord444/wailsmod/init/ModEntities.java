package com.wailord444.wailsmod.init;

import com.wailord444.wailsmod.Main;
import com.wailord444.wailsmod.entity.EntityBrewer;
import com.wailord444.wailsmod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities 
{
	public static void registerEntities()
	{
		registerEntity("brewer", EntityBrewer.class, Reference.ENTITY_BREWER, 20, 111111, 555555);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int c1, int c2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, c1, c2);
	}
}
