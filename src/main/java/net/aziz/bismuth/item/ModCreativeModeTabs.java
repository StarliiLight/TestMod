package net.aziz.bismuth.item;

import net.aziz.bismuth.Bismuth;
import net.aziz.bismuth.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB,  Bismuth.MOD_ID);

    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB =  CREATIVE_MODE_TAB.register("bismuth_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.IRIDESCENT_BISMUTH_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.bismuth.bismuth_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BISMUTH_BLOCK);
                        output.accept(ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_BLOCK);
                        output.accept(ModBlocks.BLUE_BISMUTH_CRYSTAL_BLOCK);
                        output.accept(ModBlocks.GREEN_BISMUTH_CRYSTAL_BLOCK);
                        output.accept(ModBlocks.PINK_BISMUTH_CRYSTAL_BLOCK);
                        output.accept(ModBlocks.RED_BISMUTH_CRYSTAL_BLOCK);
                        output.accept(ModItems.BISMUTH_INGOT);
                        output.accept(ModItems.BISMUTH_NUGGET);
                        output.accept(ModItems.IRIDESCENT_BISMUTH_CRYSTAL);
                        output.accept(ModItems.BLUE_BISMUTH_CRYSTAL);
                        output.accept(ModItems.GREEN_BISMUTH_CRYSTAL);
                        output.accept(ModItems.PINK_BISMUTH_CRYSTAL);
                        output.accept(ModItems.RED_BISMUTH_CRYSTAL);

                    }).build());

    public static final Supplier<CreativeModeTab> POTASSIUM_ITEMS_TAB =  CREATIVE_MODE_TAB.register("potassium_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blocks.TNT))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Bismuth.MOD_ID, "bismuth_items_tab"))
                    .title(Component.translatable("creativetab.bismuth.potassium_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.POTASSIUM_INGOT);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
