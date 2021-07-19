package com.nuget.themedievalmod;


import com.nuget.themedievalmod.core.init.BlockInit;
import com.nuget.themedievalmod.core.init.SoundInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.nuget.themedievalmod.core.init.ItemInit;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MedievalMod.MOD_ID)
public class MedievalMod {



    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "themedievalmod";
   /* public static final ItemGroup themedievalmod_GROUP = new themedievalmodGroup("themedievalmodtab");*/

    public MedievalMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        SoundInit.SOUNDS.register(bus);
//        EntityTypeInit.ENTITY_TYPES.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
//        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
    /*public static class MedievalGroup extends ItemGroup {
        public MedievalGroup(String label) {
            super(label);
            System.out.print(label);
        }


        @Override
        public ItemStack makeIcon() {

            return ItemInit.TEST.get().getDefaultInstance();
        }


    }*/

}
