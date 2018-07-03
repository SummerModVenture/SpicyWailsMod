package com.wailord444.wailsmod.util.handlers;

import com.wailord444.wailsmod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler
{
    public static SoundEvent ONIT, GOTEM_ONIT, LONG_ONIT ,HUGE;

    public static void registerSounds()
    {
        ONIT = registerSound("entity.brewer.ambient");
        GOTEM_ONIT = registerSound("entity.brewer.hurt");
        LONG_ONIT = registerSound("entity.brewer.death");
    }

    private static SoundEvent registerSound(String name)
    {
        ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
