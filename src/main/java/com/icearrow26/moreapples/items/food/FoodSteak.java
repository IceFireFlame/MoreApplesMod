package com.icearrow26.moreapples.items.food;

import com.icearrow26.moreapples.Main;
import com.icearrow26.moreapples.init.ModItems;
import com.icearrow26.moreapples.util.Interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodSteak extends ItemFood implements IHasModel {

	public FoodSteak(String name, CreativeTabs tab, int amount, boolean isWolfFood)
		{
			super(amount, isWolfFood);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(tab);
			
			ModItems.ITEMS.add(this);
			
		}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
