package com.jtrent238.youtubers.entity.item;

import com.jtrent238.youtubers.entity.EntityDiamondMinecart;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.minecart.MinecartInteractEvent;

public class EntityDiamondMinecartEmpty extends EntityDiamondMinecart
{
    private static final String __OBFID = "CL_00001677";

    public EntityDiamondMinecartEmpty(World p_i1722_1_)
    {
        super(p_i1722_1_);
    }

    public EntityDiamondMinecartEmpty(World p_i1723_1_, double p_i1723_2_, double p_i1723_4_, double p_i1723_6_)
    {
        super(p_i1723_1_, p_i1723_2_, p_i1723_4_, p_i1723_6_);
    }

    /**
     * First layer of player interaction
     */
    public boolean interactFirst(EntityPlayer p_130002_1_)
    {
        if(net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(new MinecartInteractEvent(null, p_130002_1_))) return true;
        if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer && this.riddenByEntity != p_130002_1_)
        {
            return true;
        }
        else if (this.riddenByEntity != null && this.riddenByEntity != p_130002_1_)
        {
            return false;
        }
        else
        {
            if (!this.worldObj.isRemote)
            {
                p_130002_1_.mountEntity(this);
            }

            return true;
        }
    }

    public int getMinecartType()
    {
        return 0;
    }
}