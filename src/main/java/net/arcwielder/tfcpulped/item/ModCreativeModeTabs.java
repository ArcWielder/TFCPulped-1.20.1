package net.arcwielder.tfcpulped.item;

import net.arcwielder.tfcpulped.TFCPulped;
import net.arcwielder.tfcpulped.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TFCPulped.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TFC_PULPED = CREATIVE_MODE_TABS.register("tfc_pulped",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ROSEWOOD_CHIPS.get()))
                    .title(Component.translatable("creativetab.tfc_pulped"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ACACIA_BARK.get());
                        output.accept(ModItems.ASH_BARK.get());
                        output.accept(ModItems.ASPEN_BARK.get());
                        output.accept(ModItems.BIRCH_BARK.get());
                        output.accept(ModItems.BLACKWOOD_BARK.get());
                        output.accept(ModItems.CHESTNUT_BARK.get());
                        output.accept(ModItems.DOUGLAS_FIR_BARK.get());
                        output.accept(ModItems.HICKORY_BARK.get());
                        output.accept(ModItems.KAPOK_BARK.get());
                        output.accept(ModItems.MANGROVE_BARK.get());
                        output.accept(ModItems.MAPLE_BARK.get());
                        output.accept(ModItems.OAK_BARK.get());
                        output.accept(ModItems.PALM_BARK.get());
                        output.accept(ModItems.PINE_BARK.get());
                        output.accept(ModItems.ROSEWOOD_BARK.get());
                        output.accept(ModItems.SEQUOIA_BARK.get());
                        output.accept(ModItems.SPRUCE_BARK.get());
                        output.accept(ModItems.SYCAMORE_BARK.get());
                        output.accept(ModItems.WHITE_CEDAR_BARK.get());
                        output.accept(ModItems.WILLOW_BARK.get());
                        output.accept(ModItems.ACACIA_CHIPS.get());
                        output.accept(ModItems.ASH_CHIPS.get());
                        output.accept(ModItems.ASPEN_CHIPS.get());
                        output.accept(ModItems.BIRCH_CHIPS.get());
                        output.accept(ModItems.BLACKWOOD_CHIPS.get());
                        output.accept(ModItems.CHESTNUT_CHIPS.get());
                        output.accept(ModItems.DOUGLAS_FIR_CHIPS.get());
                        output.accept(ModItems.HICKORY_CHIPS.get());
                        output.accept(ModItems.KAPOK_CHIPS.get());
                        output.accept(ModItems.MANGROVE_CHIPS.get());
                        output.accept(ModItems.MAPLE_CHIPS.get());
                        output.accept(ModItems.OAK_CHIPS.get());
                        output.accept(ModItems.PALM_CHIPS.get());
                        output.accept(ModItems.PINE_CHIPS.get());
                        output.accept(ModItems.ROSEWOOD_CHIPS.get());
                        output.accept(ModItems.SEQUOIA_CHIPS.get());
                        output.accept(ModItems.SPRUCE_CHIPS.get());
                        output.accept(ModItems.SYCAMORE_CHIPS.get());
                        output.accept(ModItems.WHITE_CEDAR_CHIPS.get());
                        output.accept(ModItems.WILLOW_CHIPS.get());
                        output.accept(ModItems.RAW_WOOD_PULP_BUCKET.get());
                        output.accept(ModItems.BLEACHED_WOOD_PULP_BUCKET.get());
                        output.accept(ModBlocks.FORMING_BASIN_ACACIA.get());
                        output.accept(ModBlocks.FORMING_BASIN_ASH.get());
                        output.accept(ModBlocks.FORMING_BASIN_ASPEN.get());
                        output.accept(ModBlocks.FORMING_BASIN_BIRCH.get());
                        output.accept(ModBlocks.FORMING_BASIN_BLACKWOOD.get());
                        output.accept(ModBlocks.FORMING_BASIN_CHESTNUT.get());
                        output.accept(ModBlocks.FORMING_BASIN_DOUGLAS_FIR.get());
                        output.accept(ModBlocks.FORMING_BASIN_HICKORY.get());
                        output.accept(ModBlocks.FORMING_BASIN_KAPOK.get());
                        output.accept(ModBlocks.FORMING_BASIN_MANGROVE.get());
                        output.accept(ModBlocks.FORMING_BASIN_MAPLE.get());
                        output.accept(ModBlocks.FORMING_BASIN_OAK.get());
                        output.accept(ModBlocks.FORMING_BASIN_PALM.get());
                        output.accept(ModBlocks.FORMING_BASIN_PINE.get());
                        output.accept(ModBlocks.FORMING_BASIN_ROSEWOOD.get());
                        output.accept(ModBlocks.FORMING_BASIN_SEQUOIA.get());
                        output.accept(ModBlocks.FORMING_BASIN_SPRUCE.get());
                        output.accept(ModBlocks.FORMING_BASIN_SYCAMORE.get());
                        output.accept(ModBlocks.FORMING_BASIN_WHITE_CEDAR.get());
                        output.accept(ModBlocks.FORMING_BASIN_WILLOW.get());
                        output.accept(ModItems.DRIED_PULP_SHEET.get());
                        output.accept(ModItems.LIMED_PULP_SHEET.get());
                        output.accept(ModItems.REFINED_PULP_SHEET.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
