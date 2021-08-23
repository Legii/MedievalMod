package com.nuget.themedievalmod.core;

import com.nuget.themedievalmod.core.init.BlockInit;
import com.nuget.themedievalmod.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MedievalGroup extends ItemGroup { private String label;
    public static final ItemGroup MEDIEVAL_MISCS = new MedievalGroup("themedievalmod_miscs");
    public static final ItemGroup MEDIEVAL_MATERIALS = new MedievalGroup("themedievalmod_materials");
    public static final ItemGroup MEDIEVAL_WEAPONS_PARTS = new MedievalGroup("themedievalmod_weapons_parts");
    public static final ItemGroup MEDIEVAL_WEAPONS = new MedievalGroup("themedievalmod_weapons");
    public static final ItemGroup MEDIEVAL_BLOCKS = new MedievalGroup("themedievalmod_blocks");
    public static final ItemGroup MEDIEVAL_WORKBENCHES = new MedievalGroup("themedievalmod_workbenches");

    public MedievalGroup( String label) {
        super(label);
        this.label = label;

    }


    @java.lang.Override
    public ItemStack createIcon() {
        switch(this.label)  {
           case "themedievalmod_blocks":
            return new ItemStack(BlockInit.WALL_BLOCK.get());
            case "themedievalmod_workbenches":
                return new ItemStack(ItemInit.SMITHY_ANVIL.get());

            default:
                return new ItemStack(ItemInit.TEST.get());

        }

    }
}
