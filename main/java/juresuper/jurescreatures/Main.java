package juresuper.jurescreatures;



import org.apache.logging.log4j.Logger;

import juresuper.jurescreatures.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.MODVERSION, dependencies = "required-after:forge@[14.23.5.2768,)", useMetadata = true)

public class Main
{
    public static final String MODID = "jurescreatures";
    public static final String MODNAME = "Jure's Creatures";
    public static final String MODVERSION= "1.0";

    @SidedProxy(clientSide = "juresuper.jurescreatures.proxy.ClientProxy", serverSide = "juresuper.jurescreatures.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Main instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}


