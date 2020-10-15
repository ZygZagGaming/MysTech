package com.zygzag.mystech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class T6Stone extends Block {

    public T6Stone() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(0.5f, 6.0f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
