package net.termiteqc.entity.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.termiteqc.sewingsmod.SewingsMod;

public class ModModelLayers {
    public static final ModelLayerLocation DIAMOND_SHEEP_LAYER = new ModelLayerLocation(
            new ResourceLocation(SewingsMod.MOD_ID, "diamond_sheep_layer"), "main");
    public static final ModelLayerLocation DIAMOND_SHEEP_FUR_LAYER = new ModelLayerLocation(
            new ResourceLocation(SewingsMod.MOD_ID, "diamond_sheep_fur_layer"), "second");
}
