package net.arcwielder.tfcpulped.common.blockentities;

import net.arcwielder.tfcpulped.TFCPulped;
import net.arcwielder.tfcpulped.common.blocks.PulpedBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PulpedBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TFCPulped.MOD_ID);

    public static final RegistryObject<BlockEntityType<DeckleBlockEntity>> DECKLE_BE =
            BLOCK_ENTITIES.register("deckle_be", () ->
                    BlockEntityType.Builder.of(DeckleBlockEntity::new,
                            PulpedBlocks.ACACIA_DECKLE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
