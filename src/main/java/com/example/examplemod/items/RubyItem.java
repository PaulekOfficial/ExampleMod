package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Item;

public class RubyItem extends Item {

    public RubyItem() {
        setRegistryName(ExampleMod.MOD_ID, "ruby");
        setUnlocalizedName(ExampleMod.MOD_ID + ".ruby");
        setCreativeTab(ExampleMod.CREATIVE_TABS);
    }

}
