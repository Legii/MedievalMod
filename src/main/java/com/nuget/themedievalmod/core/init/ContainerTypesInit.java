package com.nuget.themedievalmod.core.init;

import com.nuget.themedievalmod.MedievalMod;
import com.nuget.themedievalmod.common.container.AnvilContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypesInit {

    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister
            .create(ForgeRegistries.CONTAINERS, MedievalMod.MOD_ID);

    public static final RegistryObject<ContainerType<AnvilContainer>> SMITHY_ANVIL_CONTAINER_TYPE = CONTAINER_TYPES
            .register("display_case", () -> IForgeContainerType.create(AnvilContainer::new));


}
