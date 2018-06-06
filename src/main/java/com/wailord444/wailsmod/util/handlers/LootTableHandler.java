package com.wailord444.wailsmod.util.handlers;

import com.wailord444.wailsmod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler 
{
	public static final ResourceLocation BREWER = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "brewer"));
}
