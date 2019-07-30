package juresuper.jurescreatures.entities.SnowWolfMinion;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelSnowWolfMinion - Juresuper
 * Created using Tabula 7.0.1
 */
public class ModelSnowWolfMinion extends ModelBase {
    public ModelRenderer leg1;
    public ModelRenderer Torso;
    public ModelRenderer Body;
    public ModelRenderer leg2;
    public ModelRenderer leg3;
    public ModelRenderer leg4;
    public ModelRenderer Tail;
    public ModelRenderer Head;
    public ModelRenderer Right_Ear;
    public ModelRenderer Left_Ear;
    public ModelRenderer Mouth;
    public ModelRenderer Lower_Jaw;

    public ModelSnowWolfMinion() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Right_Ear = new ModelRenderer(this, 16, 14);
        this.Right_Ear.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Right_Ear.addBox(-2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Right_Ear, 0.2617993877991494F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(-1.0F, 13.5F, -7.0F);
        this.Head.addBox(-2.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
        this.setRotateAngle(Head, 0.2617993877991494F, -0.08726646259971647F, 0.0F);
        this.Left_Ear = new ModelRenderer(this, 16, 14);
        this.Left_Ear.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Left_Ear.addBox(2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Left_Ear, 0.2617993877991494F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 9, 18);
        this.Tail.setRotationPoint(-1.0F, 12.0F, 8.0F);
        this.Tail.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(Tail, 1.730144887501979F, 0.0F, 0.0F);
        this.Mouth = new ModelRenderer(this, 0, 10);
        this.Mouth.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mouth.addBox(-0.5F, 0.0F, -5.0F, 3, 2, 4, 0.0F);
        this.Lower_Jaw = new ModelRenderer(this, 38, 14);
        this.Lower_Jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Lower_Jaw.addBox(-0.5F, 0.0F, -5.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Lower_Jaw, 0.29216811678385074F, 0.0F, 0.0F);
        this.leg2 = new ModelRenderer(this, 0, 18);
        this.leg2.setRotationPoint(0.5F, 16.0F, 7.0F);
        this.leg2.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.leg1 = new ModelRenderer(this, 0, 18);
        this.leg1.setRotationPoint(0.5F, 16.0F, -4.0F);
        this.leg1.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.Torso = new ModelRenderer(this, 21, 0);
        this.Torso.setRotationPoint(-1.0F, 14.0F, -3.0F);
        this.Torso.addBox(-3.0F, -3.0F, -3.0F, 8, 6, 7, 0.0F);
        this.setRotateAngle(Torso, 1.5707963267948966F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 18, 14);
        this.Body.setRotationPoint(0.0F, 14.0F, 2.0F);
        this.Body.addBox(-3.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
        this.setRotateAngle(Body, 1.5707963267948966F, 0.0F, 0.0F);
        this.leg3 = new ModelRenderer(this, 0, 18);
        this.leg3.setRotationPoint(-2.5F, 16.0F, 7.0F);
        this.leg3.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.leg4 = new ModelRenderer(this, 0, 18);
        this.leg4.setRotationPoint(-2.5F, 16.0F, -4.0F);
        this.leg4.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.Head.addChild(this.Right_Ear);
        this.Head.addChild(this.Left_Ear);
        this.Head.addChild(this.Mouth);
        this.Head.addChild(this.Lower_Jaw);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Head.render(f5);
        this.Tail.render(f5);
        this.leg2.render(f5);
        this.leg1.render(f5);
        this.Torso.render(f5);
        this.Body.render(f5);
        this.leg3.render(f5);
        this.leg4.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
        
    }
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	float f6 = (180F / (float)Math.PI);
    	this.Head.rotateAngleX = f4 / (180F / (float)Math.PI);
    	this.Head.rotateAngleY = f3 / (180F / (float)Math.PI);
    	
    	this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    	this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    	this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    	this.leg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    	
}}
