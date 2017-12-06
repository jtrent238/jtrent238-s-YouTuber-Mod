package com.jtrent238.youtubers.client;

import com.jtrent238.youtubers.common.CommonProxy;
import com.jtrent238.youtubers.entity.youtuber.EntityAntvenom;
import com.jtrent238.youtubers.entity.youtuber.EntityBajanCanadian;
import com.jtrent238.youtubers.entity.youtuber.EntityDanTDM;
import com.jtrent238.youtubers.entity.youtuber.EntityDerpSSundee;
import com.jtrent238.youtubers.entity.youtuber.EntityEckoSoldier;
import com.jtrent238.youtubers.entity.youtuber.EntityHeyItsLuigi;
import com.jtrent238.youtubers.entity.youtuber.EntityJoy_Rider_2284;
import com.jtrent238.youtubers.entity.youtuber.EntityLaurie201;
import com.jtrent238.youtubers.entity.youtuber.EntityMagna_Invictus;
import com.jtrent238.youtubers.entity.youtuber.EntitySSundee;
import com.jtrent238.youtubers.entity.youtuber.EntitySethBling;
import com.jtrent238.youtubers.entity.youtuber.Entity_MrGregor_;
import com.jtrent238.youtubers.entity.youtuber.Entityblohod;
import com.jtrent238.youtubers.entity.youtuber.EntityskythekidRS;
import com.jtrent238.youtubers.entity.player.EntityAlexIsCool;
import com.jtrent238.youtubers.entity.player.EntityCowMan;
import com.jtrent238.youtubers.entity.player.EntityFar;
import com.jtrent238.youtubers.entity.player.EntityHER08RINE;
import com.jtrent238.youtubers.entity.player.Entitycaptainspy6;
import com.jtrent238.youtubers.entity.player.EntitymegablasterT;
import com.jtrent238.youtubers.entity.youtuber.EntityxJSQ;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy
{


	
 	
	public void init(FMLInitializationEvent e) {
    super.init (e);

    RenderingRegistry.registerEntityRenderingHandler(EntityxJSQ.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/xJSQ.png");}});
    RenderingRegistry.registerEntityRenderingHandler(Entityblohod.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/blohod.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityDanTDM.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/DanTDM.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityLaurie201.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/Laurie201.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntitySethBling.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/SethBling.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityskythekidRS.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/skythekidRS.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityHeyItsLuigi.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/HeyItsLuigi.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityJoy_Rider_2284.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/Joy_Rider_2284.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityAntvenom.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/Antvenom.png");}});
    RenderingRegistry.registerEntityRenderingHandler(Entity_MrGregor_.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/_MrGregor_.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntitySSundee.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/SSundee.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityDerpSSundee.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/DerpSSundee.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityMagna_Invictus.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/Magna_Invictus.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityEckoSoldier.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/EckoSoldier.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityBajanCanadian.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/youtuber/BajanCanadian.png");}});
    
    //NOT YOUTUBERS
    RenderingRegistry.registerEntityRenderingHandler(Entitycaptainspy6.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/player/captainspy6.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityHER08RINE.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/player/HER08RINE.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityAlexIsCool.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/player/AlexIsCool.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntitymegablasterT.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/player/megablasterT.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityCowMan.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/player/CowMan.png");}});
    RenderingRegistry.registerEntityRenderingHandler(EntityFar.class, new RenderLiving(new ModelBiped(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("youtubers:textures/entity/player/Far.png");}});

    
  }
  

  public void postInit(FMLPostInitializationEvent e) {
	 
	  
  }
  
  
  @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
  public void onEvent(PlayerTickEvent event)
  {
    
 
}
}