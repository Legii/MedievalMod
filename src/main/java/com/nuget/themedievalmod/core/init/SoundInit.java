package com.nuget.themedievalmod.core.init;

import com.nuget.themedievalmod.MedievalMod;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MedievalMod.MOD_ID);
    public static final RegistryObject<SoundEvent> WARHORN_SOUND = SOUNDS.register("item.warhorn_sound",() -> new SoundEvent(new ResourceLocation(MedievalMod.MOD_ID,"item.warhorn_sound")));

}
