package com.swedishmonkey.moretools.common;

import com.swedishmonkey.moretools.entity.EntitySmallLonsdaleiteMetorite;
import com.swedishmonkey.moretools.renderer.RendererSmallLonsdaleite;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

    public void registerRenderThings() {
        ClientRegistry.bindTileEntitySpecialRenderer(EntitySmallLonsdaleiteMetorite.class, new RendererSmallLonsdaleite());
    }
}
