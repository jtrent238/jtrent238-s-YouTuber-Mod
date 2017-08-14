package com.jtrent238.youtubers.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockGlitch extends Block{

	 @SideOnly(Side.CLIENT)
	    private IIcon[] field_150033_a;
	
	 	private World p_149643_1_;
	 	private int p_149643_2_;
		private int p_149643_3_;
		private int p_149643_4_;

	    public static final String[] field_150169_M = new String[] {"0", "1", "2", "3"};

	   
	private static final String __OBFID = "CL_00000217";

	    public BlockGlitch(Material p_i45398_1_)
	    {
	        super(p_i45398_1_);
	        //this.setCreativeTab(CreativeTabs.tabBlock);
	    }

	    /**
	     * Gets the block's texture. Args: side, meta
	     */
	    @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	    {
	        return this.field_150033_a[p_149691_2_ % this.field_150033_a.length];
	    }

	    /**
	     * Determines the damage on the item the block drops. Used in cloth and wood.
	     */
	    public int damageDropped(int p_149692_1_)
	    {
	        return p_149692_1_;
	    }

	    public static int func_150032_b(int p_150032_0_)
	    {
	        return func_150031_c(p_150032_0_);
	    }

	    public static int func_150031_c(int p_150031_0_)
	    {
	        return ~p_150031_0_ & 15;
	    }

	    /**
	     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
	     */


	    /**
	     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
	     */
	    @SideOnly(Side.CLIENT)
	    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
	    {
	        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
	        //p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
	        //p_149666_3_.add(new ItemStack(p_149666_1_, 1, 2));
	       // p_149666_3_.add(new ItemStack(p_149666_1_, 1, 3));
	    }

	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister p_149651_1_)
	    {
	        this.field_150033_a = new IIcon[field_150169_M.length];
	        this.field_150033_a = new IIcon[field_150169_M.length];

	        for (int i = 0; i < this.field_150033_a.length; ++i)
	        {
	            this.field_150033_a[i] = p_149651_1_.registerIcon(this.getTextureName() + "_" + field_150169_M[i]);
	            //this.field_150033_a[i] = p_149651_1_.registerIcon(this.getTextureName() + "_" + field_150169_M[i] + "_top");
	        }
	    }

	    public MapColor getMapColor(int p_149728_1_)
	    {
	        return MapColor.getMapColorForBlockColored(p_149728_1_);
	    }
	}