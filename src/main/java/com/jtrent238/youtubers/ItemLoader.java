package com.jtrent238.youtubers;

import com.jtrent238.youtubers.items.ItemSpawnEgg;
import com.jtrent238.youtubers.items.armor.xJSQ_Armor;
import com.jtrent238.youtubers.items.materials.ItemxJSQIngot;
import com.jtrent238.youtubers.items.tools.ItemxJSQAxe;
import com.jtrent238.youtubers.items.tools.ItemxJSQHoe;
import com.jtrent238.youtubers.items.tools.ItemxJSQMultiTool;
import com.jtrent238.youtubers.items.tools.ItemxJSQPickaxe;
import com.jtrent238.youtubers.items.tools.ItemxJSQShovel;
import com.jtrent238.youtubers.items.tools.weapons.ItemxJSQSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemLoader {

	public static Item ItemSpawnEgg;
	public static Item ItemxJSQIngot;
	public static Item ItemxJSQHelment;
	public static Item ItemxJSQChestplate;
	public static Item ItemxJSQLeggings;
	public static Item ItemxJSQBoots;
	public static Item ItemxJSQSword;
	public static Item ItemxJSQPickaxe;
	public static Item ItemxJSQAxe;
	public static Item ItemxJSQShovel;
	public static Item ItemxJSQHoe;
	public static Item ItemxJSQMultiTool;
	
	private static int JSQ = 10;			//xJSQ Multiplier
	
	public static ArmorMaterial xJSQ_ARMOR = EnumHelper.addArmorMaterial("xJSQ_ARMOR", 16, new int[] {3 * JSQ, 8 * JSQ, 6 * JSQ, 3 * JSQ}, 30 * JSQ);
	public static ToolMaterial xJSQ_TOOL = EnumHelper.addToolMaterial("xJSQ_TOOL", 3 * JSQ, 1561 * JSQ, 8.0F * JSQ, 3.0F * JSQ, 10 * JSQ);
	
	/**
	 * Load Items.
	 */
	public static void LoadItems() {


		ItemSpawnEgg = new ItemSpawnEgg().setUnlocalizedName("ItemSpawnEgg").setTextureName("youtubers:ItemSpawnEgg").setCreativeTab(YouTubers.YouTubers);
		
		//ingots
		ItemxJSQIngot = new ItemxJSQIngot().setUnlocalizedName("ItemxJSQIngot").setTextureName("youtubers:ItemxJSQIngot").setCreativeTab(YouTubers.YouTubers);
		
		//armor
		ItemxJSQHelment = new xJSQ_Armor(xJSQ_ARMOR, 0, 0).setUnlocalizedName("ItemxJSQHelment").setTextureName("youtubers:ItemxJSQHelment").setCreativeTab(YouTubers.YouTubers);
		ItemxJSQChestplate = new xJSQ_Armor(xJSQ_ARMOR, 1, 1).setUnlocalizedName("ItemxJSQChestplate").setTextureName("youtubers:ItemxJSQChestplate").setCreativeTab(YouTubers.YouTubers);
		ItemxJSQLeggings = new xJSQ_Armor(xJSQ_ARMOR, 2, 2).setUnlocalizedName("ItemxJSQLeggings").setTextureName("youtubers:ItemxJSQLeggings").setCreativeTab(YouTubers.YouTubers);
		ItemxJSQBoots = new xJSQ_Armor(xJSQ_ARMOR, 3, 3).setUnlocalizedName("ItemxJSQBoots").setTextureName("youtubers:ItemxJSQBoots").setCreativeTab(YouTubers.YouTubers);
		
		//weapons & tools
		ItemxJSQSword = new ItemxJSQSword(xJSQ_TOOL).setUnlocalizedName("ItemxJSQSword").setTextureName("youtubers:ItemxJSQSword").setCreativeTab(YouTubers.YouTubers);
		ItemxJSQPickaxe = new ItemxJSQPickaxe(xJSQ_TOOL).setUnlocalizedName("ItemxJSQPickaxe").setTextureName("youtubers:ItemxJSQPickaxe").setCreativeTab(YouTubers.YouTubers);
		ItemxJSQAxe = new ItemxJSQAxe(xJSQ_TOOL).setUnlocalizedName("ItemxJSQAxe").setTextureName("youtubers:ItemxJSQAxe").setCreativeTab(YouTubers.YouTubers);
		ItemxJSQShovel = new ItemxJSQShovel(xJSQ_TOOL).setUnlocalizedName("ItemxJSQShovel").setTextureName("youtubers:ItemxJSQShovel").setCreativeTab(YouTubers.YouTubers);
		ItemxJSQHoe = new ItemxJSQHoe(xJSQ_TOOL).setUnlocalizedName("ItemxJSQHoe").setTextureName("youtubers:ItemxJSQHoe").setCreativeTab(YouTubers.YouTubers);
		ItemxJSQMultiTool = new ItemxJSQMultiTool(xJSQ_TOOL).setUnlocalizedName("ItemxJSQMultiTool").setTextureName("youtubers:ItemxJSQMultiTool").setCreativeTab(YouTubers.YouTubers);
		
		registerItems();
		
	}

	/**
	 * Register Items.
	 */
	private static void registerItems(){
		
		GameRegistry.registerItem(ItemSpawnEgg, ItemSpawnEgg.getUnlocalizedName().substring(5));
		
		//ingots
		GameRegistry.registerItem(ItemxJSQIngot, ItemxJSQIngot.getUnlocalizedName().substring(5));
		
		//armor
		GameRegistry.registerItem(ItemxJSQHelment, ItemxJSQHelment.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemxJSQChestplate, ItemxJSQChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemxJSQLeggings, ItemxJSQLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemxJSQBoots, ItemxJSQBoots.getUnlocalizedName().substring(5));
		
		//weapons & tools
		GameRegistry.registerItem(ItemxJSQSword, ItemxJSQSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemxJSQPickaxe, ItemxJSQPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemxJSQAxe, ItemxJSQAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemxJSQShovel, ItemxJSQShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemxJSQHoe, ItemxJSQHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemxJSQMultiTool, ItemxJSQMultiTool.getUnlocalizedName().substring(5));
		}
}
