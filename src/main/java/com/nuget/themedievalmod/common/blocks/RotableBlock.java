package com.nuget.themedievalmod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraftforge.common.property.Properties;
import java.util.stream.Stream;
import javax.annotation.Nullable;


public class RotableBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    private static final VoxelShape SHAPE_N = Stream.of(

            Block.makeCuboidShape(8, 1, 0, 15, 4, 1),
            Block.makeCuboidShape(12, 13, 0, 16, 16, 1),
            Block.makeCuboidShape(12, 5, 0, 16, 8, 1),
            Block.makeCuboidShape(0, 5, 0, 3, 8, 1),
            Block.makeCuboidShape(0, 13, 0, 3, 16, 1),
            Block.makeCuboidShape(4, 13, 0, 11, 16, 1),
            Block.makeCuboidShape(0, 9, 0, 7, 12, 1),
            Block.makeCuboidShape(0, 1, 0, 7, 4, 1),
            Block.makeCuboidShape(8, 9, 0, 15, 12, 1),
            Block.makeCuboidShape(4, 5, 0, 11, 8, 1),
            Block.makeCuboidShape(0, 0.01, 1, 16, 16.01, 15),
            Block.makeCuboidShape(8, 1, 15, 15, 4, 16),
            Block.makeCuboidShape(12, 13, 15, 16, 16, 16),
            Block.makeCuboidShape(12, 5, 15, 16, 8, 16),
            Block.makeCuboidShape(0, 5, 15, 3, 8, 16),
            Block.makeCuboidShape(0, 13, 15, 3, 16, 16),
            Block.makeCuboidShape(4, 13, 15, 11, 16, 16),
            Block.makeCuboidShape(0, 9, 15, 7, 12, 16),
            Block.makeCuboidShape(0, 1, 15, 7, 4, 16),
            Block.makeCuboidShape(8, 9, 15, 15, 12, 16),
            Block.makeCuboidShape(4, 5, 15, 11, 8, 16),
            Block.makeCuboidShape(0, 0, 0, 16, 0.01, 16)
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
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();


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
            ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

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
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();



















    public RotableBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING,Direction.NORTH));

    }

    @Override
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


    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }
    @SuppressWarnings("deprecation")
    @Override
    public BlockState rotate(BlockState state, IWorld world, BlockPos pos, Rotation direction) {
        return state.with(FACING,direction.rotate(state.get(FACING)));
    }


    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING,context.getPlacementHorizontalFacing().getOpposite());
    }

    @java.lang.Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder);
        builder.add(FACING);
    }

}
