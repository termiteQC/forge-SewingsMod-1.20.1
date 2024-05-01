package net.termiteqc.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.termiteqc.entity.custom.DiamondSheepEntity;
import net.termiteqc.sewingsmod.SewingsMod;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SewingsMod.MOD_ID);

    public static final RegistryObject<EntityType<DiamondSheepEntity>> DIAMOND_SHEEP =
            ENTITY_TYPES.register("diamond_sheep", () -> EntityType.Builder.of(DiamondSheepEntity::new, MobCategory.CREATURE)
                    .sized(2f, 2f).build("diamond_sheep"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
