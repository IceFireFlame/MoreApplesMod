package com.icearrow26.moreapples.util.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {
	public static enum EnumType implements IStringSerializable {
		RED_APPLE_SEEDS(0, "red_apple_seeds"),
		GREEN_APPLE_SEEDS(1, "green_apple_seeds"),
		PURPLE_APPLE_SEEDS(2, "purple_apple_seeds"),
		YELLOW_APPLE_SEEDS(3, "yellow_apple_seeds");
		private static final EnumType[] META_LOOKUP = new EnumType[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private EnumType(int meta, String name) {
			this(meta, name, name);
		}
		private EnumType(int meta, String name, String unlocalizedName) {
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
		}
		@Override
		public String getName() {
			return this.name;
		}
		public int getMeta() {
			return this.meta;
		}
		public String getUnlocalizedName() {
			return this.unlocalizedName;
		}
		@Override
		public String toString() {
			return this.name;
		}
		public static EnumType byMetadata(int meta) {
			return META_LOOKUP[meta];
		}
		static
		{
			for(EnumType enumtype : values()) {
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}
}
