package com.zygzag.mystech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraftforge.common.ToolType;

public class T1Pillar extends Block {

    public T1Pillar() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(0.5f, 6.0f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
    }

    EnumProperty<Direction.Axis> axis = BlockStateProperties.AXIS;

    @Override
    protected void fillStateContainer(StateContainer.Builder<net.minecraft.block.Block, BlockState> builder) {
        super.fillStateContainer(builder);
        builder.add(axis);
    }

}
