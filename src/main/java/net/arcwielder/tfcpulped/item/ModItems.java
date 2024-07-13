package net.arcwielder.tfcpulped.item;

import net.arcwielder.tfcpulped.TFCPulped;
import net.arcwielder.tfcpulped.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TFCPulped.MOD_ID);

    public static final RegistryObject<Item> ACACIA_BARK = ITEMS.register("bark/acacia",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASH_BARK = ITEMS.register("bark/ash",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_BARK = ITEMS.register("bark/aspen",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_BARK = ITEMS.register("bark/birch",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_BARK= ITEMS.register("bark/blackwood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_BARK = ITEMS.register("bark/chestnut",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_BARK = ITEMS.register("bark/douglas_fir",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_BARK = ITEMS.register("bark/hickory",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_BARK = ITEMS.register("bark/kapok",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BARK = ITEMS.register("bark/mangrove",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_BARK = ITEMS.register("bark/maple",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OAK_BARK = ITEMS.register("bark/oak",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALM_BARK = ITEMS.register("bark/palm",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINE_BARK = ITEMS.register("bark/pine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_BARK = ITEMS.register("bark/rosewood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_BARK = ITEMS.register("bark/sequoia",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BARK = ITEMS.register("bark/spruce",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_BARK = ITEMS.register("bark/sycamore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_BARK = ITEMS.register("bark/white_cedar",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_BARK = ITEMS.register("bark/willow",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ACACIA_CHIPS = ITEMS.register("wood_chips/acacia",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASH_CHIPS = ITEMS.register("wood_chips/ash",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_CHIPS = ITEMS.register("wood_chips/aspen",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_CHIPS = ITEMS.register("wood_chips/birch",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_CHIPS= ITEMS.register("wood_chips/blackwood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_CHIPS = ITEMS.register("wood_chips/chestnut",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_CHIPS = ITEMS.register("wood_chips/douglas_fir",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_CHIPS = ITEMS.register("wood_chips/hickory",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_CHIPS = ITEMS.register("wood_chips/kapok",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHIPS = ITEMS.register("wood_chips/mangrove",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_CHIPS = ITEMS.register("wood_chips/maple",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OAK_CHIPS = ITEMS.register("wood_chips/oak",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALM_CHIPS = ITEMS.register("wood_chips/palm",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINE_CHIPS = ITEMS.register("wood_chips/pine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_CHIPS = ITEMS.register("wood_chips/rosewood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_CHIPS = ITEMS.register("wood_chips/sequoia",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_CHIPS = ITEMS.register("wood_chips/spruce",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_CHIPS = ITEMS.register("wood_chips/sycamore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_CHIPS = ITEMS.register("wood_chips/white_cedar",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_CHIPS = ITEMS.register("wood_chips/willow",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_WOOD_PULP_BUCKET = ITEMS.register("raw_wood_pulp_bucket",
            () -> new BucketItem(ModFluids.SOURCE_RAW_WOOD_PULP,
                    new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
