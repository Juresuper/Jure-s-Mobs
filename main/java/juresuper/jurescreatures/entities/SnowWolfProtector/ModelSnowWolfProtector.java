package juresuper.jurescreatures.entities.SnowWolfProtector;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * SnowWolfProtector - Juresuper
 * Created using Tabula 7.0.1
 */
public class ModelSnowWolfProtector extends ModelBase {
    public double[] modelScale = new double[] { 0.85D, 0.85D, 0.85D };
    public ModelRenderer LeftThigh;
    public ModelRenderer RightThigh;
    public ModelRenderer Torso;
    public ModelRenderer Head;
    public ModelRenderer LeftCalf;
    public ModelRenderer RightCalf;
    public ModelRenderer Body;
    public ModelRenderer UpperLeftArm;
    public ModelRenderer UpperRightArm;
    public ModelRenderer Cape;
    public ModelRenderer BottomLeftArm;
    public ModelRenderer StaffHandle;
    public ModelRenderer StaffCore;
    public ModelRenderer StaffBone1;
    public ModelRenderer StaffBone2;
    public ModelRenderer StaffBone3;
    public ModelRenderer StaffBone4;
    public ModelRenderer BottomRightArm;
    public ModelRenderer RightHorn1;
    public ModelRenderer LeftHorn1;
    public ModelRenderer Jaw;
    public ModelRenderer RightHorn2;
    public ModelRenderer RightHorn3;
    public ModelRenderer LeftHorn2;
    public ModelRenderer LeftHorn3;
    public ModelRenderer LeftJawBone;
    public ModelRenderer RightJawBone;

