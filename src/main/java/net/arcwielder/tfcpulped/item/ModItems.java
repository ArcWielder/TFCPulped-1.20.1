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

    public static final RegistryObject<Item> ACACIA_SAWDUST = ITEMS.register("acacia_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASH_SAWDUST = ITEMS.register("ash_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_SAWDUST = ITEMS.register("aspen_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SAWDUST = ITEMS.register("birch_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_SAWDUST= ITEMS.register("blackwood_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_SAWDUST = ITEMS.register("chestnut_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_SAWDUST = ITEMS.register("douglas_fir_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_SAWDUST = ITEMS.register("hickory_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_SAWDUST = ITEMS.register("kapok_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_SAWDUST = ITEMS.register("mangrove_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_SAWDUST = ITEMS.register("maple_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OAK_SAWDUST = ITEMS.register("oak_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALM_SAWDUST = ITEMS.register("palm_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINE_SAWDUST = ITEMS.register("pine_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_SAWDUST = ITEMS.register("rosewood_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_SAWDUST = ITEMS.register("sequoia_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_SAWDUST = ITEMS.register("spruce_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_SAWDUST = ITEMS.register("sycamore_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_SAWDUST = ITEMS.register("white_cedar_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_SAWDUST = ITEMS.register("willow_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRIED_PULP_SHEET = ITEMS.register("dried_pulp_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PAPYRUS = ITEMS.register("papyrus",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
