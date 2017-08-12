package com.jtrent238.youtubers.client;

import com.jtrent238.youtubers.common.CommonProxy;
import com.jtrent238.youtubers.entity.youtuber.EntityDanTDM;
import com.jtrent238.youtubers.entity.youtuber.EntityLaurie201;
import com.jtrent238.youtubers.entity.youtuber.EntitySethBling;
import com.jtrent238.youtubers.entity.youtuber.Entityblohod;
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

    
  }
  

  public void postInit(FMLPostInitializationEvent e) {
	 
	  
  }
  
  
  @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
  public void onEvent(PlayerTickEvent event)
  {
    
 
}
}