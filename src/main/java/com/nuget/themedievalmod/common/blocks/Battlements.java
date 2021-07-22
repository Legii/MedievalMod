package com.nuget.themedievalmod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class Battlements extends RotableBlock {
    public Battlements() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(3,4)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(1)
                .sound(SoundType.STONE));
    }

    private static final VoxelShape SHAPE_S = Stream.of(

            Block.makeCuboidShape(4, 0, 0, 12, 16, 8)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    }).get();


    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(8, 0, 4, 16, 16, 12)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    }).get();


    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(4, 0, 8, 12, 16, 16)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    }).get();

    private static final VoxelShape SHAPE_W = Stream.of(

            Block.makeCuboidShape(0, 0, 4, 8, 16, 12)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    }).get();

    public Battlements(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));

    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            case EAST:
                return SHAPE_W;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_E;
            case NORTH:
                return SHAPE_N;
            default:
                return SHAPE_N;
        }
    }
}