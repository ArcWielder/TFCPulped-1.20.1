package net.arcwielder.tfcpulped.datagen;

import net.arcwielder.tfcpulped.TFCPulped;
import net.arcwielder.tfcpulped.common.blocks.PulpedBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class PulpedBlockStateProvider extends BlockStateProvider {
    public PulpedBlockStateProvider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(PulpedBlocks.ACACIA_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/acacia")));
        simpleBlock(PulpedBlocks.ASH_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/ash")));
        simpleBlock(PulpedBlocks.ASPEN_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/aspen")));
        simpleBlock(PulpedBlocks.BIRCH_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/birch")));
        simpleBlock(PulpedBlocks.BLACKWOOD_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/blackwood")));
        simpleBlock(PulpedBlocks.CHESTNUT_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/chestnut")));
        simpleBlock(PulpedBlocks.DOUGLAS_FIR_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/douglas_fir")));
        simpleBlock(PulpedBlocks.HICKORY_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/hickory")));
        simpleBlock(PulpedBlocks.KAPOK_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/kapok")));
        simpleBlock(PulpedBlocks.MANGROVE_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/mangrove")));
        simpleBlock(PulpedBlocks.MAPLE_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/maple")));
        simpleBlock(PulpedBlocks.OAK_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/oak")));
        simpleBlock(PulpedBlocks.PALM_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/palm")));
        simpleBlock(PulpedBlocks.PINE_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/pine")));
        simpleBlock(PulpedBlocks.ROSEWOOD_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/rosewood")));
        simpleBlock(PulpedBlocks.SEQUOIA_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/sequoia")));
        simpleBlock(PulpedBlocks.SPRUCE_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/spruce")));
        simpleBlock(PulpedBlocks.SYCAMORE_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/sycamore")));
        simpleBlock(PulpedBlocks.WHITE_CEDAR_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/white_cedar")));
        simpleBlock(PulpedBlocks.WILLOW_DECKLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/deckle/willow")));
    }

    private void simpleBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
