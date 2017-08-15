package com.jtrent238.youtubers;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {

	
	/**
	 * Register Recipes with Game Registry.
	 */
	public static void registerRecpies(){
		addShaplessRecpies();
		addShapedRecpies();
		addsmeltigrecipies();
	}

	/**
	 * Add Shaped Recipes.
	 */
	private static void addShapedRecpies(){
		//xJSQ Crafting Recipes
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockxJSQ), "XXX", "XXX", "XXX", 'X', ItemLoader.ItemxJSQIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemxJSQSword), "I", "I", "S", 'I', ItemLoader.ItemxJSQIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemxJSQPickaxe), "III", "BSB", "BSB", 'I', ItemLoader.ItemxJSQIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemxJSQAxe), "IIB", "ISB", "BSB", 'I', ItemLoader.ItemxJSQIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemxJSQShovel), "BIB", "BSB", "BSB", 'I', ItemLoader.ItemxJSQIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemxJSQHoe), "IIB", "BSB", "BSB", 'I', ItemLoader.ItemxJSQIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemxJSQHelment), "III", "IBI", 'I', ItemLoader.ItemxJSQIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemxJSQChestplate), "IBI", "III", "III", 'I', ItemLoader.ItemxJSQIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemxJSQLeggings), "III", "IBI", "IBI", 'I', ItemLoader.ItemxJSQIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemxJSQBoots), "IBI", "IBI", 'I', ItemLoader.ItemxJSQIngot);
		
		//DanTDM Crafting Recipes
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockDanTDM), "XXX", "XXX", "XXX", 'X', ItemLoader.ItemDanTDMIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDanTDMSword), "I", "I", "S", 'I', ItemLoader.ItemDanTDMIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDanTDMPickaxe), "III", "BSB", "BSB", 'I', ItemLoader.ItemDanTDMIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDanTDMAxe), "IIB", "ISB", "BSB", 'I', ItemLoader.ItemDanTDMIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDanTDMShovel), "BIB", "BSB", "BSB", 'I', ItemLoader.ItemDanTDMIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDanTDMHoe), "IIB", "BSB", "BSB", 'I', ItemLoader.ItemDanTDMIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDanTDMHelment), "III", "IBI", 'I', ItemLoader.ItemDanTDMIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDanTDMChestplate), "IBI", "III", "III", 'I', ItemLoader.ItemDanTDMIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDanTDMLeggings), "III", "IBI", "IBI", 'I', ItemLoader.ItemDanTDMIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDanTDMBoots), "IBI", "IBI", 'I', ItemLoader.ItemDanTDMIngot);
		
		//SethBling Crafting Recipes
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockSethBling), "XXX", "XXX", "XXX", 'X', ItemLoader.ItemSethBlingIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemSethBlingSword), "I", "I", "S", 'I', ItemLoader.ItemSethBlingIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemSethBlingPickaxe), "III", "BSB", "BSB", 'I', ItemLoader.ItemSethBlingIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemSethBlingAxe), "IIB", "ISB", "BSB", 'I', ItemLoader.ItemSethBlingIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemSethBlingShovel), "BIB", "BSB", "BSB", 'I', ItemLoader.ItemSethBlingIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemSethBlingHoe), "IIB", "BSB", "BSB", 'I', ItemLoader.ItemSethBlingIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemSethBlingHelment), "III", "IBI", 'I', ItemLoader.ItemSethBlingIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemSethBlingChestplate), "IBI", "III", "III", 'I', ItemLoader.ItemSethBlingIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemSethBlingLeggings), "III", "IBI", "IBI", 'I', ItemLoader.ItemSethBlingIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemSethBlingBoots), "IBI", "IBI", 'I', ItemLoader.ItemSethBlingIngot);
		
		//Laurie201 Crafting Recipes
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockLaurie201), "XXX", "XXX", "XXX", 'X', ItemLoader.ItemLaurie201Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemLaurie201Sword), "I", "I", "S", 'I', ItemLoader.ItemLaurie201Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemLaurie201Pickaxe), "III", "BSB", "BSB", 'I', ItemLoader.ItemLaurie201Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemLaurie201Axe), "IIB", "ISB", "BSB", 'I', ItemLoader.ItemLaurie201Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemLaurie201Shovel), "BIB", "BSB", "BSB", 'I', ItemLoader.ItemLaurie201Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemLaurie201Hoe), "IIB", "BSB", "BSB", 'I', ItemLoader.ItemLaurie201Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemLaurie201Helment), "III", "IBI", 'I', ItemLoader.ItemLaurie201Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemLaurie201Chestplate), "IBI", "III", "III", 'I', ItemLoader.ItemLaurie201Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemLaurie201Leggings), "III", "IBI", "IBI", 'I', ItemLoader.ItemLaurie201Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemLaurie201Boots), "IBI", "IBI", 'I', ItemLoader.ItemLaurie201Ingot);
		
		//blohod Crafting Recipes
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.Blockblohod), "XXX", "XXX", "XXX", 'X', ItemLoader.ItemblohodIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemblohodSword), "I", "I", "S", 'I', ItemLoader.ItemblohodIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemblohodPickaxe), "III", "BSB", "BSB", 'I', ItemLoader.ItemblohodIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemblohodAxe), "IIB", "ISB", "BSB", 'I', ItemLoader.ItemblohodIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemblohodShovel), "BIB", "BSB", "BSB", 'I', ItemLoader.ItemblohodIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemblohodHoe), "IIB", "BSB", "BSB", 'I', ItemLoader.ItemblohodIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemblohodHelment), "III", "IBI", 'I', ItemLoader.ItemblohodIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemblohodChestplate), "IBI", "III", "III", 'I', ItemLoader.ItemblohodIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemblohodLeggings), "III", "IBI", "IBI", 'I', ItemLoader.ItemblohodIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemblohodBoots), "IBI", "IBI", 'I', ItemLoader.ItemblohodIngot);

		//skythekidRS Crafting Recipes
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockskythekidRS), "XXX", "XXX", "XXX", 'X', ItemLoader.ItemskythekidRSIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemskythekidRSSword), "I", "I", "S", 'I', ItemLoader.ItemskythekidRSIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemskythekidRSPickaxe), "III", "BSB", "BSB", 'I', ItemLoader.ItemskythekidRSIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemskythekidRSAxe), "IIB", "ISB", "BSB", 'I', ItemLoader.ItemskythekidRSIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemskythekidRSShovel), "BIB", "BSB", "BSB", 'I', ItemLoader.ItemskythekidRSIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemskythekidRSHoe), "IIB", "BSB", "BSB", 'I', ItemLoader.ItemskythekidRSIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemskythekidRSHelment), "III", "IBI", 'I', ItemLoader.ItemskythekidRSIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemskythekidRSChestplate), "IBI", "III", "III", 'I', ItemLoader.ItemskythekidRSIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemskythekidRSLeggings), "III", "IBI", "IBI", 'I', ItemLoader.ItemskythekidRSIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemskythekidRSBoots), "IBI", "IBI", 'I', ItemLoader.ItemskythekidRSIngot);

		//HeyItsLuigi Crafting Recipes
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockHeyItsLuigi), "XXX", "XXX", "XXX", 'X', ItemLoader.ItemHeyItsLuigiIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemHeyItsLuigiSword), "I", "I", "S", 'I', ItemLoader.ItemHeyItsLuigiIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemHeyItsLuigiPickaxe), "III", "BSB", "BSB", 'I', ItemLoader.ItemHeyItsLuigiIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemHeyItsLuigiAxe), "IIB", "ISB", "BSB", 'I', ItemLoader.ItemHeyItsLuigiIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemHeyItsLuigiShovel), "BIB", "BSB", "BSB", 'I', ItemLoader.ItemHeyItsLuigiIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemHeyItsLuigiHoe), "IIB", "BSB", "BSB", 'I', ItemLoader.ItemHeyItsLuigiIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemHeyItsLuigiHelment), "III", "IBI", 'I', ItemLoader.ItemHeyItsLuigiIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemHeyItsLuigiChestplate), "IBI", "III", "III", 'I', ItemLoader.ItemHeyItsLuigiIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemHeyItsLuigiLeggings), "III", "IBI", "IBI", 'I', ItemLoader.ItemHeyItsLuigiIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemHeyItsLuigiBoots), "IBI", "IBI", 'I', ItemLoader.ItemHeyItsLuigiIngot);

		//Antvenom Crafting Recipes
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockAntvenom), "XXX", "XXX", "XXX", 'X', ItemLoader.ItemAntvenomIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemAntvenomSword), "I", "I", "S", 'I', ItemLoader.ItemAntvenomIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemAntvenomPickaxe), "III", "BSB", "BSB", 'I', ItemLoader.ItemAntvenomIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemAntvenomAxe), "IIB", "ISB", "BSB", 'I', ItemLoader.ItemAntvenomIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemAntvenomShovel), "BIB", "BSB", "BSB", 'I', ItemLoader.ItemAntvenomIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemAntvenomHoe), "IIB", "BSB", "BSB", 'I', ItemLoader.ItemAntvenomIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemAntvenomHelment), "III", "IBI", 'I', ItemLoader.ItemAntvenomIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemAntvenomChestplate), "IBI", "III", "III", 'I', ItemLoader.ItemAntvenomIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemAntvenomLeggings), "III", "IBI", "IBI", 'I', ItemLoader.ItemAntvenomIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemAntvenomBoots), "IBI", "IBI", 'I', ItemLoader.ItemAntvenomIngot);

		//Joy_Rider_2284 Crafting Recipes
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.BlockJoy_Rider_2284), "XXX", "XXX", "XXX", 'X', ItemLoader.ItemJoy_Rider_2284Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemJoy_Rider_2284Sword), "I", "I", "S", 'I', ItemLoader.ItemJoy_Rider_2284Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemJoy_Rider_2284Pickaxe), "III", "BSB", "BSB", 'I', ItemLoader.ItemJoy_Rider_2284Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemJoy_Rider_2284Axe), "IIB", "ISB", "BSB", 'I', ItemLoader.ItemJoy_Rider_2284Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemJoy_Rider_2284Shovel), "BIB", "BSB", "BSB", 'I', ItemLoader.ItemJoy_Rider_2284Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemJoy_Rider_2284Hoe), "IIB", "BSB", "BSB", 'I', ItemLoader.ItemJoy_Rider_2284Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemJoy_Rider_2284Helment), "III", "IBI", 'I', ItemLoader.ItemJoy_Rider_2284Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemJoy_Rider_2284Chestplate), "IBI", "III", "III", 'I', ItemLoader.ItemJoy_Rider_2284Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemJoy_Rider_2284Leggings), "III", "IBI", "IBI", 'I', ItemLoader.ItemJoy_Rider_2284Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemJoy_Rider_2284Boots), "IBI", "IBI", 'I', ItemLoader.ItemJoy_Rider_2284Ingot);

		//jtrent238 Crafting Recipes
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.Blockjtrent238), "XXX", "XXX", "XXX", 'X', ItemLoader.Itemjtrent238Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Itemjtrent238Sword), "I", "I", "S", 'I', ItemLoader.Itemjtrent238Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Itemjtrent238Pickaxe), "III", "BSB", "BSB", 'I', ItemLoader.Itemjtrent238Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Itemjtrent238Axe), "IIB", "ISB", "BSB", 'I', ItemLoader.Itemjtrent238Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Itemjtrent238Shovel), "BIB", "BSB", "BSB", 'I', ItemLoader.Itemjtrent238Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Itemjtrent238Hoe), "IIB", "BSB", "BSB", 'I', ItemLoader.Itemjtrent238Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Itemjtrent238Helment), "III", "IBI", 'I', ItemLoader.Itemjtrent238Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Itemjtrent238Chestplate), "IBI", "III", "III", 'I', ItemLoader.Itemjtrent238Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Itemjtrent238Leggings), "III", "IBI", "IBI", 'I', ItemLoader.Itemjtrent238Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Itemjtrent238Boots), "IBI", "IBI", 'I', ItemLoader.Itemjtrent238Ingot);

		//_MrGregor_ Crafting Recipes
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.Block_MrGregor_), "XXX", "XXX", "XXX", 'X', ItemLoader.Item_MrGregor_Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Item_MrGregor_Sword), "I", "I", "S", 'I', ItemLoader.Item_MrGregor_Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Item_MrGregor_Pickaxe), "III", "BSB", "BSB", 'I', ItemLoader.Item_MrGregor_Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Item_MrGregor_Axe), "IIB", "ISB", "BSB", 'I', ItemLoader.Item_MrGregor_Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Item_MrGregor_Shovel), "BIB", "BSB", "BSB", 'I', ItemLoader.Item_MrGregor_Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Item_MrGregor_Hoe), "IIB", "BSB", "BSB", 'I', ItemLoader.Item_MrGregor_Ingot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Item_MrGregor_Helment), "III", "IBI", 'I', ItemLoader.Item_MrGregor_Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Item_MrGregor_Chestplate), "IBI", "III", "III", 'I', ItemLoader.Item_MrGregor_Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Item_MrGregor_Leggings), "III", "IBI", "IBI", 'I', ItemLoader.Item_MrGregor_Ingot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.Item_MrGregor_Boots), "IBI", "IBI", 'I', ItemLoader.Item_MrGregor_Ingot);

	}
	
	/**
	 * Add Shapeless Recipes.
	 */
	private static void addShaplessRecpies(){
		
		}
	/**
	 * Add Smelting Recipes
	 */
	private static void addsmeltigrecipies(){
		GameRegistry.addSmelting(BlockLoader.BlockxJSQOre, new ItemStack (ItemLoader.ItemxJSQIngot, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockDanTDMOre, new ItemStack (ItemLoader.ItemDanTDMIngot, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockSethBlingOre, new ItemStack (ItemLoader.ItemSethBlingIngot, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockLaurie201Ore, new ItemStack (ItemLoader.ItemLaurie201Ingot, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockblohodOre, new ItemStack (ItemLoader.ItemblohodIngot, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockskythekidRSOre, new ItemStack (ItemLoader.ItemskythekidRSIngot, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockHeyItsLuigiOre, new ItemStack (ItemLoader.ItemHeyItsLuigiIngot, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockAntvenomOre, new ItemStack (ItemLoader.ItemAntvenomIngot, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.BlockJoy_Rider_2284Ore, new ItemStack (ItemLoader.ItemJoy_Rider_2284Ingot, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.Blockjtrent238Ore, new ItemStack (ItemLoader.Itemjtrent238Ingot, 1), 2F );
		GameRegistry.addSmelting(BlockLoader.Block_MrGregor_Ore, new ItemStack (ItemLoader.Item_MrGregor_Ingot, 1), 2F );
		
		
		}
	
	}

	
	
	
