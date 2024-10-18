package net.arcwielder.tfcpulped;

import com.mojang.logging.LogUtils;
import net.arcwielder.tfcpulped.block.PulpedBlocks;
import net.arcwielder.tfcpulped.fluid.PulpedFluidTypes;
import net.arcwielder.tfcpulped.fluid.PulpedFluids;
import net.arcwielder.tfcpulped.item.PulpedCreativeModeTabs;
import net.arcwielder.tfcpulped.item.PulpedItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
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
