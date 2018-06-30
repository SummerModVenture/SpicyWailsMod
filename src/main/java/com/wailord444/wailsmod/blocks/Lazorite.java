package com.wailord444.wailsmod.blocks;

import com.wailord444.wailsmod.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class Lazorite extends BlockBase
{
    public Lazorite(String name, Material material)
    {
        super(name,material);
        setSoundType(SoundType.GLASS);
        setHardness(2.0F);
        setResistance(30.0F);
        setHarvestLevel("pickaxe",4);
        setLightLevel(4.0F);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.LAZORITE_FRAGMENT;
    }
}
