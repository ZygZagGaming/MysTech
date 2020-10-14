package com.zygzag.mystech;

import com.zygzag.mystech.util.ArmorRegistryHandler;
import com.zygzag.mystech.util.BlockRegistryHandler;
import com.zygzag.mystech.util.ItemRegistryHandler;
import com.zygzag.mystech.util.ToolRegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("myst")
public class MysTech
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "myst";

    public MysTech() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Initialize content registries
        ItemRegistryHandler.init();
        ToolRegistryHandler.init();
        ArmorRegistryHandler.init();
        BlockRegistryHandler.init();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
    }

    public static final ItemGroup TAB = new ItemGroup("mystechTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemRegistryHandler.T1_CORE.get());
        }
    };

}
