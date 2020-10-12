package com.zygzag.mystech.items;

import com.zygzag.mystech.MysTech;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(MysTech.TAB));
    }
}
