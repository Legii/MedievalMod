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

public class Hoarding extends RotableBlock {
    public Hoarding() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(2,2)
                .harvestTool(ToolType.AXE)
                .harvestLevel(0)
                .sound(SoundType.WOOD));
    }



    private static final VoxelShape SHAPE_E =Stream.of(
            Block.makeCuboidShape(0.05882000000000076, 0, 14.94118, 2.0588200000000008, 16, 15.94118),
            Block.makeCuboidShape(0.05882000000000076, 0, 0.9411799999999992, 1.0588200000000008, 16, 1.9411799999999992),
            Block.makeCuboidShape(0.05882000000000076, 0, 13.94118, 1.0588200000000008, 16, 14.94118),
            Block.makeCuboidShape(0.05882000000000076, 0, 1.9411799999999992, 1.0588200000000008, 16, 2.9411799999999992),
            Block.makeCuboidShape(0.05882000000000076, 0, 2.9411799999999992, 1.0588200000000008, 16, 3.9411799999999992),
            Block.makeCuboidShape(0.05882000000000076, 0, 12.94118, 1.0588200000000008, 16, 13.94118),
            Block.makeCuboidShape(0.05882000000000076, 0, 11.94118, 1.0588200000000008, 16, 12.94118),
            Block.makeCuboidShape(0.05882000000000076, 0, 9.94118, 2.0588200000000008, 16, 10.94118),
            Block.makeCuboidShape(0.05882000000000076, 0, 4.941179999999999, 2.0588200000000008, 16, 5.941179999999999),
            Block.makeCuboidShape(0.05882000000000076, 0, 6.941179999999999, 1.0588200000000008, 6, 7.941179999999999),
            Block.makeCuboidShape(0.05882000000000076, 11, 6.941179999999999, 1.0588200000000008, 16, 7.941179999999999),
            Block.makeCuboidShape(0.05882000000000076, 0, 10.94118, 1.0588200000000008, 16, 11.94118),
            Block.makeCuboidShape(0.05882000000000076, 0, 3.9411799999999992, 1.0588200000000008, 16, 4.941179999999999),
            Block.makeCuboidShape(0.05882000000000076, 0, 5.941179999999999, 1.0588200000000008, 16, 6.941179999999999),
            Block.makeCuboidShape(0.05882000000000076, 0, 8.94118, 1.0588200000000008, 16, 9.94118),
            Block.makeCuboidShape(0.05882000000000076, 0, 7.941179999999999, 1.0588200000000008, 6, 8.94118),
            Block.makeCuboidShape(0.05882000000000076, 11, 7.941179999999999, 1.0588200000000008, 16, 8.94118),
            Block.makeCuboidShape(0.05882000000000076, 0, -0.05882000000000076, 2.0588200000000008, 16, 0.9411799999999992),
            Block.makeCuboidShape(14.05882, 0, -0.05882000000000076, 16.05882, 16, 0.9411799999999992),
            Block.makeCuboidShape(14.05882, 0, 14.94118, 16.05882, 16, 15.94118),
            Block.makeCuboidShape(14.05882, 0, -0.05882000000000076, 16.05882, 16, 0.9411799999999992)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();


    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(0.05882, 0, 0.05882000000000076, 1.05882, 16, 2.0588200000000008),
            Block.makeCuboidShape(14.05882, 0, 0.05882000000000076, 15.05882, 16, 1.0588200000000008),
            Block.makeCuboidShape(1.05882, 0, 0.05882000000000076, 2.05882, 16, 1.0588200000000008),
            Block.makeCuboidShape(13.05882, 0, 0.05882000000000076, 14.05882, 16, 1.0588200000000008),
            Block.makeCuboidShape(12.05882, 0, 0.05882000000000076, 13.05882, 16, 1.0588200000000008),
            Block.makeCuboidShape(2.05882, 0, 0.05882000000000076, 3.05882, 16, 1.0588200000000008),
            Block.makeCuboidShape(3.05882, 0, 0.05882000000000076, 4.05882, 16, 1.0588200000000008),
            Block.makeCuboidShape(5.05882, 0, 0.05882000000000076, 6.05882, 16, 2.0588200000000008),
            Block.makeCuboidShape(10.05882, 0, 0.05882000000000076, 11.05882, 16, 2.0588200000000008),
            Block.makeCuboidShape(8.05882, 0, 0.05882000000000076, 9.05882, 6, 1.0588200000000008),
            Block.makeCuboidShape(8.05882, 11, 0.05882000000000076, 9.05882, 16, 1.0588200000000008),
            Block.makeCuboidShape(4.05882, 0, 0.05882000000000076, 5.05882, 16, 1.0588200000000008),
            Block.makeCuboidShape(11.05882, 0, 0.05882000000000076, 12.05882, 16, 1.0588200000000008),
            Block.makeCuboidShape(9.05882, 0, 0.05882000000000076, 10.05882, 16, 1.0588200000000008),
            Block.makeCuboidShape(6.05882, 0, 0.05882000000000076, 7.05882, 16, 1.0588200000000008),
            Block.makeCuboidShape(7.05882, 0, 0.05882000000000076, 8.05882, 6, 1.0588200000000008),
            Block.makeCuboidShape(7.05882, 11, 0.05882000000000076, 8.05882, 16, 1.0588200000000008),
            Block.makeCuboidShape(15.05882, 0, 0.05882000000000076, 16.05882, 16, 2.0588200000000008),
            Block.makeCuboidShape(15.05882, 0, 14.05882, 16.05882, 16, 16.05882),
            Block.makeCuboidShape(0.05882000000000076, 0, 14.05882, 1.0588200000000008, 16, 16.05882),
            Block.makeCuboidShape(15.05882, 0, 14.05882, 16.05882, 16, 16.05882)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(13.94118, 0, 0.05881999999999987, 15.94118, 16, 1.0588199999999999),
            Block.makeCuboidShape(14.94118, 0, 14.05882, 15.94118, 16, 15.05882),
            Block.makeCuboidShape(14.94118, 0, 1.0588199999999999, 15.94118, 16, 2.05882),
            Block.makeCuboidShape(14.94118, 0, 13.05882, 15.94118, 16, 14.05882),
            Block.makeCuboidShape(14.94118, 0, 12.05882, 15.94118, 16, 13.05882),
            Block.makeCuboidShape(14.94118, 0, 2.05882, 15.94118, 16, 3.05882),
            Block.makeCuboidShape(14.94118, 0, 3.05882, 15.94118, 16, 4.05882),
            Block.makeCuboidShape(13.94118, 0, 5.05882, 15.94118, 16, 6.05882),
            Block.makeCuboidShape(13.94118, 0, 10.05882, 15.94118, 16, 11.05882),
            Block.makeCuboidShape(14.94118, 0, 8.05882, 15.94118, 6, 9.05882),
            Block.makeCuboidShape(14.94118, 11, 8.05882, 15.94118, 16, 9.05882),
            Block.makeCuboidShape(14.94118, 0, 4.05882, 15.94118, 16, 5.05882),
            Block.makeCuboidShape(14.94118, 0, 11.05882, 15.94118, 16, 12.05882),
            Block.makeCuboidShape(14.94118, 0, 9.05882, 15.94118, 16, 10.05882),
            Block.makeCuboidShape(14.94118, 0, 6.05882, 15.94118, 16, 7.05882),
            Block.makeCuboidShape(14.94118, 0, 7.05882, 15.94118, 6, 8.05882),
            Block.makeCuboidShape(14.94118, 11, 7.05882, 15.94118, 16, 8.05882),
            Block.makeCuboidShape(13.94118, 0, 15.05882, 15.94118, 16, 16.05882),
            Block.makeCuboidShape(-0.05882000000000076, 0, 15.05882, 1.9411799999999992, 16, 16.05882),
            Block.makeCuboidShape(-0.05882000000000076, 0, 0.05882000000000076, 1.9411799999999992, 16, 1.0588200000000008),
            Block.makeCuboidShape(-0.05882000000000076, 0, 15.05882, 1.9411799999999992, 16, 16.05882)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();



    private static final VoxelShape SHAPE_N  = Stream.of(
            Block.makeCuboidShape(0.05882, 0, 13.94118, 1.05882, 16, 15.94118),
            Block.makeCuboidShape(14.05882, 0, 14.94118, 15.05882, 16, 15.94118),
            Block.makeCuboidShape(1.05882, 0, 14.94118, 2.05882, 16, 15.94118),
            Block.makeCuboidShape(13.05882, 0, 14.94118, 14.05882, 16, 15.94118),
            Block.makeCuboidShape(12.05882, 0, 14.94118, 13.05882, 16, 15.94118),
            Block.makeCuboidShape(2.05882, 0, 14.94118, 3.05882, 16, 15.94118),
            Block.makeCuboidShape(3.05882, 0, 14.94118, 4.05882, 16, 15.94118),
            Block.makeCuboidShape(5.05882, 0, 13.94118, 6.05882, 16, 15.94118),
            Block.makeCuboidShape(10.05882, 0, 13.94118, 11.05882, 16, 15.94118),
            Block.makeCuboidShape(8.05882, 0, 14.94118, 9.05882, 6, 15.94118),
            Block.makeCuboidShape(8.05882, 11, 14.94118, 9.05882, 16, 15.94118),
            Block.makeCuboidShape(4.05882, 0, 14.94118, 5.05882, 16, 15.94118),
            Block.makeCuboidShape(11.05882, 0, 14.94118, 12.05882, 16, 15.94118),
            Block.makeCuboidShape(9.05882, 0, 14.94118, 10.05882, 16, 15.94118),
            Block.makeCuboidShape(6.05882, 0, 14.94118, 7.05882, 16, 15.94118),
            Block.makeCuboidShape(7.05882, 0, 14.94118, 8.05882, 6, 15.94118),
            Block.makeCuboidShape(7.05882, 11, 14.94118, 8.05882, 16, 15.94118),
            Block.makeCuboidShape(15.05882, 0, 13.94118, 16.05882, 16, 15.94118),
            Block.makeCuboidShape(15.05882, 0, -0.05882000000000076, 16.05882, 16, 1.9411799999999992),
            Block.makeCuboidShape(0.05882000000000076, 0, -0.05882000000000076, 1.0588200000000008, 16, 1.9411799999999992)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    public Hoarding(Properties properties) {
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