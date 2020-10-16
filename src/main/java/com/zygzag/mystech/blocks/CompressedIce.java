package com.zygzag.mystech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CompressedIce extends Block {

    public CompressedIce() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0f, 9.0f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .slipperiness(11)
        );
    }

}
