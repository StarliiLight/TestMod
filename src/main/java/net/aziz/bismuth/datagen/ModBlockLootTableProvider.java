package net.aziz.bismuth.datagen;

import net.aziz.bismuth.block.ModBlocks;
import net.aziz.bismuth.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }
    public static final Map<DeferredBlock<Block>, DeferredItem<Item>> ORE_DROPS = Map.ofEntries(
            entry(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_STONE_ORE, ModItems.IRIDESCENT_BISMUTH_CRYSTAL),
            entry(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_DEEPSLATE_ORE, ModItems.IRIDESCENT_BISMUTH_CRYSTAL),
            entry(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_NETHERRACK_ORE, ModItems.IRIDESCENT_BISMUTH_CRYSTAL),
            entry(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_ENDSTONE_ORE, ModItems.IRIDESCENT_BISMUTH_CRYSTAL),
            entry(ModBlocks.BLUE_BISMUTH_CRYSTAL_NETHERRACK_ORE, ModItems.BLUE_BISMUTH_CRYSTAL),
            entry(ModBlocks.RED_BISMUTH_CRYSTAL_NETHERRACK_ORE, ModItems.RED_BISMUTH_CRYSTAL),
            entry(ModBlocks.PINK_BISMUTH_CRYSTAL_STONE_ORE, ModItems.PINK_BISMUTH_CRYSTAL),
            entry(ModBlocks.PINK_BISMUTH_CRYSTAL_DEEPSLATE_ORE, ModItems.PINK_BISMUTH_CRYSTAL),
            entry(ModBlocks.PINK_BISMUTH_CRYSTAL_ENDSTONE_ORE, ModItems.PINK_BISMUTH_CRYSTAL),
            entry(ModBlocks.GREEN_BISMUTH_CRYSTAL_STONE_ORE, ModItems.GREEN_BISMUTH_CRYSTAL),
            entry(ModBlocks.GREEN_BISMUTH_CRYSTAL_DEEPSLATE_ORE, ModItems.GREEN_BISMUTH_CRYSTAL),
            entry(ModBlocks.GREEN_BISMUTH_CRYSTAL_ENDSTONE_ORE, ModItems.GREEN_BISMUTH_CRYSTAL)
            );
    @Override
    protected void generate() {
        dropSelf(ModBlocks.BISMUTH_BLOCK.get());

        ORE_DROPS.forEach((block, item) -> {
            add(block.get(), ore_block -> createMultiOreDrops(block.get(), item.get(), 2.0F, 3.0F));
        });
        add(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_BLOCK.get(), block -> createCrystallineBlockDrops(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_BLOCK.get(), ModItems.IRIDESCENT_BISMUTH_CRYSTAL.get()));
        add(ModBlocks.BLUE_BISMUTH_CRYSTAL_BLOCK.get(), block -> createCrystallineBlockDrops(ModBlocks.BLUE_BISMUTH_CRYSTAL_BLOCK.get(), ModItems.BLUE_BISMUTH_CRYSTAL.get()));
        add(ModBlocks.RED_BISMUTH_CRYSTAL_BLOCK.get(), block -> createCrystallineBlockDrops(ModBlocks.RED_BISMUTH_CRYSTAL_BLOCK.get(), ModItems.RED_BISMUTH_CRYSTAL.get()));
        add(ModBlocks.PINK_BISMUTH_CRYSTAL_BLOCK.get(), block -> createCrystallineBlockDrops(ModBlocks.PINK_BISMUTH_CRYSTAL_BLOCK.get(), ModItems.PINK_BISMUTH_CRYSTAL.get()));
        add(ModBlocks.GREEN_BISMUTH_CRYSTAL_BLOCK.get(), block -> createCrystallineBlockDrops(ModBlocks.GREEN_BISMUTH_CRYSTAL_BLOCK.get(), ModItems.GREEN_BISMUTH_CRYSTAL.get()));
    }

    protected LootTable.Builder createMultiOreDrops(Block block, Item item, float min, float max) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(block, LootItem.lootTableItem(item).apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max))).apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected LootTable.Builder createCrystallineBlockDrops(Block block, Item item) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(block, LootItem.lootTableItem(item).apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 4.0F)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
