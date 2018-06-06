package com.wailord444.wailsmod.util.handlers;

import com.wailord444.wailsmod.blocks.ABS.ContainerAdvancedBrewingStand;
import com.wailord444.wailsmod.blocks.ABS.GuiAdvancedBrewingStand;
import com.wailord444.wailsmod.blocks.ABS.TileEntityAdvancedBrewingStand;
import com.wailord444.wailsmod.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_ADVANCED_BREWING_STAND) return new ContainerAdvancedBrewingStand(player.inventory, (TileEntityAdvancedBrewingStand)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ADVANCED_BREWING_STAND) return new GuiAdvancedBrewingStand(player.inventory, (TileEntityAdvancedBrewingStand)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}