package com.jtrent238.youtubers;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class PlayerList {

public static ArrayList<String> players = new ArrayList<String>();

	public static String[] arr={"AlexIsCool", "Ben", "CowMan", "Far", "megablasterT"};

	private static int randomPlayer;

	public static String getRandomPlayerName() {
		//int numHammers = 98;
		int numPlayers = arr.length;
		for (int i = 0; i < numPlayers ; i++) {
			
			
		    Random r=new Random();
		    int randomPlayer=r.nextInt(arr.length);
		    System.out.println("Player: " + arr[randomPlayer] + " Loaded");
		    System.out.println("TEST");
		    
					//System.out.println("Player: " + i + " Loaded");
		    
		}
		return arr[randomPlayer];
		
	}
	
}