package net.arcwielder.tfcpulped.fluid;

import net.arcwielder.tfcpulped.TFCPulped;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {
    public static final ResourceLocation LAVA_STILL_RL = new ResourceLocation("block/lava_still");
    public static final ResourceLocation LAVA_FLOWING_RL = new ResourceLocation("block/lava_flow");
    public static final ResourceLocation RAW_WOOD_PULP_STILL_RL = new ResourceLocation("tfcpulped:block/raw_wood_pulp_still");
    public static final ResourceLocation RAW_WOOD_PULP_FLOWING_RL = new ResourceLocation("tfcpulped:block/raw_wood_pulp_flowing");
    public static final ResourceLocation WOOD_PULP_OVERLAY_RL = new ResourceLocation(TFCPulped.MOD_ID, "misc/in_wood_pulp");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TFCPulped.MOD_ID);

    public static final RegistryObject<FluidType> WOOD_PULP_FLUID_TYPE = register("wood_pulp_fluid",
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(35).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));
    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(RAW_WOOD_PULP_STILL_RL, RAW_WOOD_PULP_FLOWING_RL, WOOD_PULP_OVERLAY_RL,
                0xFFCFB5C5, new Vector3f( 207f / 255f, 149f / 255f, 101f / 255f), properties));
    }
    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
