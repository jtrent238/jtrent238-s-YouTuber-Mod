package com.jtrent238.youtubers;

import com.jtrent238.youtubers.blocks.BlockAntvenomOre;
import com.jtrent238.youtubers.blocks.BlockBajanCanadianOre;
import com.jtrent238.youtubers.blocks.BlockGlitch;
import com.jtrent238.youtubers.blocks.BlockDanTDMOre;
import com.jtrent238.youtubers.blocks.BlockDanTDM_Logo;
import com.jtrent238.youtubers.blocks.BlockDecoCommandBlock_Chain;
import com.jtrent238.youtubers.blocks.BlockDecoCommandBlock_Impulse;
import com.jtrent238.youtubers.blocks.BlockDecoCommandBlock_Repeat;
import com.jtrent238.youtubers.blocks.BlockEckoSoldierOre;
import com.jtrent238.youtubers.blocks.BlockHeyItsLuigiEgg;
import com.jtrent238.youtubers.blocks.BlockHeyItsLuigiOre;
import com.jtrent238.youtubers.blocks.BlockJoy_Rider_2284Ore;
import com.jtrent238.youtubers.blocks.BlockLaurie201Ore;
import com.jtrent238.youtubers.blocks.BlockMagna_InvictusOre;
import com.jtrent238.youtubers.blocks.BlockRealThinknoodlesOre;
import com.jtrent238.youtubers.blocks.BlockSSundeeOre;
import com.jtrent238.youtubers.blocks.BlockSethBlingOre;
import com.jtrent238.youtubers.blocks.BlockTerraCube;
import com.jtrent238.youtubers.blocks.Block_MrGregor_Ore;
import com.jtrent238.youtubers.blocks.BlockblohodOre;
import com.jtrent238.youtubers.blocks.Blockjtrent238Ore;
import com.jtrent238.youtubers.blocks.BlockskythekidRSOre;
import com.jtrent238.youtubers.blocks.BlockxJSQOre;
import com.jtrent238.youtubers.blocks.materials.BlockAntvenom;
import com.jtrent238.youtubers.blocks.materials.BlockBajanCanadian;
import com.jtrent238.youtubers.blocks.materials.BlockDanTDM;
import com.jtrent238.youtubers.blocks.materials.BlockEckoSoldier;
import com.jtrent238.youtubers.blocks.materials.BlockHeyItsLuigi;
import com.jtrent238.youtubers.blocks.materials.BlockJoy_Rider_2284;
import com.jtrent238.youtubers.blocks.materials.BlockLaurie201;
import com.jtrent238.youtubers.blocks.materials.BlockMagna_Invictus;
import com.jtrent238.youtubers.blocks.materials.BlockRealThinknoodles;
import com.jtrent238.youtubers.blocks.materials.BlockSSundee;
import com.jtrent238.youtubers.blocks.materials.BlockSethBling;
import com.jtrent238.youtubers.blocks.materials.Block_MrGregor_;
import com.jtrent238.youtubers.blocks.materials.Blockblohod;
import com.jtrent238.youtubers.blocks.materials.Blockjtrent238;
import com.jtrent238.youtubers.blocks.materials.BlockskythekidRS;
import com.jtrent238.youtubers.blocks.materials.BlockxJSQ;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLoader {

	public static Block BlockDecoCommandBlock_Impulse;
	public static Block BlockDecoCommandBlock_Chain;
	public static Block BlockDecoCommandBlock_Repeat;
	
	//xJSQ Blocks
	public static Block BlockxJSQOre;
	public static Block BlockxJSQ;
	
	//DanTDM Blocks
	public static Block BlockDanTDMOre;
	public static Block BlockDanTDM;
	public static Block BlockDanTDM_Logo;
	
	
	//SethBling Blocks
	public static Block BlockSethBlingOre;
	public static Block BlockSethBling;

	//Laurie201 Blocks
	public static Block BlockLaurie201Ore;
	public static Block BlockLaurie201;
	public static Block BlockTerraCube;

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

	//_MrGregor_ Blocks
	public static Block Block_MrGregor_Ore;
	public static Block Block_MrGregor_;
	
	//SSundee Blocks
	public static Block BlockSSundeeOre;
	public static Block BlockSSundee;

	//Magna_Invictus Blocks
	public static Block BlockMagna_InvictusOre;
	public static Block BlockMagna_Invictus;

	//EckoSoldier Blocks
	public static Block BlockEckoSoldierOre;
	public static Block BlockEckoSoldier;

	//BajanCanadian Blocks
	public static Block BlockBajanCanadianOre;
	public static Block BlockBajanCanadian;
	
	//RealThinknoodles Blocks
	public static Block BlockRealThinknoodlesOre;
	public static Block BlockRealThinknoodles;

	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {
		
		BlockDecoCommandBlock_Impulse = new BlockDecoCommandBlock_Impulse(Material.rock).setBlockName("BlockDecoCommandBlock_Impulse").setBlockTextureName("youtubers:BlockDecoCommandBlock_Impulse").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockDecoCommandBlock_Chain = new BlockDecoCommandBlock_Chain(Material.rock).setBlockName("BlockDecoCommandBlock_Chain").setBlockTextureName("youtubers:BlockDecoCommandBlock_Chain").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockDecoCommandBlock_Repeat = new BlockDecoCommandBlock_Repeat(Material.rock).setBlockName("BlockDecoCommandBlock_Repeat").setBlockTextureName("youtubers:BlockDecoCommandBlock_Repeat").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		
		//xJSQ Blocks
		BlockxJSQOre = new BlockxJSQOre(Material.rock).setBlockName("BlockxJSQOre").setBlockTextureName("youtubers:BlockxJSQOre").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockxJSQ = new BlockxJSQ(Material.iron).setBlockName("BlockxJSQ").setBlockTextureName("youtubers:BlockxJSQ").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		
		//DanTDM Blocks
		BlockDanTDMOre = new BlockDanTDMOre(Material.rock).setBlockName("BlockDanTDMOre").setBlockTextureName("youtubers:BlockDanTDMOre").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockDanTDM = new BlockDanTDM(Material.iron).setBlockName("BlockDanTDM").setBlockTextureName("youtubers:BlockDanTDM").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockDanTDM_Logo = new BlockDanTDM_Logo(Material.iron).setBlockName("BlockDanTDM_Logo").setBlockTextureName("youtubers:BlockDanTDM_Logo").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		
		//SethBling Blocks
		BlockSethBlingOre = new BlockSethBlingOre(false).setBlockName("BlockSethBlingOre").setBlockTextureName("youtubers:BlockSethBlingOre").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockSethBling = new BlockSethBling(Material.iron).setBlockName("BlockSethBling").setBlockTextureName("youtubers:BlockSethBling").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		
		//Laurie201 Blocks
		BlockLaurie201Ore = new BlockLaurie201Ore(Material.rock).setBlockName("BlockLaurie201Ore").setBlockTextureName("youtubers:BlockLaurie201Ore").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockLaurie201 = new BlockLaurie201(Material.iron).setBlockName("BlockLaurie201").setBlockTextureName("youtubers:BlockLaurie201").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockTerraCube = new BlockTerraCube(Material.iron).setBlockName("BlockTerraCube").setBlockTextureName("youtubers:BlockTerraCube").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		
		//blohod Blocks
		BlockblohodOre = new BlockblohodOre(Material.rock).setBlockName("BlockblohodOre").setBlockTextureName("youtubers:BlockblohodOre").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		Blockblohod = new Blockblohod(Material.iron).setBlockName("Blockblohod").setBlockTextureName("youtubers:Blockblohod").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		
		//skythekidRS Blocks
		BlockskythekidRSOre = new BlockskythekidRSOre(Material.rock).setBlockName("BlockskythekidRSOre").setBlockTextureName("youtubers:BlockskythekidRSOre").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockskythekidRS = new BlockskythekidRS(Material.iron).setBlockName("BlockskythekidRS").setBlockTextureName("youtubers:BlockskythekidRS").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		
		//HeyItsLuigi Blocks
		BlockHeyItsLuigiOre = new BlockHeyItsLuigiOre(Material.rock).setBlockName("BlockHeyItsLuigiOre").setBlockTextureName("youtubers:BlockHeyItsLuigiOre").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockHeyItsLuigi = new BlockHeyItsLuigi(Material.iron).setBlockName("BlockHeyItsLuigi").setBlockTextureName("youtubers:BlockHeyItsLuigi").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockHeyItsLuigiEgg = new BlockHeyItsLuigiEgg().setBlockName("BlockHeyItsLuigiEgg").setBlockTextureName("youtubers:BlockHeyItsLuigiEgg").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		
		//Antvenom Blocks
		BlockAntvenomOre = new BlockAntvenomOre(Material.rock).setBlockName("BlockAntvenomOre").setBlockTextureName("youtubers:BlockAntvenomOre").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockAntvenom = new BlockAntvenom(Material.iron).setBlockName("BlockAntvenom").setBlockTextureName("youtubers:BlockAntvenom").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockGlitch = new BlockGlitch(Material.iron).setBlockName("BlockGlitch").setBlockTextureName("youtubers:BlockGlitch").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		
		//Joy_Rider_2284 Blocks
		BlockJoy_Rider_2284Ore = new BlockJoy_Rider_2284Ore(Material.rock).setBlockName("BlockJoy_Rider_2284Ore").setBlockTextureName("youtubers:BlockJoy_Rider_2284Ore").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockJoy_Rider_2284 = new BlockJoy_Rider_2284(Material.iron).setBlockName("BlockJoy_Rider_2284").setBlockTextureName("youtubers:BlockJoy_Rider_2284").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		
		//jtrent238 Blocks
		Blockjtrent238Ore = new Blockjtrent238Ore(Material.rock).setBlockName("Blockjtrent238Ore").setBlockTextureName("youtubers:Blockjtrent238Ore").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		Blockjtrent238 = new Blockjtrent238(Material.iron).setBlockName("Blockjtrent238").setBlockTextureName("youtubers:Blockjtrent238").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		
		//_MrGregor_ Blocks
		Block_MrGregor_Ore = new Block_MrGregor_Ore(Material.rock).setBlockName("Block_MrGregor_Ore").setBlockTextureName("youtubers:Block_MrGregor_Ore").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		Block_MrGregor_ = new Block_MrGregor_(Material.iron).setBlockName("Block_MrGregor_").setBlockTextureName("youtubers:Block_MrGregor_").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		
		//SSundee Blocks
		BlockSSundeeOre = new BlockSSundeeOre(Material.rock).setBlockName("BlockSSundeeOre").setBlockTextureName("youtubers:BlockSSundeeOre").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockSSundee = new BlockSSundee(Material.iron).setBlockName("BlockSSundee").setBlockTextureName("youtubers:BlockSSundee").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		
		//Magna_Invictus Blocks
		BlockMagna_InvictusOre = new BlockMagna_InvictusOre(Material.rock).setBlockName("BlockMagna_InvictusOre").setBlockTextureName("youtubers:BlockMagna_InvictusOre").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockMagna_Invictus = new BlockMagna_Invictus(Material.iron).setBlockName("BlockMagna_Invictus").setBlockTextureName("youtubers:BlockMagna_Invictus").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
	
		//EckoSoldier Blocks
		BlockEckoSoldierOre = new BlockEckoSoldierOre(Material.rock).setBlockName("BlockEckoSoldierOre").setBlockTextureName("youtubers:BlockEckoSoldierOre").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockEckoSoldier = new BlockEckoSoldier(Material.iron).setBlockName("BlockEckoSoldier").setBlockTextureName("youtubers:BlockEckoSoldier").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
	
		//BajanCanadian Blocks
		BlockBajanCanadianOre = new BlockBajanCanadianOre(Material.rock).setBlockName("BlockBajanCanadianOre").setBlockTextureName("youtubers:BlockBajanCanadianOre").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockBajanCanadian = new BlockBajanCanadian(Material.iron).setBlockName("BlockBajanCanadian").setBlockTextureName("youtubers:BlockBajanCanadian").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		
		//RealThinknoodles Blocks
		BlockRealThinknoodlesOre = new BlockRealThinknoodlesOre(Material.rock).setBlockName("BlockRealThinknoodlesOre").setBlockTextureName("youtubers:BlockRealThinknoodlesOre").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
		BlockRealThinknoodles = new BlockRealThinknoodles(Material.iron).setBlockName("BlockRealThinknoodles").setBlockTextureName("youtubers:BlockRealThinknoodles").setCreativeTab(YouTubers.YouTubers).setHardness(5F);
	
		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks() {
		
		GameRegistry.registerBlock(BlockDecoCommandBlock_Impulse, "BlockDecoCommandBlock_Impulse");
		GameRegistry.registerBlock(BlockDecoCommandBlock_Chain, "BlockDecoCommandBlock_Chain");
		GameRegistry.registerBlock(BlockDecoCommandBlock_Repeat, "BlockDecoCommandBlock_Repeat");
		
		//xJSQ Blocks
		GameRegistry.registerBlock(BlockxJSQOre, "BlockxJSQOre");
		GameRegistry.registerBlock(BlockxJSQ, "BlockxJSQ");
		
		//DanTDM Blocks
		GameRegistry.registerBlock(BlockDanTDMOre, "BlockDanTDMOre");
		GameRegistry.registerBlock(BlockDanTDM, "BlockDanTDM");
		GameRegistry.registerBlock(BlockDanTDM_Logo, "BlockDanTDM_Logo");
		
	
		//SethBling Blocks
		GameRegistry.registerBlock(BlockSethBlingOre, "BlockSethBlingOre");
		GameRegistry.registerBlock(BlockSethBling, "BlockSethBling");
		
		//Laurie201 Blocks
		GameRegistry.registerBlock(BlockLaurie201Ore, "BlockLaurie201Ore");
		GameRegistry.registerBlock(BlockLaurie201, "BlockLaurie201");
		GameRegistry.registerBlock(BlockTerraCube, "BlockTerraCube");
		
		//blohod Blocks
		GameRegistry.registerBlock(BlockblohodOre, "BlockblohodOre");
		GameRegistry.registerBlock(Blockblohod, "Blockblohod");
		
		//skythekidRS Blocks
		GameRegistry.registerBlock(BlockskythekidRSOre, "BlockskythekidRSOre");
		GameRegistry.registerBlock(BlockskythekidRS, "BlockskythekidRS");
		
		//HeyItsLuigi Blocks
		GameRegistry.registerBlock(BlockHeyItsLuigiOre, "BlockHeyItsLuigiOre");
		GameRegistry.registerBlock(BlockHeyItsLuigi, "BlockHeyItsLuigi");
		GameRegistry.registerBlock(BlockHeyItsLuigiEgg, "BlockHeyItsLuigiEgg");
		
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
		
		//_MrGregor_ Blocks
		GameRegistry.registerBlock(Block_MrGregor_Ore, "Block_MrGregor_Ore");
		GameRegistry.registerBlock(Block_MrGregor_, "Block_MrGregor_");
		
		//SSundee Blocks
		GameRegistry.registerBlock(BlockSSundeeOre, "BlockSSundeeOre");
		GameRegistry.registerBlock(BlockSSundee, "BlockSSundee");
		
		//Magna_Invictus Blocks
		GameRegistry.registerBlock(BlockMagna_InvictusOre, "BlockMagna_InvictusOre");
		GameRegistry.registerBlock(BlockMagna_Invictus, "BlockMagna_Invictus");

		//EckoSoldier Blocks
		GameRegistry.registerBlock(BlockEckoSoldierOre, "BlockEckoSoldierOre");
		GameRegistry.registerBlock(BlockEckoSoldier, "BlockEckoSoldier");

		//BajanCanadian Blocks
		GameRegistry.registerBlock(BlockBajanCanadianOre, "BlockBajanCanadianOre");
		GameRegistry.registerBlock(BlockBajanCanadian, "BlockBajanCanadian");

		//RealThinknoodles Blocks
		GameRegistry.registerBlock(BlockRealThinknoodlesOre, "BlockRealThinknoodlesOre");
		GameRegistry.registerBlock(BlockRealThinknoodles, "BlockRealThinknoodles");

	}

}
