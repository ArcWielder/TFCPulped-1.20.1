package net.arcwielder.tfcpulped.block;

import net.arcwielder.tfcpulped.TFCPulped;
import net.arcwielder.tfcpulped.fluid.PulpedFluids;
import net.arcwielder.tfcpulped.item.PulpedItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class PulpedBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TFCPulped.MOD_ID);

    public static final RegistryObject<LiquidBlock> RAW_WOOD_PULP_BLOCK = BLOCKS.register("raw_wood_pulp_block",
            () -> new LiquidBlock(PulpedFluids.SOURCE_RAW_WOOD_PULP, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> BLEACHED_WOOD_PULP_BLOCK = BLOCKS.register("bleached_wood_pulp_block",
            () -> new LiquidBlock(PulpedFluids.SOURCE_BLEACHED_WOOD_PULP, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<SlabBlock> DRIED_PULP_SLAB = BLOCKS.register("dried_pulp_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return PulpedItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
