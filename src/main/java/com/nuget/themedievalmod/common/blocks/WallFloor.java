package com.nuget.themedievalmod.common.blocks;

import com.nuget.themedievalmod.common.container.AnvilContainer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class WallFloor extends RotableBlock {
    public WallFloor() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(2,2)
                .harvestTool(ToolType.AXE)
                .harvestLevel(0)
                .sound(SoundType.WOOD));
    }
   private static VoxelShape vs = Stream.of(
            Block.makeCuboidShape(0.42428545709782384, 14, -0.834285457097824, 16.424285457097824, 16, 0.16571454290217602),
            Block.makeCuboidShape(-1.1865668760521153, 10.47333602888909, -0.6842854570978236, 15.813433123947885, 11.47333602888909, 0.06571454290217638),
            Block.makeCuboidShape(-1.1865668760521153, 10.47333602888909, -0.6842854570978236, 15.813433123947885, 11.47333602888909, 0.06571454290217638),
            Block.makeCuboidShape(-1.1865668760521153, 10.47333602888909, 14.315714542902175, 15.813433123947885, 11.47333602888909, 15.065714542902175),
            Block.makeCuboidShape(-1.1865668760521153, 10.47333602888909, 9.315714542902175, 15.813433123947885, 11.47333602888909, 10.065714542902175),
            Block.makeCuboidShape(-1.1865668760521153, 10.47333602888909, 4.315714542902175, 15.813433123947885, 11.47333602888909, 5.065714542902175),
            Block.makeCuboidShape(0.42428545709782384, 14, 14.165714542902176, 16.424285457097824, 16, 15.165714542902176),
            Block.makeCuboidShape(0.42428545709782384, 15, 0.16571454290217602, 16.424285457097824, 16, 1.165714542902176),
            Block.makeCuboidShape(0.42428545709782384, 15, 13.165714542902176, 16.424285457097824, 16, 14.165714542902176),
            Block.makeCuboidShape(0.42428545709782384, 15, 1.165714542902176, 16.424285457097824, 16, 2.165714542902176),
            Block.makeCuboidShape(0.42428545709782384, 15, 2.165714542902176, 16.424285457097824, 16, 3.165714542902176),
            Block.makeCuboidShape(0.42428545709782384, 15, 12.165714542902176, 16.424285457097824, 16, 13.165714542902176),
            Block.makeCuboidShape(0.42428545709782384, 15, 11.165714542902176, 16.424285457097824, 16, 12.165714542902176),
            Block.makeCuboidShape(0.42428545709782384, 14, 9.165714542902176, 16.424285457097824, 16, 10.165714542902176),
            Block.makeCuboidShape(0.42428545709782384, 14, 4.165714542902176, 16.424285457097824, 16, 5.165714542902176),
            Block.makeCuboidShape(0.42428545709782384, 15, 6.165714542902176, 16.424285457097824, 16, 7.165714542902176),
            Block.makeCuboidShape(0.42428545709782384, 15, 10.165714542902176, 16.424285457097824, 16, 11.165714542902176),
            Block.makeCuboidShape(0.42428545709782384, 15, 3.165714542902176, 16.424285457097824, 16, 4.165714542902176),
            Block.makeCuboidShape(0.42428545709782384, 15, 5.165714542902176, 16.424285457097824, 16, 6.165714542902176),
            Block.makeCuboidShape(0.42428545709782384, 15, 8.165714542902176, 16.424285457097824, 16, 9.165714542902176),
            Block.makeCuboidShape(0.42428545709782384, 15, 7.165714542902176, 16.424285457097824, 16, 8.165714542902176),
            Block.makeCuboidShape(1, 8, -1, 17, 9, 15)
            ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
    public WallFloor(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));

    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {

           return vs;

    }
}