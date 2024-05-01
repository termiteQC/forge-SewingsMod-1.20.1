package net.termiteqc.entity.custom;

import com.google.common.collect.Maps;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.TransientCraftingContainer;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraftforge.common.IForgeShearable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Collectors;

public class DiamondSheepEntity extends Sheep{
    private EatBlockGoal eatBlockGoal;

    public DiamondSheepEntity(EntityType<? extends Sheep> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }


    protected void registerGoals() {
        this.eatBlockGoal = new EatBlockGoal(this);
        this.goalSelector.addGoal(0, new FloatGoal(this)); // Float on water
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25)); // Escape when hurt
        this.goalSelector.addGoal(2, this.eatBlockGoal); //Eat
        this.goalSelector.addGoal(3, new WaterAvoidingRandomStrollGoal(this, 1.0)); // Avoid water when moving
        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, 6.0F)); // Look at player
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this)); // Look around
    }

    public static AttributeSupplier.Builder createAttributes(){
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 20D)
                .add(Attributes.MOVEMENT_SPEED, 0.50D)
                .add(Attributes.FOLLOW_RANGE, 5D);
    }
}
