package com.icearrow26.moreapples.tabs;

import com.icearrow26.moreapples.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class AppleTab extends CreativeTabs {

	public AppleTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.GREEN_APPLE);
	}

}
