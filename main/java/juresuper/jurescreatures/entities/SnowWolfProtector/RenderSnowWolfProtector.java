package juresuper.jurescreatures.entities.SnowWolfProtector;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderSnowWolfProtector extends RenderLiving<EntitySnowWolfProtector>
{
	private ResourceLocation mobTexture = new ResourceLocation("jurescreatures:textures/snowwolfprotector.png");
	
	public RenderSnowWolfProtector(RenderManager renderManagerIn) 
	{
		super (renderManagerIn, new ModelSnowWolfProtector(), 0.8F);
	}
	
	@Override
    protected ResourceLocation getEntityTexture(EntitySnowWolfProtector entity) {
        return mobTexture;


}
public static final RenderSnowWolfProtector.Factory FACTORY = new RenderSnowWolfProtector.Factory();
	
	public static class Factory implements IRenderFactory<EntitySnowWolfProtector> {
		
		@Override
		public Render<? super EntitySnowWolfProtector> createRenderFor(RenderManager manager) 
		{
			return new RenderSnowWolfProtector(manager);
			
		
		 
		}
	
	}}
	


