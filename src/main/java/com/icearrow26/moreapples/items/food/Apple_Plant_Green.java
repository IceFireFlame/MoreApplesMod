package com.icearrow26.moreapples.items.food;

import java.util.List;

import com.icearrow26.moreapples.blocks.BlockBase;
import com.icearrow26.moreapples.init.ModBlocks;
import com.icearrow26.moreapples.init.ModItems;
import com.icearrow26.moreapples.tabs.AppleTab;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Apple_Plant_Green extends BlockCrops
{
	private static final AxisAlignedBB[] green_apple_seeds = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), 
																				  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), 
																				  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), 
																				  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), 
																				  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), 
																				  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), 
																				  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), 
																				  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};
    public Apple_Plant_Green(String name, AppleTab appletab)
    {
    	setUnlocalizedName(name);
    	setRegistryName(name);
    	ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
    	ModBlocks.BLOCKS.add(this);
    }
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	{
    		if(!worldIn.isRemote)
    		{
    			if(this.isMaxAge(state))
    			{
    				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.GREEN_APPLE)));
    				worldIn.setBlockState(pos, this.withAge(0));
    				return true;
    			}
    		}
    	} return false;
    }
    @Override
    protected Item getSeed()
    {
    	return ModItems.GREEN_APPLE_SEEDS;
    }
    
    @Override
    protected Item getCrop()
    {
    	return ModItems.GREEN_APPLE_SEEDS;
    }
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
    {
    	return green_apple_seeds[((Integer)state.getValue(this.getAgeProperty())).intValue()];
    }
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

}