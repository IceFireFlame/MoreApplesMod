package com.icearrow26.moreapples;

import com.icearrow26.moreapples.init.ModRecipes;
import com.icearrow26.moreapples.minecart.ExplodingMinecart;
import com.icearrow26.moreapples.proxy.CommonProxy;
import com.icearrow26.moreapples.tabs.AppleTab;
import com.icearrow26.moreapples.tabs.ArmorTab;
import com.icearrow26.moreapples.util.Reference;
import com.icearrow26.moreapples.tabs.BlockTab;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	public static final AppleTab appleTab = new AppleTab("appletab");
	public static final ArmorTab ArmorTab = new ArmorTab("armortab");
	public static final BlockTab BlockTab = new BlockTab("blocktab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.Init();
		MinecraftForge.EVENT_BUS.register(new ExplodingMinecart());
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
}
