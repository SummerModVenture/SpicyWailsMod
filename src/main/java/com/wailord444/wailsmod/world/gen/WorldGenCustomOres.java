package com.wailord444.wailsmod.world.gen;


import com.wailord444.wailsmod.init.ModBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenCustomOres implements IWorldGenerator
{
    private WorldGenerator onit_ore;
    private WorldGenerator lazorite;
    private WorldGenerator n_lazorite;

    public WorldGenCustomOres()
    {
        onit_ore = new WorldGenMinable(ModBlocks.ONIT_ORE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
        lazorite = new WorldGenMinable(ModBlocks.LAZORITE.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.STONE));
        n_lazorite = new WorldGenMinable(ModBlocks.NETHER_LAZORITE.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.getDimension())
        {
            case -1:
                //nether
                runGenerator(n_lazorite, world, random, chunkX, chunkZ, 10, 0, 100);
                break;

            case 0:
                //overworld
                runGenerator(onit_ore, world, random, chunkX, chunkZ, 3, 5, 25);
                runGenerator(lazorite, world, random, chunkX, chunkZ, 1, 5, 20);
                break;

            case 1:
                //end

        }
    }

    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
    {
        if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds reeee");

        int heightDiff = maxHeight - minHeight + 1;
        for(int i = 0; i < chance; i++)//number of times spawned in 1 chunk
        {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);

            gen.generate(world, rand, new BlockPos(x,y,z));
        }
    }
}
