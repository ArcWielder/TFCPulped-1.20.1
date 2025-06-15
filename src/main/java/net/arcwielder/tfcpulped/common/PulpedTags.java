package net.arcwielder.tfcpulped.common;

import net.arcwielder.tfcpulped.TFCPulped;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class PulpedTags {
    public static class Blocks {
        public static final TagKey<Block> DECKLES = tag("deckles");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(TFCPulped.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> STRIPPED_ACACIA_LOGS = tag("stripped_acacia_logs");
        public static final TagKey<Item> STRIPPED_ASH_LOGS = tag("stripped_ash_logs");
        public static final TagKey<Item> STRIPPED_ASPEN_LOGS = tag("stripped_aspen_logs");
        public static final TagKey<Item> STRIPPED_BIRCH_LOGS = tag("stripped_birch_logs");
        public static final TagKey<Item> STRIPPED_BLACKWOOD_LOGS = tag("stripped_blackwood_logs");
        public static final TagKey<Item> STRIPPED_CHESTNUT_LOGS = tag("stripped_chestnut_logs");
        public static final TagKey<Item> STRIPPED_DOUGLAS_FIR_LOGS = tag("stripped_douglas_fir_logs");
        public static final TagKey<Item> STRIPPED_HICKORY_LOGS = tag("stripped_hickory_logs");
        public static final TagKey<Item> STRIPPED_KAPOK_LOGS = tag("stripped_kapok_logs");
        public static final TagKey<Item> STRIPPED_MANGROVE_LOGS = tag("stripped_mangrove_logs");
        public static final TagKey<Item> STRIPPED_MAPLE_LOGS = tag("stripped_maple_logs");
        public static final TagKey<Item> STRIPPED_OAK_LOGS = tag("stripped_oak_logs");
        public static final TagKey<Item> STRIPPED_PALM_LOGS = tag("stripped_palm_logs");
        public static final TagKey<Item> STRIPPED_PINE_LOGS = tag("stripped_pine_logs");
        public static final TagKey<Item> STRIPPED_ROSEWOOD_LOGS = tag("stripped_rosewood_logs");
        public static final TagKey<Item> STRIPPED_SEQUOIA_LOGS = tag("stripped_sequoia_logs");
        public static final TagKey<Item> STRIPPED_SPRUCE_LOGS = tag("stripped_spruce_logs");
        public static final TagKey<Item> STRIPPED_SYCAMORE_LOGS = tag("stripped_sycamore_logs");
        public static final TagKey<Item> STRIPPED_WHITE_CEDAR_LOGS = tag("stripped_white_cedar_logs");
        public static final TagKey<Item> STRIPPED_WILLOW_LOGS = tag("stripped_willow_logs");
        public static final TagKey<Item> TREE_BARKS = tag("tree_barks");
        public static final TagKey<Item> WOOD_CHIPS = tag("wood_chips");

        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(new ResourceLocation(TFCPulped.MOD_ID, name));
        }
    }

}
