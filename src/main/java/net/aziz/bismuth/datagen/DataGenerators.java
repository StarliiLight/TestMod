package net.aziz.bismuth.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import static net.aziz.bismuth.Bismuth.MOD_ID;

@EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent dataEvent) {
        DataGenerator generator = dataEvent.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper helper = dataEvent.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = dataEvent.getLookupProvider();

        generator.addProvider(dataEvent.includeServer(), new LootTableProvider(packOutput, Set.of(), List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
        generator.addProvider(dataEvent.includeClient(), new ModBlockStateProvider(packOutput, helper));
        generator.addProvider(dataEvent.includeClient(), new ModItemModelProvider(packOutput, helper));
        generator.addProvider(dataEvent.includeServer(), new ModRecipeProvider(packOutput, lookupProvider));
        BlockTagsProvider blockTagsProvider = new ModBlockTagsProvider(packOutput, lookupProvider, helper);
        generator.addProvider(dataEvent.includeServer(), blockTagsProvider);
        generator.addProvider(dataEvent.includeServer(), new ModItemTagsProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter()));
    }
}
