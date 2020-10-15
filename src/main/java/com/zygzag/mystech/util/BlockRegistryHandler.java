package com.zygzag.mystech.util;

import com.zygzag.mystech.MysTech;
import com.zygzag.mystech.blocks.*;
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
    public static final RegistryObject<Block> T1_INFUSION_STONE = BLOCKS.register("t1_stone", T1Stone::new);
    public static final RegistryObject<Block> T2_INFUSION_PILLAR = BLOCKS.register("t2_pillar", T2Pillar::new);
    public static final RegistryObject<Block> T2_INFUSION_STONE = BLOCKS.register("t2_stone", T2Stone::new);
    public static final RegistryObject<Block> T3_INFUSION_PILLAR = BLOCKS.register("t3_pillar", T3Pillar::new);
    public static final RegistryObject<Block> T3_INFUSION_STONE = BLOCKS.register("t3_stone", T3Stone::new);
    public static final RegistryObject<Block> T4_INFUSION_PILLAR = BLOCKS.register("t4_pillar", T4Pillar::new);
    public static final RegistryObject<Block> T4_INFUSION_STONE = BLOCKS.register("t4_stone", T4Stone::new);
    public static final RegistryObject<Block> T5_INFUSION_PILLAR = BLOCKS.register("t5_pillar", T5Pillar::new);
    public static final RegistryObject<Block> T5_INFUSION_STONE = BLOCKS.register("t5_stone", T5Stone::new);
    public static final RegistryObject<Block> T6_INFUSION_PILLAR = BLOCKS.register("t6_pillar", T6Pillar::new);
    public static final RegistryObject<Block> T6_INFUSION_STONE = BLOCKS.register("t6_stone", T6Stone::new);

    // Block Items
    public static final RegistryObject<Item> T1_INFUSION_PILLAR_ITEM = ITEMS.register("t1_pillar", () -> new BlockItemBase(T1_INFUSION_PILLAR.get()));
    public static final RegistryObject<Item> T1_INFUSION_STONE_ITEM = ITEMS.register("t1_stone", () -> new BlockItemBase(T1_INFUSION_STONE.get()));
    public static final RegistryObject<Item> T2_INFUSION_PILLAR_ITEM = ITEMS.register("t2_pillar", () -> new BlockItemBase(T2_INFUSION_PILLAR.get()));
    public static final RegistryObject<Item> T2_INFUSION_STONE_ITEM = ITEMS.register("t2_stone", () -> new BlockItemBase(T2_INFUSION_STONE.get()));
    public static final RegistryObject<Item> T3_INFUSION_PILLAR_ITEM = ITEMS.register("t3_pillar", () -> new BlockItemBase(T3_INFUSION_PILLAR.get()));
    public static final RegistryObject<Item> T3_INFUSION_STONE_ITEM = ITEMS.register("t3_stone", () -> new BlockItemBase(T3_INFUSION_STONE.get()));
    public static final RegistryObject<Item> T4_INFUSION_PILLAR_ITEM = ITEMS.register("t4_pillar", () -> new BlockItemBase(T4_INFUSION_PILLAR.get()));
    public static final RegistryObject<Item> T4_INFUSION_STONE_ITEM = ITEMS.register("t4_stone", () -> new BlockItemBase(T4_INFUSION_STONE.get()));
    public static final RegistryObject<Item> T5_INFUSION_PILLAR_ITEM = ITEMS.register("t5_pillar", () -> new BlockItemBase(T5_INFUSION_PILLAR.get()));
    public static final RegistryObject<Item> T5_INFUSION_STONE_ITEM = ITEMS.register("t5_stone", () -> new BlockItemBase(T5_INFUSION_STONE.get()));
    public static final RegistryObject<Item> T6_INFUSION_PILLAR_ITEM = ITEMS.register("t6_pillar", () -> new BlockItemBase(T6_INFUSION_PILLAR.get()));
    public static final RegistryObject<Item> T6_INFUSION_STONE_ITEM = ITEMS.register("t6_stone", () -> new BlockItemBase(T6_INFUSION_STONE.get()));

}
