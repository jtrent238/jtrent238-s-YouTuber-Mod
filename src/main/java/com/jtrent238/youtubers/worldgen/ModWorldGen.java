package com.jtrent238.youtubers.worldgen;

import java.util.Random;
import java.util.logging.Level;

import com.jtrent238.youtubers.BlockLoader;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Loader;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenBigMushroom;
import net.minecraft.world.gen.feature.WorldGenCactus;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenReed;
import net.minecraft.world.gen.feature.WorldGenSand;
import net.minecraft.world.gen.feature.WorldGenWaterlily;
import net.minecraft.world.gen.feature.WorldGenerator;


public class ModWorldGen implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	    switch (world.provider.dimensionId) {
	    
	    case 0: //Overworld
	    	this.runGenerator(this.gen_xJSQ_ore, world, random, chunkX, chunkZ, 20, 0, 64);
	    	this.runGenerator(this.gen_DanTDM_ore, world, random, chunkX, chunkZ, 20, 0, 64);
		    this.runGenerator(this.gen_SethBling_ore, world, random, chunkX, chunkZ, 20, 0, 64);
		    this.runGenerator(this.gen_Laurie201_ore, world, random, chunkX, chunkZ, 20, 0, 64);
		    this.runGenerator(this.gen_blohod_ore, world, random, chunkX, chunkZ, 20, 0, 64);
		    this.runGenerator(this.gen_skythekidRS_ore, world, random, chunkX, chunkZ, 20, 0, 64);
		    this.runGenerator(this.gen_HeyItsLuigi_ore, world, random, chunkX, chunkZ, 20, 0, 64);
		    this.runGenerator(this.gen_Antvenom_ore, world, random, chunkX, chunkZ, 20, 0, 64);
		    this.runGenerator(this.gen_Joy_Rider_2284_ore, world, random, chunkX, chunkZ, 20, 0, 64);
		    this.runGenerator(this.gen_jtrent238_ore, world, random, chunkX, chunkZ, 20, 0, 64);
		    this.runGenerator(this.gen__MrGregor__ore, world, random, chunkX, chunkZ, 20, 0, 64);

	        break;
	    case -1: //Nether

	        break;
	    case 1: //End

	        break;
	    }
	}
	
	private WorldGenerator gen_xJSQ_ore;
	private WorldGenerator gen_DanTDM_ore;
	private WorldGenerator gen_SethBling_ore;
	private WorldGenerator gen_Laurie201_ore;
	private WorldGenerator gen_blohod_ore;
	private WorldGenerator gen_skythekidRS_ore;
	private WorldGenerator gen_HeyItsLuigi_ore;
	private WorldGenerator gen_Antvenom_ore;
	private WorldGenerator gen_Joy_Rider_2284_ore;
	private WorldGenerator gen_jtrent238_ore;
	private WorldGenerator gen__MrGregor__ore;

	
	public ModWorldGen() {
	    this.gen_xJSQ_ore = new WorldGenMinable(BlockLoader.BlockxJSQOre, 8);
		this.gen_DanTDM_ore = new WorldGenMinable(BlockLoader.BlockDanTDMOre, 8);
		this.gen_SethBling_ore = new WorldGenMinable(BlockLoader.BlockSethBlingOre, 8);
		this.gen_Laurie201_ore = new WorldGenMinable(BlockLoader.BlockLaurie201Ore, 8);
		this.gen_blohod_ore = new WorldGenMinable(BlockLoader.BlockblohodOre, 8);
		this.gen_skythekidRS_ore = new WorldGenMinable(BlockLoader.BlockskythekidRSOre, 8);
		this.gen_HeyItsLuigi_ore = new WorldGenMinable(BlockLoader.BlockHeyItsLuigiOre, 8);
		this.gen_Antvenom_ore = new WorldGenMinable(BlockLoader.BlockAntvenomOre, 8);
		this.gen_Joy_Rider_2284_ore = new WorldGenMinable(BlockLoader.BlockJoy_Rider_2284Ore, 8);
		this.gen_jtrent238_ore = new WorldGenMinable(BlockLoader.Blockjtrent238Ore, 8);
		this.gen__MrGregor__ore = new WorldGenMinable(BlockLoader.Block_MrGregor_Ore, 8);

	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, x, y, z);
	    }
	}

	
	
}