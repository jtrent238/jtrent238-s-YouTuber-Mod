package com.jtrent238.youtubers.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class RealThinknoodles_Armor extends ItemArmor{

	private String textureName;
	private int armorType;
	

	public RealThinknoodles_Armor(ArmorMaterial diamond, int i, int j) {
		super(diamond, 0, i);
	    //this.textureName = textureName;
	    this.setUnlocalizedName("RealThinknoodles_Armor");
	    this.setTextureName("RealThinknoodles_Armor");
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return "youtubers:textures/armor/RealThinknoodles_Armor" + (this.armorType == 2 ? "2" : "1") + ".png";
		}
}