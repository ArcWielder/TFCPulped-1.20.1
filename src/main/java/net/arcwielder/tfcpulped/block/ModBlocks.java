package net.arcwielder.tfcpulped.block;

import net.arcwielder.tfcpulped.TFCPulped;
import net.arcwielder.tfcpulped.fluid.ModFluids;
import net.arcwielder.tfcpulped.item.ModItems;
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

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TFCPulped.MOD_ID);

    public static final RegistryObject<LiquidBlock> RAW_WOOD_PULP_BLOCK = BLOCKS.register("raw_wood_pulp_block",
            () -> new LiquidBlock(ModFluids.SOURCE_RAW_WOOD_PULP, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<LiquidBlock> BLEACHED_WOOD_PULP_BLOCK = BLOCKS.register("bleached_wood_pulp_block",
            () -> new LiquidBlock(ModFluids.SOURCE_BLEACHED_WOOD_PULP, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<SlabBlock> FORMING_BASIN_ACACIA = registerBlock("forming_basin/acacia",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_ASH = registerBlock("forming_basin/ash",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_ASPEN = registerBlock("forming_basin/aspen",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_BIRCH = registerBlock("forming_basin/birch",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_BLACKWOOD = registerBlock("forming_basin/blackwood",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_CHESTNUT = registerBlock("forming_basin/chestnut",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_DOUGLAS_FIR = registerBlock("forming_basin/douglas_fir",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_HICKORY = registerBlock("forming_basin/hickory",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_KAPOK = registerBlock("forming_basin/kapok",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_MANGROVE = registerBlock("forming_basin/mangrove",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_MAPLE = registerBlock("forming_basin/maple",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_OAK = registerBlock("forming_basin/oak",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_PALM = registerBlock("forming_basin/palm",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_PINE = registerBlock("forming_basin/pine",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_ROSEWOOD = registerBlock("forming_basin/rosewood",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_SEQUOIA = registerBlock("forming_basin/sequoia",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_SPRUCE = registerBlock("forming_basin/spruce",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_SYCAMORE = registerBlock("forming_basin/sycamore",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_WHITE_CEDAR = registerBlock("forming_basin/white_cedar",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<SlabBlock> FORMING_BASIN_WILLOW = registerBlock("forming_basin/willow",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
