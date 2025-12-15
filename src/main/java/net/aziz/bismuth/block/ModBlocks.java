package net.aziz.bismuth.block;

import net.aziz.bismuth.Bismuth;
import net.aziz.bismuth.item.ModItems;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Bismuth.MOD_ID);

    public static final DeferredBlock<Block> BISMUTH_BLOCK = registerBlockShiny("bismuth_block", () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> IRIDESCENT_BISMUTH_CRYSTAL_BLOCK = registerBlockShiny("iridescent_bismuth_crystal_block", () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> BLUE_BISMUTH_CRYSTAL_BLOCK = registerBlockShiny("blue_bismuth_crystal_block", () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> PINK_BISMUTH_CRYSTAL_BLOCK = registerBlockShiny("pink_bismuth_crystal_block", () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> RED_BISMUTH_CRYSTAL_BLOCK = registerBlockShiny("red_bismuth_crystal_block", () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> GREEN_BISMUTH_CRYSTAL_BLOCK = registerBlockShiny("green_bismuth_crystal_block", () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block, Item.Properties properties) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, properties);
         return toReturn;
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        return registerBlock(name, block, new Item.Properties());
    }

    private static <T extends Block> DeferredBlock<T> registerBlockShiny(String name, Supplier<T> block) {
        return registerBlock(name, block, (new Item.Properties()).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true));
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block, Item.Properties properties) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
