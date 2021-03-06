package com.jtrent238.youtubers.items.armor;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockDispenser;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.command.IEntitySelector;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class EckoSoldier_Armor extends ItemArmor{

	private String textureName;
	private int armorType;
	

	public EckoSoldier_Armor(ArmorMaterial diamond, int i, int j) {
		super(diamond, 0, i);
	    //this.textureName = textureName;
	    this.setUnlocalizedName("EckoSoldier_Armor");
	    this.setTextureName("youtubers:EckoSoldier_Armor");
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return "youtubers:textures/armor/EckoSoldier_Armor_" + (this.armorType == 2 ? "2" : "1") + ".png";
		}
}