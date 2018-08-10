package com.jtrent238.youtubers.entity;

import com.google.common.collect.Multimap;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Collection;
import java.util.Random;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class PlayerEntity
  extends EntityPlayerBase
{
  public boolean RenderFailed = false;
  public static final ResourceLocation locationStevePng = new ResourceLocation("textures/entity/steve.png");
  private ResourceLocation locationSkin = locationStevePng;
  private ThreadDownloadImageData downloadImageSkin;
  
  public PlayerEntity(World par1World)
  {
    this(par1World, -1);
  }
  
  public PlayerEntity(World par1World, int par2)
  {
    this(par1World, par2 < 0 ? com.jtrent238.youtubers.YTConfig.PlayerNames[new Random().nextInt(com.jtrent238.youtubers.YTConfig.PlayerNames.length)] : com.jtrent238.youtubers.YTConfig.PlayerNames[par2]);
  }
  
  public PlayerEntity(World par1World, String name)
  {
    super(par1World);
    setName(name);
    //func_70105_a(0.6F, 1.8F);
  }
  
  
  public String getName()
  {
    return this.getEntityName().substring(19);
  }
  
  public void setName(String par1Str)
  {
    this.setName(par1Str);
  }
  
  
  @SideOnly(Side.CLIENT)
  public boolean func_94059_bO()
  {
    return true;
  }
  
  protected void func_70088_a()
  {
   // super.func_70088_a();
   // this.field_70180_af.func_75682_a(19, "");
  }
  
  
  
  public void func_70014_b(NBTTagCompound par1NBTTagCompound)
  {
    super.writeEntityToNBT(par1NBTTagCompound);
    
    par1NBTTagCompound.setString("Name", getName());
  }
  
  public void func_70037_a(NBTTagCompound par1NBTTagCompound)
  {
    super.readEntityFromNBT(par1NBTTagCompound);
    
    setName(par1NBTTagCompound.getString("Name"));
  }
  
  
  protected String func_70621_aR()
  {
    return "mob.villager.hit";
  }
  
  protected String func_70673_aS()
  {
    return "mob.villager.death";
  }
  
  @SideOnly(Side.CLIENT)
  public void setRecipes(MerchantRecipeList par1MerchantRecipeList) {}
  
  public int getGrowingAge()
  {
    return 0;
  }
  
}
