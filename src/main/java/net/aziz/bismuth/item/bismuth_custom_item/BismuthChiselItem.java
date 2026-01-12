package net.aziz.bismuth.item.bismuth_custom_item;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class BismuthChiselItem extends Item {

    public BismuthChiselItem(Properties properties) {
        super(properties);
    }
    public static final Map<Block, Block> CHISEL_MAP = Map.of(Blocks.STONE, Blocks.STONE_BRICKS, Blocks.DEEPSLATE, Blocks.DEEPSLATE_BRICKS, Blocks.END_STONE, Blocks.END_STONE_BRICKS, Blocks.BLACKSTONE, Blocks.POLISHED_BLACKSTONE_BRICKS);
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block block = level.getBlockState(context.getClickedPos()).getBlock();
        if (CHISEL_MAP.containsKey(block)) {
            if (!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), CHISEL_MAP.get(block).defaultBlockState());
                level.playSound(null, context.getClickedPos(), SoundEvents.AMETHYST_BLOCK_STEP, SoundSource.BLOCKS);
                context.getItemInHand().hurtAndBreak(1, (ServerLevel) level, context.getPlayer(), item -> context.getPlayer().onEquippedItemBroken(item, LivingEntity.getSlotForHand(context.getHand())));
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.FAIL;
    }
}

//TODO Make it work for ALL stonecutter recipes
