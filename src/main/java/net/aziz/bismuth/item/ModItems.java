package net.aziz.bismuth.item;

import net.aziz.bismuth.Bismuth;
import net.minecraft.core.component.DataComponents;
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

    public static final DeferredItem<Item> POTASSIUM_INGOT = ITEMS.register("potassium_ingot",
            () -> new Item((new Item.Properties())));
    //TODO give potassium texture and JSON
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
