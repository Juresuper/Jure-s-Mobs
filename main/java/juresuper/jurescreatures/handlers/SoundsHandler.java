package juresuper.jurescreatures.handlers;

import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import juresuper.jurescreatures.Main;
import net.minecraft.util.ResourceLocation;

public class SoundsHandler
{
	public static SoundEvent ENTITIES_SNOW_WOLF_MINION_AMBIENT;
	
	public static void registerSounds()
	{
		ENTITIES_SNOW_WOLF_MINION_AMBIENT = registerSound("entities.snowwolfminion.ambient");
	}
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Main.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}

}
