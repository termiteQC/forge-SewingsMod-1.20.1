package net.termiteqc.sewingsmod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShearsItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
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



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

