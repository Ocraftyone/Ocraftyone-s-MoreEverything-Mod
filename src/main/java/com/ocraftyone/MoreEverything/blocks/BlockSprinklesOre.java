package com.ocraftyone.MoreEverything.blocks;

import java.util.Random;

import com.ocraftyone.MoreEverything.Reference;
import com.ocraftyone.MoreEverything.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockSprinklesOre extends Block {

	public BlockSprinklesOre(String name) {
		super (Material.ROCK);
		this.setUnlocalizedName(name);
		this.setRegistryName(new ResourceLocation(Reference.modid, name));
		this.setHardness(3);
		this.setResistance(15);
		this.setHarvestLevel("pickaxe", 2);
	}
	 
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.itemSprinkles;
	}
	
	public static int toolFortune;
	 @Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		toolFortune = fortune;
		return toolFortune * 2 + 1;
	}
}
