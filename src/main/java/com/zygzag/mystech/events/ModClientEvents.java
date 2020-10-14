package com.zygzag.mystech.events;

import com.zygzag.mystech.MysTech;
import com.zygzag.mystech.util.BlockRegistryHandler;
import com.zygzag.mystech.util.ItemRegistryHandler;
import com.zygzag.mystech.util.ToolRegistryHandler;
import net.minecraft.advancements.criterion.RightClickBlockWithItemTrigger;
import net.minecraft.block.Block;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MysTech.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    /*@SubscribeEvent // remap function
    public static void onJumpWithStick(LivingEvent.LivingJumpEvent event) {
        LivingEntity player = event.getEntityLiving();
        if (player.getHeldItemMainhand().getItem() == Items.STICK) {
            MysTech.LOGGER.info("Player jumped w/ a stick");
            World world = player.getEntityWorld();
            world.setBlockState(player.func_233580_cy_().add(0, -1, 0), BlockRegistryHandler.T1_INFUSION_PILLAR.get().getDefaultState());
        }
    }

    @SubscribeEvent
    public static void onDamageSheep(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == ToolRegistryHandler.ENDER_SWORD.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
                target.set
            }
        }
    } */

    @SubscribeEvent
    public static void onRClickDisplayWithSword(PlayerInteractEvent.RightClickBlock event) {
        ItemStack item = event.getItemStack();
        BlockPos blockpos = event.getPos();
        World world = event.getWorld();
        world.getBlockState(blockpos);
    }
}
