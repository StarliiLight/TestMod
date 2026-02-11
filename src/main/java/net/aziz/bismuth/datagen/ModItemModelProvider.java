package net.aziz.bismuth.datagen;

import net.aziz.bismuth.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static net.aziz.bismuth.Bismuth.MOD_ID;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.IRIDESCENT_BISMUTH_CRYSTAL.get());
        basicItem(ModItems.BLUE_BISMUTH_CRYSTAL.get());
        basicItem(ModItems.RED_BISMUTH_CRYSTAL.get());
        basicItem(ModItems.PINK_BISMUTH_CRYSTAL.get());
        basicItem(ModItems.GREEN_BISMUTH_CRYSTAL.get());
        basicItem(ModItems.BISMUTH_INGOT.get());
        basicItem(ModItems.BISMUTH_NUGGET.get());
        basicItem(ModItems.BISMUTH_CHISEL.get());
        basicItem(ModItems.RADISH.get());
//        basicItem(ModItems.POTASSIUM_INGOT.get());
    }
}
