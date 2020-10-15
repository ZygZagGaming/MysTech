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

    // Tools:
    // Swords
    public static final RegistryObject<SwordItem> ENDER_SWORD = ITEMS.register("ender_sword",
            () -> new SwordItem(ModItemTier.ENDER, 4, -2.4F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<SwordItem> ADVANCED_ENDER_SWORD = ITEMS.register("advanced_ender_sword",
            () -> new SwordItem(ModItemTier.ADVANCED_ENDER, 4, -2.4F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<SwordItem> EMPOWERED_ENDER_SWORD = ITEMS.register("empowered_ender_sword",
            () -> new SwordItem(ModItemTier.EMPOWERED_ENDER, 4, -2.4F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<SwordItem> CHAOTIC_ENDER_SWORD = ITEMS.register("chaotic_ender_sword",
            () -> new SwordItem(ModItemTier.CHAOTIC_ENDER, 4, -2.4F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<SwordItem> REFINED_ENDER_SWORD = ITEMS.register("refined_ender_sword",
            () -> new SwordItem(ModItemTier.REFINED_ENDER, 4, -2.4F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<SwordItem> ULTIMATE_ENDER_SWORD = ITEMS.register("ultimate_ender_sword",
            () -> new SwordItem(ModItemTier.ULTIMATE_ENDER, 4, -2.4F, new Item.Properties().group(MysTech.TAB)));

    // Pickaxes
    public static final RegistryObject<PickaxeItem> ENDER_PICKAXE = ITEMS.register("ender_pickaxe",
            () -> new PickaxeItem(ModItemTier.ENDER, 2, -2.8F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<PickaxeItem> ADVANCED_ENDER_PICKAXE = ITEMS.register("advanced_ender_pickaxe",
            () -> new PickaxeItem(ModItemTier.ADVANCED_ENDER, 2, -2.8F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<PickaxeItem> EMPOWERED_ENDER_PICKAXE = ITEMS.register("empowered_ender_pickaxe",
            () -> new PickaxeItem(ModItemTier.EMPOWERED_ENDER, 2, -2.8F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<PickaxeItem> CHAOTIC_ENDER_PICKAXE = ITEMS.register("chaotic_ender_pickaxe",
            () -> new PickaxeItem(ModItemTier.CHAOTIC_ENDER, 2, -2.8F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<PickaxeItem> REFINED_ENDER_PICKAXE = ITEMS.register("refined_ender_pickaxe",
            () -> new PickaxeItem(ModItemTier.REFINED_ENDER, 2, -2.8F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<PickaxeItem> ULTIMATE_ENDER_PICKAXE = ITEMS.register("ultimate_ender_pickaxe",
            () -> new PickaxeItem(ModItemTier.ULTIMATE_ENDER, 2, -2.8F, new Item.Properties().group(MysTech.TAB)));

    // Axes
    public static final RegistryObject<AxeItem> ENDER_AXE = ITEMS.register("ender_axe",
            () -> new AxeItem(ModItemTier.ENDER, 5, -3.0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<AxeItem> ADVANCED_ENDER_AXE = ITEMS.register("advanced_ender_axe",
            () -> new AxeItem(ModItemTier.ADVANCED_ENDER, 5, -3.0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<AxeItem> EMPOWERED_ENDER_AXE = ITEMS.register("empowered_ender_axe",
            () -> new AxeItem(ModItemTier.EMPOWERED_ENDER, 5, -3.0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<AxeItem> CHAOTIC_ENDER_AXE = ITEMS.register("chaotic_ender_axe",
            () -> new AxeItem(ModItemTier.CHAOTIC_ENDER, 5, -3.0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<AxeItem> REFINED_ENDER_AXE = ITEMS.register("refined_ender_axe",
            () -> new AxeItem(ModItemTier.REFINED_ENDER, 5, -3.0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<AxeItem> ULTIMATE_ENDER_AXE = ITEMS.register("ultimate_ender_axe",
            () -> new AxeItem(ModItemTier.ULTIMATE_ENDER, 5, -3.0F, new Item.Properties().group(MysTech.TAB)));

    // Shovels
    public static final RegistryObject<ShovelItem> ENDER_SHOVEL = ITEMS.register("ender_shovel",
            () -> new ShovelItem(ModItemTier.ENDER, 2.5F, -3.0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<ShovelItem> ADVANCED_ENDER_SHOVEL = ITEMS.register("advanced_ender_shovel",
            () -> new ShovelItem(ModItemTier.ADVANCED_ENDER, 2.5F, -3.0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<ShovelItem> EMPOWERED_ENDER_SHOVEL = ITEMS.register("empowered_ender_shovel",
            () -> new ShovelItem(ModItemTier.EMPOWERED_ENDER, 2.5F, -3.0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<ShovelItem> CHAOTIC_ENDER_SHOVEL = ITEMS.register("chaotic_ender_shovel",
            () -> new ShovelItem(ModItemTier.CHAOTIC_ENDER, 2.5F, -3.0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<ShovelItem> REFINED_ENDER_SHOVEL = ITEMS.register("refined_ender_shovel",
            () -> new ShovelItem(ModItemTier.REFINED_ENDER, 2.5F, -3.0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<ShovelItem> ULTIMATE_ENDER_SHOVEL = ITEMS.register("ultimate_ender_shovel",
            () -> new ShovelItem(ModItemTier.ULTIMATE_ENDER, 2.5F, -3.0F, new Item.Properties().group(MysTech.TAB)));

    // Hoes
    public static final RegistryObject<HoeItem> ENDER_HOE = ITEMS.register("ender_hoe",
            () -> new HoeItem(ModItemTier.ENDER, 0, 0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<HoeItem> ADVANCED_ENDER_HOE = ITEMS.register("advanced_ender_hoe",
            () -> new HoeItem(ModItemTier.ADVANCED_ENDER, 0, 0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<HoeItem> EMPOWERED_ENDER_HOE = ITEMS.register("empowered_ender_hoe",
            () -> new HoeItem(ModItemTier.EMPOWERED_ENDER, 0, 0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<HoeItem> CHAOTIC_ENDER_HOE = ITEMS.register("chaotic_ender_hoe",
            () -> new HoeItem(ModItemTier.CHAOTIC_ENDER, 0, 0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<HoeItem> REFINED_ENDER_HOE = ITEMS.register("refined_ender_hoe",
            () -> new HoeItem(ModItemTier.REFINED_ENDER, 0, 0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<HoeItem> ULTIMATE_ENDER_HOE = ITEMS.register("ultimate_ender_hoe",
            () -> new HoeItem(ModItemTier.ULTIMATE_ENDER, 0, 0F, new Item.Properties().group(MysTech.TAB)));

}
