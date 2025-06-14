package net.arcwielder.tfcpulped.common.fluids;

import net.arcwielder.tfcpulped.TFCPulped;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class PulpedFluidTypes {
    public static final ResourceLocation RAW_WOOD_PULP_STILL_RL = new ResourceLocation("tfcpulped:block/raw_wood_pulp_still");
    public static final ResourceLocation RAW_WOOD_PULP_FLOWING_RL = new ResourceLocation("tfcpulped:block/raw_wood_pulp_flowing");
    public static final ResourceLocation BLEACHED_WOOD_PULP_STILL_RL = new ResourceLocation("tfcpulped:block/bleached_wood_pulp_still");
    public static final ResourceLocation BLEACHED_WOOD_PULP_FLOWING_RL = new ResourceLocation("tfcpulped:block/bleached_wood_pulp_flowing");
    public static final ResourceLocation WOOD_PULP_OVERLAY_RL = new ResourceLocation(TFCPulped.MOD_ID, "misc/in_wood_pulp");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TFCPulped.MOD_ID);

    public static final RegistryObject<FluidType> RAW_WOOD_PULP_FLUID_TYPE = register("raw_wood_pulp_fluid",
            FluidType.Properties.create()
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)
                    .lightLevel(0)
                    .density(3000)
                    .viscosity(6000)
                    .canSwim(false)
                    .canHydrate(false)
                    .canPushEntity(false)
                    .supportsBoating(false)
                    .canConvertToSource(false)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK),
            RAW_WOOD_PULP_STILL_RL, RAW_WOOD_PULP_FLOWING_RL, WOOD_PULP_OVERLAY_RL);
    public static final RegistryObject<FluidType> BLEACHED_WOOD_PULP_FLUID_TYPE = register("bleached_wood_pulp_fluid",
            FluidType.Properties.create()
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)
                    .lightLevel(0)
                    .density(3000)
                    .viscosity(6000)
                    .canSwim(false)
                    .canHydrate(false)
                    .canPushEntity(false)
                    .supportsBoating(false)
                    .canConvertToSource(false)
                    .sound(SoundAction.get("drink"), SoundEvents.HONEY_DRINK),
            BLEACHED_WOOD_PULP_STILL_RL, BLEACHED_WOOD_PULP_FLOWING_RL, WOOD_PULP_OVERLAY_RL);

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties, ResourceLocation still, ResourceLocation flowing, ResourceLocation overlay) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(still, flowing, overlay,
                0xFFCFB5C5, new Vector3f(207f / 255f, 149f / 255f, 101f / 255f), properties));
    }


    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
