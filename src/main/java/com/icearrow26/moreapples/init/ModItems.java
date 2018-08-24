package com.icearrow26.moreapples.init;

import java.util.ArrayList;
import java.util.List;

import com.icearrow26.moreapples.Main;
import com.icearrow26.moreapples.items.EBase;
import com.icearrow26.moreapples.items.FoodBase;
import com.icearrow26.moreapples.items.armor.ArmorBase;
import com.icearrow26.moreapples.items.armor.ArmorBase2;
import com.icearrow26.moreapples.items.armor.ArmorBase3;
import com.icearrow26.moreapples.items.armor.ArmorBase4;
import com.icearrow26.moreapples.items.food.FoodApple;
import com.icearrow26.moreapples.items.food.FoodSteak;
import com.icearrow26.moreapples.items.food.IPlantable.GreenAppleSeed;
import com.icearrow26.moreapples.items.food.IPlantable.PurpleAppleSeed;
import com.icearrow26.moreapples.items.food.IPlantable.RedAppleSeed;
import com.icearrow26.moreapples.items.food.IPlantable.YellowAppleSeed;
import com.icearrow26.moreapples.items.tools.ToolAxe;
import com.icearrow26.moreapples.items.tools.ToolHoe;
import com.icearrow26.moreapples.items.tools.ToolPickaxe;
import com.icearrow26.moreapples.items.tools.ToolSpade;
import com.icearrow26.moreapples.items.tools.ToolSword;
import com.icearrow26.moreapples.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<>();
	//Materials
	public static final ToolMaterial RED_MATERIAL_APPLE = EnumHelper.addToolMaterial("red_material_apple", 3, 400, 8.0f, (float) 5.0, 10);
	public static final ToolMaterial YELLOW_MATERIAL_APPLE = EnumHelper.addToolMaterial("yellow_material_apple", 3, 400, 8.0f, (float) 5.0, 10);
	public static final ToolMaterial PURPLE_MATERIAL_APPLE = EnumHelper.addToolMaterial("purple_material_apple", 3, 400, 8.0f, (float) 5.0, 10);
	public static final ToolMaterial GREEN_MATERIAL_APPLE = EnumHelper.addToolMaterial("green_material_apple", 3, 400, 8.0f, (float) 5.0, 10);
	public static final ArmorMaterial RED_ARMOR_MATERIAL_APPLE = EnumHelper.addArmorMaterial("red_armor_material_apple", Reference.MOD_ID + ":red_apple", 17, new int[] {4, 8, 6, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.5F);
	public static final ArmorMaterial YELLOW_ARMOR_MATERIAL_APPLE = EnumHelper.addArmorMaterial("yellow_armor_material_apple", Reference.MOD_ID + ":yellow_apple", 17, new int[] {4, 8, 6, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.5F);
	public static final ArmorMaterial PURPLE_ARMOR_MATERIAL_APPLE = EnumHelper.addArmorMaterial("purple_armor_material_apple", Reference.MOD_ID + ":purple_apple", 17, new int[] {4, 8, 6, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.5F);
	public static final ArmorMaterial GREEN_ARMOR_MATERIAL_APPLE = EnumHelper.addArmorMaterial("green_armor_material_apple", Reference.MOD_ID + ":green_apple", 17, new int[] {4, 8, 6, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.5F); 
	//apples
	public static final Item YELLOW_APPLE = new FoodApple("yellow_apple", Main.appleTab, 3, false);
	public static final Item GREEN_APPLE = new FoodApple("green_apple", Main.appleTab, 3, false);
	public static final Item BURNT_GREEN_APPLE = new FoodApple("burnt_green_apple", Main.appleTab, 3, false);
	public static final Item PURPLE_APPLE = new FoodApple("purple_apple", Main.appleTab, 3, false);
	public static final Item BURNT_PURPLE_APPLE = new FoodApple("burnt_purple_apple", Main.appleTab, 3, false);
	public static final Item BURNT_YELLOW_APPLE = new FoodApple("burnt_yellow_apple", Main.appleTab, 3, false);
	public static final Item BURNT_RED_APPLE = new FoodApple("burnt_red_apple", Main.appleTab, 3, false);
	//steak
	public static final Item RED_APPLE_STEAK = new FoodSteak("red_apple_steak", Main.appleTab, 20, false);
	public static final Item YELLOW_APPLE_STEAK = new FoodSteak("yellow_apple_steak", Main.appleTab, 20, false);
	public static final Item PURPLE_APPLE_STEAK = new FoodSteak("purple_apple_steak", Main.appleTab, 20, false);
	public static final Item GREEN_APPLE_STEAK = new FoodSteak ("green_apple_steak", Main.appleTab, 20, false);
	//tools
	//red
	public static final ItemSword RED_APPLE_SWORD = new ToolSword("red_apple_sword", RED_MATERIAL_APPLE);
	public static final ItemSpade RED_APPLE_SHOVEL = new ToolSpade("red_apple_shovel", RED_MATERIAL_APPLE);
	public static final ItemPickaxe RED_APPLE_PICKAXE = new ToolPickaxe("red_apple_pickaxe", RED_MATERIAL_APPLE);
	public static final ItemAxe RED_APPLE_AXE = new ToolAxe("red_apple_axe", RED_MATERIAL_APPLE);
	public static final ItemHoe RED_APPLE_HOE = new ToolHoe("red_apple_hoe", RED_MATERIAL_APPLE);
	//yellow
	public static final ItemSword YELLOW_APPLE_SWORD = new ToolSword("yellow_apple_sword", YELLOW_MATERIAL_APPLE);
	public static final ItemSpade YELLOWAPPLE_SHOVEL = new ToolSpade("yellow_apple_shovel", YELLOW_MATERIAL_APPLE);
	public static final ItemPickaxe YELLOW_APPLE_PICKAXE = new ToolPickaxe("yellow_apple_pickaxe", YELLOW_MATERIAL_APPLE);
	public static final ItemAxe YELLOW_APPLE_AXE = new ToolAxe("yellow_apple_axe", YELLOW_MATERIAL_APPLE);
	public static final ItemHoe YELLOW_APPLE_HOE = new ToolHoe("yellow_apple_hoe", YELLOW_MATERIAL_APPLE);
	//purple
	public static final ItemSword PURPLE_APPLE_SWORD = new ToolSword("purple_apple_sword", PURPLE_MATERIAL_APPLE);
	public static final ItemSpade PURPLE_APPLE_SHOVEL = new ToolSpade("purple_apple_shovel", PURPLE_MATERIAL_APPLE);
	public static final ItemPickaxe PURPLE_APPLE_PICKAXE = new ToolPickaxe("purple_apple_pickaxe", PURPLE_MATERIAL_APPLE);
	public static final ItemAxe PURPLE_APPLE_AXE = new ToolAxe("purple_apple_axe", PURPLE_MATERIAL_APPLE);
	public static final ItemHoe PURPLE_APPLE_HOE = new ToolHoe("purple_apple_hoe", PURPLE_MATERIAL_APPLE);
	//green
	public static final ItemSword GREEN_APPLE_SWORD = new ToolSword("green_apple_sword", GREEN_MATERIAL_APPLE);
	public static final ItemSpade GREEN_APPLE_SHOVEL = new ToolSpade("green_apple_shovel", GREEN_MATERIAL_APPLE);
	public static final ItemPickaxe GREEN_APPLE_PICKAXE = new ToolPickaxe("green_apple_pickaxe", GREEN_MATERIAL_APPLE);
	public static final ItemAxe GREEN_APPLE_AXE = new ToolAxe("green_apple_axe", GREEN_MATERIAL_APPLE);
	public static final ItemHoe GREEN_APPLE_HOE = new ToolHoe("green_apple_hoe", GREEN_MATERIAL_APPLE);
	//seeds
	public static final Item RED_APPLE_SEEDS = new RedAppleSeed("red_apple_seed", 1, false);
	public static final Item YELLOW_APPLE_SEEDS = new YellowAppleSeed("yellow_apple_seed", 1, false);
	public static final Item PURPLE_APPLE_SEEDS = new PurpleAppleSeed("purple_apple_seed", 1, false);
	public static final Item GREEN_APPLE_SEEDS = new GreenAppleSeed("green_apple_seed", 1, false);
	//armor
	//red
	public static final Item  RED_APPLE_HELMET = new ArmorBase("red_apple_helmet", RED_ARMOR_MATERIAL_APPLE, 1, EntityEquipmentSlot.HEAD);
	public static final Item  RED_APPLE_CHESTPLATE = new ArmorBase("red_apple_chestplate", RED_ARMOR_MATERIAL_APPLE, 1, EntityEquipmentSlot.CHEST);
	public static final Item  RED_APPLE_LEGGINGS = new ArmorBase("red_apple_leggings", RED_ARMOR_MATERIAL_APPLE, 2, EntityEquipmentSlot.LEGS);
	public static final Item  RED_APPLE_BOOTS = new ArmorBase("red_apple_boots", RED_ARMOR_MATERIAL_APPLE, 1, EntityEquipmentSlot.FEET);
	//yellow
	public static final Item  YELLOW_APPLE_HELMET = new ArmorBase2("yellow_apple_helmet", YELLOW_ARMOR_MATERIAL_APPLE, 1, EntityEquipmentSlot.HEAD);
	public static final Item  YELLOW_APPLE_CHESTPLATE = new ArmorBase2("yellow_apple_chestplate", YELLOW_ARMOR_MATERIAL_APPLE, 1, EntityEquipmentSlot.CHEST);
	public static final Item  YELLOW_APPLE_LEGGINGS = new ArmorBase2("yellow_apple_leggings", YELLOW_ARMOR_MATERIAL_APPLE, 2, EntityEquipmentSlot.LEGS);
	public static final Item  YELLOW_APPLE_BOOTS = new ArmorBase2("yellow_apple_boots", YELLOW_ARMOR_MATERIAL_APPLE, 1, EntityEquipmentSlot.FEET);
	//green
	public static final Item  GREEN_APPLE_HELMET = new ArmorBase3("green_apple_helmet", GREEN_ARMOR_MATERIAL_APPLE, 1, EntityEquipmentSlot.HEAD);
	public static final Item  GREEN_APPLE_CHESTPLATE = new ArmorBase3("green_apple_chestplate", GREEN_ARMOR_MATERIAL_APPLE, 1, EntityEquipmentSlot.CHEST);
	public static final Item  GREEN_APPLE_LEGGINGS = new ArmorBase3("green_apple_leggings", GREEN_ARMOR_MATERIAL_APPLE, 2, EntityEquipmentSlot.LEGS);
	public static final Item  GREEN_APPLE_BOOTS = new ArmorBase3("green_apple_boots", GREEN_ARMOR_MATERIAL_APPLE, 1, EntityEquipmentSlot.FEET);
	//purple
	public static final Item  PURPLE_APPLE_HELMET = new ArmorBase4("purple_apple_helmet", PURPLE_ARMOR_MATERIAL_APPLE, 1, EntityEquipmentSlot.HEAD);
	public static final Item  PURPLE_APPLE_CHESTPLATE = new ArmorBase4("purple_apple_chestplate", PURPLE_ARMOR_MATERIAL_APPLE, 1, EntityEquipmentSlot.CHEST);
	public static final Item  PURPLE_APPLE_LEGGINGS = new ArmorBase4("purple_apple_leggings", PURPLE_ARMOR_MATERIAL_APPLE, 2, EntityEquipmentSlot.LEGS);
	public static final Item  PURPLE_APPLE_BOOTS = new ArmorBase4("purple_apple_boots", PURPLE_ARMOR_MATERIAL_APPLE, 1, EntityEquipmentSlot.FEET);
}
