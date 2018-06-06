package com.wailord444.wailsmod.init;

import java.util.ArrayList;
import java.util.List;

import com.wailord444.wailsmod.items.ItemBase;
import com.wailord444.wailsmod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_MEME = EnumHelper.addToolMaterial("material_meme", 2, 420, 5.0F, 2.0F, 10);
	
	//Items
	public static final Item ONIT_ESSENCE = new ItemBase("onit_essence");
	public static final Item ONIT_SHARD = new ItemBase("onit_shard");
	public static final Item ONIT_INGOT = new ItemBase("onit_ingot");
	public static final Item SPICY_ONIT_FUEL = new ItemBase("spicy_onit_fuel");
	
	//Tools
	public static final ToolSword MEME_BLADE = new ToolSword("meme_blade", MATERIAL_MEME);

}
