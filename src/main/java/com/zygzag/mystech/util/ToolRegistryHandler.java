package com.zygzag.mystech.util;

import com.zygzag.mystech.MysTech;
import com.zygzag.mystech.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ToolRegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MysTech.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MysTech.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Tools
    public static final RegistryObject<SwordItem> ENDER_SWORD = ITEMS.register("ender_sword", () -> new SwordItem(ModItemTier.ENDER, 4, -2.4F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<PickaxeItem> ENDER_PICKAXE = ITEMS.register("ender_pickaxe", () -> new PickaxeItem(ModItemTier.ENDER, 2, -2.8F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<AxeItem> ENDER_AXE = ITEMS.register("ender_axe", () -> new AxeItem(ModItemTier.ENDER, 5, -3.0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<ShovelItem> ENDER_SHOVEL = ITEMS.register("ender_shovel", () -> new ShovelItem(ModItemTier.ENDER, 2.5F, -3.0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<HoeItem> ENDER_HOE = ITEMS.register("ender_hoe", () -> new HoeItem(ModItemTier.ENDER, 0, 0F, new Item.Properties().group(MysTech.TAB)));

}
