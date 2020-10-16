package com.zygzag.mystech.events;

import com.zygzag.mystech.MysTech;
import com.zygzag.mystech.util.BlockRegistryHandler;
import com.zygzag.mystech.util.ItemRegistryHandler;
import net.minecraft.advancements.criterion.PlayerHurtEntityTrigger;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
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
        if (event.getWorld().getBlockState(event.getPos()) == BlockRegistryHandler.T1_INFUSION_STONE.get().getDefaultState()) {
            ItemStack item = event.getItemStack();
            event.getPlayer().getHeldItemMainhand().setCount(item.getCount() - 1);
            item.getItem();
        }
    }

    public static void onAttack(LivingAttackEvent event) {


        /*
        if the entity who attacked was a player and was holding a t3 core then it is set to t4
         */
        Entity entity = event.getEntityLiving();
            Entity source = event.getSource().getImmediateSource();
        if (source.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) entity;
            Item main = player.getHeldItemMainhand().getItem();
            Item offhand = player.getHeldItemOffhand().getItem();
            int count = player.getHeldItemMainhand().getCount();
            if (event.getAmount() >= 15) {
                if (main == ItemRegistryHandler.T3_CORE.get()) {
                    ItemStack stack = ItemRegistryHandler.T4_CORE.get().getDefaultInstance();
                    stack.setCount(count);
                    player.setItemStackToSlot(EquipmentSlotType.MAINHAND, stack);
                }
                if (offhand == ItemRegistryHandler.T3_CORE.get()) {
                    ItemStack stack = ItemRegistryHandler.T4_CORE.get().getDefaultInstance();
                    stack.setCount(count);
                    player.setItemStackToSlot(EquipmentSlotType.OFFHAND, stack);
                }
            }
        }
    }
}
