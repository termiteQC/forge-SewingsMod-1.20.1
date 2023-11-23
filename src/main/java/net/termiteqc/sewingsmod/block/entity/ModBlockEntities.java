package net.termiteqc.sewingsmod.block.entity;

import net.minecraft.world.damagesource.DamageEffects;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.termiteqc.sewingsmod.SewingsMod;
import net.termiteqc.sewingsmod.block.ModBlocks;

import java.rmi.registry.Registry;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SewingsMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<CardingTableBlockEntity>> CARDING_TABLE_BE =
            BLOCK_ENTITIES.register("carding_table_be", () ->
                    BlockEntityType.Builder.of(CardingTableBlockEntity::new,
                            ModBlocks.CARDING_TABLE.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
