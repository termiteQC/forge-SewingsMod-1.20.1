package net.termiteqc.sewingsmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.termiteqc.sewingsmod.SewingsMod;
import net.termiteqc.sewingsmod.block.custom.CardingTable;
import net.termiteqc.sewingsmod.block.custom.SewingsMachine;
import net.termiteqc.sewingsmod.block.custom.WinderPole;
import net.termiteqc.sewingsmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SewingsMod.MOD_ID);

    public static final RegistryObject<Block> ANDESITE_WOOL = registerBlock("andesite_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)));
    public static final RegistryObject<Block> CLAY_WOOL = registerBlock("clay_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)));
    public static final RegistryObject<Block> COAL_WOOL = registerBlock("coal_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)));
    public static final RegistryObject<Block> COBBLESTONE_WOOL = registerBlock("cobblestone_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)));
    public static final RegistryObject<Block> DIAMOND_WOOL = registerBlock("diamond_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final RegistryObject<Block> DIORITE_WOOL = registerBlock("diorite_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> DIRT_WOOL = registerBlock("dirt_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> EMERALD_WOOL = registerBlock("emerald_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)));
    public static final RegistryObject<Block> GLOWSTONE_WOOL = registerBlock("glowstone_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)));
    public static final RegistryObject<Block> GOLD_WOOL = registerBlock("gold_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)));
    public static final RegistryObject<Block> GRANITE_WOOL = registerBlock("granite_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> GRAVEL_WOOL = registerBlock("gravel_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)));
    public static final RegistryObject<Block> ICE_WOOL = registerBlock("ice_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)));
    public static final RegistryObject<Block> IRON_WOOL = registerBlock("iron_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)));
    public static final RegistryObject<Block> LAPIS_WOOL = registerBlock("lapis_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)));
    public static final RegistryObject<Block> NETHERITE_WOOL = registerBlock("netherite_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)));
    public static final RegistryObject<Block> NETHERRACK_WOOL = registerBlock("netherrack_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)));
    public static final RegistryObject<Block> OBSIDIAN_WOOL = registerBlock("obsidian_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)));
    public static final RegistryObject<Block> PRISMARINE_WOOL = registerBlock("prismarine_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final RegistryObject<Block> PRISMARINE_SHARD_WOOL = registerBlock("prismarine_shard_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final RegistryObject<Block> PUMPKIN_WOOL = registerBlock("pumpkin_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)));
    public static final RegistryObject<Block> QUARTZ_WOOL = registerBlock("quartz_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> REDSTONE_WOOL = registerBlock("redstone_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)));
    public static final RegistryObject<Block> SAND_WOOL = registerBlock("sand_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> SLIME_WOOL = registerBlock("slime_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));
    public static final RegistryObject<Block> SOULSAND_WOOL = registerBlock("soulsand_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> WOOD_WOOL = registerBlock("wood_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));


    public static final RegistryObject<Block> DIRT_WITH_ANDESITE_FERTILIZER = registerBlock("dirt_with_andesite_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_CLAY_FERTILIZER = registerBlock("dirt_with_clay_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_COAL_FERTILIZER = registerBlock("dirt_with_coal_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_COBBLESTONE_FERTILIZER = registerBlock("dirt_with_cobblestone_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_DIAMOND_FERTILIZER = registerBlock("dirt_with_diamond_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_DIORITE_FERTILIZER = registerBlock("dirt_with_diorite_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_DIRT_FERTILIZER = registerBlock("dirt_with_dirt_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_EMERALD_FERTILIZER = registerBlock("dirt_with_emerald_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_GLOWSTONE_FERTILIZER = registerBlock("dirt_with_glowstone_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_GOLD_FERTILIZER = registerBlock("dirt_with_gold_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_GRANITE_FERTILIZER = registerBlock("dirt_with_granite_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_GRAVEL_FERTILIZER = registerBlock("dirt_with_gravel_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_ICE_FERTILIZER = registerBlock("dirt_with_ice_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_IRON_FERTILIZER = registerBlock("dirt_with_iron_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_LAPIS_FERTILIZER = registerBlock("dirt_with_lapis_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_NETHERITE_FERTILIZER = registerBlock("dirt_with_netherite_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_NETHERRACK_FERTILIZER = registerBlock("dirt_with_netherrack_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_OBSIDIAN_FERTILIZER = registerBlock("dirt_with_obsidian_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_PRISMARINE_FERTILIZER = registerBlock("dirt_with_prismarine_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_PRISMARINE_SHARD_FERTILIZER = registerBlock("dirt_with_prismarine_shard_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_PUMPKIN_FERTILIZER = registerBlock("dirt_with_pumpkin_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_QUARTZ_FERTILIZER = registerBlock("dirt_with_quartz_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_REDSTONE_FERTILIZER = registerBlock("dirt_with_redstone_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_SAND_FERTILIZER = registerBlock("dirt_with_sand_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_SLIME_FERTILIZER = registerBlock("dirt_with_slime_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_SOULSAND_FERTILIZER = registerBlock("dirt_with_soulsand_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRT_WITH_WOOD_FERTILIZER = registerBlock("dirt_with_wood_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));



    public static final RegistryObject<Block> GRASS_WITH_ANDESITE_FERTILIZER = registerBlock("grass_with_andesite_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_CLAY_FERTILIZER = registerBlock("grass_with_clay_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_COAL_FERTILIZER = registerBlock("grass_with_coal_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_COBBLESTONE_FERTILIZER = registerBlock("grass_with_cobblestone_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_DIAMOND_FERTILIZER = registerBlock("grass_with_diamond_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_DIORITE_FERTILIZER = registerBlock("grass_with_diorite_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_DIRT_FERTILIZER = registerBlock("grass_with_dirt_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_EMERALD_FERTILIZER = registerBlock("grass_with_emerald_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_GLOWSTONE_FERTILIZER = registerBlock("grass_with_glowstone_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_GOLD_FERTILIZER = registerBlock("grass_with_gold_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_GRANITE_FERTILIZER = registerBlock("grass_with_granite_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_GRAVEL_FERTILIZER = registerBlock("grass_with_gravel_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_ICE_FERTILIZER = registerBlock("grass_with_ice_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_IRON_FERTILIZER = registerBlock("grass_with_iron_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_LAPIS_FERTILIZER = registerBlock("grass_with_lapis_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_NETHERITE_FERTILIZER = registerBlock("grass_with_netherite_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_NETHERRACK_FERTILIZER = registerBlock("grass_with_netherrack_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_OBSIDIAN_FERTILIZER = registerBlock("grass_with_obsidian_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_PRISMARINE_FERTILIZER = registerBlock("grass_with_prismarine_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_PRISMARINE_SHARD_FERTILIZER = registerBlock("grass_with_prismarine_shard_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_PUMPKIN_FERTILIZER = registerBlock("grass_with_pumpkin_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_QUARTZ_FERTILIZER = registerBlock("grass_with_quartz_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_REDSTONE_FERTILIZER = registerBlock("grass_with_redstone_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_SAND_FERTILIZER = registerBlock("grass_with_sand_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_SLIME_FERTILIZER = registerBlock("grass_with_slime_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_SOULSAND_FERTILIZER = registerBlock("grass_with_soulsand_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GRASS_WITH_WOOD_FERTILIZER = registerBlock("grass_with_wood_fertilizer",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));




    public static final RegistryObject<Block> CARDING_TABLE = registerBlock("carding_table",
            () -> new CardingTable(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).noOcclusion()));
    public static final RegistryObject<Block> SEWINGS_MACHINE = registerBlock("sewings_machine",
            () -> new SewingsMachine(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));
    public static final RegistryObject<Block> WINDER_POLE = registerBlock("winder_pole",
            () -> new WinderPole(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
    return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
}

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
