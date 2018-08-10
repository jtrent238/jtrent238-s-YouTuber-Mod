package com.jtrent238.youtubers.entity;

import com.jtrent238.youtubers.ItemLoader;
import com.jtrent238.youtubers.YouTubers;
import com.jtrent238.youtubers.entity.youtuber.EntityAntvenom;
import com.jtrent238.youtubers.entity.youtuber.EntityBajanCanadian;
import com.jtrent238.youtubers.entity.youtuber.EntityDanTDM;
import com.jtrent238.youtubers.entity.youtuber.EntityDerpSSundee;
import com.jtrent238.youtubers.entity.youtuber.EntityEckoSoldier;
import com.jtrent238.youtubers.entity.youtuber.EntityHeyItsLuigi;
import com.jtrent238.youtubers.entity.youtuber.EntityJoy_Rider_2284;
import com.jtrent238.youtubers.entity.youtuber.EntityLaurie201;
import com.jtrent238.youtubers.entity.youtuber.EntityMagna_Invictus;
import com.jtrent238.youtubers.entity.youtuber.EntityRealThinknoodles;
import com.jtrent238.youtubers.entity.youtuber.EntitySSundee;
import com.jtrent238.youtubers.entity.youtuber.EntitySethBling;
import com.jtrent238.youtubers.entity.youtuber.Entity_MrGregor_;
import com.jtrent238.youtubers.entity.youtuber.Entityblohod;
import com.jtrent238.youtubers.entity.youtuber.EntityskythekidRS;
import com.jtrent238.youtubers.entity.youtuber.EntityxJSQ;

import cpw.mods.fml.common.Loader;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class EntityCrazyFan extends EntityGolem implements IBossDisplayData 
{
	World world = null;
	private int attackTimer;
	private DamageSource damageSource;
	private EntityPlayer entityAttackedBy;
    private ResourceLocation locationCape;
	private String name = "";
    public EntityCrazyFan(World var1)
    {
        super(var1);
        world = var1;
        experienceValue = 4;
        this.isImmuneToFire = true;
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, false));
        this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.9D, 32.0F));
        this.tasks.addTask(3, new EntityAIMoveThroughVillage(this, 0.6D, true));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityxJSQ.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, Entityblohod.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityDanTDM.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLaurie201.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySethBling.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityskythekidRS.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityHeyItsLuigi.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityJoy_Rider_2284.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityAntvenom.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, Entity_MrGregor_.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySSundee.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityDerpSSundee.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityMagna_Invictus.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityEckoSoldier.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBajanCanadian.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityRealThinknoodles.class, 0, false));
        
        if(YouTubers.epicproportionsmod_loaded == true) {
        	this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, com.jtrent238.epicproportions.entity.EntityPat.class, 0, false));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, com.jtrent238.epicproportions.entity.EntityJen.class, 0, false)); 
        }
        if(YouTubers.epicproportionsmod_halloween_loaded == true) {
        	this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, com.jtrent238.epicproportions.addons.halloween.entity.EntitySpookyPat.class, 0, false));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, com.jtrent238.epicproportions.addons.halloween.entity.EntitySpookyJen.class, 0, false)); 
        }
        if(YouTubers.epicproportionsmod_christmas_loaded == true) {
        	this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, com.jtrent238.epicproportions.addons.christmas.entity.EntityXmasPat.class, 0, false));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, com.jtrent238.epicproportions.addons.christmas.entity.EntityXmasJen.class, 0, false)); 
        }
        
        this.hasCustomNameTag();
        this.setCustomNameTag(name);
        
        addRandomArmor();
    }
    
   
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
    }

    public boolean attackEntityAsMob(Entity p_70652_1_)
    {
        this.attackTimer = 10;
        this.worldObj.setEntityState(this, (byte)4);
        boolean flag = p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(7 + this.rand.nextInt(15)));

        if (flag)
        {
            p_70652_1_.motionY += 0.4000000059604645D;
        }

        this.playSound("", 1.0F, 1.0F);
        return flag;
    }

    
    
protected void addRandomArmor(){

}

		/*
	protected void dropRareDrop(int par1){
			this.dropItem(ItemLoader.itemCaptainCookieCookie, 1);
	}
		*/

	public boolean isAIEnabled()
	{
		   return true;
	}
	   
	/**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    protected boolean canDespawn()
    {
        return true;
    }
    
    /**
     * Drop items of this living's type
     */
    protected void dropFewItems(boolean var1, int var2)
    {
    	this.entityDropItem(new ItemStack(ItemLoader.ItemFanMail, 16), 1F);//.setStackDisplayName(EnumChatFormatting.AQUA + StatCollector.translateToLocal("item.ItemFanMail.name")), 1F);
    	//this.entityDropItem(new ItemStack(Blocks.skull, 1, 3), 1F);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "";
    }

		
    public void onStruckByLightning(EntityLightningBolt entityLightningBolt){
		int i = (int)this.posX;
		int j = (int)this.posY;
		int k = (int)this.posZ;
		Entity entity = this;
		
	}

	protected void fall(float l){
		int i = (int)this.posX;
		int j = (int)this.posY;
		int k = (int)this.posZ;
		super.fall(l);
		Entity entity = this;
		
	}

	public void onCriticalHit(Entity entity2) {
		int i = (int)this.posX;
		int j = (int)this.posY;
		int k = (int)this.posZ;
		Entity entity = this;
		
	}

	public void onKillEntity(EntityLiving entityLiving){
		int i = (int)this.posX;
		int j = (int)this.posY;
		int k = (int)this.posZ;
		Entity entity = this;
		
	}

	public String getEntityName(){
		return name;
	}


/**
* Will return how many at most can spawn in a chunk at once.
*/
public int getMaxSpawnedInChunk()
{
   return 4;
}

}
