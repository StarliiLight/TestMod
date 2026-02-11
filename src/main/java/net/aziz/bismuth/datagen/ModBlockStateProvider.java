package net.aziz.bismuth.datagen;

import net.aziz.bismuth.block.ModBlocks;
import net.aziz.bismuth.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import static net.aziz.bismuth.Bismuth.MOD_ID;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MOD_ID, exFileHelper);
    }

    private void blockWithItem(DeferredBlock<?> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
    
    
    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_STONE_ORE);
        blockWithItem(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_NETHERRACK_ORE);
        blockWithItem(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_ENDSTONE_ORE);
        blockWithItem(ModBlocks.BLUE_BISMUTH_CRYSTAL_NETHERRACK_ORE);
        blockWithItem(ModBlocks.RED_BISMUTH_CRYSTAL_NETHERRACK_ORE);
        blockWithItem(ModBlocks.PINK_BISMUTH_CRYSTAL_STONE_ORE);
        blockWithItem(ModBlocks.PINK_BISMUTH_CRYSTAL_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.PINK_BISMUTH_CRYSTAL_ENDSTONE_ORE);
        blockWithItem(ModBlocks.GREEN_BISMUTH_CRYSTAL_STONE_ORE);
        blockWithItem(ModBlocks.GREEN_BISMUTH_CRYSTAL_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.GREEN_BISMUTH_CRYSTAL_ENDSTONE_ORE);
        blockWithItem(ModBlocks.BISMUTH_BLOCK);
        blockWithItem(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_BLOCK);
        blockWithItem(ModBlocks.RED_BISMUTH_CRYSTAL_BLOCK);
        blockWithItem(ModBlocks.BLUE_BISMUTH_CRYSTAL_BLOCK);
        blockWithItem(ModBlocks.GREEN_BISMUTH_CRYSTAL_BLOCK);
        blockWithItem(ModBlocks.PINK_BISMUTH_CRYSTAL_BLOCK);
    }
}
