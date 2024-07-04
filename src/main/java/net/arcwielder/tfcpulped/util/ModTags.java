package net.arcwielder.tfcpulped.util;

import net.arcwielder.tfcpulped.TFCPulped;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(TFCPulped.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> STRIPPED_ACACIA = tag("stripped_acacia");
        public static final TagKey<Item> STRIPPED_ASH = tag("stripped_ash");
        public static final TagKey<Item> STRIPPED_ASPEN = tag("stripped_aspen");
        public static final TagKey<Item> STRIPPED_BIRCH = tag("stripped_birch");
        public static final TagKey<Item> STRIPPED_BLACKWOOD = tag("stripped_blackwood");
        public static final TagKey<Item> STRIPPED_CHESTNUT = tag("stripped_chestnut");
        public static final TagKey<Item> STRIPPED_DOUGLAS_FIR = tag("stripped_douglas_fir");
        public static final TagKey<Item> STRIPPED_HICKORY = tag("stripped_hickory");
        public static final TagKey<Item> STRIPPED_KAPOK = tag("stripped_kapok");
        public static final TagKey<Item> STRIPPED_MANGROVE = tag("stripped_mangrove");
        public static final TagKey<Item> STRIPPED_MAPLE = tag("stripped_maple");
        public static final TagKey<Item> STRIPPED_OAK = tag("stripped_oak");
        public static final TagKey<Item> STRIPPED_PALM = tag("stripped_palm");
        public static final TagKey<Item> STRIPPED_PINE = tag("stripped_pine");
        public static final TagKey<Item> STRIPPED_ROSEWOOD = tag("stripped_rosewood");
        public static final TagKey<Item> STRIPPED_SEQUOIA = tag("stripped_sequoia");
        public static final TagKey<Item> STRIPPED_SPRUCE = tag("stripped_spruce");
        public static final TagKey<Item> STRIPPED_SYCAMORE = tag("stripped_sycamore");
        public static final TagKey<Item> STRIPPED_WHITE_CEDAR = tag("stripped_white_cedar");
        public static final TagKey<Item> STRIPPED_WILLOW = tag("stripped_willow");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(TFCPulped.MOD_ID, name));
        }
    }
}
