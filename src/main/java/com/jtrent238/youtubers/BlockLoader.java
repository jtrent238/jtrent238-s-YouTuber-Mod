package com.jtrent238.youtubers;

import com.jtrent238.youtubers.blocks.BlockAntvenomOre;
import com.jtrent238.youtubers.blocks.BlockGlitch;
import com.jtrent238.youtubers.blocks.BlockDanTDMOre;
import com.jtrent238.youtubers.blocks.BlockHeyItsLuigiEgg;
import com.jtrent238.youtubers.blocks.BlockHeyItsLuigiOre;
import com.jtrent238.youtubers.blocks.BlockJoy_Rider_2284Ore;
import com.jtrent238.youtubers.blocks.BlockLaurie201Ore;
import com.jtrent238.youtubers.blocks.BlockSethBlingOre;
import com.jtrent238.youtubers.blocks.BlockblohodOre;
import com.jtrent238.youtubers.blocks.Blockjtrent238Ore;
import com.jtrent238.youtubers.blocks.BlockskythekidRSOre;
import com.jtrent238.youtubers.blocks.BlockxJSQOre;
import com.jtrent238.youtubers.blocks.materials.BlockAntvenom;
import com.jtrent238.youtubers.blocks.materials.BlockDanTDM;
import com.jtrent238.youtubers.blocks.materials.BlockHeyItsLuigi;
import com.jtrent238.youtubers.blocks.materials.BlockJoy_Rider_2284;
import com.jtrent238.youtubers.blocks.materials.BlockLaurie201;
import com.jtrent238.youtubers.blocks.materials.BlockSethBling;
import com.jtrent238.youtubers.blocks.materials.Blockblohod;
import com.jtrent238.youtubers.blocks.materials.Blockjtrent238;
import com.jtrent238.youtubers.blocks.materials.BlockskythekidRS;
import com.jtrent238.youtubers.blocks.materials.BlockxJSQ;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLoader {

	//xJSQ Blocks
	public static Block BlockxJSQOre;
	public static Block BlockxJSQ;
	
	//DanTDM Blocks
	public static Block BlockDanTDMOre;
	public static Block BlockDanTDM;
	
	//SethBling Blocks
	public static Block BlockSethBlingOre;
	public static Block BlockSethBling;

	//Laurie201 Blocks
	public static Block BlockLaurie201Ore;
	public static Block BlockLaurie201;

	//blohod Blocks
	public static Block BlockblohodOre;
	public static Block Blockblohod;

	//skythekidRS Blocks
	public static Block BlockskythekidRSOre;
	public static Block BlockskythekidRS;
	
	//HeyItsLuigi Blocks
	public static Block BlockHeyItsLuigiOre;
	public static Block BlockHeyItsLuigi;
	public static Block BlockHeyItsLuigiEgg;

	//Antvenom Blocks
	public static Block BlockAntvenomOre;
	public static Block BlockAntvenom;
	public static Block BlockGlitch;
	
	//Joy_Rider_2284 Blocks
	public static Block BlockJoy_Rider_2284Ore;
	public static Block BlockJoy_Rider_2284;
	
	//jtrent238 Blocks
	public static Block Blockjtrent238Ore;
	public static Block Blockjtrent238;

	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {
		
		//xJSQ Blocks
		BlockxJSQOre = new BlockxJSQOre(Material.rock).setBlockName("BlockxJSQOre").setBlockTextureName("youtubers:BlockxJSQOre").setCreativeTab(YouTubers.YouTubers);
		BlockxJSQ = new BlockxJSQ(Material.iron).setBlockName("BlockxJSQ").setBlockTextureName("youtubers:BlockxJSQ").setCreativeTab(YouTubers.YouTubers);
		
		//DanTDM Blocks
		BlockDanTDMOre = new BlockDanTDMOre(Material.rock).setBlockName("BlockDanTDMOre").setBlockTextureName("youtubers:BlockDanTDMOre").setCreativeTab(YouTubers.YouTubers);
		BlockDanTDM = new BlockDanTDM(Material.iron).setBlockName("BlockDanTDM").setBlockTextureName("youtubers:BlockDanTDM").setCreativeTab(YouTubers.YouTubers);
		
		//SethBling Blocks
		BlockSethBlingOre = new BlockSethBlingOre(false).setBlockName("BlockSethBlingOre").setBlockTextureName("youtubers:BlockSethBlingOre").setCreativeTab(YouTubers.YouTubers);
		BlockSethBling = new BlockSethBling(Material.iron).setBlockName("BlockSethBling").setBlockTextureName("youtubers:BlockSethBling").setCreativeTab(YouTubers.YouTubers);
		
		//Laurie201 Blocks
		BlockLaurie201Ore = new BlockLaurie201Ore(Material.rock).setBlockName("BlockLaurie201Ore").setBlockTextureName("youtubers:BlockLaurie201Ore").setCreativeTab(YouTubers.YouTubers);
		BlockLaurie201 = new BlockLaurie201(Material.iron).setBlockName("BlockLaurie201").setBlockTextureName("youtubers:BlockLaurie201").setCreativeTab(YouTubers.YouTubers);
		
		//blohod Blocks
		BlockblohodOre = new BlockblohodOre(Material.rock).setBlockName("BlockblohodOre").setBlockTextureName("youtubers:BlockblohodOre").setCreativeTab(YouTubers.YouTubers);
		Blockblohod = new Blockblohod(Material.iron).setBlockName("Blockblohod").setBlockTextureName("youtubers:Blockblohod").setCreativeTab(YouTubers.YouTubers);
		
		//skythekidRS Blocks
		BlockskythekidRSOre = new BlockskythekidRSOre(Material.rock).setBlockName("BlockskythekidRSOre").setBlockTextureName("youtubers:BlockskythekidRSOre").setCreativeTab(YouTubers.YouTubers);
		BlockskythekidRS = new BlockskythekidRS(Material.iron).setBlockName("BlockskythekidRS").setBlockTextureName("youtubers:BlockskythekidRS").setCreativeTab(YouTubers.YouTubers);
		
		//HeyItsLuigi Blocks
		BlockHeyItsLuigiOre = new BlockHeyItsLuigiOre(Material.rock).setBlockName("BlockHeyItsLuigiOre").setBlockTextureName("youtubers:BlockHeyItsLuigiOre").setCreativeTab(YouTubers.YouTubers);
		BlockHeyItsLuigi = new BlockHeyItsLuigi(Material.iron).setBlockName("BlockHeyItsLuigi").setBlockTextureName("youtubers:BlockHeyItsLuigi").setCreativeTab(YouTubers.YouTubers);
		BlockHeyItsLuigiEgg = new BlockHeyItsLuigiEgg().setBlockName("BlockHeyItsLuigiEgg").setBlockTextureName("youtubers:BlockHeyItsLuigiEgg").setCreativeTab(YouTubers.YouTubers);
		
		//Antvenom Blocks
		BlockAntvenomOre = new BlockAntvenomOre(Material.rock).setBlockName("BlockAntvenomOre").setBlockTextureName("youtubers:BlockAntvenomOre").setCreativeTab(YouTubers.YouTubers);
		BlockAntvenom = new BlockAntvenom(Material.iron).setBlockName("BlockAntvenom").setBlockTextureName("youtubers:BlockAntvenom").setCreativeTab(YouTubers.YouTubers);
		BlockGlitch = new BlockGlitch(Material.iron).setBlockName("BlockGlitch").setBlockTextureName("youtubers:BlockGlitch").setCreativeTab(YouTubers.YouTubers);
		
		//Joy_Rider_2284 Blocks
		BlockJoy_Rider_2284Ore = new BlockJoy_Rider_2284Ore(Material.rock).setBlockName("BlockJoy_Rider_2284Ore").setBlockTextureName("youtubers:BlockJoy_Rider_2284Ore").setCreativeTab(YouTubers.YouTubers);
		BlockJoy_Rider_2284 = new BlockJoy_Rider_2284(Material.iron).setBlockName("BlockJoy_Rider_2284").setBlockTextureName("youtubers:BlockJoy_Rider_2284").setCreativeTab(YouTubers.YouTubers);
		
		//jtrent238 Blocks
		Blockjtrent238Ore = new Blockjtrent238Ore(Material.rock).setBlockName("Blockjtrent238Ore").setBlockTextureName("youtubers:Blockjtrent238Ore").setCreativeTab(YouTubers.YouTubers);
		Blockjtrent238 = new Blockjtrent238(Material.iron).setBlockName("Blockjtrent238").setBlockTextureName("youtubers:Blockjtrent238").setCreativeTab(YouTubers.YouTubers);
		
		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks() {
		
		//xJSQ Blocks
		GameRegistry.registerBlock(BlockxJSQOre, "BlockxJSQOre");
		GameRegistry.registerBlock(BlockxJSQ, "BlockxJSQ");
		
		//DanTDM Blocks
		GameRegistry.registerBlock(BlockDanTDMOre, "BlockDanTDMOre");
		GameRegistry.registerBlock(BlockDanTDM, "BlockDanTDM");
	
		//SethBling Blocks
		GameRegistry.registerBlock(BlockSethBlingOre, "BlockSethBlingOre");
		GameRegistry.registerBlock(BlockSethBling, "BlockSethBling");
		
		//Laurie201 Blocks
		GameRegistry.registerBlock(BlockLaurie201Ore, "BlockLaurie201Ore");
		GameRegistry.registerBlock(BlockLaurie201, "BlockLaurie201");
		
		//blohod Blocks
		GameRegistry.registerBlock(BlockblohodOre, "BlockblohodOre");
		GameRegistry.registerBlock(Blockblohod, "Blockblohod");
		
		//skythekidRS Blocks
		GameRegistry.registerBlock(BlockskythekidRSOre, "BlockskythekidRSOre");
		GameRegistry.registerBlock(BlockskythekidRS, "BlockskythekidRS");
		
		//HeyItsLuigi Blocks
		GameRegistry.registerBlock(BlockHeyItsLuigiOre, "BlockHeyItsLuigiOre");
		GameRegistry.registerBlock(BlockHeyItsLuigi, "BlockHeyItsLuigi");
//		GameRegistry.registerBlock(BlockHeyItsLuigiEgg, "BlockHeyItsLuigiEgg");
		
		//Antvenom Blocks
		GameRegistry.registerBlock(BlockAntvenomOre, "BlockAntvenomOre");
		GameRegistry.registerBlock(BlockAntvenom, "BlockAntvenom");
		GameRegistry.registerBlock(BlockGlitch, "BlockGlitch");
		
		//Joy_Rider_2284 Blocks
		GameRegistry.registerBlock(BlockJoy_Rider_2284Ore, "BlockJoy_Rider_2284Ore");
		GameRegistry.registerBlock(BlockJoy_Rider_2284, "BlockJoy_Rider_2284");
		
		//jtrent238 Blocks
		GameRegistry.registerBlock(Blockjtrent238Ore, "Blockjtrent238Ore");
		GameRegistry.registerBlock(Blockjtrent238, "Blockjtrent238");
		
	}

}
