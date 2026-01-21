package net.aziz.bismuth.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static net.aziz.bismuth.Bismuth.MOD_ID;

public class ModTags {

    public static class Blocks {

    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MOD_ID, name));
        }

        public static final TagKey<Item> BISMUTH_CRYSTALS = createTag("bismuth/bismuth_crystals");
    }
}
