package com.Kryssi.newBlockTest;

import org.bukkit.block.Block;
import net.minecraft.server.*;
import net.minecraft.server.v1_5_R3.*;
import net.minecraft.server.v1_5_R3.Block.*;
import net.minecraft.server.v1_5_R3.Material;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin 
{
	
	net.minecraft.server.v1_5_R3.Block myBlock;
	
	@Override
	public void onEnable()
	{
		System.out.println("starte:   newBlockTest - Plugin  ");
		registerBlock();
	}
	
	@Override
	public void onDisable()
	{
		System.out.println("beende:   newBlockTest - Plugin  ");
	}
	
	
	
	private void registerBlock()
	{
		myBlock = new testBlock(220, Material.BUILDABLE_GLASS);
		myBlock.c("Tester");
	}

}
