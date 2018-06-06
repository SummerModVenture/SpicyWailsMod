package com.wailord444.wailsmod.items;

import com.wailord444.wailsmod.Main;
import com.wailord444.wailsmod.init.ModItems;
import com.wailord444.wailsmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this,0,"inventory");
	}
	
}
