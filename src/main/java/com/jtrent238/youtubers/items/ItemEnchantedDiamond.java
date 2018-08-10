package com.jtrent238.youtubers.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemEnchantedDiamond extends Item{
	
    private static final String __OBFID = "CL_00000065";

    public ItemEnchantedDiamond(){
    	
    }
    
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack p_77636_1_)
    {
        return true;
    }
    
}
