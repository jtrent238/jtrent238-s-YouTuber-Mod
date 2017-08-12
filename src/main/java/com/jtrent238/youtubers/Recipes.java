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
		
		}
	
	}

	
	
	
