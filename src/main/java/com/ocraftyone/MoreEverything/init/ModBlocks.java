package com.ocraftyone.MoreEverything.init;

import com.ocraftyone.MoreEverything.Reference;
import com.ocraftyone.MoreEverything.blocks.BlockSprinklesOre;
import com.ocraftyone.MoreEverything.util.Utils;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block blockSprinklesOre;

	public static void init() {
		blockSprinklesOre = new BlockSprinklesOre("sprinkles_ore");
		
	}

	public static void register() {
		registerBlock(blockSprinklesOre);
		
	}

	public static void registerRenders() {
		registerRender(blockSprinklesOre);
		
	}
	
	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.modid, block.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
	}

}
