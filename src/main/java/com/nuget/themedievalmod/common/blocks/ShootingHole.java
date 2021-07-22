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
import net.minecraftforge.common.property.Properties;
import java.util.stream.Stream;

public class ShootingHole extends RotableBlock {
    public ShootingHole() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(3,6)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(1)
                .sound(SoundType.STONE));
    }

    private static final VoxelShape SHAPE_N = Stream.of(



                    Block.makeCuboidShape(0, 0.01, 1, 7, 7.01, 15),
                    Block.makeCuboidShape(0, 7.01, 1, 5, 10.01, 15),
                    Block.makeCuboidShape(0, 10.01, 1, 7, 15.01, 15),
                    Block.makeCuboidShape(9, 10.01, 1, 16, 15.01, 15),
                    Block.makeCuboidShape(11, 7.01, 1, 16, 10.01, 15),
                    Block.makeCuboidShape(7, 0.01, 1, 9, 2.01, 15),
                    Block.makeCuboidShape(9, 0.01, 1, 16, 7.01, 15)
            ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();


    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(1, 0.01, 9, 15, 7.01, 16),
            Block.makeCuboidShape(1, 7.01, 11, 15, 10.01, 16),
            Block.makeCuboidShape(1, 10.01, 9, 15, 15.01, 16),
            Block.makeCuboidShape(1, 10.01, 0, 15, 15.01, 7),
            Block.makeCuboidShape(1, 7.01, 0, 15, 10.01, 5),
            Block.makeCuboidShape(1, 0.01, 7, 15, 2.01, 9),
            Block.makeCuboidShape(1, 0.01, 0, 15, 7.01, 7)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();


    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(9, 0.01, 1, 16, 7.01, 15),
            Block.makeCuboidShape(11, 7.01, 1, 16, 10.01, 15),
            Block.makeCuboidShape(9, 10.01, 1, 16, 15.01, 15),
            Block.makeCuboidShape(0, 10.01, 1, 7, 15.01, 15),
            Block.makeCuboidShape(0, 7.01, 1, 5, 10.01, 15),
            Block.makeCuboidShape(7, 0.01, 1, 9, 2.01, 15),
            Block.makeCuboidShape(0, 0.01, 1, 7, 7.01, 15)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(1, 0.01, 2, 15, 7.01, 9),
            Block.makeCuboidShape(1, 7.01, 2, 15, 10.01, 7),
            Block.makeCuboidShape(1, 10.01, 2, 15, 15.01, 9),
            Block.makeCuboidShape(1, 10.01, 11, 15, 15.01, 18),
            Block.makeCuboidShape(1, 7.01, 13, 15, 10.01, 18),
            Block.makeCuboidShape(1, 0.01, 9, 15, 2.01, 11),
            Block.makeCuboidShape(1, 0.01, 11, 15, 7.01, 18)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public ShootingHole(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            case EAST:
                return SHAPE_E;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }
}