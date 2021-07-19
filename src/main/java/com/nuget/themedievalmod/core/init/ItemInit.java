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
    //PARTS
    public static final RegistryObject<Item> EXAMPLE_PART = ITEMS.register("example_part",
            () -> new Item(new Item.Properties().group(MedievalGroup.MEDIEVAL_WEAPONS_PARTS)));
    public static final RegistryObject<Item> EXAMPLE_WEAPON = ITEMS.register("example_weapon",
            () -> new Item(new Item.Properties().group(MedievalGroup.MEDIEVAL_WEAPONS)));
    public static final RegistryObject<WarHorn> WAR_HORN = ITEMS.register("war_horn",
            () -> new WarHorn(new Item.Properties().group(MedievalGroup.MEDIEVAL_MISCS)));
    //BLOCK ITEMS
    public static final RegistryObject<BlockItem> SHOOTING_HOLE= ITEMS.register("shooting_hole",
            () -> new BlockItem(BlockInit.SHOOTING_HOLE.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
    public static final RegistryObject<BlockItem> WALL_BLOCK= ITEMS.register("wall_block",
            () -> new BlockItem(BlockInit.WALL_BLOCK.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
    public static final RegistryObject<BlockItem> BATTLEMENTS= ITEMS.register("battlements",
            () -> new BlockItem(BlockInit.BATTLEMENTS.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));
    public static final RegistryObject<BlockItem> WALL_BLOCK_CORNER= ITEMS.register("wall_block_corner",
            () -> new BlockItem(BlockInit.WALL_BLOCK_CORNER.get(),new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS)));

    /*public static final RegistryObject<WarHorn> WARHORN = ITEMS.register("warhorn",
            () -> new WarHorn(new Item.Properties().tab(ItemGroup.TAB_FOOD).rarity(Rarity.EPIC).isImmuneToFire()));*/
}
