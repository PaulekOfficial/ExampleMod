package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.ItemSword;

public class RubySwordItem extends ItemSword {

    public RubySwordItem() {
        super(ToolMaterial.DIAMOND);
        setRegistryName(ExampleMod.MOD_ID, "ruby_sword");
        setUnlocalizedName(ExampleMod.MOD_ID + ".ruby_sword");
        setCreativeTab(ExampleMod.CREATIVE_TABS);
    }

}
