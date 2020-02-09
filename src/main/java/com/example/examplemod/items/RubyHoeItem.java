package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.ItemHoe;

public class RubyHoeItem extends ItemHoe {

    public RubyHoeItem() {
        super(ToolMaterial.DIAMOND);
        setRegistryName(ExampleMod.MOD_ID, "ruby_hoe");
        setUnlocalizedName(ExampleMod.MOD_ID + ".ruby_hoe");
        setCreativeTab(ExampleMod.CREATIVE_TABS);
    }

}
