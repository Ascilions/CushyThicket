package net.asterite.item;

import net.asterite.Cushy;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.ItemGroupEventsImpl;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CushyItems {

    public static final Item MERCURY_INGOT = register(
            new Item(new Item.Settings()),
            "mercury_ingot"
    );

    public static Item register(Item item, String name){
        Identifier itemID = Identifier.of(Cushy.MOD_ID, name);

        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        return registeredItem;
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(CushyItems.MERCURY_INGOT));
    }

}
