package com.nuget.themedievalmod.core.init;

import com.nuget.themedievalmod.MedievalMod;
import com.nuget.themedievalmod.common.blocks.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MedievalMod.MOD_ID);
    public static final RegistryObject<Block>SHOOTING_HOLE = BLOCKS.register("shooting_hole",() -> new ShootingHole(AbstractBlock.Properties.create(Material.ROCK)
            .hardnessAndResistance(3,6)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(1)
            .sound(SoundType.STONE)));


    public static final RegistryObject<Battlements>BATTLEMENTS = BLOCKS.register("battlements",() -> new Battlements(AbstractBlock.Properties.create(Material.ROCK)
            .hardnessAndResistance(3,4)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(1)
            .sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock>WALL_BLOCK = BLOCKS.register("wall_block",() -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK)
            .hardnessAndResistance(3,4)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(1)
            .sound(SoundType.STONE)));
    public static final RegistryObject<WallBlockCorner>WALL_BLOCK_CORNER = BLOCKS.register("wall_block_corner",() -> new WallBlockCorner(AbstractBlock.Properties.create(Material.ROCK)
            .hardnessAndResistance(3,4)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(1)
            .sound(SoundType.STONE)));

}
