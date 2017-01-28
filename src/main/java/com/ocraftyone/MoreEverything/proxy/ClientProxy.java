package com.ocraftyone.MoreEverything.proxy;

import com.ocraftyone.MoreEverything.Reference;
import com.ocraftyone.MoreEverything.init.ModBlocks;
import com.ocraftyone.MoreEverything.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
	
	public void registerModelBakeryVariants() {
		ModelBakery.registerItemVariants(ModItems.itemCupcakePan, new ResourceLocation(Reference.modid, "cupcake_pan_empty"),new ResourceLocation(Reference.modid, "cupcake_pan_one_cupcake"), new ResourceLocation(Reference.modid, "cupcake_pan_two_cupcakes"), new ResourceLocation(Reference.modid, "cupcake_pan_three_cupcakes"), new ResourceLocation(Reference.modid, "cupcake_pan_four_cupcakes"), new ResourceLocation(Reference.modid, "cupcake_pan_five_cupcakes"), new ResourceLocation(Reference.modid, "cupcake_pan_six_cupcakes"), new ResourceLocation(Reference.modid, "cupcake_pan_one_dough"), new ResourceLocation(Reference.modid, "cupcake_pan_two_dough"), new ResourceLocation(Reference.modid, "cupcake_pan_three_dough"), new ResourceLocation(Reference.modid, "cupcake_pan_four_dough"), new ResourceLocation(Reference.modid, "cupcake_pan_five_dough"), new ResourceLocation(Reference.modid, "cupcake_pan_six_dough"));
	}

}
