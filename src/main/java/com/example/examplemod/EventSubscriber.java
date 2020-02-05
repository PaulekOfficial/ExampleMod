package com.example.examplemod;

import com.example.examplemod.blocks.RubyBlock;
import com.example.examplemod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBanner;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID)
public class EventSubscriber {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        final Block[] blocks = {
                new RubyBlock()
        };

        event.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final Item[] items = {
                new Item().setRegistryName(ExampleMod.MOD_ID, "ruby").setUnlocalizedName(ExampleMod.MOD_ID + ".ruby").setCreativeTab(CreativeTabs.FOOD)
        };

        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.RUBY_BLOCK).setRegistryName(ModBlocks.RUBY_BLOCK.getRegistryName())
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }

}
