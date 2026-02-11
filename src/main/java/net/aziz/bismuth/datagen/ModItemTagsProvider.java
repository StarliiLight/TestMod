package net.aziz.bismuth.datagen;

import net.aziz.bismuth.item.ModItems;
import net.aziz.bismuth.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, blockTags);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.BISMUTH_CRYSTALS)
        .add(ModItems.IRIDESCENT_BISMUTH_CRYSTAL.get())
        .add(ModItems.RED_BISMUTH_CRYSTAL.get())
        .add(ModItems.BLUE_BISMUTH_CRYSTAL.get())
        .add(ModItems.PINK_BISMUTH_CRYSTAL.get())
        .add(ModItems.GREEN_BISMUTH_CRYSTAL.get());
    }
}
