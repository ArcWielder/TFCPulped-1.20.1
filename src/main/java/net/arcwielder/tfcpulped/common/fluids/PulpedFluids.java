package net.arcwielder.tfcpulped.common.fluids;

import net.arcwielder.tfcpulped.TFCPulped;
import net.arcwielder.tfcpulped.common.blocks.PulpedBlocks;
import net.arcwielder.tfcpulped.common.items.PulpedItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PulpedFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, TFCPulped.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_RAW_WOOD_PULP = FLUIDS.register("raw_wood_pulp",
            () -> new ForgeFlowingFluid.Source(PulpedFluids.RAW_WOOD_PULP_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_RAW_WOOD_PULP = FLUIDS.register("flowing_raw_wood_pulp",
            () -> new ForgeFlowingFluid.Flowing(PulpedFluids.RAW_WOOD_PULP_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SOURCE_BLEACHED_WOOD_PULP = FLUIDS.register("bleached_wood_pulp",
            () -> new ForgeFlowingFluid.Source(PulpedFluids.BLEACHED_WOOD_PULP_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_BLEACHED_WOOD_PULP = FLUIDS.register("flowing_bleached_wood_pulp",
            () -> new ForgeFlowingFluid.Flowing(PulpedFluids.BLEACHED_WOOD_PULP_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties RAW_WOOD_PULP_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PulpedFluidTypes.RAW_WOOD_PULP_FLUID_TYPE, SOURCE_RAW_WOOD_PULP, FLOWING_RAW_WOOD_PULP)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(4)
            .block(PulpedBlocks.RAW_WOOD_PULP_BLOCK)
            .bucket(PulpedItems.RAW_WOOD_PULP_BUCKET);
    public static final ForgeFlowingFluid.Properties BLEACHED_WOOD_PULP_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            PulpedFluidTypes.BLEACHED_WOOD_PULP_FLUID_TYPE, SOURCE_BLEACHED_WOOD_PULP, FLOWING_BLEACHED_WOOD_PULP)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(4)
            .block(PulpedBlocks.BLEACHED_WOOD_PULP_BLOCK)
            .bucket(PulpedItems.BLEACHED_WOOD_PULP_BUCKET);



    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
