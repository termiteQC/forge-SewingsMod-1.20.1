package net.termiteqc.sewingsmod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShearsItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.termiteqc.entity.ModEntities;
import net.termiteqc.sewingsmod.SewingsMod;

import java.awt.event.InputEvent;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SewingsMod.MOD_ID);

public static final RegistryObject<Item> ANDESITE_BALL_OF_YARN = ITEMS.register("andesite_ball_of_yarn",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_STRING = ITEMS.register("andesite_string",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CLAY_BALL_OF_YARN = ITEMS.register("clay_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLAY_STRING = ITEMS.register("clay_string",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COAL_BALL_OF_YARN = ITEMS.register("coal_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COAL_STRING = ITEMS.register("coal_string",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COBBLESTONE_BALL_OF_YARN = ITEMS.register("cobblestone_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_STRING = ITEMS.register("cobblestone_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> DIAMOND_BALL_OF_YARN = ITEMS.register("diamond_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_STRING = ITEMS.register("diamond_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> DIORITE_BALL_OF_YARN = ITEMS.register("diorite_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIORITE_STRING = ITEMS.register("diorite_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> DIRT_BALL_OF_YARN = ITEMS.register("dirt_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRT_STRING = ITEMS.register("dirt_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> EMERALD_BALL_OF_YARN = ITEMS.register("emerald_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_STRING = ITEMS.register("emerald_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> GLOWSTONE_BALL_OF_YARN = ITEMS.register("glowstone_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLOWSTONE_STRING = ITEMS.register("glowstone_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> GOLD_BALL_OF_YARN = ITEMS.register("gold_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_STRING = ITEMS.register("gold_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> GRANITE_BALL_OF_YARN = ITEMS.register("granite_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRANITE_STRING = ITEMS.register("granite_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> GRAVEL_BALL_OF_YARN = ITEMS.register("gravel_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAVEL_STRING = ITEMS.register("gravel_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> ICE_BALL_OF_YARN = ITEMS.register("ice_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICE_STRING = ITEMS.register("ice_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> IRON_BALL_OF_YARN = ITEMS.register("iron_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_STRING = ITEMS.register("iron_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> LAPIS_BALL_OF_YARN = ITEMS.register("lapis_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_STRING = ITEMS.register("lapis_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> NETHERITE_BALL_OF_YARN = ITEMS.register("netherite_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_STRING = ITEMS.register("netherite_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> NETHERRACK_BALL_OF_YARN = ITEMS.register("netherrack_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERRACK_STRING = ITEMS.register("netherrack_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> OBSIDIAN_BALL_OF_YARN = ITEMS.register("obsidian_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_STRING = ITEMS.register("obsidian_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> PRISMARINE_BALL_OF_YARN = ITEMS.register("prismarine_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRISMARINE_STRING = ITEMS.register("prismarine_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> PRISMARINE_SHARD_BALL_OF_YARN = ITEMS.register("prismarine_shard_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRISMARINE_SHARD_STRING = ITEMS.register("prismarine_shard_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> PUMPKIN_BALL_OF_YARN = ITEMS.register("pumpkin_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PUMPKIN_STRING = ITEMS.register("pumpkin_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> QUARTZ_BALL_OF_YARN = ITEMS.register("quartz_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_STRING = ITEMS.register("quartz_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> REDSTONE_BALL_OF_YARN = ITEMS.register("redstone_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_STRING = ITEMS.register("redstone_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> SAND_BALL_OF_YARN = ITEMS.register("sand_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAND_STRING = ITEMS.register("sand_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> SLIME_BALL_OF_YARN = ITEMS.register("slime_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SLIME_STRING = ITEMS.register("slime_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> SOULSAND_BALL_OF_YARN = ITEMS.register("soulsand_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOULSAND_STRING = ITEMS.register("soulsand_string",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> WOOD_BALL_OF_YARN = ITEMS.register("wood_ball_of_yarn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOOD_STRING = ITEMS.register("wood_string",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ANDESITE_FERTILIZER = ITEMS.register("andesite_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_CRAFTING_STAR = ITEMS.register("andesite_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_ANDESITE_CRAFTING_STAR = ITEMS.register("supra_andesite_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CLAY_FERTILIZER = ITEMS.register("clay_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLAY_CRAFTING_STAR = ITEMS.register("clay_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_CLAY_CRAFTING_STAR = ITEMS.register("supra_clay_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COAL_FERTILIZER = ITEMS.register("coal_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COAL_CRAFTING_STAR = ITEMS.register("coal_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_COAL_CRAFTING_STAR = ITEMS.register("supra_coal_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COBBLESTONE_FERTILIZER = ITEMS.register("cobblestone_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_CRAFTING_STAR = ITEMS.register("cobblestone_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_COBBLESTONE_CRAFTING_STAR = ITEMS.register("supra_cobblestone_crafting_star",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> DIAMOND_FERTILIZER = ITEMS.register("diamond_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_CRAFTING_STAR = ITEMS.register("diamond_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_DIAMOND_CRAFTING_STAR = ITEMS.register("supra_diamond_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIORITE_FERTILIZER = ITEMS.register("diorite_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIORITE_CRAFTING_STAR = ITEMS.register("diorite_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_DIORITE_CRAFTING_STAR = ITEMS.register("supra_diorite_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIRT_FERTILIZER = ITEMS.register("dirt_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRT_CRAFTING_STAR = ITEMS.register("dirt_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_DIRT_CRAFTING_STAR = ITEMS.register("supra_dirt_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_FERTILIZER = ITEMS.register("emerald_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_CRAFTING_STAR = ITEMS.register("emerald_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_EMERALD_CRAFTING_STAR = ITEMS.register("supra_emerald_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GLOWSTONE_FERTILIZER = ITEMS.register("glowstone_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLOWSTONE_CRAFTING_STAR = ITEMS.register("glowstone_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_GLOWSTONE_CRAFTING_STAR = ITEMS.register("supra_glowstone_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLD_FERTILIZER = ITEMS.register("gold_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_CRAFTING_STAR = ITEMS.register("gold_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_GOLD_CRAFTING_STAR = ITEMS.register("supra_gold_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GRANITE_FERTILIZER = ITEMS.register("granite_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRANITE_CRAFTING_STAR = ITEMS.register("granite_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_GRANITE_CRAFTING_STAR = ITEMS.register("supra_granite_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GRAVEL_FERTILIZER = ITEMS.register("gravel_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAVEL_CRAFTING_STAR = ITEMS.register("gravel_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_GRAVEL_CRAFTING_STAR = ITEMS.register("supra_gravel_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ICE_FERTILIZER = ITEMS.register("ice_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICE_CRAFTING_STAR = ITEMS.register("ice_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_ICE_CRAFTING_STAR = ITEMS.register("supra_ice_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_FERTILIZER = ITEMS.register("iron_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_CRAFTING_STAR = ITEMS.register("iron_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_IRON_CRAFTING_STAR = ITEMS.register("supra_iron_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LAPIS_FERTILIZER = ITEMS.register("lapis_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_CRAFTING_STAR = ITEMS.register("lapis_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_LAPIS_CRAFTING_STAR = ITEMS.register("supra_lapis_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_FERTILIZER = ITEMS.register("netherite_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_CRAFTING_STAR = ITEMS.register("netherite_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_NETHERITE_CRAFTING_STAR = ITEMS.register("supra_netherite_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHERRACK_FERTILIZER = ITEMS.register("netherrack_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERRACK_CRAFTING_STAR = ITEMS.register("netherrack_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_NETHERRACK_CRAFTING_STAR = ITEMS.register("supra_netherrack_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OBSIDIAN_FERTILIZER = ITEMS.register("obsidian_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_CRAFTING_STAR = ITEMS.register("obsidian_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_OBSIDIAN_CRAFTING_STAR = ITEMS.register("supra_obsidian_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PRISMARINE_FERTILIZER = ITEMS.register("prismarine_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRISMARINE_CRAFTING_STAR = ITEMS.register("prismarine_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_PRISMARINE_CRAFTING_STAR = ITEMS.register("supra_prismarine_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PRISMARINE_SHARD_FERTILIZER = ITEMS.register("prismarine_shard_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRISMARINE_SHARD_CRAFTING_STAR = ITEMS.register("prismarine_shard_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_PRISMARINE_SHARD_CRAFTING_STAR = ITEMS.register("supra_prismarine_shard_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PUMPKIN_FERTILIZER = ITEMS.register("pumpkin_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PUMPKIN_CRAFTING_STAR = ITEMS.register("pumpkin_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_PUMPKIN_CRAFTING_STAR = ITEMS.register("supra_pumpkin_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> QUARTZ_FERTILIZER = ITEMS.register("quartz_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_CRAFTING_STAR = ITEMS.register("quartz_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_QUARTZ_CRAFTING_STAR = ITEMS.register("supra_quartz_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REDSTONE_FERTILIZER = ITEMS.register("redstone_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_CRAFTING_STAR = ITEMS.register("redstone_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_REDSTONE_CRAFTING_STAR = ITEMS.register("supra_redstone_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAND_FERTILIZER = ITEMS.register("sand_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAND_CRAFTING_STAR = ITEMS.register("sand_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_SAND_CRAFTING_STAR = ITEMS.register("supra_sand_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SLIME_FERTILIZER = ITEMS.register("slime_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SLIME_CRAFTING_STAR = ITEMS.register("slime_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_SLIME_CRAFTING_STAR = ITEMS.register("supra_slime_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SOULSAND_FERTILIZER = ITEMS.register("soulsand_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOULSAND_CRAFTING_STAR = ITEMS.register("soulsand_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_SOULSAND_CRAFTING_STAR = ITEMS.register("supra_soulsand_crafting_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WOOD_FERTILIZER = ITEMS.register("wood_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOOD_CRAFTING_STAR = ITEMS.register("wood_crafting_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUPRA_WOOD_CRAFTING_STAR = ITEMS.register("supra_wood_crafting_star",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> WOOD_SHEARS = ITEMS.register("wood_shears",
            () -> new ShearsItem(new Item.Properties().durability(5)));
    public static final RegistryObject<Item> GOLD_SHEARS = ITEMS.register("gold_shears",
            () -> new ShearsItem(new Item.Properties().durability(33)));
    public static final RegistryObject<Item> EMERALD_SHEARS = ITEMS.register("emerald_shears",
            () -> new ShearsItem(new Item.Properties().durability(450)));
    public static final RegistryObject<Item> DIAMOND_SHEARS = ITEMS.register("diamond_shears",
            () -> new ShearsItem(new Item.Properties().durability(531)));
    public static final RegistryObject<Item> OBSIDIAN_SHEARS = ITEMS.register("obsidian_shears",
            () -> new ShearsItem(new Item.Properties().durability(1001)));
    public static final RegistryObject<Item> NETHERITE_SHEARS = ITEMS.register("netherite_shears",
            () -> new ShearsItem(new Item.Properties().durability(2577)));

    public static final RegistryObject<Item> SUPRA_BLUE_EMERALD = ITEMS.register("supra_blue_emerald",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> DIAMOND_SHEEP_SPAWN_EGG = ITEMS.register("diamond_sheep_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.DIAMOND_SHEEP, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

