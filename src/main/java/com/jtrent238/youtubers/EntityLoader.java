package com.jtrent238.youtubers;

import com.jtrent238.youtubers.entity.EntityCraigTheMailman;
import com.jtrent238.youtubers.entity.EntityCrazyFan;
import com.jtrent238.youtubers.entity.EntityFakeDanTDM;
import com.jtrent238.youtubers.entity.EntityGrim;
import com.jtrent238.youtubers.entity.EntityMcDuck;
import com.jtrent238.youtubers.entity.EntityTerrance;
import com.jtrent238.youtubers.entity.EntityTrayaurus;
import com.jtrent238.youtubers.entity.player.EntityAlexIsCool;
import com.jtrent238.youtubers.entity.player.EntityCowMan;
import com.jtrent238.youtubers.entity.player.EntityFar;
import com.jtrent238.youtubers.entity.player.EntityHER08RINE;
import com.jtrent238.youtubers.entity.player.EntityRandomPlayer;
import com.jtrent238.youtubers.entity.player.Entitycaptainspy6;
import com.jtrent238.youtubers.entity.player.EntitymegablasterT;
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
	    	//Grim Registry
	    	EntityRegistry.registerGlobalEntityID(EntityGrim.class, "EntityGrim",EntityRegistry.findGlobalUniqueEntityId(), 0xd9dce0, 0xa2a5aa);
	    	EntityRegistry.addSpawn(EntityGrim.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    	//Terrance Registry
	    	EntityRegistry.registerGlobalEntityID(EntityTerrance.class, "EntityTerrance",EntityRegistry.findGlobalUniqueEntityId(), 0xd1b5c6, 0xefdee9);
	    	EntityRegistry.addSpawn(EntityTerrance.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    	//Trayaurus Registry
	    	EntityRegistry.registerGlobalEntityID(EntityTrayaurus.class, "EntityTrayaurus",EntityRegistry.findGlobalUniqueEntityId(), 0xffffff, 0xe2e2e2);
	    	EntityRegistry.addSpawn(EntityTrayaurus.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    	//CraigTheMailman Registry
	    	EntityRegistry.registerGlobalEntityID(EntityCraigTheMailman.class, "EntityCraigTheMailman",EntityRegistry.findGlobalUniqueEntityId(), 0x44536b, 0x324d77);
	    	EntityRegistry.addSpawn(EntityCraigTheMailman.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    	//McDuck Registry
	    	EntityRegistry.registerGlobalEntityID(EntityMcDuck.class, "EntityMcDuck",EntityRegistry.findGlobalUniqueEntityId(), 0xdee2e8, 0xf7d1c5);
	    	EntityRegistry.addSpawn(EntityMcDuck.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    	//Fake DanTDM Registry
	    	EntityRegistry.registerGlobalEntityID(EntityFakeDanTDM.class, "EntityFakeDanTDM",EntityRegistry.findGlobalUniqueEntityId(), 0x42e2f4, 0x415ff4);
	    	EntityRegistry.addSpawn(EntityFakeDanTDM.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);

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
	    
	    //Antvenom Registry
	    EntityRegistry.registerGlobalEntityID(EntityAntvenom.class, "EntityAntvenom",EntityRegistry.findGlobalUniqueEntityId(), 0x4f1900, 0x930000);
	    EntityRegistry.addSpawn(EntityAntvenom.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	    //Joy_Rider_2284 Registry
	    EntityRegistry.registerGlobalEntityID(EntityJoy_Rider_2284.class, "EntityJoy_Rider_2284",EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xff7b00);
	    EntityRegistry.addSpawn(EntityJoy_Rider_2284.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	    //jtrent238 Registry
	    //EntityRegistry.registerGlobalEntityID(Entityjtrent238.class, "Entityjtrent238",EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xff7b00);
	    //EntityRegistry.addSpawn(Entityjtrent238.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	    //_MrGregor_ Registry
	    EntityRegistry.registerGlobalEntityID(Entity_MrGregor_.class, "Entity_MrGregor_",EntityRegistry.findGlobalUniqueEntityId(), 0xff9000, 0x000000);
	    EntityRegistry.addSpawn(Entity_MrGregor_.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	    //SSundee Registry
	    EntityRegistry.registerGlobalEntityID(EntitySSundee.class, "EntitySSundee",EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x595959);
	    EntityRegistry.addSpawn(EntitySSundee.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    	//Derp SSundee Registry
	    	EntityRegistry.registerGlobalEntityID(EntityDerpSSundee.class, "EntityDerpSSundee",EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x595959);
	    	EntityRegistry.addSpawn(EntityDerpSSundee.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	    //Magna_Invictus Registry
	    EntityRegistry.registerGlobalEntityID(EntityMagna_Invictus.class, "EntityMagna_Invictus",EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x9b0096);
	    EntityRegistry.addSpawn(EntityMagna_Invictus.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    		
	    //EckoSoldier Registry
	    EntityRegistry.registerGlobalEntityID(EntityEckoSoldier.class, "EntityEckoSoldier",EntityRegistry.findGlobalUniqueEntityId(), 0x32773c, 0x098c1c);
	    EntityRegistry.addSpawn(EntityEckoSoldier.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
		
	    //BajanCanadian Registry
	    EntityRegistry.registerGlobalEntityID(EntityBajanCanadian.class, "EntityBajanCanadian",EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xaa1106);
	    EntityRegistry.addSpawn(EntityBajanCanadian.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
		
	    //RealThinknoodles Registry
	    EntityRegistry.registerGlobalEntityID(EntityRealThinknoodles.class, "EntityRealThinknoodles",EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xaa1106);
	    EntityRegistry.addSpawn(EntityRealThinknoodles.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
		
	}

	public static void LoadPlayers() {

	    //EntityRandomPlayer Registry
	    EntityRegistry.registerGlobalEntityID(EntityRandomPlayer.class, "EntityRandomPlayer",EntityRegistry.findGlobalUniqueEntityId(), 0xff9328, 0xff9433);
	    EntityRegistry.addSpawn(EntityRandomPlayer.class, 5, 4, 6, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
		
		//captainspy6 Registry
	    EntityRegistry.registerGlobalEntityID(Entitycaptainspy6.class, "Entitycaptainspy6",EntityRegistry.findGlobalUniqueEntityId(), 0x515dff, 0xff9400);
	    EntityRegistry.addSpawn(Entitycaptainspy6.class, 2, 1, 3, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
		
	    //HER08RINE Registry
	    EntityRegistry.registerGlobalEntityID(EntityHER08RINE.class, "EntityHER08RINE",EntityRegistry.findGlobalUniqueEntityId(), 0x00ff4c, 0xffffff);
	    EntityRegistry.addSpawn(EntityHER08RINE.class, 2, 1, 3, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	    //AlexIsCool Registry
	    EntityRegistry.registerGlobalEntityID(EntityAlexIsCool.class, "EntityAlexIsCool",EntityRegistry.findGlobalUniqueEntityId(), 0x30ddd1, 0x00ffed);
	    EntityRegistry.addSpawn(EntityAlexIsCool.class, 2, 1, 3, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	    //megablasterT Registry
	    EntityRegistry.registerGlobalEntityID(EntitymegablasterT.class, "EntitymegablasterT",EntityRegistry.findGlobalUniqueEntityId(), 0xd5efed, 0x4fc1b9);
	    EntityRegistry.addSpawn(EntitymegablasterT.class, 2, 1, 3, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	    //CowMan Registry
	    EntityRegistry.registerGlobalEntityID(EntityCowMan.class, "EntityCowMan",EntityRegistry.findGlobalUniqueEntityId(), 0xefd8d5, 0x843e33);
	    EntityRegistry.addSpawn(EntityCowMan.class, 2, 1, 3, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	    //Far Registry
	    EntityRegistry.registerGlobalEntityID(EntityFar.class, "EntityFar",EntityRegistry.findGlobalUniqueEntityId(), 0xffc4ea, 0xffc4d2);
	    EntityRegistry.addSpawn(EntityFar.class, 2, 1, 3, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	}

	public static void loadOther() {

	    //CrazyFan Registry
	    EntityRegistry.registerGlobalEntityID(EntityCrazyFan.class, "EntityCrazyFan",EntityRegistry.findGlobalUniqueEntityId(), 0x99fcbc, 0x1c4f2e);
	    EntityRegistry.addSpawn(EntityCrazyFan.class, 2, 1, 3, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	}

}
