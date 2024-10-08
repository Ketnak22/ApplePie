package net.ketnak.applepie.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ketnak.applepie.ApplePie;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item APPLE_PIE = registerItem("apple_pie",
            new Item(new Item.Settings().food(ModFoodComponents.APPLE_PIE)));

    public static final Item GOLDEN_APPLE_PIE = registerItem("golden_apple_pie",
            new Item(new Item.Settings().rarity(Rarity.RARE).food(ModFoodComponents.GOLDEN_APPLE_PIE)));

    public static final Item ENCHANTED_GOLDEN_APPLE_PIE = registerItem("enchanted_golden_apple_pie",
            new Item(new Item.Settings().rarity(Rarity.EPIC).food(ModFoodComponents.ENCHANTED_GOLDEN_APPLE_PIE).component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ApplePie.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ApplePie.LOGGER.info("Registering mod items for " + ApplePie.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(APPLE_PIE);
            entries.add(GOLDEN_APPLE_PIE);
            entries.add(ENCHANTED_GOLDEN_APPLE_PIE);
        });
    }

}
