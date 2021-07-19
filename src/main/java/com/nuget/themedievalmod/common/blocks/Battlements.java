package com.nuget.themedievalmod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;

import java.util.stream.Stream;

public class Battlements extends RotableBlock {
    private static final VoxelShape SHAPE_N = Stream.of(

            Block.makeCuboidShape(4, 0, 0, 12, 16, 8)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    }).get();


    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(8, 0, 4, 16, 16, 12)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    }).get();


    private static final VoxelShape SHAPE_S = Stream.of(
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
}