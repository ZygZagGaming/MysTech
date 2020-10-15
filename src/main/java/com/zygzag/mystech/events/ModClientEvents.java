package com.zygzag.mystech.events;

import com.zygzag.mystech.MysTech;
import com.zygzag.mystech.util.ItemRegistryHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.lang.reflect.Field;

@Mod.EventBusSubscriber(modid = MysTech.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onItemDropped(ItemTossEvent event) {

        ItemEntity itemEntity = event.getEntityItem();
        ItemStack item = event.getEntityItem().getItem();
        LivingEntity player = event.getPlayer();
        ServerWorld world = (ServerWorld) player.getEntityWorld();
        LightningBoltEntity bolt = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, world);
        bolt.forceSetPosition(itemEntity.getPosX(), itemEntity.getPosY(), itemEntity.getPosZ());
        if (item.getItem() == ItemRegistryHandler.LIGHTNING_BOLT.get() && item.getCount() == 1) {
            world.summonEntity(bolt);
        }

    }

    @SubscribeEvent
    public static void onRightClickInfusionStoneWithItem(PlayerInteractEvent.RightClickBlock event) {

    }
}
