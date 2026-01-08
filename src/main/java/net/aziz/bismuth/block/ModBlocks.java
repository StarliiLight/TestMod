package net.aziz.bismuth.block;

import net.aziz.bismuth.Bismuth;
import net.aziz.bismuth.item.ModItems;
import net.minecraft.core.component.DataComponents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
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

    public static final DeferredBlock<Block> IRIDESCENT_BISMUTH_CRYSTAL_STONE_ORE = registerBlock("iridescent_bismuth_crystal_stone_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> IRIDESCENT_BISMUTH_CRYSTAL_DEEPSLATE_ORE = registerBlock("iridescent_bismuth_crystal_deepslate_ore", () -> new DropExperienceBlock(UniformInt.of(3, 5), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> IRIDESCENT_BISMUTH_CRYSTAL_NETHERRACK_ORE = registerBlock("iridescent_bismuth_crystal_netherrack_ore", () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> IRIDESCENT_BISMUTH_CRYSTAL_ENDSTONE_ORE = registerBlock("iridescent_bismuth_crystal_endstone_ore", () -> new DropExperienceBlock(UniformInt.of(4, 6), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> BLUE_BISMUTH_CRYSTAL_NETHERRACK_ORE = registerBlock("blue_bismuth_crystal_netherrack_ore", () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> PINK_BISMUTH_CRYSTAL_STONE_ORE = registerBlock("pink_bismuth_crystal_stone_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> PINK_BISMUTH_CRYSTAL_DEEPSLATE_ORE = registerBlock("pink_bismuth_crystal_deepslate_ore", () -> new DropExperienceBlock(UniformInt.of(3, 5), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> PINK_BISMUTH_CRYSTAL_ENDSTONE_ORE = registerBlock("pink_bismuth_crystal_endstone_ore", () -> new DropExperienceBlock(UniformInt.of(4, 6), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> RED_BISMUTH_CRYSTAL_NETHERRACK_ORE = registerBlock("red_bismuth_crystal_netherrack_ore", () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> GREEN_BISMUTH_CRYSTAL_STONE_ORE = registerBlock("green_bismuth_crystal_stone_ore", () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> GREEN_BISMUTH_CRYSTAL_DEEPSLATE_ORE = registerBlock("green_bismuth_crystal_deepslate_ore", () -> new DropExperienceBlock(UniformInt.of(3, 5), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> GREEN_BISMUTH_CRYSTAL_ENDSTONE_ORE = registerBlock("green_bismuth_crystal_endstone_ore", () -> new DropExperienceBlock(UniformInt.of(4, 6), BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    //TODO Make the block-item json files for the ores
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
