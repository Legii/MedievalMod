package com.nuget.themedievalmod.core.init;

import com.nuget.themedievalmod.MedievalMod;
import com.nuget.themedievalmod.common.tileentities.AnvilTileEntity;


import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypesInit {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister
            .create(ForgeRegistries.TILE_ENTITIES, MedievalMod.MOD_ID);



    public static final RegistryObject<TileEntityType<AnvilTileEntity>> SMITHY_ANVIL_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
            .register("display_case",
                    () -> TileEntityType.Builder.create(AnvilTileEntity::new, BlockInit.SMITHY_ANVIL.get()).build(null));

    public static final RegistryObject<TileEntityType<AnvilTileEntity>> WOODEN_GATE_TILE_ENTITY = TILE_ENTITY_TYPE
            .register("wooden_gate",
                    () -> TileEntityType.Builder.create(AnvilTileEntity::new, BlockInit.OAK_GATE.get()).build(null));

}




