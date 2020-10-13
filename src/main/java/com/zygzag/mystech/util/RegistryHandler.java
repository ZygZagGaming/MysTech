package com.zygzag.mystech.util;

import com.zygzag.mystech.MysTech;
import com.zygzag.mystech.armor.ModArmorMaterial;
import com.zygzag.mystech.blocks.BlockItemBase;
import com.zygzag.mystech.blocks.T1Pillar;
import com.zygzag.mystech.items.ItemBase;
import com.zygzag.mystech.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MysTech.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MysTech.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> T1_CORE = ITEMS.register("t1_core", ItemBase::new);
    public static final RegistryObject<Item> CORE_FRAME = ITEMS.register("core_frame", ItemBase::new);
    public static final RegistryObject<Item> IRON_ROD = ITEMS.register("iron_rod", ItemBase::new);

    // Tools
    public static final RegistryObject<SwordItem> ENDER_SWORD = ITEMS.register("ender_sword", () -> new SwordItem(ModItemTier.ENDER, 4, -2.4F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<AxeItem> ENDER_AXE = ITEMS.register("ender_axe", () -> new AxeItem(ModItemTier.ENDER, 5, -3.0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<PickaxeItem> ENDER_PICKAXE = ITEMS.register("ender_pickaxe", () -> new PickaxeItem(ModItemTier.ENDER, 2, -2.8F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<ShovelItem> ENDER_SHOVEL = ITEMS.register("ender_shovel", () -> new ShovelItem(ModItemTier.ENDER, 2.5F, -3.0F, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<HoeItem> ENDER_HOE = ITEMS.register("ender_hoe", () -> new HoeItem(ModItemTier.ENDER, 0, 0F, new Item.Properties().group(MysTech.TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> EXO_HELMET = ITEMS.register("exo_helmet", () -> new ArmorItem(ModArmorMaterial.EXO, EquipmentSlotType.HEAD, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<ArmorItem> EXO_CHESTPLATE = ITEMS.register("exo_chestplate", () -> new ArmorItem(ModArmorMaterial.EXO, EquipmentSlotType.CHEST, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<ArmorItem> EXO_LEGGINGS = ITEMS.register("exo_leggings", () -> new ArmorItem(ModArmorMaterial.EXO, EquipmentSlotType.LEGS, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<ArmorItem> EXO_BOOTS = ITEMS.register("exo_boots", () -> new ArmorItem(ModArmorMaterial.EXO, EquipmentSlotType.FEET, new Item.Properties().group(MysTech.TAB)));

    // Blocks
    public static final RegistryObject<Block> T1_INFUSION_PILLAR = BLOCKS.register("t1_pillar", T1Pillar::new);

    // Block Items
    public static final RegistryObject<Item> T1_INFUSION_PILLAR_ITEM = ITEMS.register("t1_pillar", () -> new BlockItemBase(T1_INFUSION_PILLAR.get()));
}
