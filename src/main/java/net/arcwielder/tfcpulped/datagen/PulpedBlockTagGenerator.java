package net.arcwielder.tfcpulped.datagen;

import net.arcwielder.tfcpulped.TFCPulped;
import net.arcwielder.tfcpulped.common.PulpedTags;
import net.arcwielder.tfcpulped.common.blocks.PulpedBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class PulpedBlockTagGenerator extends BlockTagsProvider {
    public PulpedBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TFCPulped.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .addTag(PulpedTags.Blocks.DECKLES);

        this.tag(PulpedTags.Blocks.DECKLES)
                .add(
                        PulpedBlocks.ACACIA_DECKLE.get(),
                        PulpedBlocks.ASH_DECKLE.get(),
                        PulpedBlocks.ASPEN_DECKLE.get(),
                        PulpedBlocks.BIRCH_DECKLE.get(),
                        PulpedBlocks.BLACKWOOD_DECKLE.get(),
                        PulpedBlocks.CHESTNUT_DECKLE.get(),
                        PulpedBlocks.DOUGLAS_FIR_DECKLE.get(),
                        PulpedBlocks.HICKORY_DECKLE.get(),
                        PulpedBlocks.KAPOK_DECKLE.get(),
                        PulpedBlocks.MANGROVE_DECKLE.get(),
                        PulpedBlocks.MAPLE_DECKLE.get(),
                        PulpedBlocks.OAK_DECKLE.get(),
                        PulpedBlocks.PALM_DECKLE.get(),
                        PulpedBlocks.PINE_DECKLE.get(),
                        PulpedBlocks.ROSEWOOD_DECKLE.get(),
                        PulpedBlocks.SEQUOIA_DECKLE.get(),
                        PulpedBlocks.SPRUCE_DECKLE.get(),
                        PulpedBlocks.SYCAMORE_DECKLE.get(),
                        PulpedBlocks.WHITE_CEDAR_DECKLE.get(),
                        PulpedBlocks.WILLOW_DECKLE.get()
                );
    }
}

//"tfc:wood/stripped_log/acacia",
//    "tfc:wood/stripped_wood/acacia"