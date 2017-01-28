package com.ocraftyone.MoreEverything.init;

import com.ocraftyone.MoreEverything.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ModItemFood extends ItemFood {
	
	private PotionEffect[] effects;
	private PotionEffect effect;
	private float Probability;
	
	public ModItemFood(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);		
		this.setUnlocalizedName(name);
		this.setRegistryName(new ResourceLocation(Reference.modid, name));
	}
	
	public ModItemFood(String name, int amount, float saturation, boolean isWolfFood, PotionEffect...potionEffects) {
		super(amount, saturation, isWolfFood);		
		this.setUnlocalizedName(name);
		this.setRegistryName(new ResourceLocation(Reference.modid, name));
		effects = potionEffects;
		for(PotionEffect effect : effects) {
			this.setPotionEffect(effect, 1);
		}
	}
	
	public ModItemFood(String name, int amount, float saturation, boolean isWolfFood, PotionEffect potionEffects) {
		super(amount, saturation, isWolfFood);		
		this.setUnlocalizedName(name);
		this.setRegistryName(new ResourceLocation(Reference.modid, name));
		effect = potionEffects;
			this.setPotionEffect(effect, 1);
	}
	
	public ModItemFood(String name, int amount, float saturation, boolean isWolfFood, PotionEffect potionEffects, float probability) {
		super(amount, saturation, isWolfFood);		
		this.setUnlocalizedName(name);
		this.setRegistryName(new ResourceLocation(Reference.modid, name));
		effect = potionEffects;
		Probability = probability;
			this.setPotionEffect(effect, Probability);
	}
}
