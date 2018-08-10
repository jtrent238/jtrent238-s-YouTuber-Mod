package com.jtrent238.youtubers.model;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

import com.jtrent238.youtubers.entity.EntityGrim;

@SideOnly(Side.CLIENT)
public class ModelGrim extends ModelBase
{
    /** main box for the Grim head */
    public ModelRenderer GrimHeadMain;
    /** The Grim's body */
    public ModelRenderer GrimBody;
    /** Grim'se first leg */
    public ModelRenderer GrimLeg1;
    /** Grim's second leg */
    public ModelRenderer GrimLeg2;
    /** Grim's third leg */
    public ModelRenderer GrimLeg3;
    /** Grim's fourth leg */
    public ModelRenderer GrimLeg4;
    /** The Grim's tail */
    ModelRenderer GrimTail;
    /** The Grim's mane */
    ModelRenderer GrimMane;
    private static final String __OBFID = "CL_00000868";

    public ModelGrim()
    {
        float f = 0.0F;
        float f1 = 13.5F;
        this.GrimHeadMain = new ModelRenderer(this, 0, 0);
        this.GrimHeadMain.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4, f);
        this.GrimHeadMain.setRotationPoint(-1.0F, f1, -7.0F);
        this.GrimBody = new ModelRenderer(this, 18, 14);
        this.GrimBody.addBox(-4.0F, -2.0F, -3.0F, 6, 9, 6, f);
        this.GrimBody.setRotationPoint(0.0F, 14.0F, 2.0F);
        this.GrimMane = new ModelRenderer(this, 21, 0);
        this.GrimMane.addBox(-4.0F, -3.0F, -3.0F, 8, 6, 7, f);
        this.GrimMane.setRotationPoint(-1.0F, 14.0F, 2.0F);
        this.GrimLeg1 = new ModelRenderer(this, 0, 18);
        this.GrimLeg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
        this.GrimLeg1.setRotationPoint(-2.5F, 16.0F, 7.0F);
        this.GrimLeg2 = new ModelRenderer(this, 0, 18);
        this.GrimLeg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
        this.GrimLeg2.setRotationPoint(0.5F, 16.0F, 7.0F);
        this.GrimLeg3 = new ModelRenderer(this, 0, 18);
        this.GrimLeg3.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
        this.GrimLeg3.setRotationPoint(-2.5F, 16.0F, -4.0F);
        this.GrimLeg4 = new ModelRenderer(this, 0, 18);
        this.GrimLeg4.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
        this.GrimLeg4.setRotationPoint(0.5F, 16.0F, -4.0F);
        this.GrimTail = new ModelRenderer(this, 9, 18);
        this.GrimTail.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
        this.GrimTail.setRotationPoint(-1.0F, 12.0F, 8.0F);
        this.GrimHeadMain.setTextureOffset(16, 14).addBox(-3.0F, -5.0F, 0.0F, 2, 2, 1, f);
        this.GrimHeadMain.setTextureOffset(16, 14).addBox(1.0F, -5.0F, 0.0F, 2, 2, 1, f);
        this.GrimHeadMain.setTextureOffset(0, 10).addBox(-1.5F, 0.0F, -5.0F, 3, 3, 4, f);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_)
    {
        super.render(p_78088_1_, p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_);
        this.setRotationAngles(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, p_78088_1_);

        if (this.isChild)
        {
            float f6 = 2.0F;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 5.0F * p_78088_7_, 2.0F * p_78088_7_);
            this.GrimHeadMain.renderWithRotation(p_78088_7_);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
            GL11.glTranslatef(0.0F, 24.0F * p_78088_7_, 0.0F);
            this.GrimBody.render(p_78088_7_);
            this.GrimLeg1.render(p_78088_7_);
            this.GrimLeg2.render(p_78088_7_);
            this.GrimLeg3.render(p_78088_7_);
            this.GrimLeg4.render(p_78088_7_);
            this.GrimTail.renderWithRotation(p_78088_7_);
            this.GrimMane.render(p_78088_7_);
            GL11.glPopMatrix();
        }
        else
        {
            this.GrimHeadMain.renderWithRotation(p_78088_7_);
            this.GrimBody.render(p_78088_7_);
            this.GrimLeg1.render(p_78088_7_);
            this.GrimLeg2.render(p_78088_7_);
            this.GrimLeg3.render(p_78088_7_);
            this.GrimLeg4.render(p_78088_7_);
            this.GrimTail.renderWithRotation(p_78088_7_);
            this.GrimMane.render(p_78088_7_);
        }
    }

    /**
     * Used for easily adding entity-dependent animations. The second and third float params here are the same second
     * and third as in the setRotationAngles method.
     */
    public void setLivingAnimations(EntityLivingBase p_78086_1_, float p_78086_2_, float p_78086_3_, float p_78086_4_)
    {
        EntityGrim entityGrim = (EntityGrim)p_78086_1_;

        if (entityGrim.isAngry())
        {
            this.GrimTail.rotateAngleY = 0.0F;
        }
        else
        {
            this.GrimTail.rotateAngleY = MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_;
        }

        if (entityGrim.isSitting())
        {
            this.GrimMane.setRotationPoint(-1.0F, 16.0F, -3.0F);
            this.GrimMane.rotateAngleX = ((float)Math.PI * 2F / 5F);
            this.GrimMane.rotateAngleY = 0.0F;
            this.GrimBody.setRotationPoint(0.0F, 18.0F, 0.0F);
            this.GrimBody.rotateAngleX = ((float)Math.PI / 4F);
            this.GrimTail.setRotationPoint(-1.0F, 21.0F, 6.0F);
            this.GrimLeg1.setRotationPoint(-2.5F, 22.0F, 2.0F);
            this.GrimLeg1.rotateAngleX = ((float)Math.PI * 3F / 2F);
            this.GrimLeg2.setRotationPoint(0.5F, 22.0F, 2.0F);
            this.GrimLeg2.rotateAngleX = ((float)Math.PI * 3F / 2F);
            this.GrimLeg3.rotateAngleX = 5.811947F;
            this.GrimLeg3.setRotationPoint(-2.49F, 17.0F, -4.0F);
            this.GrimLeg4.rotateAngleX = 5.811947F;
            this.GrimLeg4.setRotationPoint(0.51F, 17.0F, -4.0F);
        }
        else
        {
            this.GrimBody.setRotationPoint(0.0F, 14.0F, 2.0F);
            this.GrimBody.rotateAngleX = ((float)Math.PI / 2F);
            this.GrimMane.setRotationPoint(-1.0F, 14.0F, -3.0F);
            this.GrimMane.rotateAngleX = this.GrimBody.rotateAngleX;
            this.GrimTail.setRotationPoint(-1.0F, 12.0F, 8.0F);
            this.GrimLeg1.setRotationPoint(-2.5F, 16.0F, 7.0F);
            this.GrimLeg2.setRotationPoint(0.5F, 16.0F, 7.0F);
            this.GrimLeg3.setRotationPoint(-2.5F, 16.0F, -4.0F);
            this.GrimLeg4.setRotationPoint(0.5F, 16.0F, -4.0F);
            this.GrimLeg1.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_;
            this.GrimLeg2.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F + (float)Math.PI) * 1.4F * p_78086_3_;
            this.GrimLeg3.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F + (float)Math.PI) * 1.4F * p_78086_3_;
            this.GrimLeg4.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_;
        }

        this.GrimHeadMain.rotateAngleZ = entityGrim.getInterestedAngle(p_78086_4_) + entityGrim.getShakeAngle(p_78086_4_, 0.0F);
        this.GrimMane.rotateAngleZ = entityGrim.getShakeAngle(p_78086_4_, -0.08F);
        this.GrimBody.rotateAngleZ = entityGrim.getShakeAngle(p_78086_4_, -0.16F);
        this.GrimTail.rotateAngleZ = entityGrim.getShakeAngle(p_78086_4_, -0.2F);
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
    {
        super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);
        this.GrimHeadMain.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
        this.GrimHeadMain.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
        this.GrimTail.rotateAngleX = p_78087_3_;
    }
}