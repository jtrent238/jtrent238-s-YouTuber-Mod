package com.jtrent238.youtubers.entity.youtuber;

import java.util.Map;

import com.jtrent238.youtubers.client.ClientProxy;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.ReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelRenderer;
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderPlayerEvent;

public class EntityDanTDM extends EntityGolem implements IBossDisplayData
{
	World world = null;
	private int attackTimer;
	private DamageSource damageSource;
	private EntityPlayer entityAttackedBy;
    private ResourceLocation locationCape;
	private ModelRenderer bipedCloak;
	public boolean renderCape = true;
    public EntityDanTDM(World var1)
    {
        super(var1);
        world = var1;
        experienceValue = 4;
        this.isImmuneToFire = true;
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, true));
        this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.9D, 32.0F));
        this.tasks.addTask(3, new EntityAIMoveThroughVillage(this, 0.6D, true));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, true, IMob.mobSelector));
        this.shouldRenderCape();
        this.hasCustomNameTag();
        this.setCustomNameTag("DanTDM");
        //this.renderCloak(10);
        this.renderCloak(new ResourceLocation("youtubers:textures/entity/cloak/MC15.png"));
        addRandomArmor();
        //DungeonHooks.addDungeonMob("xJSQ", 180);
    }
    
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void playerSpecialsRendering(RenderPlayerEvent.Specials.Pre event) {
        float rotationY = event.renderer.modelBipedMain.bipedBody.rotateAngleY;
        float rotationX = event.renderer.modelBipedMain.bipedBody.rotateAngleX;
        float rotationZ = event.renderer.modelBipedMain.bipedBody.rotateAngleZ;
        double x = event.entity.posX;
        double y = event.entity.posY;
        double z = event.entity.posZ;
        float pitch = event.entity.rotationPitch;
        float yaw = event.entity.rotationYaw;
        //ClientProxy.rendererWearableEquipped.render(event.entity, x, y, z, rotationX, rotationY, rotationZ, pitch, yaw);
        event.renderCape = true;
    }
    
    private boolean shouldRenderCape() {
    	return true;
	}

	@SubscribeEvent
    public static void onRenderPlayer(RenderPlayerEvent.Post event)
    {
        //EntityDanTDM player = null;RenderPlayer

                Class<? super Object> cape0 = null;
				Object cape1;
				//NetworkPlayerInfo info = ReflectionHelper.getPrivateValue(AbstractClientPlayer.class, clplayer, ObfuscatedNames.PLAYER_INFO);
                Map<MinecraftProfileTexture.Type, ResourceLocation> textures = ReflectionHelper.getPrivateValue(cape0, EntityDanTDM.class, "youtubers:textures/entity/cloak/MC15.png");
                ResourceLocation loc = new ResourceLocation("proxyslib", "textures/whoknows/special_cape.png");
                textures.put(MinecraftProfileTexture.Type.CAPE, loc);
                //textures.put(MinecraftProfileTexture.Type.ELYTRA, loc);
                //done.add(player);
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
    	this.entityDropItem(new ItemStack(Items.diamond, 1), 1F);
    	this.entityDropItem(new ItemStack(Blocks.skull, 1, 3), 1F);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    	
    protected String getLivingSound()
    {
        return "youtubers:DanTDM_living";
    }
     	
    /**
     * Returns the sound this mob makes when it is hurt.
     */
    	
    protected String getHurtSound()
    {
        return "youtubers:DanTDM_hurt";
    }
		
    /**
     * Returns the sound this mob makes on death.
     */
    	
    protected String getDeathSound()
    {
        return "youtubers:DanTDM_death";
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
		return "DanTDM";
	}


/**
* Will return how many at most can spawn in a chunk at once.
*/
public int getMaxSpawnedInChunk()
{
   return 4;
}

public boolean func_152122_n()
{
    return this.locationCape ==  new ResourceLocation("youtubers:textures/entity/cloak/MC15.png");
}

public ResourceLocation renderCloak	(ResourceLocation resourceLocation)
{
	return new ResourceLocation("youtubers:textures/entity/cloak/MC15.png");
}

/**
 * Renders the cloak of the current biped (in most cases, it's a player)
 */
public void renderCloak(float p_78111_1_)
{
    this.bipedCloak.render(p_78111_1_);
    this.locationCape = new ResourceLocation("youtubers:textures/entity/cloak/MC15.png");
}

}
