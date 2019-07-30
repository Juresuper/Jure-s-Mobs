package juresuper.jurescreatures.handlers;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class RegistryHandler 
{
	public static void InitRegistries()
	{
		SoundsHandler.registerSounds();
	}

}
