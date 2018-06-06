package com.wailord444.wailsmod.items.tools;

import com.wailord444.wailsmod.Main;
import com.wailord444.wailsmod.init.ModItems;
import com.wailord444.wailsmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{
	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
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
