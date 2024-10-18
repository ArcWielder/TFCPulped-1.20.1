package net.arcwielder.tfcpulped;

import com.mojang.logging.LogUtils;
import net.arcwielder.tfcpulped.block.PulpedBlocks;
import net.arcwielder.tfcpulped.fluid.PulpedFluids;
import net.arcwielder.tfcpulped.util.Helpers;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static java.sql.DriverManager.println;


public class ForgeEventHandler {

    public static void init() {
        final IEventBus bus = MinecraftForge.EVENT_BUS;

        bus.addListener(ForgeEventHandler::onBlockPlace);
    }

    public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
        System.out.println("BLOCK PALCED");
    }
}
