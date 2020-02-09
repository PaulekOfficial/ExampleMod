package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.blocks.RubyBlock;
import com.example.examplemod.init.ModBlocks;
import com.example.examplemod.items.*;
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
                new RubyItem(),
                new RubySwordItem(),
                new RubyPickaxeItem(),
                new RubyAxeItem(),
                new RubyShovelItem(),
                new RubyHoeItem()
        };

        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.RUBY_BLOCK).setRegistryName(ModBlocks.RUBY_BLOCK.getRegistryName())
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }

}
