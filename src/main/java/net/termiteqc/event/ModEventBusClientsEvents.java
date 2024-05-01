package net.termiteqc.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.termiteqc.entity.ModEntities;
import net.termiteqc.entity.client.ModModelLayers;
import net.termiteqc.entity.client.ModModelSpecialFur;
import net.termiteqc.entity.client.ModModelSpecialSheep;
import net.termiteqc.entity.custom.DiamondSheepEntity;
import net.termiteqc.sewingsmod.SewingsMod;

@Mod.EventBusSubscriber(modid = SewingsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientsEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.DIAMOND_SHEEP_LAYER, ModModelSpecialSheep::createBodyLayer);
    }
}
