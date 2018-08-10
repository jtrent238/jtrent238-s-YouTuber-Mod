package com.jtrent238.youtubers.entity;

import com.jtrent238.youtubers.entity.youtuber.EntityDanTDM;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class EntityFakeDanTDM extends EntityDanTDM{

	private String name = EnumChatFormatting.RED + "DanTDM";


	public EntityFakeDanTDM(World var1) {
		super(var1);
        this.hasCustomNameTag();
        this.setCustomNameTag(name );
	}


	public String getEntityName(){
		return name;
	}


}
