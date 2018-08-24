package com.icearrow26.moreapples.blocks;

import com.icearrow26.moreapples.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BaseAppleBlock extends BlockBase  {

	public BaseAppleBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(Main.BlockTab);
	}

}
