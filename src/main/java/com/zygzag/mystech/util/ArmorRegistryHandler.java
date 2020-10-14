package com.zygzag.mystech.util;

import com.zygzag.mystech.MysTech;
import com.zygzag.mystech.armor.ModArmorMaterial;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmorRegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MysTech.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MysTech.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Armor
    public static final RegistryObject<ArmorItem> EXO_HELMET = ITEMS.register("exo_helmet", () -> new ArmorItem(ModArmorMaterial.EXO, EquipmentSlotType.HEAD, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<ArmorItem> EXO_CHESTPLATE = ITEMS.register("exo_chestplate", () -> new ArmorItem(ModArmorMaterial.EXO, EquipmentSlotType.CHEST, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<ArmorItem> EXO_LEGGINGS = ITEMS.register("exo_leggings", () -> new ArmorItem(ModArmorMaterial.EXO, EquipmentSlotType.LEGS, new Item.Properties().group(MysTech.TAB)));
    public static final RegistryObject<ArmorItem> EXO_BOOTS = ITEMS.register("exo_boots", () -> new ArmorItem(ModArmorMaterial.EXO, EquipmentSlotType.FEET, new Item.Properties().group(MysTech.TAB)));

}
