package net.aziz.bismuth.datagen;

import net.aziz.bismuth.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static net.aziz.bismuth.Bismuth.MOD_ID;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .add(ModBlocks.BISMUTH_BLOCK.get())
        .add(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_BLOCK.get())
        .add(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_NETHERRACK_ORE.get())
        .add(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_DEEPSLATE_ORE.get())
        .add(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_STONE_ORE.get())
        .add(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_ENDSTONE_ORE.get())
        .add(ModBlocks.BLUE_BISMUTH_CRYSTAL_BLOCK.get())
        .add(ModBlocks.BLUE_BISMUTH_CRYSTAL_NETHERRACK_ORE.get())
        .add(ModBlocks.PINK_BISMUTH_CRYSTAL_BLOCK.get())
        .add(ModBlocks.PINK_BISMUTH_CRYSTAL_ENDSTONE_ORE.get())
        .add(ModBlocks.PINK_BISMUTH_CRYSTAL_STONE_ORE.get())
        .add(ModBlocks.PINK_BISMUTH_CRYSTAL_DEEPSLATE_ORE.get())
        .add(ModBlocks.GREEN_BISMUTH_CRYSTAL_BLOCK.get())
        .add(ModBlocks.GREEN_BISMUTH_CRYSTAL_ENDSTONE_ORE.get())
        .add(ModBlocks.GREEN_BISMUTH_CRYSTAL_STONE_ORE.get())
        .add(ModBlocks.GREEN_BISMUTH_CRYSTAL_DEEPSLATE_ORE.get())
        .add(ModBlocks.RED_BISMUTH_CRYSTAL_BLOCK.get())
        .add(ModBlocks.RED_BISMUTH_CRYSTAL_NETHERRACK_ORE.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
        .add(ModBlocks.GREEN_BISMUTH_CRYSTAL_DEEPSLATE_ORE.get())
        .add(ModBlocks.GREEN_BISMUTH_CRYSTAL_ENDSTONE_ORE.get())
        .add(ModBlocks.PINK_BISMUTH_CRYSTAL_DEEPSLATE_ORE.get())
        .add(ModBlocks.PINK_BISMUTH_CRYSTAL_ENDSTONE_ORE.get())
        .add(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_ENDSTONE_ORE.get())
        .add(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_DEEPSLATE_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
        .add(ModBlocks.BISMUTH_BLOCK.get())
        .add(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_BLOCK.get())
        .add(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_NETHERRACK_ORE.get())
        .add(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_STONE_ORE.get())
        .add(ModBlocks.BLUE_BISMUTH_CRYSTAL_BLOCK.get())
        .add(ModBlocks.BLUE_BISMUTH_CRYSTAL_NETHERRACK_ORE.get())
        .add(ModBlocks.PINK_BISMUTH_CRYSTAL_BLOCK.get())
        .add(ModBlocks.PINK_BISMUTH_CRYSTAL_STONE_ORE.get())
        .add(ModBlocks.GREEN_BISMUTH_CRYSTAL_BLOCK.get())
        .add(ModBlocks.GREEN_BISMUTH_CRYSTAL_STONE_ORE.get())
        .add(ModBlocks.RED_BISMUTH_CRYSTAL_BLOCK.get())
        .add(ModBlocks.RED_BISMUTH_CRYSTAL_NETHERRACK_ORE.get());
    }
}
