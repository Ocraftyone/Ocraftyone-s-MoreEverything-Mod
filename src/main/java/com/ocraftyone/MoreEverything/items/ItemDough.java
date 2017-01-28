package com.ocraftyone.MoreEverything.items;

import com.ocraftyone.MoreEverything.init.ModItemFood;

import net.minecraft.potion.PotionEffect;

public class ItemDough extends ModItemFood {

	public ItemDough(String name, int amount, float saturation, boolean isWolfFood, PotionEffect potionEffects,
			float probability) {
		super(name, amount, saturation, isWolfFood, potionEffects, probability);
	}
	
}
