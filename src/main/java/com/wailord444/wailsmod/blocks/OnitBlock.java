package com.wailord444.wailsmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OnitBlock extends BlockBase
{
	public OnitBlock(String name, Material material)
	{
		super(name,material);
		setSoundType(SoundType.GLASS);
		setHardness(2.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe",2);
		setLightLevel(50.0F);
		//setLightOpacity();
		//setBlockUnbreakable();
	}
}
