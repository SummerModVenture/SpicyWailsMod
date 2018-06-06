package com.wailord444.wailsmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.ONIT_BLOCK, new ItemStack(Items.DIAMOND,1), 2.0F);
	}
}
