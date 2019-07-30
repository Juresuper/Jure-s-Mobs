package juresuper.jurescreatures.entities.SnowWolfMinion;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerEndermanEyes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;

@SideOnly(Side.CLIENT)
public class RenderSnowWolfMinion extends RenderLiving<EntitySnowWolfMinion>
{
	private ResourceLocation mobTexture = new ResourceLocation("jurescreatures:textures/snowwolfminion.png");
	
	
	
	public RenderSnowWolfMinion(RenderManager renderManagerIn) 
	{
		super (renderManagerIn, new ModelSnowWolfMinion(), 0.8F);
	}
	
	@Override
    protected ResourceLocation getEntityTexture(EntitySnowWolfMinion entity) {
        return mobTexture;
	

}
	public static final RenderSnowWolfMinion.Factory FACTORY = new RenderSnowWolfMinion.Factory();
	
	public static class Factory implements IRenderFactory<EntitySnowWolfMinion> {
		
		@Override
		public Render<? super EntitySnowWolfMinion> createRenderFor(RenderManager manager) 
		{
			return new RenderSnowWolfMinion(manager);
			
		
		 
		}
	
	}
	


}
