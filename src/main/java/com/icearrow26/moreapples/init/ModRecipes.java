package com.icearrow26.moreapples.init;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void Init() {
		GameRegistry.addSmelting(ModItems.GREEN_APPLE, new ItemStack(ModItems.BURNT_GREEN_APPLE, 1), 3.0f);
		GameRegistry.addSmelting(ModItems.YELLOW_APPLE, new ItemStack(ModItems.BURNT_YELLOW_APPLE, 1), 3.0f);
		GameRegistry.addSmelting(ModItems.PURPLE_APPLE, new ItemStack(ModItems.BURNT_PURPLE_APPLE, 1), 3.0f);
		GameRegistry.addSmelting(ModBlocks.PURPLE_APPLE_BLOCK, new ItemStack(ModBlocks.APPLE_BASE_BLOCK, 8), 3.0f);
		GameRegistry.addSmelting(ModBlocks.YELLOW_APPLE_BLOCK, new ItemStack(ModBlocks.APPLE_BASE_BLOCK, 8), 3.0f);
		GameRegistry.addSmelting(ModBlocks.GREEN_APPLE_BLOCK, new ItemStack(ModBlocks.APPLE_BASE_BLOCK, 8), 3.0f);
	}
			
}
