package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.blocks.RubinBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(ExampleMod.MOD_ID)
public class ModItems {

    @GameRegistry.ObjectHolder("ruby")
    public static final Item RUBY = null;

    @GameRegistry.ObjectHolder("ruby_block")
    public static final ItemBlock RUBIN_BLOCK = null;

    @Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID)
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            final Item[] items = {
                    new Item().setRegistryName(ExampleMod.MOD_ID, "ruby").setUnlocalizedName(ExampleMod.MOD_ID + ".ruby").setCreativeTab(CreativeTabs.FOOD),
                    new ItemBlock(new RubinBlock()).setRegistryName(ExampleMod.MOD_ID, "ruby_block").setUnlocalizedName(ExampleMod.MOD_ID + ".ruby_block").setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
            };

            event.getRegistry().registerAll(items);
        }
    }

}
