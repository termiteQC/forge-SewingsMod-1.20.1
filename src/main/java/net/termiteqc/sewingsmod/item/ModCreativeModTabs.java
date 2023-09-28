package net.termiteqc.sewingsmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.termiteqc.sewingsmod.SewingsMod;
import net.termiteqc.sewingsmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SewingsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SEWINGSMOD_WOOLS_TAB = CREATIVE_MODE_TABS.register("sewingsmod_wools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DIAMOND_WOOL.get()))
                    .title(Component.translatable("creativetab.sewingsmod_wools_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.ANDESITE_WOOL.get());
                        pOutput.accept(ModItems.ANDESITE_STRING.get());
                        pOutput.accept(ModItems.ANDESITE_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.CLAY_WOOL.get());
                        pOutput.accept(ModItems.CLAY_STRING.get());
                        pOutput.accept(ModItems.CLAY_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.COAL_WOOL.get());
                        pOutput.accept(ModItems.COAL_STRING.get());
                        pOutput.accept(ModItems.COAL_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.COBBLESTONE_WOOL.get());
                        pOutput.accept(ModItems.COBBLESTONE_STRING.get());
                        pOutput.accept(ModItems.COBBLESTONE_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.DIAMOND_WOOL.get());
                        pOutput.accept(ModItems.DIAMOND_STRING.get());
                        pOutput.accept(ModItems.DIAMOND_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.DIORITE_WOOL.get());
                        pOutput.accept(ModItems.DIORITE_STRING.get());
                        pOutput.accept(ModItems.DIORITE_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.DIRT_WOOL.get());
                        pOutput.accept(ModItems.DIRT_STRING.get());
                        pOutput.accept(ModItems.DIRT_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.EMERALD_WOOL.get());
                        pOutput.accept(ModItems.EMERALD_STRING.get());
                        pOutput.accept(ModItems.EMERALD_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.GLOWSTONE_WOOL.get());
                        pOutput.accept(ModItems.GLOWSTONE_STRING.get());
                        pOutput.accept(ModItems.GLOWSTONE_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.GOLD_WOOL.get());
                        pOutput.accept(ModItems.GOLD_STRING.get());
                        pOutput.accept(ModItems.GOLD_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.GRANITE_WOOL.get());
                        pOutput.accept(ModItems.GRANITE_STRING.get());
                        pOutput.accept(ModItems.GRANITE_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.GRAVEL_WOOL.get());
                        pOutput.accept(ModItems.GRAVEL_STRING.get());
                        pOutput.accept(ModItems.GRAVEL_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.ICE_WOOL.get());
                        pOutput.accept(ModItems.ICE_STRING.get());
                        pOutput.accept(ModItems.ICE_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.IRON_WOOL.get());
                        pOutput.accept(ModItems.IRON_STRING.get());
                        pOutput.accept(ModItems.IRON_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.LAPIS_WOOL.get());
                        pOutput.accept(ModItems.LAPIS_STRING.get());
                        pOutput.accept(ModItems.LAPIS_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.NETHERITE_WOOL.get());
                        pOutput.accept(ModItems.NETHERITE_STRING.get());
                        pOutput.accept(ModItems.NETHERITE_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.NETHERRACK_WOOL.get());
                        pOutput.accept(ModItems.NETHERRACK_STRING.get());
                        pOutput.accept(ModItems.NETHERRACK_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.OBSIDIAN_WOOL.get());
                        pOutput.accept(ModItems.OBSIDIAN_STRING.get());
                        pOutput.accept(ModItems.OBSIDIAN_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.PRISMARINE_WOOL.get());
                        pOutput.accept(ModItems.PRISMARINE_STRING.get());
                        pOutput.accept(ModItems.PRISMARINE_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.PRISMARINE_SHARD_WOOL.get());
                        pOutput.accept(ModItems.PRISMARINE_SHARD_STRING.get());
                        pOutput.accept(ModItems.PRISMARINE_SHARD_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.PUMPKIN_WOOL.get());
                        pOutput.accept(ModItems.PUMPKIN_STRING.get());
                        pOutput.accept(ModItems.PUMPKIN_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.QUARTZ_WOOL.get());
                        pOutput.accept(ModItems.QUARTZ_STRING.get());
                        pOutput.accept(ModItems.QUARTZ_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.REDSTONE_WOOL.get());
                        pOutput.accept(ModItems.REDSTONE_STRING.get());
                        pOutput.accept(ModItems.REDSTONE_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.SAND_WOOL.get());
                        pOutput.accept(ModItems.SAND_STRING.get());
                        pOutput.accept(ModItems.SAND_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.SLIME_WOOL.get());
                        pOutput.accept(ModItems.SLIME_STRING.get());
                        pOutput.accept(ModItems.SLIME_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.SOULSAND_WOOL.get());
                        pOutput.accept(ModItems.SOULSAND_STRING.get());
                        pOutput.accept(ModItems.SOULSAND_BALL_OF_YARN.get());

                        pOutput.accept(ModBlocks.WOOD_WOOL.get());
                        pOutput.accept(ModItems.WOOD_STRING.get());
                        pOutput.accept(ModItems.WOOD_BALL_OF_YARN.get());

                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> SEWINGSMOD_ADVANCED_TAB = CREATIVE_MODE_TABS.register("sewingsmod_advanced_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NETHERITE_SHEARS.get()))
                    .title(Component.translatable("creativetab.sewingsmod_advanced_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.WOOD_SHEARS.get());
                        pOutput.accept(ModItems.GOLD_SHEARS.get());
                        pOutput.accept(ModItems.EMERALD_SHEARS.get());
                        pOutput.accept(ModItems.DIAMOND_SHEARS.get());
                        pOutput.accept(ModItems.OBSIDIAN_SHEARS.get());
                        pOutput.accept(ModItems.NETHERITE_SHEARS.get());


                        pOutput.accept(ModItems.SUPRA_ANDESITE_CRAFTING_STAR.get());
                        pOutput.accept(ModItems.ANDESITE_CRAFTING_STAR.get());


                        pOutput.accept(ModItems.SUPRA_BLUE_EMERALD.get());


                        pOutput.accept(ModBlocks.CARDING_TABLE.get());
                        pOutput.accept(ModBlocks.SEWINGS_MACHINE.get());
                        pOutput.accept(ModBlocks.WINDER_POLE.get());

                    })
                    .build());


    public static final RegistryObject<CreativeModeTab> SEWINGSMOD_GRASS_TAB = CREATIVE_MODE_TABS.register("sewingsmod_grass_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DIRT_WITH_DIAMOND_FERTILIZER.get()))
                    .title(Component.translatable("creativetab.sewingsmod_grass_tab"))
                    .displayItems((pParameters, pOutput) -> {


                        pOutput.accept(ModItems.ANDESITE_FERTILIZER.get());
                        pOutput.accept(ModBlocks.DIRT_WITH_ANDESITE_FERTILIZER.get());

                        pOutput.accept(ModBlocks.DIRT_WITH_CLAY_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_COAL_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_COBBLESTONE_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_DIAMOND_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_DIORITE_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_DIRT_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_EMERALD_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_GLOWSTONE_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_GOLD_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_GRANITE_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_GRAVEL_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_ICE_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_IRON_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_LAPIS_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_NETHERITE_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_NETHERRACK_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_OBSIDIAN_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_PRISMARINE_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_PRISMARINE_SHARD_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_PUMPKIN_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_QUARTZ_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_REDSTONE_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_SAND_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_SLIME_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_SOULSAND_FERTILIZER.get());


                        pOutput.accept(ModBlocks.DIRT_WITH_WOOD_FERTILIZER.get());



                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
