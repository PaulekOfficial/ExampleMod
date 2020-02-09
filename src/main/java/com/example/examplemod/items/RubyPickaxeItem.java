package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.ItemPickaxe;

public class RubyPickaxeItem extends ItemPickaxe {

    public RubyPickaxeItem() {
        super(ToolMaterial.DIAMOND);
        setUnlocalizedName(ExampleMod.MOD_ID + ".ruby_pickaxe");
        setRegistryName(ExampleMod.MOD_ID, "ruby_pickaxe");
        setCreativeTab(ExampleMod.CREATIVE_TABS);
    }

}
