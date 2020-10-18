package com.zygzag.mystech.events;

import com.zygzag.mystech.MysTech;
import com.zygzag.mystech.util.BlockRegistryHandler;
import com.zygzag.mystech.util.ItemRegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.audio.SoundEngine;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.audio.SoundList;
import net.minecraft.client.audio.SoundSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.system.CallbackI;

import java.util.List;

@Mod.EventBusSubscriber(modid = MysTech.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onItemDropped(ItemTossEvent event) {
    }

    @SubscribeEvent
    public static void onFirePlaced(PlayerInteractEvent.RightClickBlock event) {
        if (event.getItemStack().getItem() == Items.FLINT_AND_STEEL || event.getItemStack().getItem() == Items.FIRE_CHARGE) {
            World world = event.getWorld();
            BlockPos pos = event.getPos();
            BlockState state = world.getBlockState(pos);
            if (state == Blocks.NETHERRACK.getDefaultState()) {
                AxisAlignedBB bb = new AxisAlignedBB(pos.getX() + 1.5, pos.getY() + 1, pos.getZ() + 1.5, pos.getX() - 1.5, pos.getY() - 1, pos.getZ() - 1.5);
                List<ItemFrameEntity> list = world.getEntitiesWithinAABB(ItemFrameEntity.class, bb);
                int i = 0;
                ItemFrameEntity[] l = new ItemFrameEntity[4];
                if (list.size() >= 4) {
                    l[0] = list.get(0);
                    l[1] = list.get(1);
                    l[2] = list.get(2);
                    l[3] = list.get(3);
                    if (!(world.isRemote())) {
                        ServerWorld sWorld = (ServerWorld) world;
                        sWorld.removeEntity(l[0]);
                        sWorld.removeEntity(l[1]);
                        sWorld.removeEntity(l[2]);
                        sWorld.removeEntity(l[3]);
                        sWorld.removeBlock(pos.add(0, 0, 0), false);
                        LightningBoltEntity bolt = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, sWorld);
                        bolt.setPosition(pos.getX(), pos.getY(), pos.getZ());
                        sWorld.summonEntity(bolt);
                    }
                }
            }
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

    @SubscribeEvent
    public static void onLivingAttack(LivingAttackEvent event) {
        if(!(event.getEntityLiving().getEntityWorld().isRemote())) {
            if (event.getAmount() >= 15) {
                ServerWorld world = (ServerWorld) event.getEntity().getEntityWorld();
                if (event.getSource().getImmediateSource() != null) {
                    if (event.getSource().getImmediateSource().getType() == EntityType.PLAYER) {
                        PlayerEntity player = (PlayerEntity) event.getSource().getImmediateSource();
                        if (player.getHeldItemOffhand().getItem() == ItemRegistryHandler.T3_CORE.get() && player.getHeldItemOffhand().getCount() >= 4 && player.experienceLevel >= 10) {
                            if (player.getHeldItemOffhand().getCount() > 4) {
                                ItemEntity item = new ItemEntity(player.getEntityWorld(), player.getPosX(), player.getPosY(), player.getPosZ());
                                ItemStack itemStack = ItemRegistryHandler.T4_CORE.get().getDefaultInstance();
                                itemStack.setCount(1);
                                item.setItem(itemStack);
                                world.summonEntity(item);
                            }
                            ItemStack t3 = ItemRegistryHandler.T3_CORE.get().getDefaultInstance();
                            t3.setCount(player.getHeldItemOffhand().getCount() - 4);
                            player.setItemStackToSlot(EquipmentSlotType.OFFHAND, t3);
                            player.addExperienceLevel(-10);
                            world.playSound(null, player.getPosX(), player.getPosY(), player.getPosZ(), SoundEvents.AMBIENT_CAVE, SoundCategory.AMBIENT, 1, 1);
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onFireLit(BlockEvent.EntityPlaceEvent event) {
        /*
        if fire lit w/ other stuff, summon boss
         */
        BlockState block = event.getPlacedBlock();
        if (block == Blocks.FIRE.getDefaultState()) {
            
        }

    }
}
