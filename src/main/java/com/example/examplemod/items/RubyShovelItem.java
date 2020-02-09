package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.ItemSpade;

public class RubyShovelItem extends ItemSpade {

    public RubyShovelItem() {
        super(ToolMaterial.DIAMOND);
        setRegistryName(ExampleMod.MOD_ID, "ruby_shovel");
        setUnlocalizedName(ExampleMod.MOD_ID + ".ruby_shovel");
        setCreativeTab(ExampleMod.CREATIVE_TABS);
    }

}
