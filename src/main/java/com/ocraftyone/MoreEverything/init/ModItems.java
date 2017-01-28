package com.ocraftyone.MoreEverything.init;

import com.ocraftyone.MoreEverything.Reference;
import com.ocraftyone.MoreEverything.handlers.EnumHandler;
import com.ocraftyone.MoreEverything.items.ItemCupcake;
import com.ocraftyone.MoreEverything.items.ItemCupcakeLiner;
import com.ocraftyone.MoreEverything.items.ItemCupcakePan;
import com.ocraftyone.MoreEverything.items.ItemDough;
import com.ocraftyone.MoreEverything.items.ItemSprinkleCupcake;
import com.ocraftyone.MoreEverything.items.ItemSprinkles;
import com.ocraftyone.MoreEverything.util.Utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	

	//Food
	public static Item itemCupcake;
	public static Item itemSprinkleCupcake;
	public static Item itemSprinkles;
	public static Item itemCupcakeLiner;
	public static Item itemCupcakePan;
	public static Item itemDough;
	
	public static void init(){
		itemCupcake = new ItemCupcake("cupcake", 2, 2, false);
		itemSprinkleCupcake = new ItemSprinkleCupcake("sprinkle_cupcake", 4, 4, false);
		itemSprinkles = new ItemSprinkles("sprinkles", 1, 1, false, new PotionEffect(MobEffects.SPEED, 200, 2));
		itemCupcakeLiner = new ItemCupcakeLiner("cupcake_liner");
		itemCupcakePan = new ItemCupcakePan("cupcake_pan");
		itemDough = new ItemDough("dough", 1, 1, false, new PotionEffect(MobEffects.HUNGER, 200, 1), 0.9F);
	}
	
	public static void register() {
		GameRegistry.register(itemCupcake);
		GameRegistry.register(itemSprinkleCupcake);
		GameRegistry.register(itemSprinkles);
		GameRegistry.register(itemCupcakeLiner);
		GameRegistry.register(itemCupcakePan);
		GameRegistry.register(itemCupcake);
		GameRegistry.register(itemDough);
	}
	
	public static void registerRenders() {
		registerRender(itemCupcake);
		registerRender(itemSprinkleCupcake);
		registerRender(itemSprinkles);
		registerRender(itemCupcakeLiner);
		registerRender(itemDough);
		
		for(int i = 0; i < EnumHandler.CupcakePanTypes.values().length; i++) {
			registerRender(itemCupcakePan, i, "cupcake_pan_" + EnumHandler.CupcakePanTypes.values()[i].getName());
		}
	}
	
	public static void registerItem(Item item){
		GameRegistry.register(item);
		Utils.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));
	}
	
	private static void registerRender(Item item){
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.modid, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
	}
	
	private static void registerRender(Item item, int meta, String fileName){
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.modid, fileName), "inventory"));
		Utils.getLogger().info("Registered render for " + item.getUnlocalizedName().substring(5));
	}

}