    public ModelSnowWolfProtector() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.StaffBone4 = new ModelRenderer(this, 60, 28);
        this.StaffBone4.setRotationPoint(0.5F, -10.5F, 1.0F);
        this.StaffBone4.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(StaffBone4, -0.3490658503988659F, -0.03490658503988659F, 0.0F);
        this.RightJawBone = new ModelRenderer(this, 35, 13);
        this.RightJawBone.setRotationPoint(-2.0F, -0.9F, -0.4F);
        this.RightJawBone.addBox(-0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RightJawBone, 0.40142572795869574F, 0.03490658503988659F, -0.7853981633974483F);
        this.UpperLeftArm = new ModelRenderer(this, 46, 0);
        this.UpperLeftArm.setRotationPoint(4.0F, 2.5F, 0.0F);
        this.UpperLeftArm.addBox(0.0F, -5.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(UpperLeftArm, 0.0F, 0.0F, -0.2617993877991494F);
        this.RightHorn3 = new ModelRenderer(this, 40, 11);
        this.RightHorn3.setRotationPoint(0.9F, -1.0F, -0.5F);
        this.RightHorn3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RightHorn3, 0.0F, -0.17453292519943295F, 4.014257279586958F);
        this.LeftThigh = new ModelRenderer(this, 60, 0);
        this.LeftThigh.setRotationPoint(1.5F, 13.5F, 1.0F);
        this.LeftThigh.addBox(0.0F, -7.5F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(LeftThigh, -0.06981317007977318F, 0.0F, 0.0F);
        this.StaffCore = new ModelRenderer(this, 21, 0);
        this.StaffCore.setRotationPoint(1.0F, -11.0F, 0.0F);
        this.StaffCore.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.BottomLeftArm = new ModelRenderer(this, 41, -1);
        this.BottomLeftArm.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.BottomLeftArm.addBox(0.0F, 0.0F, -10.0F, 1, 1, 11, 0.0F);
        this.setRotateAngle(BottomLeftArm, 0.7853981633974483F, 0.0F, 0.0F);
        this.BottomRightArm = new ModelRenderer(this, 41, 0);
        this.BottomRightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BottomRightArm.addBox(0.0F, 0.0F, -9.0F, 1, 1, 10, 0.0F);
        this.setRotateAngle(BottomRightArm, 0.7853981633974483F, 0.0F, 0.0F);
        this.LeftHorn1 = new ModelRenderer(this, 45, 11);
        this.LeftHorn1.setRotationPoint(1.0F, -7.0F, 1.5F);
        this.LeftHorn1.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(LeftHorn1, -0.5235987755982988F, 0.0F, 0.0F);
        this.StaffBone1 = new ModelRenderer(this, 60, 28);
        this.StaffBone1.setRotationPoint(-1.0F, -10.0F, -0.5F);
        this.StaffBone1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(StaffBone1, 0.0F, -0.03490658503988659F, -0.3490658503988659F);
        this.Cape = new ModelRenderer(this, 0, 12);
        this.Cape.setRotationPoint(0.0F, 6.5F, 3.0F);
        this.Cape.addBox(-3.5F, -10.0F, -0.5F, 7, 20, 0, 0.0F);
        this.setRotateAngle(Cape, 0.017453292519943295F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 28, 20);
        this.Head.setRotationPoint(0.5F, -6.4F, -1.0F);
        this.Head.addBox(-2.5F, -2.0F, -3.5F, 5, 4, 7, 0.0F);
        this.setRotateAngle(Head, 0.12217304763960307F, 0.0F, 0.0F);
        this.Jaw = new ModelRenderer(this, 30, 0);
        this.Jaw.setRotationPoint(0.0F, 2.5F, -2.0F);
        this.Jaw.addBox(-2.0F, -0.5F, -1.5F, 4, 1, 3, 0.0F);
        this.setRotateAngle(Jaw, 0.31869712141416456F, 0.08621926504851989F, 0.0F);
        this.StaffHandle = new ModelRenderer(this, 22, 11);
        this.StaffHandle.setRotationPoint(-0.5F, 0.0F, -10.0F);
        this.StaffHandle.addBox(0.5F, -10.0F, -0.5F, 1, 20, 1, 0.0F);
        this.setRotateAngle(StaffHandle, -0.6981317007977318F, 0.4363323129985824F, 0.0F);
        this.Torso = new ModelRenderer(this, 0, 0);
        this.Torso.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.Torso.addBox(-3.0F, -3.5F, -2.0F, 6, 7, 4, 0.1F);
        this.setRotateAngle(Torso, 0.17453292519943295F, 0.0F, 0.0F);
        this.LeftJawBone = new ModelRenderer(this, 35, 13);
        this.LeftJawBone.setRotationPoint(2.0F, -0.9F, -0.4F);
        this.LeftJawBone.addBox(-0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LeftJawBone, 0.40142572795869574F, 0.03490658503988659F, 0.7853981633974483F);
        this.RightHorn1 = new ModelRenderer(this, 45, 11);
        this.RightHorn1.setRotationPoint(-1.9F, -7.0F, 1.5F);
        this.RightHorn1.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(RightHorn1, -0.5235987755982988F, 0.0F, 0.0F);
        this.StaffBone2 = new ModelRenderer(this, 60, 28);
        this.StaffBone2.setRotationPoint(2.0F, -10.4F, -0.5F);
        this.StaffBone2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(StaffBone2, 0.0F, -0.03490658503988659F, 0.3490658503988659F);
        this.UpperRightArm = new ModelRenderer(this, 46, 0);
        this.UpperRightArm.setRotationPoint(-5.0F, 2.5F, 0.0F);
        this.UpperRightArm.addBox(0.0F, -5.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(UpperRightArm, 0.0F, 0.0F, 0.2617993877991494F);
        this.RightCalf = new ModelRenderer(this, 55, 0);
        this.RightCalf.setRotationPoint(0.0F, 5.0F, 0.8F);
        this.RightCalf.addBox(0.0F, -4.5F, 0.5F, 1, 8, 1, 0.0F);
        this.setRotateAngle(RightCalf, 0.2617993877991494F, 0.0F, 0.0F);
        this.StaffBone3 = new ModelRenderer(this, 60, 28);
        this.StaffBone3.setRotationPoint(0.5F, -10.0F, -2.0F);
        this.StaffBone3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(StaffBone3, 0.3490658503988659F, -0.03490658503988659F, 0.0F);
        this.RightHorn2 = new ModelRenderer(this, 40, 11);
        this.RightHorn2.setRotationPoint(-1.5F, -2.0F, 2.0F);
        this.RightHorn2.addBox(0.0F, -3.5F, -0.5F, 1, 7, 1, 0.0F);
        this.setRotateAngle(RightHorn2, -0.5235987755982988F, 0.0F, -0.5235987755982988F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Body.addBox(-2.5F, -2.5F, -1.5F, 5, 5, 3, 0.0F);
        this.setRotateAngle(Body, 0.05235987755982988F, 0.0F, 0.0F);
        this.LeftHorn3 = new ModelRenderer(this, 40, 11);
        this.LeftHorn3.setRotationPoint(0.9F, -1.5F, -0.5F);
        this.LeftHorn3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LeftHorn3, 0.0F, -0.17453292519943295F, -4.014257279586958F);
        this.LeftCalf = new ModelRenderer(this, 55, 0);
        this.LeftCalf.setRotationPoint(0.0F, 5.0F, 0.8F);
        this.LeftCalf.addBox(0.0F, -4.5F, 0.5F, 1, 8, 1, 0.0F);
        this.setRotateAngle(LeftCalf, 0.2617993877991494F, 0.0F, 0.0F);
        this.LeftHorn2 = new ModelRenderer(this, 40, 11);
        this.LeftHorn2.setRotationPoint(1.5F, -2.0F, 2.0F);
        this.LeftHorn2.addBox(0.0F, -3.5F, -0.5F, 1, 7, 1, 0.0F);
        this.setRotateAngle(LeftHorn2, -0.5235987755982988F, 0.0F, 0.5235987755982988F);
        this.RightThigh = new ModelRenderer(this, 60, 0);
        this.RightThigh.setRotationPoint(-1.5F, 13.5F, 1.0F);
        this.RightThigh.addBox(0.0F, -7.5F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(RightThigh, -0.06981317007977318F, 0.0F, 0.0F);
        this.StaffHandle.addChild(this.StaffBone4);
        this.Jaw.addChild(this.RightJawBone);
        this.Torso.addChild(this.UpperLeftArm);
        this.RightHorn2.addChild(this.RightHorn3);
        this.StaffHandle.addChild(this.StaffCore);
        this.UpperLeftArm.addChild(this.BottomLeftArm);
        this.UpperRightArm.addChild(this.BottomRightArm);
        this.Head.addChild(this.LeftHorn1);
        this.StaffHandle.addChild(this.StaffBone1);
        this.Torso.addChild(this.Cape);
        this.Head.addChild(this.Jaw);
        this.BottomLeftArm.addChild(this.StaffHandle);
        this.Jaw.addChild(this.LeftJawBone);
        this.Head.addChild(this.RightHorn1);
        this.StaffHandle.addChild(this.StaffBone2);
        this.Torso.addChild(this.UpperRightArm);
        this.RightThigh.addChild(this.RightCalf);
        this.StaffHandle.addChild(this.StaffBone3);
        this.RightHorn1.addChild(this.RightHorn2);
        this.Torso.addChild(this.Body);
        this.LeftHorn2.addChild(this.LeftHorn3);
        this.LeftThigh.addChild(this.LeftCalf);
        this.LeftHorn1.addChild(this.LeftHorn2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.scale(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        this.LeftThigh.render(f5);
        this.Head.render(f5);
        this.Torso.render(f5);
        this.RightThigh.render(f5);
        GlStateManager.popMatrix();
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
