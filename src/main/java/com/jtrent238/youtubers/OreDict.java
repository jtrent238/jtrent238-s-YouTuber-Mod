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
		OreDictionary.registerOre("ore_DanTDM",     BlockLoader.BlockDanTDMOre);
		OreDictionary.registerOre("ore_SethBling",     BlockLoader.BlockSethBlingOre);
		OreDictionary.registerOre("ore_Laurie201",     BlockLoader.BlockLaurie201Ore);
		OreDictionary.registerOre("ore_blohod",     BlockLoader.BlockblohodOre);
		OreDictionary.registerOre("ore_skythekidRS",     BlockLoader.BlockskythekidRSOre);
		OreDictionary.registerOre("ore_HeyItsLuigi",     BlockLoader.BlockHeyItsLuigiOre);
		OreDictionary.registerOre("ore_Antvenom",     BlockLoader.BlockAntvenomOre);
		OreDictionary.registerOre("ore_Joy_Rider_2284",     BlockLoader.BlockJoy_Rider_2284Ore);
		OreDictionary.registerOre("ore_jtrent238",     BlockLoader.Blockjtrent238Ore);
		OreDictionary.registerOre("ore__MrGregor_",     BlockLoader.Block_MrGregor_Ore);
		//OreDictionary.registerOre("ore_DanTDM",     BlockLoader.BlockDanTDMOre);
		
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
        

		
	}

}
