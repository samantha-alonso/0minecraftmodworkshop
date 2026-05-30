package samy.playerevolutions.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import samy.playerevolutions.playerevolutions;

public class ItemBase extends Item {
    public ItemBase() {
        super( new Item.Properties().group(playerevolutions.TAB));
    }
}
