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

public class HoardingFloor extends RotableBlock {
    public HoardingFloor() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(2,2)
                .harvestTool(ToolType.AXE)
                .harvestLevel(0)
                .sound(SoundType.WOOD));
    }



    private static final VoxelShape SHAPE_W =Stream.of(
            Block.makeCuboidShape(-0.05882000000000076, -1, 14.94118, 15.94118, 1, 15.94118),
            Block.makeCuboidShape(-0.05882000000000076, -1, -0.05882000000000076, 15.94118, 1, 0.9411799999999992),
            Block.makeCuboidShape(-0.05882000000000076, 0, 13.94118, 15.94118, 1, 14.94118),
            Block.makeCuboidShape(-0.05882000000000076, 0, 0.9411799999999992, 15.94118, 1, 1.9411799999999992),
            Block.makeCuboidShape(-0.05882000000000076, 0, 12.94118, 15.94118, 1, 13.94118),
            Block.makeCuboidShape(-0.05882000000000076, 0, 11.94118, 15.94118, 1, 12.94118),
            Block.makeCuboidShape(-0.05882000000000076, 0, 1.9411799999999992, 15.94118, 1, 2.9411799999999992),
            Block.makeCuboidShape(-0.05882000000000076, 0, 2.9411799999999992, 15.94118, 1, 3.9411799999999992),
            Block.makeCuboidShape(-0.05882000000000076, -1, 4.941179999999999, 15.94118, 1, 5.941179999999999),
            Block.makeCuboidShape(-0.05882000000000076, -1, 9.94118, 15.94118, 1, 10.94118),
            Block.makeCuboidShape(-0.05882000000000076, 0, 7.941179999999999, 15.94118, 1, 8.94118),
            Block.makeCuboidShape(-0.05882000000000076, 0, 3.9411799999999992, 15.94118, 1, 4.941179999999999),
            Block.makeCuboidShape(-0.05882000000000076, 0, 10.94118, 15.94118, 1, 11.94118),
            Block.makeCuboidShape(-0.05882000000000076, 0, 8.94118, 15.94118, 1, 9.94118),
            Block.makeCuboidShape(-0.05882000000000076, 0, 5.941179999999999, 15.94118, 1, 6.941179999999999),
            Block.makeCuboidShape(-0.05882000000000076, 0, 6.941179999999999, 15.94118, 1, 7.941179999999999),
            Block.makeCuboidShape(13.94118, 1, 14.94118, 15.94118, 15, 15.94118),
            Block.makeCuboidShape(14.94118, 1, 0.9411799999999992, 15.94118, 15, 1.9411799999999992),
            Block.makeCuboidShape(14.94118, 1, 13.94118, 15.94118, 15, 14.94118),
            Block.makeCuboidShape(14.94118, 1, 1.9411799999999992, 15.94118, 15, 2.9411799999999992),
            Block.makeCuboidShape(14.94118, 1, 2.9411799999999992, 15.94118, 15, 3.9411799999999992),
            Block.makeCuboidShape(14.94118, 1, 12.94118, 15.94118, 15, 13.94118),
            Block.makeCuboidShape(14.94118, 1, 11.94118, 15.94118, 15, 12.94118),
            Block.makeCuboidShape(13.94118, 1, 9.94118, 15.94118, 15, 10.94118),
            Block.makeCuboidShape(13.94118, 1, 4.941179999999999, 15.94118, 15, 5.941179999999999),
            Block.makeCuboidShape(14.94118, 1, 6.941179999999999, 15.94118, 15, 7.941179999999999),
            Block.makeCuboidShape(14.94118, 1, 10.94118, 15.94118, 15, 11.94118),
            Block.makeCuboidShape(14.94118, 1, 3.9411799999999992, 15.94118, 15, 4.941179999999999),
            Block.makeCuboidShape(14.94118, 1, 5.941179999999999, 15.94118, 15, 6.941179999999999),
            Block.makeCuboidShape(14.94118, 1, 8.94118, 15.94118, 15, 9.94118),
            Block.makeCuboidShape(14.94118, 1, 7.941179999999999, 15.94118, 15, 8.94118),
            Block.makeCuboidShape(13.94118, 1, -0.05882000000000076, 15.94118, 15, 0.9411799999999992)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();


    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(14.94118, -1, 0.05882000000000076, 15.94118, 1, 16.05882),
            Block.makeCuboidShape(-0.05882000000000076, -1, 0.05882000000000076, 0.9411799999999992, 1, 16.05882),
            Block.makeCuboidShape(13.94118, 0, 0.05882000000000076, 14.94118, 1, 16.05882),
            Block.makeCuboidShape(0.9411799999999992, 0, 0.05882000000000076, 1.9411799999999992, 1, 16.05882),
            Block.makeCuboidShape(12.94118, 0, 0.05882000000000076, 13.94118, 1, 16.05882),
            Block.makeCuboidShape(11.94118, 0, 0.05882000000000076, 12.94118, 1, 16.05882),
            Block.makeCuboidShape(1.9411799999999992, 0, 0.05882000000000076, 2.9411799999999992, 1, 16.05882),
            Block.makeCuboidShape(2.9411799999999992, 0, 0.05882000000000076, 3.9411799999999992, 1, 16.05882),
            Block.makeCuboidShape(4.941179999999999, -1, 0.05882000000000076, 5.941179999999999, 1, 16.05882),
            Block.makeCuboidShape(9.94118, -1, 0.05882000000000076, 10.94118, 1, 16.05882),
            Block.makeCuboidShape(7.941179999999999, 0, 0.05882000000000076, 8.94118, 1, 16.05882),
            Block.makeCuboidShape(3.9411799999999992, 0, 0.05882000000000076, 4.941179999999999, 1, 16.05882),
            Block.makeCuboidShape(10.94118, 0, 0.05882000000000076, 11.94118, 1, 16.05882),
            Block.makeCuboidShape(8.94118, 0, 0.05882000000000076, 9.94118, 1, 16.05882),
            Block.makeCuboidShape(5.941179999999999, 0, 0.05882000000000076, 6.941179999999999, 1, 16.05882),
            Block.makeCuboidShape(6.941179999999999, 0, 0.05882000000000076, 7.941179999999999, 1, 16.05882),
            Block.makeCuboidShape(14.94118, 1, 0.05882000000000076, 15.94118, 15, 2.0588200000000008),
            Block.makeCuboidShape(0.9411799999999992, 1, 0.05882000000000076, 1.9411799999999992, 15, 1.0588200000000008),
            Block.makeCuboidShape(13.94118, 1, 0.05882000000000076, 14.94118, 15, 1.0588200000000008),
            Block.makeCuboidShape(1.9411799999999992, 1, 0.05882000000000076, 2.9411799999999992, 15, 1.0588200000000008),
            Block.makeCuboidShape(2.9411799999999992, 1, 0.05882000000000076, 3.9411799999999992, 15, 1.0588200000000008),
            Block.makeCuboidShape(12.94118, 1, 0.05882000000000076, 13.94118, 15, 1.0588200000000008),
            Block.makeCuboidShape(11.94118, 1, 0.05882000000000076, 12.94118, 15, 1.0588200000000008),
            Block.makeCuboidShape(9.94118, 1, 0.05882000000000076, 10.94118, 15, 2.0588200000000008),
            Block.makeCuboidShape(4.941179999999999, 1, 0.05882000000000076, 5.941179999999999, 15, 2.0588200000000008),
            Block.makeCuboidShape(6.941179999999999, 1, 0.05882000000000076, 7.941179999999999, 15, 1.0588200000000008),
            Block.makeCuboidShape(10.94118, 1, 0.05882000000000076, 11.94118, 15, 1.0588200000000008),
            Block.makeCuboidShape(3.9411799999999992, 1, 0.05882000000000076, 4.941179999999999, 15, 1.0588200000000008),
            Block.makeCuboidShape(5.941179999999999, 1, 0.05882000000000076, 6.941179999999999, 15, 1.0588200000000008),
            Block.makeCuboidShape(8.94118, 1, 0.05882000000000076, 9.94118, 15, 1.0588200000000008),
            Block.makeCuboidShape(7.941179999999999, 1, 0.05882000000000076, 8.94118, 15, 1.0588200000000008),
            Block.makeCuboidShape(-0.05882000000000076, 1, 0.05882000000000076, 0.9411799999999992, 15, 2.0588200000000008)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(0.05882000000000076, -1, 0.05882000000000076, 16.05882, 1, 1.0588200000000008),
            Block.makeCuboidShape(0.05882000000000076, -1, 15.05882, 16.05882, 1, 16.05882),
            Block.makeCuboidShape(0.05882000000000076, 0, 1.0588200000000008, 16.05882, 1, 2.0588200000000008),
            Block.makeCuboidShape(0.05882000000000076, 0, 14.05882, 16.05882, 1, 15.05882),
            Block.makeCuboidShape(0.05882000000000076, 0, 2.0588200000000008, 16.05882, 1, 3.0588200000000008),
            Block.makeCuboidShape(0.05882000000000076, 0, 3.0588200000000008, 16.05882, 1, 4.058820000000001),
            Block.makeCuboidShape(0.05882000000000076, 0, 13.05882, 16.05882, 1, 14.05882),
            Block.makeCuboidShape(0.05882000000000076, 0, 12.05882, 16.05882, 1, 13.05882),
            Block.makeCuboidShape(0.05882000000000076, -1, 10.05882, 16.05882, 1, 11.05882),
            Block.makeCuboidShape(0.05882000000000076, -1, 5.058820000000001, 16.05882, 1, 6.058820000000001),
            Block.makeCuboidShape(0.05882000000000076, 0, 7.058820000000001, 16.05882, 1, 8.05882),
            Block.makeCuboidShape(0.05882000000000076, 0, 11.05882, 16.05882, 1, 12.05882),
            Block.makeCuboidShape(0.05882000000000076, 0, 4.058820000000001, 16.05882, 1, 5.058820000000001),
            Block.makeCuboidShape(0.05882000000000076, 0, 6.058820000000001, 16.05882, 1, 7.058820000000001),
            Block.makeCuboidShape(0.05882000000000076, 0, 9.05882, 16.05882, 1, 10.05882),
            Block.makeCuboidShape(0.05882000000000076, 0, 8.05882, 16.05882, 1, 9.05882),
            Block.makeCuboidShape(0.05882000000000076, 1, 0.05882000000000076, 2.0588200000000008, 15, 1.0588200000000008),
            Block.makeCuboidShape(0.05882000000000076, 1, 14.05882, 1.0588200000000008, 15, 15.05882),
            Block.makeCuboidShape(0.05882000000000076, 1, 1.0588200000000008, 1.0588200000000008, 15, 2.0588200000000008),
            Block.makeCuboidShape(0.05882000000000076, 1, 13.05882, 1.0588200000000008, 15, 14.05882),
            Block.makeCuboidShape(0.05882000000000076, 1, 12.05882, 1.0588200000000008, 15, 13.05882),
            Block.makeCuboidShape(0.05882000000000076, 1, 2.0588200000000008, 1.0588200000000008, 15, 3.0588200000000008),
            Block.makeCuboidShape(0.05882000000000076, 1, 3.0588200000000008, 1.0588200000000008, 15, 4.058820000000001),
            Block.makeCuboidShape(0.05882000000000076, 1, 5.058820000000001, 2.0588200000000008, 15, 6.058820000000001),
            Block.makeCuboidShape(0.05882000000000076, 1, 10.05882, 2.0588200000000008, 15, 11.05882),
            Block.makeCuboidShape(0.05882000000000076, 1, 8.05882, 1.0588200000000008, 15, 9.05882),
            Block.makeCuboidShape(0.05882000000000076, 1, 4.058820000000001, 1.0588200000000008, 15, 5.058820000000001),
            Block.makeCuboidShape(0.05882000000000076, 1, 11.05882, 1.0588200000000008, 15, 12.05882),
            Block.makeCuboidShape(0.05882000000000076, 1, 9.05882, 1.0588200000000008, 15, 10.05882),
            Block.makeCuboidShape(0.05882000000000076, 1, 6.058820000000001, 1.0588200000000008, 15, 7.058820000000001),
            Block.makeCuboidShape(0.05882000000000076, 1, 7.058820000000001, 1.0588200000000008, 15, 8.05882),
            Block.makeCuboidShape(0.05882000000000076, 1, 15.05882, 2.0588200000000008, 15, 16.05882)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();



    private static final VoxelShape SHAPE_N  = Stream.of(
            Block.makeCuboidShape(0.05882000000000076, -1, -0.05882000000000076, 1.0588200000000008, 1, 15.94118),
            Block.makeCuboidShape(15.05882, -1, -0.05882000000000076, 16.05882, 1, 15.94118),
            Block.makeCuboidShape(1.0588200000000008, 0, -0.05882000000000076, 2.0588200000000008, 1, 15.94118),
            Block.makeCuboidShape(14.05882, 0, -0.05882000000000076, 15.05882, 1, 15.94118),
            Block.makeCuboidShape(2.0588200000000008, 0, -0.05882000000000076, 3.0588200000000008, 1, 15.94118),
            Block.makeCuboidShape(3.0588200000000008, 0, -0.05882000000000076, 4.058820000000001, 1, 15.94118),
            Block.makeCuboidShape(13.05882, 0, -0.05882000000000076, 14.05882, 1, 15.94118),
            Block.makeCuboidShape(12.05882, 0, -0.05882000000000076, 13.05882, 1, 15.94118),
            Block.makeCuboidShape(10.05882, -1, -0.05882000000000076, 11.05882, 1, 15.94118),
            Block.makeCuboidShape(5.058820000000001, -1, -0.05882000000000076, 6.058820000000001, 1, 15.94118),
            Block.makeCuboidShape(7.058820000000001, 0, -0.05882000000000076, 8.05882, 1, 15.94118),
            Block.makeCuboidShape(11.05882, 0, -0.05882000000000076, 12.05882, 1, 15.94118),
            Block.makeCuboidShape(4.058820000000001, 0, -0.05882000000000076, 5.058820000000001, 1, 15.94118),
            Block.makeCuboidShape(6.058820000000001, 0, -0.05882000000000076, 7.058820000000001, 1, 15.94118),
            Block.makeCuboidShape(9.05882, 0, -0.05882000000000076, 10.05882, 1, 15.94118),
            Block.makeCuboidShape(8.05882, 0, -0.05882000000000076, 9.05882, 1, 15.94118),
            Block.makeCuboidShape(0.05882000000000076, 1, 13.94118, 1.0588200000000008, 15, 15.94118),
            Block.makeCuboidShape(14.05882, 1, 14.94118, 15.05882, 15, 15.94118),
            Block.makeCuboidShape(1.0588200000000008, 1, 14.94118, 2.0588200000000008, 15, 15.94118),
            Block.makeCuboidShape(13.05882, 1, 14.94118, 14.05882, 15, 15.94118),
            Block.makeCuboidShape(12.05882, 1, 14.94118, 13.05882, 15, 15.94118),
            Block.makeCuboidShape(2.0588200000000008, 1, 14.94118, 3.0588200000000008, 15, 15.94118),
            Block.makeCuboidShape(3.0588200000000008, 1, 14.94118, 4.058820000000001, 15, 15.94118),
            Block.makeCuboidShape(5.058820000000001, 1, 13.94118, 6.058820000000001, 15, 15.94118),
            Block.makeCuboidShape(10.05882, 1, 13.94118, 11.05882, 15, 15.94118),
            Block.makeCuboidShape(8.05882, 1, 14.94118, 9.05882, 15, 15.94118),
            Block.makeCuboidShape(4.058820000000001, 1, 14.94118, 5.058820000000001, 15, 15.94118),
            Block.makeCuboidShape(11.05882, 1, 14.94118, 12.05882, 15, 15.94118),
            Block.makeCuboidShape(9.05882, 1, 14.94118, 10.05882, 15, 15.94118),
            Block.makeCuboidShape(6.058820000000001, 1, 14.94118, 7.058820000000001, 15, 15.94118),
            Block.makeCuboidShape(7.058820000000001, 1, 14.94118, 8.05882, 15, 15.94118),
            Block.makeCuboidShape(15.05882, 1, 13.94118, 16.05882, 15, 15.94118)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    public HoardingFloor(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {

            case WEST:
                return SHAPE_W;
             case EAST:
                return SHAPE_E;

            case SOUTH:
                return SHAPE_S;
            case NORTH:
                return SHAPE_N;
            default:
                return SHAPE_N;
        }
    }
}