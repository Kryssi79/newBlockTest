package com.Kryssi.newBlockTest;

import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;

import net.minecraft.server.v1_5_R3.*;

import org.bukkit.plugin.Plugin;



public class testBlock  extends net.minecraft.server.v1_5_R3.Block
{
	public int myID = 245;
	
	public testBlock(int id, net.minecraft.server.v1_5_R3.Material myMaterial)
	{
		super(id, myMaterial);  // .c(0.5F).a("Glass V1");
		this.c(0.5F);
		myID = id;
	}
	
	public int getDropType(int paramInt1, Random paramRandom, int paramInt2)
	{
		return myID;
	}

	
}