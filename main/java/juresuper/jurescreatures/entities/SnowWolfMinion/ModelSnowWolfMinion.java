package juresuper.jurescreatures.entities.SnowWolfMinion;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelSnowWolfMinion - Juresuper
 * Created using Tabula 7.0.1
 */
public class ModelSnowWolfMinion extends ModelBase {
    public ModelRenderer Upper_Left_Leg;
    public ModelRenderer Torso;
    public ModelRenderer Body;
    public ModelRenderer Bottom_Left_Leg;
    public ModelRenderer Bottom_Right_Leg;
    public ModelRenderer Upper_Right_Leg;
    public ModelRenderer Tail;
    public ModelRenderer Head;
    public ModelRenderer Right_Ear;
    public ModelRenderer Left_Ear;
    public ModelRenderer Mouth;
    public ModelRenderer Lower_Jaw;

    public ModelSnowWolfMinion() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(-1.0F, 13.5F, -7.0F);
        this.Head.addBox(-2.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
        this.setRotateAngle(Head, 0.2617993877991494F, -0.08726646259971647F, 0.0F);
        this.Lower_Jaw = new ModelRenderer(this, 0, 12);
        this.Lower_Jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Lower_Jaw.addBox(-0.5F, 0.0F, -5.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Lower_Jaw, 0.29222397628804614F, 0.0F, 0.0F);
        this.Right_Ear = new ModelRenderer(this, 16, 14);
        this.Right_Ear.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Right_Ear.addBox(-2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Right_Ear, 0.2617993877991494F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 18, 14);
        this.Body.setRotationPoint(0.0F, 14.0F, 2.0F);
        this.Body.addBox(-3.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
        this.setRotateAngle(Body, 1.5707963267948966F, 0.0F, 0.0F);
        this.Bottom_Right_Leg = new ModelRenderer(this, 0, 18);
        this.Bottom_Right_Leg.setRotationPoint(-2.5F, 16.0F, 7.0F);
        this.Bottom_Right_Leg.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.Upper_Right_Leg = new ModelRenderer(this, 0, 18);
        this.Upper_Right_Leg.setRotationPoint(-2.5F, 16.0F, -4.0F);
        this.Upper_Right_Leg.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.Torso = new ModelRenderer(this, 21, 0);
        this.Torso.setRotationPoint(-1.0F, 14.0F, -3.0F);
        this.Torso.addBox(-3.0F, -3.0F, -3.0F, 8, 6, 7, 0.0F);
        this.setRotateAngle(Torso, 1.5707963267948966F, 0.0F, 0.0F);
        this.Mouth = new ModelRenderer(this, 0, 10);
        this.Mouth.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mouth.addBox(-0.5F, 0.0F, -5.0F, 3, 2, 4, 0.0F);
        this.Upper_Left_Leg = new ModelRenderer(this, 0, 18);
        this.Upper_Left_Leg.setRotationPoint(0.5F, 16.0F, -4.0F);
        this.Upper_Left_Leg.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.Bottom_Left_Leg = new ModelRenderer(this, 0, 18);
        this.Bottom_Left_Leg.setRotationPoint(0.5F, 16.0F, 7.0F);
        this.Bottom_Left_Leg.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.Left_Ear = new ModelRenderer(this, 16, 14);
        this.Left_Ear.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Left_Ear.addBox(2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Left_Ear, 0.2617993877991494F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 9, 18);
        this.Tail.setRotationPoint(-1.0F, 12.0F, 8.0F);
        this.Tail.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(Tail, 0.6981317007977318F, 0.0F, 0.0F);
        this.Head.addChild(this.Lower_Jaw);
        this.Head.addChild(this.Right_Ear);
        this.Head.addChild(this.Mouth);
        this.Head.addChild(this.Left_Ear);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Head.render(f5);
        this.Body.render(f5);
        this.Bottom_Right_Leg.render(f5);
        this.Upper_Right_Leg.render(f5);
        this.Torso.render(f5);
        this.Upper_Left_Leg.render(f5);
        this.Bottom_Left_Leg.render(f5);
        this.Tail.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
