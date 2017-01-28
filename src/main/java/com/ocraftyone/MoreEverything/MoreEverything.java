package com.ocraftyone.MoreEverything;

import com.ocraftyone.MoreEverything.handlers.RecipeHandler;
import com.ocraftyone.MoreEverything.init.ModBlocks;
import com.ocraftyone.MoreEverything.init.ModItems;
import com.ocraftyone.MoreEverything.proxy.CommonProxy;
import com.ocraftyone.MoreEverything.util.Utils;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.modid, name = Reference.modname, version = Reference.version, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class MoreEverything {
	
	@Mod.Instance(Reference.modid)
	public static MoreEverything instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
	Utils.getLogger().info("======================================START LOADING OCRAFTYONE'S MOREEVERYTHING MOD======================================");;
	ModItems.init();
	ModItems.register();
	
	ModBlocks.init();
	ModBlocks.register();
	
	proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
	proxy.registerModelBakeryVariants();
	
	RecipeHandler.registerCraftingRecipies();
	RecipeHandler.registerSmeltingRecipies();
	
	Utils.getLogger().info("Initialization Complete!");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		Utils.getLogger().info("======================================LOADED  OCRAFTYONE'S MOREEVERYTHING MOD======================================");
	}

}
