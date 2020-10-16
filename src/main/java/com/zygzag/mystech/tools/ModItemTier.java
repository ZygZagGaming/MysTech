package com.zygzag.mystech.tools;

import com.zygzag.mystech.util.ItemRegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    ENDER(5, 2581, 10.0F, 5.5F, 20, () -> {
        return Ingredient.fromItems(ItemRegistryHandler.T1_CORE.get());
    }),

    ADVANCED_ENDER(6,3004,11.0F,6.0F,20 , () -> {
        return Ingredient.fromItems(ItemRegistryHandler.T2_CORE.get());
    }),

    EMPOWERED_ENDER(7, 3500, 11.5F, 6.5F, 20, () -> {
        return Ingredient.fromItems(ItemRegistryHandler.T3_CORE.get());
    }),

    CHAOTIC_ENDER(8, 1200, 15.0F, 9.0F, 0, () -> {
        return Ingredient.fromItems(ItemRegistryHandler.T4_CORE.get());
    }),

    REFINED_ENDER(9, 3750, 15.0F, 9.0F, 20, () -> {
        return Ingredient.fromItems(ItemRegistryHandler.T5_CORE.get());
    }),

    ULTIMATE_ENDER(10, 10000, 50.0F, 15.0F, 10, () -> {
        return Ingredient.fromItems(ItemRegistryHandler.T6_CORE.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
