package net.aziz.bismuth.item.custom_fuels;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.NotNull;

public class FuelItem extends Item {
    public FuelItem(Properties properties, int burnTime) {
        super(properties);
        this.burnTime = burnTime;
    }
    private final int burnTime;

    @Override
    public int getBurnTime(@NotNull ItemStack stack, RecipeType recipe) {
        return burnTime;
    }
}
