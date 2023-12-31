package net.termiteqc.sewingsmod.screen;

import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.termiteqc.sewingsmod.SewingsMod;

import java.rmi.registry.Registry;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, SewingsMod.MOD_ID);

    public static final RegistryObject<MenuType<CardingTableMenu>> CARDING_TABLE_MENU =
            registerMenuType("carding_table_menu", CardingTableMenu::new);
    public static final RegistryObject<MenuType<SewingsMachineMenu>> SEWINGS_MACHINE_MENU =
            registerMenuType("sewings_machine_menu", SewingsMachineMenu::new);

    public static final RegistryObject<MenuType<WinderPoleMenu>> WINDER_POLE_MENU =
            registerMenuType("winder_pole_menu", WinderPoleMenu::new);


    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
