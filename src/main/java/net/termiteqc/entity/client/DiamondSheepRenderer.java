package net.termiteqc.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.termiteqc.entity.custom.DiamondSheepEntity;
import net.termiteqc.sewingsmod.SewingsMod;

public class DiamondSheepRenderer extends MobRenderer<DiamondSheepEntity, ModModelSpecialSheep<DiamondSheepEntity>> {

    public DiamondSheepRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ModModelSpecialSheep<>(pContext.bakeLayer(ModModelLayers.DIAMOND_SHEEP_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(DiamondSheepEntity diamondSheepEntity) {
        return new ResourceLocation(SewingsMod.MOD_ID, "textures/sheeps/diamond_sheep.png");
    }

    @Override
    public void render(DiamondSheepEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
