package net.termiteqc.sewingsmod.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.termiteqc.sewingsmod.SewingsMod;

public class ModRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, SewingsMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<CardingTableRecipe>> CARDING_TABLE_SERIALIZER =
            SERIALIZERS.register("carding", () -> CardingTableRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<SewingsMachineRecipe>> SEWINGS_MACHINE_SERIALIZER =
            SERIALIZERS.register("sewings", () -> SewingsMachineRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<WinderPoleRecipe>> WINDER_POLE_SERIALIZER =
            SERIALIZERS.register("winding", () -> WinderPoleRecipe.Serializer.INSTANCE);


    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
