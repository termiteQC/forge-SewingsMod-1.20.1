package net.termiteqc.sewingsmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.termiteqc.sewingsmod.SewingsMod;
import net.termiteqc.sewingsmod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SewingsMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlockWithItem(ModBlocks.CARDING_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/carding_table")));
        simpleBlockWithItem(ModBlocks.SEWINGS_MACHINE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/sewings_machine")));
        simpleBlockWithItem(ModBlocks.WINDER_POLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/winder_pole")));
    }



    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}