package com.jtrent238.youtubers;

import com.jtrent238.youtubers.blocks.BlockxJSQOre;
import com.jtrent238.youtubers.blocks.materials.BlockxJSQ;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLoader {

	
	public static Block BlockxJSQOre;
	public static Block BlockxJSQ;
	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {

		BlockxJSQOre = new BlockxJSQOre(Material.rock).setBlockName("BlockxJSQOre").setBlockTextureName("youtubers:BlockxJSQOre").setCreativeTab(YouTubers.YouTubers);
		BlockxJSQ = new BlockxJSQ(Material.iron).setBlockName("BlockxJSQ").setBlockTextureName("youtubers:BlockxJSQ").setCreativeTab(YouTubers.YouTubers);


		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks() {

		GameRegistry.registerBlock(BlockxJSQOre, "BlockxJSQOre");
		GameRegistry.registerBlock(BlockxJSQ, "BlockxJSQ");
		
	}

}
