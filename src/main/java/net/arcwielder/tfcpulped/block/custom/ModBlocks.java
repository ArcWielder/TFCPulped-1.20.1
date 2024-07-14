package net.arcwielder.tfcpulped.block.custom;

import net.arcwielder.tfcpulped.TFCPulped;
import net.arcwielder.tfcpulped.fluid.ModFluids;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TFCPulped.MOD_ID);

    public static final RegistryObject<LiquidBlock> RAW_WOOD_PULP_BLOCK = BLOCKS.register("raw_wood_pulp_block",
            () -> new LiquidBlock(ModFluids.SOURCE_RAW_WOOD_PULP, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> BLEACHED_WOOD_PULP_BLOCK = BLOCKS.register("bleached_wood_pulp_block",
            () -> new LiquidBlock(ModFluids.SOURCE_BLEACHED_WOOD_PULP, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static void register(IEventBus eventBus) { BLOCKS.register(eventBus); }
}
