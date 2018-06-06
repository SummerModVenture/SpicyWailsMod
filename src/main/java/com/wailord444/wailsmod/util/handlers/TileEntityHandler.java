package com.wailord444.wailsmod.util.handlers;

import com.wailord444.wailsmod.blocks.ABS.TileEntityAdvancedBrewingStand;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityAdvancedBrewingStand.class, "advanced_brewing_stand");
	}
}