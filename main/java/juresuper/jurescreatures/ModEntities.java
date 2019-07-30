package juresuper.jurescreatures;

import juresuper.jurescreatures.entities.SnowWolfMinion.EntitySnowWolfMinion;
import juresuper.jurescreatures.entities.SnowWolfMinion.RenderSnowWolfMinion;
import juresuper.jurescreatures.entities.SnowWolfProtector.EntitySnowWolfProtector;
import juresuper.jurescreatures.entities.SnowWolfProtector.RenderSnowWolfProtector;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities 
{
	public static void init() {
		int id = 1;
		
		EntityRegistry.registerModEntity(new ResourceLocation(Main.MODID, "jurescreatures_snowwolfminion"), EntitySnowWolfMinion.class, "jurescreatures_snowwolfminion", id++,
                Main.instance, 64, 3, true, 0x5636095, 0x16777215);
		EntityRegistry.registerModEntity(new ResourceLocation(Main.MODID, "jurescreatures_snowwolfprotector"), EntitySnowWolfProtector.class, "jurescreatures_snowwolfprotector", id++,
                Main.instance, 64, 3, true, 0x5636095, 0x16777215);
		
	}
	@SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntitySnowWolfMinion.class, RenderSnowWolfMinion.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntitySnowWolfProtector.class, RenderSnowWolfProtector.FACTORY);

       
    }

}
