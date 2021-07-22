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

    public static final RegistryObject<ShootingHole>SHOOTING_HOLE = BLOCKS.register("shooting_hole",() -> new ShootingHole());
    public static final RegistryObject<ShootingHole>SANDSTONE_SHOOTING_HOLE = BLOCKS.register("sandstone_shooting_hole",() -> new ShootingHole());


    public static final RegistryObject<Battlements>BATTLEMENTS = BLOCKS.register("battlements",() -> new Battlements());
    public static final RegistryObject<Battlements>SANDSTONE_BATTLEMENTS = BLOCKS.register("sandstone_battlements",() -> new Battlements());
    //WALL BLOCK
    public static final RegistryObject<WallBlock>WALL_BLOCK = BLOCKS.register("wall_block",() -> new WallBlock());
    public static final RegistryObject<WallBlock>SANDSTONE_WALL_BLOCK = BLOCKS.register("sandstone_wall_block",() -> new WallBlock());
    //WALL CORNER
    public static final RegistryObject<WallBlockCorner>WALL_BLOCK_CORNER = BLOCKS.register("wall_block_corner",() -> new WallBlockCorner());
    public static final RegistryObject<WallBlockCorner>SANDSTONE_WALL_BLOCK_CORNER = BLOCKS.register("sandstone_wall_block_corner",() -> new WallBlockCorner());
    //WALL FLOORS
    public static final RegistryObject<WallFloor>OAK_WALL_FLOOR = BLOCKS.register("oak_wall_floor",() -> new WallFloor());
    public static final RegistryObject<WallFloor>SPRUCE_WALL_FLOOR = BLOCKS.register("spruce_wall_floor",() -> new WallFloor());
    public static final RegistryObject<WallFloor>ACACIA_WALL_FLOOR = BLOCKS.register("acacia_wall_floor",() -> new WallFloor());
    public static final RegistryObject<WallFloor>BIRCH_WALL_FLOOR = BLOCKS.register("birch_wall_floor",() -> new WallFloor());
    public static final RegistryObject<WallFloor>JUNGLE_WALL_FLOOR = BLOCKS.register("jungle_wall_floor",() -> new WallFloor());
    public static final RegistryObject<WallFloor>DARK_OAK_WALL_FLOOR = BLOCKS.register("dark_oak_wall_floor",() -> new WallFloor());
    public static final RegistryObject<AnvilBlock> SMITHY_ANVIL = BLOCKS.register("smithy_anvil", () -> new AnvilBlock());


}
