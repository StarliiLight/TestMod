package net.aziz.bismuth.item;

import net.aziz.bismuth.Bismuth;
import net.aziz.bismuth.item.bismuth_custom_item.BismuthChiselItem;
import net.aziz.bismuth.item.custom_fuels.FuelItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Bismuth.MOD_ID);

    public static final DeferredItem<Item> BISMUTH_INGOT = ITEMS.register("bismuth_ingot",
            () -> new Item((new Item.Properties()).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final DeferredItem<Item> BISMUTH_NUGGET = ITEMS.register("bismuth_nugget",
            () -> new Item((new Item.Properties()).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final DeferredItem<Item> IRIDESCENT_BISMUTH_CRYSTAL = ITEMS.register("iridescent_bismuth_crystal",
            () -> new Item((new Item.Properties()).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final DeferredItem<Item> BLUE_BISMUTH_CRYSTAL = ITEMS.register("blue_bismuth_crystal",
            () -> new Item((new Item.Properties()).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final DeferredItem<Item> GREEN_BISMUTH_CRYSTAL = ITEMS.register("green_bismuth_crystal",
            () -> new Item((new Item.Properties()).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final DeferredItem<Item> PINK_BISMUTH_CRYSTAL = ITEMS.register("pink_bismuth_crystal",
            () -> new Item((new Item.Properties()).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final DeferredItem<Item> RED_BISMUTH_CRYSTAL = ITEMS.register("red_bismuth_crystal",
            () -> new Item((new Item.Properties()).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final DeferredItem<Item> BISMUTH_CHISEL = ITEMS.register("bismuth_chisel",
            () -> new BismuthChiselItem((new Item.Properties().durability(80))));
    public static final DeferredItem<Item> POTASSIUM_INGOT = ITEMS.register("potassium_ingot",
            () -> new Item((new Item.Properties())));
    //TODO give potassium texture and JSON

    public static final DeferredItem<Item> RADISH = ITEMS.register("radish", () -> new FuelItem((new Item.Properties()
            .food(
                new FoodProperties.Builder().nutrition(10).saturationModifier(1.2F).alwaysEdible().effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 255), 1).effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 200, 2), 1).effect(() -> new MobEffectInstance(MobEffects.JUMP, 2000, 255), 1).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 2000, 255), 1).effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 200, 2), 1).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 200, 2), 1).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 2), 1).build()
            )), 40000));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
