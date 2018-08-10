package com.jtrent238.youtubers.blocks;

import java.util.List;

import com.jtrent238.youtubers.YouTubers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class BlockDecoCommandBlock_Repeat extends Block{

	public BlockDecoCommandBlock_Repeat(Material p_i45394_1_) {
		super(p_i45394_1_);
	}

    @SideOnly(Side.CLIENT)
	 public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
	 list.add(EnumChatFormatting.GRAY + StatCollector.translateToLocal("tooltip." + YouTubers.MODID + "." + "cmd" + "." + "deco"));
	 list.add(EnumChatFormatting.GRAY + StatCollector.translateToLocal("tooltip." + YouTubers.MODID + "." + "cmd" + "." + "break"));
		
	  }
}
