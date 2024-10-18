package net.arcwielder.tfcpulped.util;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.registries.RegistryObject;

public class Helpers {
    public static boolean isFluid(FluidState fluid, Fluid other)
    {
        return fluid.is(other);
    }
}
