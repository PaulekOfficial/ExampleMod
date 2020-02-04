package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.blocks.RubinBlock;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(ExampleMod.MOD_ID)
public class ModBlocks {

    @GameRegistry.ObjectHolder("rubin_block")
    public static final Block RUBIN_BLOCK = null;

    @Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID)
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            final Block[] blocks = {
                new RubinBlock()
            };

            event.getRegistry().registerAll(blocks);
        }
    }

}
