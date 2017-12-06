package com.jtrent238.youtubers.blocks.materials;

import com.jtrent238.youtubers.BlockLoader;

import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockBajanCanadian extends YouTuberBlock{

	public BlockBajanCanadian(Material p_i45394_1_) {
		super(p_i45394_1_);
	}

	/**
     * Determines if this block can be used as the base of a beacon.
     *
     * @param world The current world
     * @param x X Position
     * @param y Y Position
     * @param z Z position
     * @param beaconX Beacons X Position
     * @param beaconY Beacons Y Position
     * @param beaconZ Beacons Z Position
     * @return True, to support the beacon, and make it active with this block.
     */
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)
    {
        return this == BlockLoader.BlockBajanCanadian;
    }
}
