package com.jtrent238.youtubers.items;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRandomBlockStructure_Placer  extends Item{



public ItemRandomBlockStructure_Placer(int par1){
	setMaxDamage(0);
	maxStackSize = 1;
	//setUnlocalizedName("itemJenWellPlacer");
	//setTextureName("epicproportionsmod:itemJenWellPlacer");
	//setCreativeTab(EpicProportionsMod.EpicProportionsMod);
	}
public int getItemEnchantability()
{
    return 0;
}
public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 1;
}
public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
{
    return 1.0F;
}

public boolean onItemUse(ItemStack itemStack, EntityPlayer entity, World world, int x, int y, int z, int l, float a, float b, float c){
float var4 = 1.0F;

if(true){
boolean place = true;

if(place){
	
	Random rn = new Random();
	int max = 250;
	int min = 1;
	int result = rn.nextInt(max - min + 1) + min;
	System.out.println(result);
	
	world.setBlock(x+0, y+0, z+0, Block.getBlockById(result));
	world.setBlock(x+1, y+0, z+0, Block.getBlockById(result));
	world.setBlock(x+2, y+0, z+0, Block.getBlockById(result));
	world.setBlock(x+0, y+0, z+1, Block.getBlockById(result));
	world.setBlock(x+1, y+0, z+1, Block.getBlockById(result));
	world.setBlock(x+2, y+0, z+1, Block.getBlockById(result));
	world.setBlock(x+0, y+0, z+2, Block.getBlockById(result));
	world.setBlock(x+1, y+0, z+2, Block.getBlockById(result));
	world.setBlock(x+2, y+0, z+2, Block.getBlockById(result));
	world.setBlock(x+0, y+1, z+0, Block.getBlockById(result));
	world.setBlock(x+1, y+1, z+0, Block.getBlockById(result));
	world.setBlock(x+2, y+1, z+0, Block.getBlockById(result));
	world.setBlock(x+0, y+1, z+1, Block.getBlockById(result));
	world.setBlock(x+1, y+1, z+1, Block.getBlockById(result));
	world.setBlock(x+2, y+1, z+1, Block.getBlockById(result));
	world.setBlock(x+0, y+1, z+2, Block.getBlockById(result));
	world.setBlock(x+1, y+1, z+2, Block.getBlockById(result));
	world.setBlock(x+2, y+1, z+2, Block.getBlockById(result));
	world.setBlock(x+0, y+2, z+0, Block.getBlockById(result));
	world.setBlock(x+1, y+2, z+0, Block.getBlockById(result));
	world.setBlock(x+2, y+2, z+0, Block.getBlockById(result));
	world.setBlock(x+0, y+2, z+1, Block.getBlockById(result));
	world.setBlock(x+1, y+2, z+1, Block.getBlockById(result));
	world.setBlock(x+2, y+2, z+1, Block.getBlockById(result));
	world.setBlock(x+0, y+2, z+2, Block.getBlockById(result));
	world.setBlock(x+1, y+2, z+2, Block.getBlockById(result));
	world.setBlock(x+2, y+2, z+2, Block.getBlockById(result));
	
	
	}
--itemStack.stackSize;
}


return true;
}


public void removeItem(EntityPlayer ep, ItemStack removeitem) {
	IInventory inv = ep.inventory;
	for(int i=0; i < inv.getSizeInventory(); i++)
	{
		if(inv.getStackInSlot(i) != null)
		{
			ItemStack j = inv.getStackInSlot(i);
			if(j.getItem() != null && j.getItem() == removeitem.getItem())
			{
				inv.setInventorySlotContents(i, null);
			}
		}
	}
}

}
