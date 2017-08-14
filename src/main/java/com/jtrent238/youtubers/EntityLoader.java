package com.jtrent238.youtubers;

import com.jtrent238.youtubers.entity.player.EntityHER08RINE;
import com.jtrent238.youtubers.entity.player.Entitycaptainspy6;
import com.jtrent238.youtubers.entity.youtuber.EntityDanTDM;
import com.jtrent238.youtubers.entity.youtuber.EntityHeyItsLuigi;
import com.jtrent238.youtubers.entity.youtuber.EntityJoy_Rider_2284;
import com.jtrent238.youtubers.entity.youtuber.EntityLaurie201;
import com.jtrent238.youtubers.entity.youtuber.EntitySethBling;
import com.jtrent238.youtubers.entity.youtuber.Entityblohod;
import com.jtrent238.youtubers.entity.youtuber.EntityskythekidRS;
import com.jtrent238.youtubers.entity.youtuber.EntityxJSQ;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityLoader {

	public static void LoadYouTubers() {


		//xJSQ Registry
	    EntityRegistry.registerGlobalEntityID(EntityxJSQ.class, "EntityxJSQ",EntityRegistry.findGlobalUniqueEntityId(), 0xf44242, 0xffffff);
	    EntityRegistry.addSpawn(EntityxJSQ.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    //blohod Registry
	    EntityRegistry.registerGlobalEntityID(Entityblohod.class, "Entityblohod",EntityRegistry.findGlobalUniqueEntityId(), 0xf4ee41, 0x41f452);
	    EntityRegistry.addSpawn(Entityblohod.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    //DanTDM Registry
	    EntityRegistry.registerGlobalEntityID(EntityDanTDM.class, "EntityDanTDM",EntityRegistry.findGlobalUniqueEntityId(), 0x42e2f4, 0x415ff4);
	    EntityRegistry.addSpawn(EntityDanTDM.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

	    //Laurie201 Registry
	    EntityRegistry.registerGlobalEntityID(EntityLaurie201.class, "EntityLaurie201",EntityRegistry.findGlobalUniqueEntityId(), 0xff2100, 0xff9900);
	    EntityRegistry.addSpawn(EntityLaurie201.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	    //SethBling Registry
	    EntityRegistry.registerGlobalEntityID(EntitySethBling.class, "EntitySethBling",EntityRegistry.findGlobalUniqueEntityId(), 0xff0000, 0x003fff);
	    EntityRegistry.addSpawn(EntitySethBling.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	    //skythekidRS Registry
	    EntityRegistry.registerGlobalEntityID(EntityskythekidRS.class, "EntityskythekidRS",EntityRegistry.findGlobalUniqueEntityId(), 0xeeff00, 0xea9012);
	    EntityRegistry.addSpawn(EntityskythekidRS.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	    //HeyItsLuigi Registry
	    EntityRegistry.registerGlobalEntityID(EntityHeyItsLuigi.class, "EntityHeyItsLuigi",EntityRegistry.findGlobalUniqueEntityId(), 0x007728, 0x00FF56);
	    EntityRegistry.addSpawn(EntityHeyItsLuigi.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	    //Joy_Rider_2284 Registry
	    EntityRegistry.registerGlobalEntityID(EntityJoy_Rider_2284.class, "EntityJoy_Rider_2284",EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xff7b00);
	    EntityRegistry.addSpawn(EntityJoy_Rider_2284.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	}

	public static void LoadPlayers() {

		//captainspy6 Registry
	    EntityRegistry.registerGlobalEntityID(Entitycaptainspy6.class, "Entitycaptainspy6",EntityRegistry.findGlobalUniqueEntityId(), 0x515dff, 0xff9400);
	    EntityRegistry.addSpawn(Entitycaptainspy6.class, 2, 1, 3, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
		//HER08RINE Registry
	    EntityRegistry.registerGlobalEntityID(EntityHER08RINE.class, "EntityHER08RINE",EntityRegistry.findGlobalUniqueEntityId(), 0x00ff4c, 0xffffff);
	    EntityRegistry.addSpawn(EntityHER08RINE.class, 2, 1, 3, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
		
	}

}
