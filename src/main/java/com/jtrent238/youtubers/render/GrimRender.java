package com.jtrent238.youtubers.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import com.jtrent238.youtubers.entity.EntityGrim;

@SideOnly(Side.CLIENT)
public class GrimRender extends RenderLiving
{
    private static final ResourceLocation wolfTextures = new ResourceLocation("youtubers:textures/entity/EntityGrim.png");
    private static final ResourceLocation tamedWolfTextures = new ResourceLocation("youtubers:textures/entity/EntityGrim.png");
    private static final ResourceLocation anrgyWolfTextures = new ResourceLocation("youtubers:textures/entity/EntityGrim.png");
    private static final ResourceLocation wolfCollarTextures = new ResourceLocation("textures/entity/wolf/wolf_collar.png");
    private static final String __OBFID = "CL_00001036";

    public GrimRender(ModelBase p_i1269_1_, ModelBase p_i1269_2_, float p_i1269_3_)
    {
        super(p_i1269_1_, p_i1269_3_);
        this.setRenderPassModel(p_i1269_2_);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityGrim p_77044_1_, float p_77044_2_)
    {
        return p_77044_1_.getTailRotation();
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityGrim p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        if (p_77032_2_ == 0 && p_77032_1_.getWolfShaking())
        {
            float f1 = p_77032_1_.getBrightness(p_77032_3_) * p_77032_1_.getShadingWhileShaking(p_77032_3_);
            this.bindTexture(wolfTextures);
            GL11.glColor3f(f1, f1, f1);
            return 1;
        }
        else if (p_77032_2_ == 1 && p_77032_1_.isTamed())
        {
            this.bindTexture(wolfCollarTextures);
            int j = p_77032_1_.getCollarColor();
            GL11.glColor3f(EntitySheep.fleeceColorTable[j][0], EntitySheep.fleeceColorTable[j][1], EntitySheep.fleeceColorTable[j][2]);
            return 1;
        }
        else
        {
            return -1;
        }
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityGrim p_110775_1_)
    {
        return p_110775_1_.isTamed() ? tamedWolfTextures : (p_110775_1_.isAngry() ? anrgyWolfTextures : wolfTextures);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLivingBase p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        return this.shouldRenderPass((EntityGrim)p_77032_1_, p_77032_2_, p_77032_3_);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityLivingBase p_77044_1_, float p_77044_2_)
    {
        return this.handleRotationFloat((EntityGrim)p_77044_1_, p_77044_2_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityGrim)p_110775_1_);
    }
}