package net.arcwielder.tfcpulped.fluid;

import net.arcwielder.tfcpulped.TFCPulped;
import net.arcwielder.tfcpulped.block.custom.ModBlocks;
import net.arcwielder.tfcpulped.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.concurrent.Flow;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, TFCPulped.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_RAW_WOOD_PULP = FLUIDS.register("wood_pulp_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.WOOD_PULP_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_RAW_WOOD_PULP = FLUIDS.register("flowing_wood_pulp",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.WOOD_PULP_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties WOOD_PULP_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.WOOD_PULP_FLUID_TYPE, SOURCE_RAW_WOOD_PULP, FLOWING_RAW_WOOD_PULP)
            .slopeFindDistance(2).levelDecreasePerBlock(4).block(ModBlocks.WOOD_PULP_BLOCK).bucket(ModItems.RAW_WOOD_PULP_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
