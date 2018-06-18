package com.wailord444.wailsmod.init;

import java.util.ArrayList;
import java.util.List;

import com.wailord444.wailsmod.items.ItemBase;
import com.wailord444.wailsmod.items.tools.*;

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
	public static final ToolMaterial MATERIAL_ONIT = EnumHelper.addToolMaterial("material_onit", 3, 2420, 16.0F, 5.0F, 22);
	
	//Items
	public static final Item ONIT_ESSENCE = new ItemBase("onit_essence");
	public static final Item ONIT_SHARD = new ItemBase("onit_shard");
	public static final Item ONIT_INGOT = new ItemBase("onit_ingot");
	public static final Item SPICY_ONIT_FUEL = new ItemBase("spicy_onit_fuel");
	
	//Tools
	public static final ToolSword MEME_BLADE = new ToolSword("meme_blade", MATERIAL_MEME);

	public static final ToolSword ONIT_SWORD = new ToolSword("onit_sword", MATERIAL_ONIT);
	public static final ToolAxe	ONIT_AXE = new ToolAxe("onit_axe", MATERIAL_ONIT);
	public static final ToolPickaxe ONIT_PICKAXE= new ToolPickaxe("onit_pickaxe", MATERIAL_ONIT);
	public static final ToolHoe ONIT_HOE = new ToolHoe("onit_hoe", MATERIAL_ONIT);
	public static final ToolSpade ONIT_SPADE = new ToolSpade("onit_spade", MATERIAL_ONIT);
}
