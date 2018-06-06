package com.wailord444.wailsmod.blocks.ABS.slots;
import com.wailord444.wailsmod.blocks.ABS.TileEntityAdvancedBrewingStand;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotABSFuel extends Slot
{
	public SlotABSFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityAdvancedBrewingStand.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
}