package net.arcwielder.tfcpulped;

import net.arcwielder.tfcpulped.common.items.PulpedItems;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.IEventBus;


public class ForgeEventHandler {

    public static void init() {
        final IEventBus bus = MinecraftForge.EVENT_BUS;

        bus.addListener(ForgeEventHandler::onFluidPlace);
    }

    public static void onFluidPlace(PlayerInteractEvent.RightClickBlock event) {
        ItemStack handItem = event.getItemStack();

        if (handItem.is(PulpedItems.BLEACHED_WOOD_PULP_BUCKET.get())) {
            System.out.println("RAH");
        }

    System.out.println(handItem);
    }

}
