package net.arcwielder.tfcpulped.datagen.loot;

import net.arcwielder.tfcpulped.common.blocks.PulpedBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class PulpedBlockLootTables extends BlockLootSubProvider {
    public PulpedBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(PulpedBlocks.ACACIA_DECKLE.get());
        this.dropSelf(PulpedBlocks.ASH_DECKLE.get());
        this.dropSelf(PulpedBlocks.ASPEN_DECKLE.get());
        this.dropSelf(PulpedBlocks.BIRCH_DECKLE.get());
        this.dropSelf(PulpedBlocks.BLACKWOOD_DECKLE.get());
        this.dropSelf(PulpedBlocks.CHESTNUT_DECKLE.get());
        this.dropSelf(PulpedBlocks.DOUGLAS_FIR_DECKLE.get());
        this.dropSelf(PulpedBlocks.HICKORY_DECKLE.get());
        this.dropSelf(PulpedBlocks.KAPOK_DECKLE.get());
        this.dropSelf(PulpedBlocks.MANGROVE_DECKLE.get());
        this.dropSelf(PulpedBlocks.MAPLE_DECKLE.get());
        this.dropSelf(PulpedBlocks.OAK_DECKLE.get());
        this.dropSelf(PulpedBlocks.PALM_DECKLE.get());
        this.dropSelf(PulpedBlocks.PINE_DECKLE.get());
        this.dropSelf(PulpedBlocks.ROSEWOOD_DECKLE.get());
        this.dropSelf(PulpedBlocks.SEQUOIA_DECKLE.get());
        this.dropSelf(PulpedBlocks.SPRUCE_DECKLE.get());
        this.dropSelf(PulpedBlocks.SYCAMORE_DECKLE.get());
        this.dropSelf(PulpedBlocks.WHITE_CEDAR_DECKLE.get());
        this.dropSelf(PulpedBlocks.WILLOW_DECKLE.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return PulpedBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
