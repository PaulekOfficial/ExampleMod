package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class RubyAxeItem extends ItemAxe {

    public RubyAxeItem() {
        super(ToolMaterial.DIAMOND);
        setRegistryName(ExampleMod.MOD_ID, "ruby_axe");
        setUnlocalizedName(ExampleMod.MOD_ID + ".ruby_axe");
        setCreativeTab(ExampleMod.CREATIVE_TABS);
    }

}
