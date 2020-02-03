package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(ExampleMod.MOD_ID)
public class ModItems {

    @GameRegistry.ObjectHolder("ruby")
    public static final Item RUBY = null;

    @Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID)
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            final Item[] items = {
                    new Item().setRegistryName(ExampleMod.MOD_ID, "ruby").setUnlocalizedName(ExampleMod.MOD_ID + ".ruby").setCreativeTab(CreativeTabs.FOOD)
            };

            event.getRegistry().registerAll(items);
        }
    }

}
