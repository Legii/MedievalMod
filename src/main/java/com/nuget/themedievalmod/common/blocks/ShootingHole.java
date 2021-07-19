package com.nuget.themedievalmod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraftforge.common.property.Properties;
import java.util.stream.Stream;

public class ShootingHole extends RotableBlock {
    private static final VoxelShape SHAPE_N = Stream.of(


                    Block.makeCuboidShape(0, 0.009999999999999787, 1, 7, 7.01, 15),
                    Block.makeCuboidShape(0, 7.01, 1, 5, 10.01, 15),
                    Block.makeCuboidShape(11, 7.01, 1, 16, 10.01, 15),
                    Block.makeCuboidShape(0, 10.01, 1, 7, 15.01, 15),
                    Block.makeCuboidShape(7, 0.010000000000000009, 1, 9, 2.01, 15),
                    Block.makeCuboidShape(7, 14.01, 1, 9, 15.01, 15),
                    Block.makeCuboidShape(9, 0.009999999999999787, 1, 16, 7.01, 15),
                    Block.makeCuboidShape(9, 10.01, 1, 16, 15.01, 15),
                    Block.makeCuboidShape(0, 0, 0, 16, 0.01, 16),
                    Block.makeCuboidShape(0, 15, 1, 16, 16, 15),
                    Block.makeCuboidShape(1, 1, 0, 7, 4, 1),
                    Block.makeCuboidShape(0, 13, 0, 4, 16, 1),
                    Block.makeCuboidShape(0, 5, 0, 4, 8, 1),
                    Block.makeCuboidShape(13, 5, 0, 16, 8, 1),
                    Block.makeCuboidShape(13, 13, 0, 16, 16, 1),
                    Block.makeCuboidShape(5, 13, 0, 7, 16, 1),
                    Block.makeCuboidShape(9, 13, 0, 12, 16, 1),
                    Block.makeCuboidShape(11, 9, 0, 16, 12, 1),
                    Block.makeCuboidShape(9, 1, 0, 16, 4, 1),
                    Block.makeCuboidShape(1, 9, 0, 5, 12, 1),
                    Block.makeCuboidShape(11, 9, 15, 15, 12, 16),
                    Block.makeCuboidShape(1, 9, 15, 5, 12, 16),
                    Block.makeCuboidShape(5, 5, 0, 7, 8, 1),
                    Block.makeCuboidShape(9, 5, 0, 11, 8, 1),
                    Block.makeCuboidShape(1, 1, 15, 7, 4, 16),
                    Block.makeCuboidShape(0, 13, 15, 4, 16, 16),
                    Block.makeCuboidShape(0, 5, 15, 4, 8, 16),
                    Block.makeCuboidShape(13, 5, 15, 16, 8, 16),
                    Block.makeCuboidShape(13, 13, 15, 16, 16, 16),
                    Block.makeCuboidShape(9, 13, 15, 12, 16, 16),
                    Block.makeCuboidShape(5, 13, 15, 7, 16, 16),
                    Block.makeCuboidShape(9, 1, 15, 16, 4, 16),
                    Block.makeCuboidShape(7, 2, 2, 9, 14, 15),
                    Block.makeCuboidShape(5, 7, 2, 7, 10, 15),
                    Block.makeCuboidShape(9, 7, 2, 11, 10, 15)
            ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();


    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(0, 1, 1, 1, 4, 8),
            Block.makeCuboidShape(0, 13, 0, 1, 16, 4),
            Block.makeCuboidShape(0, 5, 0, 1, 8, 4),
            Block.makeCuboidShape(0, 5, 13, 1, 8, 16),
            Block.makeCuboidShape(0, 13, 13, 1, 16, 16),
            Block.makeCuboidShape(0, 13, 5, 1, 16, 12),
            Block.makeCuboidShape(0, 9, 9, 1, 12, 16),
            Block.makeCuboidShape(0, 1, 9, 1, 4, 16),
            Block.makeCuboidShape(0, 9, 1, 1, 12, 8),
            Block.makeCuboidShape(0, 5, 5, 1, 8, 12),
            Block.makeCuboidShape(1, 0.01, 0, 15, 16.01, 16),
            Block.makeCuboidShape(15, 1, 1, 16, 4, 8),
            Block.makeCuboidShape(15, 13, 0, 16, 16, 4),
            Block.makeCuboidShape(15, 5, 0, 16, 8, 4),
            Block.makeCuboidShape(15, 5, 13, 16, 8, 16),
            Block.makeCuboidShape(15, 13, 13, 16, 16, 16),
            Block.makeCuboidShape(15, 13, 5, 16, 16, 12),
            Block.makeCuboidShape(15, 9, 9, 16, 12, 16),
            Block.makeCuboidShape(15, 1, 9, 16, 4, 16),
            Block.makeCuboidShape(15, 9, 1, 16, 12, 8),
            Block.makeCuboidShape(15, 5, 5, 16, 8, 12),
            Block.makeCuboidShape(0, 0, 0, 16, 0.01, 16)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    }).get();


    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(1, 1, 15, 8, 4, 16),
            Block.makeCuboidShape(0, 13, 15, 4, 16, 16),
            Block.makeCuboidShape(0, 5, 15, 4, 8, 16),
            Block.makeCuboidShape(13, 5, 15, 16, 8, 16),
            Block.makeCuboidShape(13, 13, 15, 16, 16, 16),
            Block.makeCuboidShape(5, 13, 15, 12, 16, 16),
            Block.makeCuboidShape(9, 9, 15, 16, 12, 16),
            Block.makeCuboidShape(9, 1, 15, 16, 4, 16),
            Block.makeCuboidShape(1, 9, 15, 8, 12, 16),
            Block.makeCuboidShape(5, 5, 15, 12, 8, 16),
            Block.makeCuboidShape(0, 0.01, 1, 16, 16.01, 15),
            Block.makeCuboidShape(1, 1, 0, 8, 4, 1),
            Block.makeCuboidShape(0, 13, 0, 4, 16, 1),
            Block.makeCuboidShape(0, 5, 0, 4, 8, 1),
            Block.makeCuboidShape(13, 5, 0, 16, 8, 1),
            Block.makeCuboidShape(13, 13, 0, 16, 16, 1),
            Block.makeCuboidShape(5, 13, 0, 12, 16, 1),
            Block.makeCuboidShape(9, 9, 0, 16, 12, 1),
            Block.makeCuboidShape(9, 1, 0, 16, 4, 1),
            Block.makeCuboidShape(1, 9, 0, 8, 12, 1),
            Block.makeCuboidShape(5, 5, 0, 12, 8, 1),
            Block.makeCuboidShape(0, 0, 0, 16, 0.01, 16)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    }).get();

    private static final VoxelShape SHAPE_W = Stream.of(

            Block.makeCuboidShape(15, 1, 8, 16, 4, 15),
            Block.makeCuboidShape(15, 13, 12, 16, 16, 16),
            Block.makeCuboidShape(15, 5, 12, 16, 8, 16),
            Block.makeCuboidShape(15, 5, 0, 16, 8, 3),
            Block.makeCuboidShape(15, 13, 0, 16, 16, 3),
            Block.makeCuboidShape(15, 13, 4, 16, 16, 11),
            Block.makeCuboidShape(15, 9, 0, 16, 12, 7),
            Block.makeCuboidShape(15, 1, 0, 16, 4, 7),
            Block.makeCuboidShape(15, 9, 8, 16, 12, 15),
            Block.makeCuboidShape(15, 5, 4, 16, 8, 11),
            Block.makeCuboidShape(1, 0.01, 0, 15, 16.01, 16),
            Block.makeCuboidShape(0, 1, 8, 1, 4, 15),
            Block.makeCuboidShape(0, 13, 12, 1, 16, 16),
            Block.makeCuboidShape(0, 5, 12, 1, 8, 16),
            Block.makeCuboidShape(0, 5, 0, 1, 8, 3),
            Block.makeCuboidShape(0, 13, 0, 1, 16, 3),
            Block.makeCuboidShape(0, 13, 4, 1, 16, 11),
            Block.makeCuboidShape(0, 9, 0, 1, 12, 7),
            Block.makeCuboidShape(0, 1, 0, 1, 4, 7),
            Block.makeCuboidShape(0, 9, 8, 1, 12, 15),
            Block.makeCuboidShape(0, 5, 4, 1, 8, 11),
            Block.makeCuboidShape(0, 0, 0, 16, 0.01, 16)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    }).get();

    public ShootingHole(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }
}