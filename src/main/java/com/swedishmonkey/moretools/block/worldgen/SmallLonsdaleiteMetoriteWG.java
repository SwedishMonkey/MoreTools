package com.swedishmonkey.moretools.block.worldgen;

import com.swedishmonkey.moretools.common.ConfigurationHandler;
import com.swedishmonkey.moretools.common.MoreTools;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class SmallLonsdaleiteMetoriteWG implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkProvider arg4, IChunkProvider arg5) {
        switch (world.provider.dimensionId) {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    public void generateSurface(World world, Random random, int x, int z) {

        for (int i = 0; i < 10; i++) {
            int Xcoords = x + random.nextInt(16);
            int Ycoords = random.nextInt(128);
            int Zcoords = z + random.nextInt(16);
            if (ConfigurationHandler.enableLonsdaleite) {
                new WorldGenMinable(MoreTools.SmallLonsdaleiteMetorite, 1).generate(world, random, Xcoords, Ycoords, Zcoords);
            }
        }
    }

    public void generateNether(World world, Random random, int x, int z) {

    }

}
