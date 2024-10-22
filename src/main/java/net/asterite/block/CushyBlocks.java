package net.asterite.block;

import net.asterite.Cushy;
import net.asterite.item.CushyItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class CushyBlocks {

    public static final Block CUSHY_LOG = register(
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)),
            "cushy_log",
            true);

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier identifier = Identifier.of(Cushy.MOD_ID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, identifier, blockItem);
        }

        //return Registry.register(Registries.BLOCK, identifier, block);
        return Registry.register(Registries.BLOCK, identifier, block);
    }

    public static void initialize(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(CushyBlocks.CUSHY_LOG));
    }
}
