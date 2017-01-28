package com.ocraftyone.MoreEverything.items;

import java.util.List;

import com.ocraftyone.MoreEverything.handlers.EnumHandler.CupcakePanTypes;
import com.ocraftyone.MoreEverything.init.ModItemBasic;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemCupcakePan extends ModItemBasic {

	public ItemCupcakePan(String name) {
		super(name);
		this.setHasSubtypes(true);
		this.setMaxStackSize(1);
	}
	
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems) {
		for(int i = 0; i < CupcakePanTypes.values().length; i++) {
			subItems.add(new ItemStack(itemIn, 1, i));
		}
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < CupcakePanTypes.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return this.getUnlocalizedName() + "." + CupcakePanTypes.values()[i].getName();
			}
			else {
				continue;
			}
		}
		return this.getUnlocalizedName() + "." + CupcakePanTypes.EMPTY.getName();
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		switch(stack.getItemDamage()) {
		case 0: break;
		case 1: tooltip.add("1/6 Cupcakes"); break;
		case 2: tooltip.add("2/6 Cupcakes"); break;
		case 3: tooltip.add("3/6 Cupcakes"); break;
		case 4: tooltip.add("4/6 Cupcakes"); break;
		case 5: tooltip.add("5/6 Cupcakes"); break;
		case 6: tooltip.add("6/6 Cupcakes"); break;
		case 7: tooltip.add("1/6 Dough"); break;
		case 8: tooltip.add("2/6 Dough"); break;
		case 9: tooltip.add("3/6 Dough"); break;
		case 10: tooltip.add("4/6 Dough"); break;
		case 11: tooltip.add("5/6 Dough"); break;
		case 12: tooltip.add("6/6 Dough"); break;
		}
	}

}
