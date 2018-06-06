package com.wailord444.wailsmod.blocks;

import java.util.Random;

import com.wailord444.wailsmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import scala.tools.nsc.io.Jar.WManifest;

public class OnitOre extends BlockBase
{
	public OnitOre(String name, Material material)
	{
		super(name,material);
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(2.0F);
		setHarvestLevel("pickaxe",3);
		setLightLevel(0.0F);
		//setLightOpacity();
		//setBlockUnbreakable();
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return ModItems.ONIT_SHARD;
	}
}
