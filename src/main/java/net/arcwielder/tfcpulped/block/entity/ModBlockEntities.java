package net.arcwielder.tfcpulped.block.entity;

import net.arcwielder.tfcpulped.TFCPulped;
import net.arcwielder.tfcpulped.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TFCPulped.MOD_ID);

    public static final RegistryObject<BlockEntityType<DryingBasinBlockEntity>> DRYING_BASIN_BE =
            BLOCK_ENTITIES.register("drying_basin_be", () ->
                    BlockEntityType.Builder.of(DryingBasinBlockEntity::new,
                            ModBlocks.DRYING_BASIN.get()).build(null));



    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
