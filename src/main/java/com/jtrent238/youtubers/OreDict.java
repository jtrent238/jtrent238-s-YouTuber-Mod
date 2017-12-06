package com.jtrent238.youtubers;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {

	public static void addores() {

		

		OreDictionary.registerOre("ore_xJSQ",     BlockLoader.BlockxJSQOre);
				OreDictionary.registerOre("ingot_xJSQ",     ItemLoader.ItemxJSQIngot);
				OreDictionary.registerOre("block_xJSQ",     BlockLoader.BlockxJSQ);

		OreDictionary.registerOre("ore_DanTDM",     BlockLoader.BlockDanTDMOre);
				OreDictionary.registerOre("ingot_DanTDM",     ItemLoader.ItemDanTDMIngot);
				OreDictionary.registerOre("block_DanTDM",     BlockLoader.BlockDanTDM);

		OreDictionary.registerOre("ore_SethBling",     BlockLoader.BlockSethBlingOre);
				OreDictionary.registerOre("ingot_SethBling",     ItemLoader.ItemSethBlingIngot);
				OreDictionary.registerOre("block_SethBling",     BlockLoader.BlockSethBling);

		OreDictionary.registerOre("ore_Laurie201",     BlockLoader.BlockLaurie201Ore);
				OreDictionary.registerOre("ingot_Laurie201",     ItemLoader.ItemLaurie201Ingot);
				OreDictionary.registerOre("block_Laurie201",     BlockLoader.BlockLaurie201);

		OreDictionary.registerOre("ore_blohod",     BlockLoader.BlockblohodOre);
				OreDictionary.registerOre("ingot_blohod",     ItemLoader.ItemblohodIngot);
				OreDictionary.registerOre("block_blohod",     BlockLoader.Blockblohod);

		OreDictionary.registerOre("ore_skythekidRS",     BlockLoader.BlockskythekidRSOre);
				OreDictionary.registerOre("ingot_skythekidRS",     ItemLoader.ItemskythekidRSIngot);
				OreDictionary.registerOre("block_skythekidRS",     BlockLoader.BlockskythekidRS);

		OreDictionary.registerOre("ore_HeyItsLuigi",     BlockLoader.BlockHeyItsLuigiOre);
				OreDictionary.registerOre("ingot_HeyItsLuigi",     ItemLoader.ItemHeyItsLuigiIngot);
				OreDictionary.registerOre("block_HeyItsLuigi",     BlockLoader.BlockHeyItsLuigi);

		OreDictionary.registerOre("ore_Antvenom",     BlockLoader.BlockAntvenomOre);
				OreDictionary.registerOre("ingot_Antvenom",     ItemLoader.ItemAntvenomIngot);
				OreDictionary.registerOre("block_Antvenom",     BlockLoader.BlockAntvenom);

		OreDictionary.registerOre("ore_Joy_Rider_2284",     BlockLoader.BlockJoy_Rider_2284Ore);
				OreDictionary.registerOre("ingot_Joy_Rider_2284",     ItemLoader.ItemJoy_Rider_2284Ingot);
				OreDictionary.registerOre("block_Joy_Rider_2284",     BlockLoader.BlockJoy_Rider_2284);

		OreDictionary.registerOre("ore_jtrent238",     BlockLoader.Blockjtrent238Ore);
				OreDictionary.registerOre("ingot_jtrent238",     ItemLoader.Itemjtrent238Ingot);
				OreDictionary.registerOre("block_jtrent238",     BlockLoader.Blockjtrent238);

		OreDictionary.registerOre("ore__MrGregor_",     BlockLoader.Block_MrGregor_Ore);
				OreDictionary.registerOre("ingot__MrGregor_",     ItemLoader.Item_MrGregor_Ingot);
				OreDictionary.registerOre("block__MrGregor_",     BlockLoader.Block_MrGregor_);

		OreDictionary.registerOre("ore_SSundee",     BlockLoader.BlockSSundeeOre);
				OreDictionary.registerOre("ingot_SSundee",     ItemLoader.ItemSSundeeIngot);
				OreDictionary.registerOre("block_SSundee",     BlockLoader.BlockSSundee);
				
		OreDictionary.registerOre("ore_Magna_Invictus",     BlockLoader.BlockMagna_InvictusOre);
				OreDictionary.registerOre("ingot_Magna_Invictus",     ItemLoader.ItemMagna_InvictusIngot);
				OreDictionary.registerOre("block_Magna_Invictus",     BlockLoader.BlockMagna_Invictus);

		OreDictionary.registerOre("ore_EckoSoldier",     BlockLoader.BlockEckoSoldierOre);
				OreDictionary.registerOre("ingot_EckoSoldier",     ItemLoader.ItemEckoSoldierIngot);
				OreDictionary.registerOre("block_EckoSoldier",     BlockLoader.BlockEckoSoldier);
		
		OreDictionary.registerOre("ore_BajanCanadian",     BlockLoader.BlockBajanCanadianOre);
				OreDictionary.registerOre("ingot_BajanCanadian",     ItemLoader.ItemBajanCanadianIngot);
				OreDictionary.registerOre("block_BajanCanadian",     BlockLoader.BlockBajanCanadian);

		
		addItems();
	}

	private static void addItems() {


		// Build our list of items to replace with ore tags
        Map<ItemStack, String> replacements = new HashMap<ItemStack, String>();
        replacements.put(new ItemStack(ItemLoader.ItemxJSQIngot), "ingot_xJSQ");
        replacements.put(new ItemStack(ItemLoader.ItemDanTDMIngot), "ingot_DanTDM");
        replacements.put(new ItemStack(ItemLoader.ItemSethBlingIngot), "ingot_SethBling");
        replacements.put(new ItemStack(ItemLoader.ItemLaurie201Ingot), "ingot_Laurie201");
        replacements.put(new ItemStack(ItemLoader.ItemblohodIngot), "ingot_blohod");
        replacements.put(new ItemStack(ItemLoader.ItemskythekidRSIngot), "ingot_skythekidRS");
        replacements.put(new ItemStack(ItemLoader.ItemHeyItsLuigiIngot), "ingot_HeyItsLuigi");
        replacements.put(new ItemStack(ItemLoader.ItemAntvenomIngot), "ingot_Antvenom");
        replacements.put(new ItemStack(ItemLoader.ItemJoy_Rider_2284Ingot), "ingot_Joy_Rider_2284");
        replacements.put(new ItemStack(ItemLoader.Itemjtrent238Ingot), "ingot_jtrent238");
        replacements.put(new ItemStack(ItemLoader.Item_MrGregor_Ingot), "ingot__MrGregor_");
        replacements.put(new ItemStack(ItemLoader.ItemSSundeeIngot), "ingot_SSundee");
        replacements.put(new ItemStack(ItemLoader.ItemMagna_InvictusIngot), "ingot_Magna_Invictus");
        replacements.put(new ItemStack(ItemLoader.ItemEckoSoldierIngot), "ingot_EckoSoldier");
        replacements.put(new ItemStack(ItemLoader.ItemBajanCanadianIngot), "ingot_BajanCanadian");
		
	}

}
