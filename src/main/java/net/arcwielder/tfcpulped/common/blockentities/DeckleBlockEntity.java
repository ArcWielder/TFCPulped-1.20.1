package net.arcwielder.tfcpulped.common.blockentities;

import com.mojang.serialization.Decoder;
import net.arcwielder.tfcpulped.common.blocks.PulpedBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Containers;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;

public class DeckleBlockEntity extends BlockEntity {
    public DeckleBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(PulpedBlockEntity.DECKLE_BE.get(), pPos, pBlockState);
    }
}
