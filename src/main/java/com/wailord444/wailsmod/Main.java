package com.wailord444.wailsmod;
import com.wailord444.wailsmod.init.ModRecipes;
import com.wailord444.wailsmod.proxy.CommonProxy;
import com.wailord444.wailsmod.util.Reference;
import com.wailord444.wailsmod.util.handlers.GuiHandler;
import com.wailord444.wailsmod.util.handlers.RegistryHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
		RegistryHandler.initRegistries();
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		RegistryHandler.postInitRegistries();
	}
	
}
