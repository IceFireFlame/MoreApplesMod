package com.icearrow26.moreapples.tabs;

import com.icearrow26.moreapples.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlockTab extends CreativeTabs {

	public BlockTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.APPLE_BASE_BLOCK);
	}

}
