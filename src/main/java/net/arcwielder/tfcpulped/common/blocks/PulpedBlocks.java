package net.arcwielder.tfcpulped.common.blocks;

import net.arcwielder.tfcpulped.TFCPulped;
import net.arcwielder.tfcpulped.common.fluids.PulpedFluids;
import net.arcwielder.tfcpulped.common.items.PulpedItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
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

    public static final RegistryObject<DeckleBlock> ACACIA_DECKLE = registerBlock("deckle/acacia",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ASH_DECKLE = registerBlock("deckle/ash",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ASPEN_DECKLE = registerBlock("deckle/aspen",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> BIRCH_DECKLE = registerBlock("deckle/birch",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> BLACKWOOD_DECKLE = registerBlock("deckle/blackwood",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> CHESTNUT_DECKLE = registerBlock("deckle/chestnut",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> DOUGLAS_FIR_DECKLE = registerBlock("deckle/douglas_fir",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> HICKORY_DECKLE = registerBlock("deckle/hickory",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> KAPOK_DECKLE = registerBlock("deckle/kapok",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> MANGROVE_DECKLE = registerBlock("deckle/mangrove",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> MAPLE_DECKLE = registerBlock("deckle/maple",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> OAK_DECKLE = registerBlock("deckle/oak",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> PALM_DECKLE = registerBlock("deckle/palm",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> PINE_DECKLE = registerBlock("deckle/pine",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ROSEWOOD_DECKLE = registerBlock("deckle/rosewood",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> SEQUOIA_DECKLE = registerBlock("deckle/sequoia",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> SPRUCE_DECKLE = registerBlock("deckle/spruce",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> SYCAMORE_DECKLE = registerBlock("deckle/sycamore",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> WHITE_CEDAR_DECKLE = registerBlock("deckle/white_cedar",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> WILLOW_DECKLE = registerBlock("deckle/willow",
            () -> new DeckleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));



//    public static final Id<Block>
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
