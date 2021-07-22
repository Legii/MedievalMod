package com.nuget.themedievalmod.core.init;

import com.nuget.themedievalmod.MedievalMod;
import com.nuget.themedievalmod.common.items.WarHorn;
import com.nuget.themedievalmod.core.MedievalGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            MedievalMod.MOD_ID);


    public static final RegistryObject<Item> TEST = ITEMS.register("test",
            () -> new Item(new Item.Properties().group(MedievalGroup.MEDIEVAL_MISCS)));
   //LOGS
   public static final RegistryObject<Item> OAK_LONG_LOG = ITEMS.register("oak_long_log",
           () -> new Item(new Item.Properties().group(MedievalGroup.MEDIEVAL_MATERIALS)));
    public static final RegistryObject<Item> SPRUCE_LONG_LOG = ITEMS.register("spruce_long_log",
            () -> new Item(new Item.Properties().group(MedievalGroup.MEDIEVAL_MATERIALS)));
    public static final RegistryObject<Item> BIRCH_LONG_LOG = ITEMS.register("birch_long_log",
            () -> new Item(new Item.Properties().group(MedievalGroup.MEDIEVAL_MATERIALS)));
    public static final RegistryObject<Item> ACACIA_LONG_LOG = ITEMS.register("acacia_long_log",
            () -> new Item(new Item.Properties().group(MedievalGroup.MEDIEVAL_MATERIALS)));
    public static final RegistryObject<Item> JUNGLE_LONG_LOG = ITEMS.register("jungle_long_log",
            () -> new Item(new Item.Properties().group(MedievalGroup.MEDIEVAL_MATERIALS)));
    public static final RegistryObject<Item> DARK_OAK_LONG_LOG = ITEMS.register("dark_oak_long_log",
            () -> new Item(new Item.Properties().group(MedievalGroup.MEDIEVAL_MATERIALS)));
    //Wall Floor
    public static final RegistryObject<BlockItem> OAK_WALL_FlOOR= ITEMS.register("oak_wall_floor",
            () -> new BlockItem(BlockInit.OAK_WALL_FLOOR.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
 public static final RegistryObject<BlockItem> SPRUCE_WALL_FlOOR= ITEMS.register("spruce_wall_floor",
         () -> new BlockItem(BlockInit.SPRUCE_WALL_FLOOR.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
    public static final RegistryObject<BlockItem> ACACIA_WALL_FlOOR= ITEMS.register("acacia_wall_floor",
            () -> new BlockItem(BlockInit.ACACIA_WALL_FLOOR.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
    public static final RegistryObject<BlockItem> BIRCH_WALL_FlOOR= ITEMS.register("birch_wall_floor",
            () -> new BlockItem(BlockInit.BIRCH_WALL_FLOOR.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
    public static final RegistryObject<BlockItem> JUNGLE_WALL_FlOOR= ITEMS.register("jungle_wall_floor",
            () -> new BlockItem(BlockInit.JUNGLE_WALL_FLOOR.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
    public static final RegistryObject<BlockItem> DARK_OAK_WALL_FlOOR= ITEMS.register("dark_oak_wall_floor",
            () -> new BlockItem(BlockInit.DARK_OAK_WALL_FLOOR.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
    //PARTS
    public static final RegistryObject<Item> EXAMPLE_PART = ITEMS.register("example_part",
            () -> new Item(new Item.Properties().group(MedievalGroup.MEDIEVAL_WEAPONS_PARTS)));
    public static final RegistryObject<Item> EXAMPLE_WEAPON = ITEMS.register("example_weapon",
            () -> new Item(new Item.Properties().group(MedievalGroup.MEDIEVAL_WEAPONS)));
    public static final RegistryObject<WarHorn> WAR_HORN = ITEMS.register("war_horn",
            () -> new WarHorn(new Item.Properties().group(MedievalGroup.MEDIEVAL_MISCS)));
    public static final RegistryObject<Item> ANVIL = ITEMS.register("anvil",
            () -> new Item(new Item.Properties().maxStackSize(1).group(MedievalGroup.MEDIEVAL_MATERIALS)));
    //BLOCK ITEMS
    public static final RegistryObject<BlockItem> SHOOTING_HOLE= ITEMS.register("shooting_hole",
            () -> new BlockItem(BlockInit.SHOOTING_HOLE.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
    public static final RegistryObject<BlockItem> SANDSTONE_SHOOTING_HOLE= ITEMS.register("sandstone_shooting_hole",
            () -> new BlockItem(BlockInit.SANDSTONE_SHOOTING_HOLE.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
    public static final RegistryObject<BlockItem> WALL_BLOCK= ITEMS.register("wall_block",
            () -> new BlockItem(BlockInit.WALL_BLOCK.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
    public static final RegistryObject<BlockItem> SANDSTONE_WALL_BLOCK= ITEMS.register("sandstone_wall_block",
            () -> new BlockItem(BlockInit.SANDSTONE_WALL_BLOCK.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));

    public static final RegistryObject<BlockItem> WALL_BLOCK_CORNER= ITEMS.register("wall_block_corner",
            () -> new BlockItem(BlockInit.WALL_BLOCK_CORNER.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
    public static final RegistryObject<BlockItem> BATTLEMENTS= ITEMS.register("battlements",
            () -> new BlockItem(BlockInit.BATTLEMENTS.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
    public static final RegistryObject<BlockItem> SANDSTONE_BATTLEMENTS= ITEMS.register("sandstone_battlements",
            () -> new BlockItem(BlockInit.SANDSTONE_BATTLEMENTS.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
    public static final RegistryObject<BlockItem> SANDSTONE_WALL_BLOCK_CORNER= ITEMS.register("sandstone_wall_block_corner",
            () -> new BlockItem(BlockInit.SANDSTONE_WALL_BLOCK_CORNER.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));

    public static final RegistryObject<BlockItem> SMITHY_ANVIL= ITEMS.register("smithy_anvil",
            () -> new BlockItem(BlockInit.SMITHY_ANVIL.get(),new Item.Properties().maxStackSize(1).group(MedievalGroup.MEDIEVAL_WORKBENCHES)));

    /*public static final RegistryObject<WarHorn> WARHORN = ITEMS.register("warhorn",
            () -> new WarHorn(new Item.Properties().tab(ItemGroup.TAB_FOOD).rarity(Rarity.EPIC).isImmuneToFire()));*/
}
