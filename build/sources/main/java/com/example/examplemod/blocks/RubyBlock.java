package com.example.examplemod.blocks;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class RubyBlock extends Block {

    public RubyBlock() {
        super(Material.ROCK);
        this.setRegistryName(ExampleMod.MOD_ID, "ruby_block");
        this.setUnlocalizedName(ExampleMod.MOD_ID + ".ruby_block");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 2);
    }

    public Item getAsItem(){
        return ItemBlock.getItemFromBlock(this);
    }

}
