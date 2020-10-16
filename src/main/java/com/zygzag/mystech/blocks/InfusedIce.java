package com.zygzag.mystech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.IceBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class InfusedIce extends Block {

    public InfusedIce() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(2.0f, 8.0f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .slipperiness(10)
        );
    }

}
