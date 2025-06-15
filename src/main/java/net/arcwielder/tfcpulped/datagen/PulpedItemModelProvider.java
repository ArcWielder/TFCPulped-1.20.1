package net.arcwielder.tfcpulped.datagen;

import net.arcwielder.tfcpulped.TFCPulped;
import net.arcwielder.tfcpulped.common.items.PulpedItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class PulpedItemModelProvider extends ItemModelProvider {
    public PulpedItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TFCPulped.MOD_ID, existingFileHelper);
    }

    @Override
    protected  void registerModels() {
        simpleItem(PulpedItems.ACACIA_BARK);
        simpleItem(PulpedItems.ASH_BARK);
        simpleItem(PulpedItems.ASPEN_BARK);
        simpleItem(PulpedItems.BIRCH_BARK);
        simpleItem(PulpedItems.BLACKWOOD_BARK);
        simpleItem(PulpedItems.CHESTNUT_BARK);
        simpleItem(PulpedItems.DOUGLAS_FIR_BARK);
        simpleItem(PulpedItems.HICKORY_BARK);
        simpleItem(PulpedItems.KAPOK_BARK);
        simpleItem(PulpedItems.MANGROVE_BARK);
        simpleItem(PulpedItems.MAPLE_BARK);
        simpleItem(PulpedItems.OAK_BARK);
        simpleItem(PulpedItems.PALM_BARK);
        simpleItem(PulpedItems.PINE_BARK);
        simpleItem(PulpedItems.ROSEWOOD_BARK);
        simpleItem(PulpedItems.SEQUOIA_BARK);
        simpleItem(PulpedItems.SPRUCE_BARK);
        simpleItem(PulpedItems.SYCAMORE_BARK);
        simpleItem(PulpedItems.WHITE_CEDAR_BARK);
        simpleItem(PulpedItems.WILLOW_BARK);

        simpleItem(PulpedItems.ACACIA_CHIPS);
        simpleItem(PulpedItems.ASH_CHIPS);
        simpleItem(PulpedItems.ASPEN_CHIPS);
        simpleItem(PulpedItems.BIRCH_CHIPS);
        simpleItem(PulpedItems.BLACKWOOD_CHIPS);
        simpleItem(PulpedItems.CHESTNUT_CHIPS);
        simpleItem(PulpedItems.DOUGLAS_FIR_CHIPS);
        simpleItem(PulpedItems.HICKORY_CHIPS);
        simpleItem(PulpedItems.KAPOK_CHIPS);
        simpleItem(PulpedItems.MANGROVE_CHIPS);
        simpleItem(PulpedItems.MAPLE_CHIPS);
        simpleItem(PulpedItems.OAK_CHIPS);
        simpleItem(PulpedItems.PALM_CHIPS);
        simpleItem(PulpedItems.PINE_CHIPS);
        simpleItem(PulpedItems.ROSEWOOD_CHIPS);
        simpleItem(PulpedItems.SEQUOIA_CHIPS);
        simpleItem(PulpedItems.SPRUCE_CHIPS);
        simpleItem(PulpedItems.SYCAMORE_CHIPS);
        simpleItem(PulpedItems.WHITE_CEDAR_CHIPS);
        simpleItem(PulpedItems.WILLOW_CHIPS);

        simpleItem(PulpedItems.MANGLED_PULP);
        simpleItem(PulpedItems.PULP_SHEET);
        simpleItem(PulpedItems.LIMED_PULP_SHEET);
        simpleItem(PulpedItems.DRIED_PULP_SHEET);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TFCPulped.MOD_ID, "item/" + item.getId().getPath()));
    }
}
