package net.termiteqc.sewingsmod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.termiteqc.entity.ModEntities;
import net.termiteqc.entity.client.DiamondSheepRenderer;
import net.termiteqc.sewingsmod.block.ModBlocks;
import net.termiteqc.sewingsmod.block.entity.CardingTableBlockEntity;
import net.termiteqc.sewingsmod.block.entity.ModBlockEntities;
import net.termiteqc.sewingsmod.item.ModCreativeModTabs;
import net.termiteqc.sewingsmod.item.ModItems;
import net.termiteqc.sewingsmod.recipe.ModRecipes;
import net.termiteqc.sewingsmod.screen.CardingTableScreen;
import net.termiteqc.sewingsmod.screen.ModMenuTypes;
import net.termiteqc.sewingsmod.screen.SewingsMachineScreen;
import net.termiteqc.sewingsmod.screen.WinderPoleScreen;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SewingsMod.MOD_ID)
public class SewingsMod {
    public static final String MOD_ID = "sewingsmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SewingsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);


        ModRecipes.register(modEventBus);
        ModEntities.register(modEventBus);


        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            MenuScreens.register(ModMenuTypes.CARDING_TABLE_MENU.get(), CardingTableScreen::new);
            MenuScreens.register(ModMenuTypes.SEWINGS_MACHINE_MENU.get(), SewingsMachineScreen::new);
            MenuScreens.register(ModMenuTypes.WINDER_POLE_MENU.get(), WinderPoleScreen::new);
            EntityRenderers.register(ModEntities.DIAMOND_SHEEP.get(), DiamondSheepRenderer::new);
        }
    }
}