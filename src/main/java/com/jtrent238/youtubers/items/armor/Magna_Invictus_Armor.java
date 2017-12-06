package com.jtrent238.youtubers.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class Magna_Invictus_Armor extends ItemArmor{

	private String textureName;
	private int armorType;
	

	public Magna_Invictus_Armor(ArmorMaterial diamond, int i, int j) {
		super(diamond, 0, i);
	    //this.textureName = textureName;
	    this.setUnlocalizedName("Magna_Invictus_Armor");
	    this.setTextureName("youtubers:Magna_Invictus_Armor");
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return "youtubers:textures/armor/Magna_Invictus_Armor" + (this.armorType == 2 ? "2" : "1") + ".png";
		}
}