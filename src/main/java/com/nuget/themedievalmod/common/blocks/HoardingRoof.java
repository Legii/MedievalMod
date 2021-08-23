package com.nuget.themedievalmod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class HoardingRoof extends RotableBlock {
    public HoardingRoof() {
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(2,2)
                .harvestTool(ToolType.AXE)
                .harvestLevel(0)
                .sound(SoundType.WOOD));
    }



    private static final VoxelShape SHAPE_W =Stream.of(
            Block.makeCuboidShape(4, 14, 0, 6, 16, 1),
            Block.makeCuboidShape(2, 14, 15, 6, 16, 16),
            Block.makeCuboidShape(2, 15, 1, 5, 16, 2),
            Block.makeCuboidShape(2, 15, 14, 5, 16, 15),
            Block.makeCuboidShape(2, 15, 2, 5, 16, 3),
            Block.makeCuboidShape(2, 15, 3, 5, 16, 4),
            Block.makeCuboidShape(2, 15, 13, 5, 16, 14),
            Block.makeCuboidShape(2, 15, 12, 5, 16, 13),
            Block.makeCuboidShape(2, 14, 10, 6, 16, 11),
            Block.makeCuboidShape(2, 14, 5, 5, 16, 6),
            Block.makeCuboidShape(14, 0, 15, 16, 12, 16),
            Block.makeCuboidShape(14, 0, 0, 16, 12, 1),
            Block.makeCuboidShape(2, 0, 0, 2, 14, 1),
            Block.makeCuboidShape(14, 0, 5, 16, 12, 6),
            Block.makeCuboidShape(15, 0, 11, 16, 13, 12),
            Block.makeCuboidShape(5, 14, 8, 10, 15, 9),
            Block.makeCuboidShape(5, 14, 9, 10, 15, 10),
            Block.makeCuboidShape(5, 14, 6, 10, 15, 7),
            Block.makeCuboidShape(5, 14, 4, 10, 15, 5),
            Block.makeCuboidShape(10, 13, 8, 15, 14, 9),
            Block.makeCuboidShape(10, 13, 9, 15, 14, 10),
            Block.makeCuboidShape(10, 13, 6, 15, 14, 7),
            Block.makeCuboidShape(10, 13, 4, 15, 14, 5),
            Block.makeCuboidShape(10, 13, 11, 15, 14, 12),
            Block.makeCuboidShape(10, 13, 7, 15, 14, 8),
            Block.makeCuboidShape(10, 12, 5, 16, 14, 6),
            Block.makeCuboidShape(10, 12, 10, 16, 14, 11),
            Block.makeCuboidShape(10, 13, 12, 15, 14, 13),
            Block.makeCuboidShape(10, 13, 13, 15, 14, 14),
            Block.makeCuboidShape(10, 13, 3, 15, 14, 4),
            Block.makeCuboidShape(10, 13, 2, 15, 14, 3),
            Block.makeCuboidShape(10, 13, 14, 15, 14, 15),
            Block.makeCuboidShape(10, 13, 1, 15, 14, 2),
            Block.makeCuboidShape(11, 12, 15, 16, 14, 16),
            Block.makeCuboidShape(11, 12, 0, 16, 14, 1),
            Block.makeCuboidShape(5, 14, 11, 10, 15, 12),
            Block.makeCuboidShape(5, 14, 7, 10, 15, 8),
            Block.makeCuboidShape(5, 13, 5, 11, 15, 6),
            Block.makeCuboidShape(5, 13, 10, 11, 15, 11),
            Block.makeCuboidShape(5, 14, 12, 10, 15, 13),
            Block.makeCuboidShape(5, 14, 13, 10, 15, 14),
            Block.makeCuboidShape(5, 14, 3, 10, 15, 4),
            Block.makeCuboidShape(5, 14, 2, 10, 15, 3),
            Block.makeCuboidShape(5, 14, 14, 10, 15, 15),
            Block.makeCuboidShape(5, 14, 1, 10, 15, 2),
            Block.makeCuboidShape(6, 13, 15, 11, 15, 16),
            Block.makeCuboidShape(6, 13, 0, 11, 15, 1),
            Block.makeCuboidShape(15, 0, 1, 16, 13, 2),
            Block.makeCuboidShape(15, 0, 12, 16, 13, 13),
            Block.makeCuboidShape(15, 0, 2, 16, 13, 3),
            Block.makeCuboidShape(15, 0, 13, 16, 13, 14),
            Block.makeCuboidShape(15, 0, 3, 16, 13, 4),
            Block.makeCuboidShape(15, 0, 9, 16, 13, 10),
            Block.makeCuboidShape(15, 0, 7, 16, 13, 8),
            Block.makeCuboidShape(15, 0, 6, 16, 13, 7),
            Block.makeCuboidShape(15, 0, 8, 16, 13, 9),
            Block.makeCuboidShape(15, 0, 4, 16, 13, 5),
            Block.makeCuboidShape(15, 0, 14, 16, 13, 15),
            Block.makeCuboidShape(14, 0, 10, 16, 12, 11),
            Block.makeCuboidShape(2, 0, 15, 2, 14, 16),
            Block.makeCuboidShape(2, 15, 7, 5, 16, 8),
            Block.makeCuboidShape(2, 15, 11, 5, 16, 12),
            Block.makeCuboidShape(2, 15, 4, 5, 16, 5),
            Block.makeCuboidShape(2, 15, 6, 6, 16, 7),
            Block.makeCuboidShape(2, 15, 9, 5, 16, 10),
            Block.makeCuboidShape(2, 15, 8, 5, 16, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(0, 14, 10, 1, 16, 16),
            Block.makeCuboidShape(15, 14, 10, 16, 16, 16),
            Block.makeCuboidShape(1, 15, 11, 2, 16, 16),
            Block.makeCuboidShape(14, 15, 11, 15, 16, 16),
            Block.makeCuboidShape(2, 15, 11, 3, 16, 16),
            Block.makeCuboidShape(3, 15, 11, 4, 16, 16),
            Block.makeCuboidShape(13, 15, 11, 14, 16, 16),
            Block.makeCuboidShape(12, 15, 11, 13, 16, 16),
            Block.makeCuboidShape(10, 14, 10, 11, 16, 16),
            Block.makeCuboidShape(5, 14, 11, 6, 16, 16),
            Block.makeCuboidShape(15, 0, 0, 16, 12, 2),
            Block.makeCuboidShape(0, 0, 0, 1, 12, 2),
            Block.makeCuboidShape(0, 0, 14, 1, 14, 16),
            Block.makeCuboidShape(5, 0, 0, 6, 12, 2),
            Block.makeCuboidShape(11, 0, 0, 12, 13, 1),
            Block.makeCuboidShape(8, 14, 6, 9, 15, 11),
            Block.makeCuboidShape(9, 14, 6, 10, 15, 11),
            Block.makeCuboidShape(6, 14, 6, 7, 15, 11),
            Block.makeCuboidShape(4, 14, 6, 5, 15, 11),
            Block.makeCuboidShape(8, 13, 1, 9, 14, 6),
            Block.makeCuboidShape(9, 13, 1, 10, 14, 6),
            Block.makeCuboidShape(6, 13, 1, 7, 14, 6),
            Block.makeCuboidShape(4, 13, 1, 5, 14, 6),
            Block.makeCuboidShape(11, 13, 1, 12, 14, 6),
            Block.makeCuboidShape(7, 13, 1, 8, 14, 6),
            Block.makeCuboidShape(5, 12, 0, 6, 14, 6),
            Block.makeCuboidShape(10, 12, 0, 11, 14, 6),
            Block.makeCuboidShape(12, 13, 1, 13, 14, 6),
            Block.makeCuboidShape(13, 13, 1, 14, 14, 6),
            Block.makeCuboidShape(3, 13, 1, 4, 14, 6),
            Block.makeCuboidShape(2, 13, 1, 3, 14, 6),
            Block.makeCuboidShape(14, 13, 1, 15, 14, 6),
            Block.makeCuboidShape(1, 13, 1, 2, 14, 6),
            Block.makeCuboidShape(15, 12, 0, 16, 14, 5),
            Block.makeCuboidShape(0, 12, 0, 1, 14, 5),
            Block.makeCuboidShape(11, 14, 6, 12, 15, 11),
            Block.makeCuboidShape(7, 14, 6, 8, 15, 11),
            Block.makeCuboidShape(5, 13, 5, 6, 15, 11),
            Block.makeCuboidShape(10, 13, 5, 11, 15, 11),
            Block.makeCuboidShape(12, 14, 6, 13, 15, 11),
            Block.makeCuboidShape(13, 14, 6, 14, 15, 11),
            Block.makeCuboidShape(3, 14, 6, 4, 15, 11),
            Block.makeCuboidShape(2, 14, 6, 3, 15, 11),
            Block.makeCuboidShape(14, 14, 6, 15, 15, 11),
            Block.makeCuboidShape(1, 14, 6, 2, 15, 11),
            Block.makeCuboidShape(15, 13, 5, 16, 15, 10),
            Block.makeCuboidShape(0, 13, 5, 1, 15, 10),
            Block.makeCuboidShape(1, 0, 0, 2, 13, 1),
            Block.makeCuboidShape(12, 0, 0, 13, 13, 1),
            Block.makeCuboidShape(2, 0, 0, 3, 13, 1),
            Block.makeCuboidShape(13, 0, 0, 14, 13, 1),
            Block.makeCuboidShape(3, 0, 0, 4, 13, 1),
            Block.makeCuboidShape(9, 0, 0, 10, 13, 1),
            Block.makeCuboidShape(7, 0, 0, 8, 13, 1),
            Block.makeCuboidShape(6, 0, 0, 7, 13, 1),
            Block.makeCuboidShape(8, 0, 0, 9, 13, 1),
            Block.makeCuboidShape(4, 0, 0, 5, 13, 1),
            Block.makeCuboidShape(14, 0, 0, 15, 13, 1),
            Block.makeCuboidShape(10, 0, 0, 11, 12, 2),
            Block.makeCuboidShape(15, 0, 14, 16, 14, 16),
            Block.makeCuboidShape(7, 15, 11, 8, 16, 16),
            Block.makeCuboidShape(11, 15, 11, 12, 16, 16),
            Block.makeCuboidShape(4, 15, 11, 5, 16, 16),
            Block.makeCuboidShape(6, 15, 10, 7, 16, 16),
            Block.makeCuboidShape(9, 15, 11, 10, 16, 16),
            Block.makeCuboidShape(8, 15, 11, 9, 16, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(9.666666666666666, 14, 15, 15.666666666666664, 16, 16),
            Block.makeCuboidShape(9.666666666666666, 14, 0, 15.666666666666664, 16, 1),
            Block.makeCuboidShape(10.666666666666666, 15, 14, 15.666666666666664, 16, 15),
            Block.makeCuboidShape(10.666666666666666, 15, 1, 15.666666666666664, 16, 1.9999999999999991),
            Block.makeCuboidShape(10.666666666666666, 15, 13, 15.666666666666664, 16, 14),
            Block.makeCuboidShape(10.666666666666666, 15, 12, 15.666666666666664, 16, 13),
            Block.makeCuboidShape(10.666666666666666, 15, 1.9999999999999991, 15.666666666666664, 16, 2.999999999999999),
            Block.makeCuboidShape(10.666666666666666, 15, 2.999999999999999, 15.666666666666664, 16, 3.999999999999999),
            Block.makeCuboidShape(9.666666666666666, 14, 4.999999999999999, 15.666666666666664, 16, 5.999999999999999),
            Block.makeCuboidShape(10.666666666666666, 14, 10, 15.666666666666664, 16, 11),
            Block.makeCuboidShape(-0.3333333333333357, 0, 0, 1.6666666666666643, 12, 1),
            Block.makeCuboidShape(-0.3333333333333357, 0, 15, 1.6666666666666643, 12, 16),
            Block.makeCuboidShape(13.666666666666666, 0, 15, 15.666666666666664, 14, 16),
            Block.makeCuboidShape(-0.3333333333333357, 0, 10, 1.6666666666666643, 12, 11),
            Block.makeCuboidShape(-0.3333333333333357, 0, 3.999999999999999, 0.6666666666666643, 13, 4.999999999999999),
            Block.makeCuboidShape(5.666666666666664, 14, 6.999999999999999, 10.666666666666666, 15, 8),
            Block.makeCuboidShape(5.666666666666664, 14, 5.999999999999999, 10.666666666666666, 15, 6.999999999999999),
            Block.makeCuboidShape(5.666666666666664, 14, 9, 10.666666666666666, 15, 10),
            Block.makeCuboidShape(5.666666666666664, 14, 11, 10.666666666666666, 15, 12),
            Block.makeCuboidShape(0.6666666666666643, 13, 6.999999999999999, 5.666666666666664, 14, 8),
            Block.makeCuboidShape(0.6666666666666643, 13, 5.999999999999999, 5.666666666666664, 14, 6.999999999999999),
            Block.makeCuboidShape(0.6666666666666643, 13, 9, 5.666666666666664, 14, 10),
            Block.makeCuboidShape(0.6666666666666643, 13, 11, 5.666666666666664, 14, 12),
            Block.makeCuboidShape(0.6666666666666643, 13, 3.999999999999999, 5.666666666666664, 14, 4.999999999999999),
            Block.makeCuboidShape(0.6666666666666643, 13, 8, 5.666666666666664, 14, 9),
            Block.makeCuboidShape(-0.3333333333333357, 12, 10, 5.666666666666664, 14, 11),
            Block.makeCuboidShape(-0.3333333333333357, 12, 4.999999999999999, 5.666666666666664, 14, 5.999999999999999),
            Block.makeCuboidShape(0.6666666666666643, 13, 2.999999999999999, 5.666666666666664, 14, 3.999999999999999),
            Block.makeCuboidShape(0.6666666666666643, 13, 1.9999999999999991, 5.666666666666664, 14, 2.999999999999999),
            Block.makeCuboidShape(0.6666666666666643, 13, 12, 5.666666666666664, 14, 13),
            Block.makeCuboidShape(0.6666666666666643, 13, 13, 5.666666666666664, 14, 14),
            Block.makeCuboidShape(0.6666666666666643, 13, 1, 5.666666666666664, 14, 1.9999999999999991),
            Block.makeCuboidShape(0.6666666666666643, 13, 14, 5.666666666666664, 14, 15),
            Block.makeCuboidShape(-0.3333333333333357, 12, 0, 4.666666666666664, 14, 1),
            Block.makeCuboidShape(-0.3333333333333357, 12, 15, 4.666666666666664, 14, 16),
            Block.makeCuboidShape(5.666666666666664, 14, 3.999999999999999, 10.666666666666666, 15, 4.999999999999999),
            Block.makeCuboidShape(5.666666666666664, 14, 8, 10.666666666666666, 15, 9),
            Block.makeCuboidShape(4.666666666666664, 13, 10, 10.666666666666666, 15, 11),
            Block.makeCuboidShape(4.666666666666664, 13, 4.999999999999999, 10.666666666666666, 15, 5.999999999999999),
            Block.makeCuboidShape(5.666666666666664, 14, 2.999999999999999, 10.666666666666666, 15, 3.999999999999999),
            Block.makeCuboidShape(5.666666666666664, 14, 1.9999999999999991, 10.666666666666666, 15, 2.999999999999999),
            Block.makeCuboidShape(5.666666666666664, 14, 12, 10.666666666666666, 15, 13),
            Block.makeCuboidShape(5.666666666666664, 14, 13, 10.666666666666666, 15, 14),
            Block.makeCuboidShape(5.666666666666664, 14, 1, 10.666666666666666, 15, 1.9999999999999991),
            Block.makeCuboidShape(5.666666666666664, 14, 14, 10.666666666666666, 15, 15),
            Block.makeCuboidShape(4.666666666666664, 13, 0, 9.666666666666666, 15, 1),
            Block.makeCuboidShape(4.666666666666664, 13, 15, 9.666666666666666, 15, 16),
            Block.makeCuboidShape(-0.3333333333333357, 0, 14, 0.6666666666666643, 13, 15),
            Block.makeCuboidShape(-0.3333333333333357, 0, 2.999999999999999, 0.6666666666666643, 13, 3.999999999999999),
            Block.makeCuboidShape(-0.3333333333333357, 0, 13, 0.6666666666666643, 13, 14),
            Block.makeCuboidShape(-0.3333333333333357, 0, 1.9999999999999991, 0.6666666666666643, 13, 2.999999999999999),
            Block.makeCuboidShape(-0.3333333333333357, 0, 12, 0.6666666666666643, 13, 13),
            Block.makeCuboidShape(-0.3333333333333357, 0, 5.999999999999999, 0.6666666666666643, 13, 6.999999999999999),
            Block.makeCuboidShape(-0.3333333333333357, 0, 8, 0.6666666666666643, 13, 9),
            Block.makeCuboidShape(-0.3333333333333357, 0, 9, 0.6666666666666643, 13, 10),
            Block.makeCuboidShape(-0.3333333333333357, 0, 6.999999999999999, 0.6666666666666643, 13, 8),
            Block.makeCuboidShape(-0.3333333333333357, 0, 11, 0.6666666666666643, 13, 12),
            Block.makeCuboidShape(-0.3333333333333357, 0, 1, 0.6666666666666643, 13, 1.9999999999999991),
            Block.makeCuboidShape(-0.3333333333333357, 0, 4.999999999999999, 1.6666666666666643, 12, 5.999999999999999),
            Block.makeCuboidShape(13.666666666666666, 0, 0, 15.666666666666664, 14, 1),
            Block.makeCuboidShape(10.666666666666666, 15, 8, 15.666666666666664, 16, 9),
            Block.makeCuboidShape(10.666666666666666, 15, 3.999999999999999, 15.666666666666664, 16, 4.999999999999999),
            Block.makeCuboidShape(10.666666666666666, 15, 11, 15.666666666666664, 16, 12),
            Block.makeCuboidShape(9.666666666666666, 15, 9, 15.666666666666664, 16, 10),
            Block.makeCuboidShape(10.666666666666666, 15, 5.999999999999999, 15.666666666666664, 16, 6.999999999999999),
            Block.makeCuboidShape(10.666666666666666, 15, 6.999999999999999, 15.666666666666664, 16, 8)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();



    private static final VoxelShape SHAPE_N  = Stream.of(
            Block.makeCuboidShape(0, 14, 4, 1, 16, 6),
            Block.makeCuboidShape(15, 14, 2, 16, 16, 6),
            Block.makeCuboidShape(1, 15, 2, 2, 16, 5),
            Block.makeCuboidShape(14, 15, 2, 15, 16, 5),
            Block.makeCuboidShape(2, 15, 2, 3, 16, 5),
            Block.makeCuboidShape(3, 15, 2, 4, 16, 5),
            Block.makeCuboidShape(13, 15, 2, 14, 16, 5),
            Block.makeCuboidShape(12, 15, 2, 13, 16, 5),
            Block.makeCuboidShape(10, 14, 2, 11, 16, 6),
            Block.makeCuboidShape(5, 14,2, 6, 16, 5),
            Block.makeCuboidShape(15, 0, 14, 16, 12, 16),
            Block.makeCuboidShape(0, 0, 14, 1, 12, 16),
            Block.makeCuboidShape(0, 0, 2, 1, 14, 2),
            Block.makeCuboidShape(5, 0, 14, 6, 12, 16),
            Block.makeCuboidShape(11, 0, 15, 12, 13, 16),
            Block.makeCuboidShape(8, 14, 5, 9, 15, 10),
            Block.makeCuboidShape(9, 14,5, 10, 15, 10),
            Block.makeCuboidShape(6, 14, 5, 7, 15, 10),
            Block.makeCuboidShape(4, 14,5, 5, 15, 10),
            Block.makeCuboidShape(8, 13, 10, 9, 14, 15),
            Block.makeCuboidShape(9, 13, 10, 10, 14, 15),
            Block.makeCuboidShape(6, 13, 10, 7, 14, 15),
            Block.makeCuboidShape(4, 13, 10, 5, 14, 15),
            Block.makeCuboidShape(11, 13, 10, 12, 14, 15),
            Block.makeCuboidShape(7, 13, 10, 8, 14, 15),
            Block.makeCuboidShape(5, 12, 10, 6, 14, 16),
            Block.makeCuboidShape(10, 12, 10, 11, 14, 16),
            Block.makeCuboidShape(12, 13, 10, 13, 14, 15),
            Block.makeCuboidShape(13, 13, 10, 14, 14, 15),
            Block.makeCuboidShape(3, 13, 10, 4, 14, 15),
            Block.makeCuboidShape(2, 13, 10, 3, 14, 15),
            Block.makeCuboidShape(14, 13, 10, 15, 14, 15),
            Block.makeCuboidShape(1, 13, 10, 2, 14, 15),
            Block.makeCuboidShape(15, 12, 11, 16, 14, 16),
            Block.makeCuboidShape(0, 12, 11, 1, 14, 16),
            Block.makeCuboidShape(11, 14,5, 12, 15, 10),
            Block.makeCuboidShape(7, 14, 5, 8, 15, 10),
            Block.makeCuboidShape(5, 13, 5, 6, 15, 11),
            Block.makeCuboidShape(10, 13, 5, 11, 15, 11),
            Block.makeCuboidShape(12, 14, 5, 13, 15, 10),
            Block.makeCuboidShape(13, 14, 5, 14, 15, 10),
            Block.makeCuboidShape(3, 14, 5, 4, 15, 10),
            Block.makeCuboidShape(2, 14, 5, 3, 15, 10),
            Block.makeCuboidShape(14, 14, 5, 15, 15, 10),
            Block.makeCuboidShape(1, 14, 5, 2, 15, 10),
            Block.makeCuboidShape(15, 13, 6, 16, 15, 11),
            Block.makeCuboidShape(0, 13, 6, 1, 15, 11),
            Block.makeCuboidShape(1, 0, 15, 2, 13, 16),
            Block.makeCuboidShape(12, 0, 15, 13, 13, 16),
            Block.makeCuboidShape(2, 0, 15, 3, 13, 16),
            Block.makeCuboidShape(13, 0, 15, 14, 13, 16),
            Block.makeCuboidShape(3, 0, 15, 4, 13, 16),
            Block.makeCuboidShape(9, 0, 15, 10, 13, 16),
            Block.makeCuboidShape(7, 0, 15, 8, 13, 16),
            Block.makeCuboidShape(6, 0, 15, 7, 13, 16),
            Block.makeCuboidShape(8, 0, 15, 9, 13, 16),
            Block.makeCuboidShape(4, 0, 15, 5, 13, 16),
            Block.makeCuboidShape(14, 0, 15, 15, 13, 16),
            Block.makeCuboidShape(10, 0, 14, 11, 12, 16),
            Block.makeCuboidShape(15, 0, 2, 16, 14, 2),
            Block.makeCuboidShape(7, 15, 2, 8, 16, 5),
            Block.makeCuboidShape(11, 15, 2, 12, 16, 5),
            Block.makeCuboidShape(4, 15, 2, 5, 16, 5),
            Block.makeCuboidShape(6, 15, 2, 7, 16, 6),
            Block.makeCuboidShape(9, 15, 2, 10, 16, 5),
            Block.makeCuboidShape(8, 15, 2, 9, 16, 5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    public HoardingRoof(Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        System.out.println(state.get(FACING));


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