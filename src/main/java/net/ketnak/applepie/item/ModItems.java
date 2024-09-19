package net.ketnak.applepie.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ketnak.applepie.ApplePie;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item APPLE_PIE = registerItem("apple_pie", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ApplePie.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ApplePie.LOGGER.info("Registering mod items for " + ApplePie.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(APPLE_PIE);
        });
    }

}
