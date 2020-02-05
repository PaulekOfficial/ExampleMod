package com.example.examplemod.tabs;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ExampleTab extends CreativeTabs {

    public ExampleTab() {
        super(ExampleMod.MOD_ID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.RUBY);
    }
}
