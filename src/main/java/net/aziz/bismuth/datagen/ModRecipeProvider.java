package net.aziz.bismuth.datagen;

import net.aziz.bismuth.block.ModBlocks;
import net.aziz.bismuth.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

import static net.aziz.bismuth.Bismuth.MOD_ID;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    public static void threeByThreeReversible(RecipeOutput recipeOutput, ItemLike big, ItemLike small, RecipeCategory category) {
        ShapedRecipeBuilder.shaped(category, big).pattern("BBB").pattern("BBB").pattern("BBB").define('B', small).unlockedBy("has_"+getItemName(small), has(small)).save(recipeOutput, MOD_ID+":"+getItemName(big)+"_from_"+getItemName(small));
        ShapelessRecipeBuilder.shapeless(category, small, 9).requires(big).unlockedBy("has_"+getItemName(big), has(big)).save(recipeOutput, MOD_ID+":"+getItemName(small)+"_from_"+getItemName(big));
    }

    public static void twoByTwoReversible(RecipeOutput recipeOutput, ItemLike big, ItemLike small, RecipeCategory category) {
        ShapedRecipeBuilder.shaped(category, big).pattern("BB").pattern("BB").define('B', small).unlockedBy("has_"+getItemName(small), has(small)).save(recipeOutput, MOD_ID+":"+getItemName(big)+"_from_"+getItemName(small));
        ShapelessRecipeBuilder.shapeless(category, small, 4).requires(big).unlockedBy("has_"+getItemName(big), has(big)).save(recipeOutput, MOD_ID+":"+getItemName(small)+"_from_"+getItemName(big));
    }
    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        threeByThreeReversible(recipeOutput, ModBlocks.BISMUTH_BLOCK.get(), ModItems.BISMUTH_INGOT.get(), RecipeCategory.MISC);
        threeByThreeReversible(recipeOutput, ModItems.BISMUTH_INGOT.get(), ModItems.BISMUTH_NUGGET.get(), RecipeCategory.MISC);
        twoByTwoReversible(recipeOutput, ModBlocks.IRIDESCENT_BISMUTH_CRYSTAL_BLOCK.get(), ModItems.IRIDESCENT_BISMUTH_CRYSTAL.get(), RecipeCategory.MISC);
        twoByTwoReversible(recipeOutput, ModBlocks.BLUE_BISMUTH_CRYSTAL_BLOCK.get(), ModItems.BLUE_BISMUTH_CRYSTAL.get(), RecipeCategory.MISC);
        twoByTwoReversible(recipeOutput, ModBlocks.GREEN_BISMUTH_CRYSTAL_BLOCK.get(), ModItems.GREEN_BISMUTH_CRYSTAL.get(), RecipeCategory.MISC);
        twoByTwoReversible(recipeOutput, ModBlocks.PINK_BISMUTH_CRYSTAL_BLOCK.get(), ModItems.PINK_BISMUTH_CRYSTAL.get(), RecipeCategory.MISC);
        twoByTwoReversible(recipeOutput, ModBlocks.RED_BISMUTH_CRYSTAL_BLOCK.get(), ModItems.RED_BISMUTH_CRYSTAL.get(), RecipeCategory.MISC);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BISMUTH_CHISEL).pattern(" BI").pattern(" IB").pattern("S  ").define('B', ModItems.BISMUTH_NUGGET.get()).define('I', Items.IRON_NUGGET).define('S', Items.STICK).unlockedBy("has_bismuth_nugget", has(ModItems.BISMUTH_NUGGET.get())).save(recipeOutput);
    }
}
