package com.nuget.themedievalmod.core.utill;

import com.nuget.themedievalmod.MedievalMod;
import com.nuget.themedievalmod.client.screen.AnvilScreen;
import com.nuget.themedievalmod.client.ter.AnvilTileEntityRenderer;
import com.nuget.themedievalmod.core.MedievalGroup;
import com.nuget.themedievalmod.core.init.BlockInit;
import com.nuget.themedievalmod.core.init.ContainerTypesInit;

import com.nuget.themedievalmod.core.init.TileEntityTypesInit;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = MedievalMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		ScreenManager.registerFactory(ContainerTypesInit.SMITHY_ANVIL_CONTAINER_TYPE.get(), AnvilScreen::new);
		ClientRegistry.bindTileEntityRenderer(TileEntityTypesInit.SMITHY_ANVIL_TILE_ENTITY_TYPE.get(), AnvilTileEntityRenderer::new);
	}
/*	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)
				.forEach(block -> {
					final Item.Properties properties = new Item.Properties().group(MedievalGroup.MEDIEVAL_BLOCKS);
					final BlockItem blockItem = new BlockItem(block, properties);
					blockItem.setRegistryName(block.getRegistryName());
					registry.register(blockItem);
				});
	}*/


}




