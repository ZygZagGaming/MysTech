package com.zygzag.mystech.util;

import com.zygzag.mystech.MysTech;
import com.zygzag.mystech.blocks.BlockItemBase;
import com.zygzag.mystech.blocks.T1Pillar;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MysTech.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MysTech.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Blocks
    public static final RegistryObject<Block> T1_INFUSION_PILLAR = BLOCKS.register("t1_pillar", T1Pillar::new);

    // Block Items
    public static final RegistryObject<Item> T1_INFUSION_PILLAR_ITEM = ITEMS.register("t1_pillar", () -> new BlockItemBase(T1_INFUSION_PILLAR.get()));
}
