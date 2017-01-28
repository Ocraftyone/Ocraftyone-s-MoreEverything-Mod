package com.ocraftyone.MoreEverything.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {
	
	public static enum CupcakePanTypes implements IStringSerializable {
		EMPTY("empty", 0),
		ONE_CUPCAKE("one_cupcake", 1),
		TWO_CUPCAKES("two_cupcakes", 2),
		THREE_CUPCAKES("three_cupcakes", 3),
		FOUR_CUPCAKES("four_cupcakes", 4),
		FIVE_CUPCAKES("five_cupcakes", 5),
		SIX_CUPCAKES("six_cupcakes", 6),
		ONE_DOUGH("one_dough", 7),
		TWO_DOUGH("two_dough", 8),
		THREE_DOUGH("three_dough", 9),
		FOUR_DOUGH("four_dough", 10),
		FIVE_DOUGH("five_dough", 11),
		SIX_DOUGH("six_dough", 12);
		
		private int ID;
		private String name;
		
		private CupcakePanTypes(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}

		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
		
	}

}
