package com.wailord444.wailsmod.blocks.ABS;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.wailord444.wailsmod.init.ModBlocks;
import com.wailord444.wailsmod.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class AdvancedBrewingStandRecipes 
{	
	private static final AdvancedBrewingStandRecipes INSTANCE = new AdvancedBrewingStandRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static AdvancedBrewingStandRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private AdvancedBrewingStandRecipes() 
	{
		addABSRecipe(new ItemStack(ModItems.ONIT_ESSENCE), new ItemStack(ModItems.ONIT_SHARD), new ItemStack(ModItems.ONIT_INGOT), 8.0F);
		addABSRecipe(new ItemStack(ModItems.ONIT_SHARD), new ItemStack(ModItems.ONIT_ESSENCE), new ItemStack(ModItems.ONIT_INGOT), 8.0F);
		addABSRecipe(new ItemStack(Items.EMERALD), new ItemStack(Items.EMERALD), new ItemStack(Items.DIAMOND), 8.0F);
	}

	
	public void addABSRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getABSResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getABSResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getABSExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}