package net.arcwielder.tfcpulped.item;

import net.arcwielder.tfcpulped.TFCPulped;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TFCPulped.MOD_ID);

    public static final RegistryObject<Item> ACACIA_BARK = ITEMS.register("acacia_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASH_BARK = ITEMS.register("ash_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_BARK = ITEMS.register("aspen_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_BARK = ITEMS.register("birch_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_BARK= ITEMS.register("blackwood_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_BARK = ITEMS.register("chestnut_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_BARK = ITEMS.register("douglas_fir_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_BARK = ITEMS.register("hickory_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_BARK = ITEMS.register("kapok_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BARK = ITEMS.register("mangrove_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_BARK = ITEMS.register("maple_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OAK_BARK = ITEMS.register("oak_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALM_BARK = ITEMS.register("palm_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINE_BARK = ITEMS.register("pine_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_BARK = ITEMS.register("rosewood_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_BARK = ITEMS.register("sequoia_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BARK = ITEMS.register("spruce_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_BARK = ITEMS.register("sycamore_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_BARK = ITEMS.register("white_cedar_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_BARK = ITEMS.register("willow_bark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRIED_PULP_SHEET = ITEMS.register("dried_pulp_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PAPYRUS = ITEMS.register("papyrus",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
