package com.example.MythicRPG;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class ModWorldGenerator implements IWorldGenerator {
    public net.minecraft.block.Block block;
    public int veinSize;

    public ModWorldGenerator(Block block, int veinSize){
        this.block = block;
        this.veinSize = veinSize;
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        if(world.provider.dimensionId == 0){
            this.runGenerator(new WorldGenMinable(block,veinSize),world,random,chunkX,chunkZ,20,0,64);
        }

    }

    private void runGenerator(WorldGenerator generator, World world, Random random, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
            throw new IllegalArgumentException("zle dane podane do min/max height!");
        }
        int HeightDif = maxHeight - minHeight;
        for (int i = 0;i< chancesToSpawn;i++){
            int x = chunk_X * 16 + random.nextInt(16);
            int y = minHeight * 16 + random.nextInt(HeightDif);
            int z = chunk_Z * 16 + random.nextInt(16);
            generator.generate(world,random,x,y,z);
        }
        }
    }

