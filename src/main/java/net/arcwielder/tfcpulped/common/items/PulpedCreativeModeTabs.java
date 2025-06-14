package net.arcwielder.tfcpulped.common.items;

import net.arcwielder.tfcpulped.TFCPulped;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class PulpedCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TFCPulped.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TFC_PULPED = CREATIVE_MODE_TABS.register("tfc_pulped",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PulpedItems.ROSEWOOD_CHIPS.get()))
                    .title(Component.translatable("creativetab.tfc_pulped"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(PulpedItems.ACACIA_BARK.get());
                        output.accept(PulpedItems.ASH_BARK.get());
                        output.accept(PulpedItems.ASPEN_BARK.get());
                        output.accept(PulpedItems.BIRCH_BARK.get());
                        output.accept(PulpedItems.BLACKWOOD_BARK.get());
                        output.accept(PulpedItems.CHESTNUT_BARK.get());
                        output.accept(PulpedItems.DOUGLAS_FIR_BARK.get());
                        output.accept(PulpedItems.HICKORY_BARK.get());
                        output.accept(PulpedItems.KAPOK_BARK.get());
                        output.accept(PulpedItems.MANGROVE_BARK.get());
                        output.accept(PulpedItems.MAPLE_BARK.get());
                        output.accept(PulpedItems.OAK_BARK.get());
                        output.accept(PulpedItems.PALM_BARK.get());
                        output.accept(PulpedItems.PINE_BARK.get());
                        output.accept(PulpedItems.ROSEWOOD_BARK.get());
                        output.accept(PulpedItems.SEQUOIA_BARK.get());
                        output.accept(PulpedItems.SPRUCE_BARK.get());
                        output.accept(PulpedItems.SYCAMORE_BARK.get());
                        output.accept(PulpedItems.WHITE_CEDAR_BARK.get());
                        output.accept(PulpedItems.WILLOW_BARK.get());
                        output.accept(PulpedItems.ACACIA_CHIPS.get());
                        output.accept(PulpedItems.ASH_CHIPS.get());
                        output.accept(PulpedItems.ASPEN_CHIPS.get());
                        output.accept(PulpedItems.BIRCH_CHIPS.get());
                        output.accept(PulpedItems.BLACKWOOD_CHIPS.get());
                        output.accept(PulpedItems.CHESTNUT_CHIPS.get());
                        output.accept(PulpedItems.DOUGLAS_FIR_CHIPS.get());
                        output.accept(PulpedItems.HICKORY_CHIPS.get());
                        output.accept(PulpedItems.KAPOK_CHIPS.get());
                        output.accept(PulpedItems.MANGROVE_CHIPS.get());
                        output.accept(PulpedItems.MAPLE_CHIPS.get());
                        output.accept(PulpedItems.OAK_CHIPS.get());
                        output.accept(PulpedItems.PALM_CHIPS.get());
                        output.accept(PulpedItems.PINE_CHIPS.get());
                        output.accept(PulpedItems.ROSEWOOD_CHIPS.get());
                        output.accept(PulpedItems.SEQUOIA_CHIPS.get());
                        output.accept(PulpedItems.SPRUCE_CHIPS.get());
                        output.accept(PulpedItems.SYCAMORE_CHIPS.get());
                        output.accept(PulpedItems.WHITE_CEDAR_CHIPS.get());
                        output.accept(PulpedItems.WILLOW_CHIPS.get());
                        output.accept(PulpedItems.RAW_WOOD_PULP_BUCKET.get());
                        output.accept(PulpedItems.BLEACHED_WOOD_PULP_BUCKET.get());
                        output.accept(PulpedItems.MANGLED_PULP.get());
                        output.accept(PulpedItems.PULP_SHEET.get());
                        output.accept(PulpedItems.DRIED_PULP_SHEET.get());
                        output.accept(PulpedItems.LIMED_PULP_SHEET.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
