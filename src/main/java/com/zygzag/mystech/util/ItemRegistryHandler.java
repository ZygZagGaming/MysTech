package com.zygzag.mystech.util;

import com.zygzag.mystech.MysTech;
import com.zygzag.mystech.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MysTech.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MysTech.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> T1_CORE = ITEMS.register("t1_core", ItemBase::new);
    public static final RegistryObject<Item> T2_CORE = ITEMS.register("t2_core", ItemBase::new);
    public static final RegistryObject<Item> T3_CORE = ITEMS.register("t3_core", ItemBase::new);
    public static final RegistryObject<Item> T4_CORE = ITEMS.register("t4_core", ItemBase::new);
    public static final RegistryObject<Item> T5_CORE = ITEMS.register("t5_core", ItemBase::new);
    public static final RegistryObject<Item> T6_CORE = ITEMS.register("t6_core", ItemBase::new);
    public static final RegistryObject<Item> CORE_FRAME = ITEMS.register("core_frame", ItemBase::new);
    public static final RegistryObject<Item> IRON_ROD = ITEMS.register("iron_rod", ItemBase::new);
    public static final RegistryObject<Item> LIGHTNING_BOLT = ITEMS.register("lightning_bolt", ItemBase::new);

}
