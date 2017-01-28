package com.ocraftyone.MoreEverything.items;

import java.util.List;

import com.ocraftyone.MoreEverything.Reference;
import com.ocraftyone.MoreEverything.init.ModItemFood;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

public class ItemSprinkles extends ModItemFood {

	public ItemSprinkles(String name, int amount, float saturation, boolean isWolfFood, PotionEffect...potionEffect) {
		super(name, amount, saturation, isWolfFood, potionEffect);
		this.setAlwaysEdible();
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		tooltip.add("\u00A7l\u00A76Full of sugar!");
		tooltip.add("Speed III (0:10)");
	} 

}
