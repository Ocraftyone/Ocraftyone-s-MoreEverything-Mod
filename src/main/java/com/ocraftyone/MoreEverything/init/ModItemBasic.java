package com.ocraftyone.MoreEverything.init;

import com.ocraftyone.MoreEverything.Reference;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ModItemBasic extends Item {
	public ModItemBasic(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(new ResourceLocation(Reference.modid, name));
	}
}
