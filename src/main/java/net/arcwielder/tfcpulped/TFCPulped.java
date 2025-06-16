package net.arcwielder.tfcpulped;

import com.mojang.logging.LogUtils;
import net.arcwielder.tfcpulped.common.blockentities.PulpedBlockEntity;
import net.arcwielder.tfcpulped.common.blocks.PulpedBlocks;
import net.arcwielder.tfcpulped.common.fluids.PulpedFluidTypes;
import net.arcwielder.tfcpulped.common.fluids.PulpedFluids;
import net.arcwielder.tfcpulped.common.items.PulpedCreativeModeTabs;
import net.arcwielder.tfcpulped.common.items.PulpedItems;
import net.arcwielder.tfcpulped.util.loot.PulpedLootModifiers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TFCPulped.MOD_ID)
public class TFCPulped {
    public static final String MOD_ID = "tfcpulped";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TFCPulped() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        PulpedCreativeModeTabs.register(modEventBus);

        PulpedItems.register(modEventBus);
        PulpedBlocks.register(modEventBus);

        PulpedBlockEntity.register(modEventBus);

        PulpedLootModifiers.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

        PulpedFluids.register(modEventBus);
        PulpedFluidTypes.register(modEventBus);

        ForgeEventHandler.init();
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
