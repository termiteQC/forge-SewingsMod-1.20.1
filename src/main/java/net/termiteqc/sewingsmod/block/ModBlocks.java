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
import net.termiteqc.sewingsmod.item.ModItems;

import java.util.Properties;
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