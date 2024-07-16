package net.arcwielder.tfcpulped.recipe;

import net.arcwielder.tfcpulped.TFCPulped;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, TFCPulped.MOD_ID);

    public static final RegistryObject<RecipeSerializer<DryingBasinFluidContainerEmptyingRecipe>> DRYING_BASIN_FLUID_CONTAINER_EMPTYING_SERIALIZER =
    SERIALIZERS.register("drying_basin_fluid_container_emptying", () -> DryingBasinFluidContainerEmptyingRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
