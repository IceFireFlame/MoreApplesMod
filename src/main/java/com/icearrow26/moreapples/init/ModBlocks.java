package com.icearrow26.moreapples.init;

import java.util.ArrayList;
import java.util.List;

import com.icearrow26.moreapples.Main;
import com.icearrow26.moreapples.blocks.BaseAppleBlock;
import com.icearrow26.moreapples.blocks.BlockBase;
import com.icearrow26.moreapples.blocks.GreenAppleBlock;
import com.icearrow26.moreapples.blocks.PurpleAppleBlock;
import com.icearrow26.moreapples.blocks.YellowAppleBlock;
import com.icearrow26.moreapples.items.food.Apple_Plant_Green;
import com.icearrow26.moreapples.items.food.Apple_Plant_Purple;
import com.icearrow26.moreapples.items.food.Apple_Plant_Red;
import com.icearrow26.moreapples.items.food.Apple_Plant_Yellow;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	//main blocks
	public static final Block YELLOW_APPLE_BLOCK = new YellowAppleBlock("yellow_apple_block",Material.IRON);
	public static final Block GREEN_APPLE_BLOCK = new GreenAppleBlock("green_apple_block",Material.IRON);
	public static final Block PURPLE_APPLE_BLOCK = new PurpleAppleBlock("purple_apple_block",Material.IRON);
	public static final Block APPLE_BASE_BLOCK = new BaseAppleBlock("base_apple_block",Material.IRON);
	//plant
	public static final Block APPLE_PLANT_GREEN = new Apple_Plant_Green("apple_plant_green", Main.appleTab);
	public static final Block APPLE_PLANT_RED = new Apple_Plant_Red("apple_plant_red", Main.appleTab);
	public static final Block APPLE_PLANT_YELLOW = new Apple_Plant_Yellow("apple_plant_yellow", Main.appleTab);
	public static final Block APPLE_PLANT_PURPLE = new Apple_Plant_Purple("apple_plant_purple", Main.appleTab);
	//Oregen
	public static final Block ORE_OVERWORLD = new ModOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new ModOres("ore_overworld","nether");
	public static final Block ORE_ENDS = new ModOres("ore_end", "end");
}
