package com.ocraftyone.MoreEverything.handlers;

import com.ocraftyone.MoreEverything.init.ModBlocks;
import com.ocraftyone.MoreEverything.init.ModItems;
import com.ocraftyone.MoreEverything.util.Utils;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
	public static void registerCraftingRecipies() {
		//GameRegistry.addRecipe(new ItemStack(item), new Object[] {"", "", "", 'letter', itemRepresented, ...});
		GameRegistry.addRecipe(new ItemStack(ModItems.itemSprinkleCupcake), "SSS", "SCS", "SSS", 'S', ModItems.itemSprinkles, 'C', ModItems.itemCupcake);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemCupcakeLiner, 4), "P P"," P ",'P', Items.PAPER);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemDough), Items.WHEAT, Items.WATER_BUCKET, Items.EGG);
		
		//Cupcake Pans
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemCupcakePan, 1, 0), "III", 'I', Items.IRON_INGOT);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemCupcakePan, 1, 1), ModItems.itemCupcakePan, ModItems.itemDough);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemCupcakePan, 1, 2), ModItems.itemCupcakePan, ModItems.itemDough, ModItems.itemDough);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemCupcakePan, 1, 3), ModItems.itemCupcakePan, ModItems.itemDough, ModItems.itemDough, ModItems.itemDough);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemCupcakePan, 1, 4), ModItems.itemCupcakePan, ModItems.itemDough, ModItems.itemDough, ModItems.itemDough, ModItems.itemDough);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemCupcakePan, 1, 5), ModItems.itemCupcakePan, ModItems.itemDough, ModItems.itemDough, ModItems.itemDough, ModItems.itemDough, ModItems.itemDough);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemCupcakePan, 1, 6), ModItems.itemCupcakePan, ModItems.itemDough, ModItems.itemDough, ModItems.itemDough, ModItems.itemDough, ModItems.itemDough, ModItems.itemDough);


		
		Utils.getLogger().info("Registered Crafting Recipies!");
	}

	public static void registerSmeltingRecipies() {
		GameRegistry.addSmelting(ModBlocks.blockSprinklesOre, new ItemStack(ModItems.itemSprinkles), 0.2F);
		
		//Cupcake Pans
		for(int i = 1; i <= 6; i++) {
			GameRegistry.addSmelting(new ItemStack(ModItems.itemCupcakePan, 1, i + 6), new ItemStack(ModItems.itemCupcakePan, 1, i), i/5);
		}
		
		Utils.getLogger().info("Registered Smelting Recipies!");
	}
}
