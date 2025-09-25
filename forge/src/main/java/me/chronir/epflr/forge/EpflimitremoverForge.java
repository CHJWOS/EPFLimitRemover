package me.chronir.epflr.forge;

import me.chronir.epflr.Epflimitremover;
import me.chronir.epflr.forge.config.Config;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Epflimitremover.MOD_ID)
public final class EpflimitremoverForge {
    public EpflimitremoverForge(FMLJavaModLoadingContext context) {
        // Run our common setup.
        Epflimitremover.init();
        context.registerConfig(ModConfig.Type.COMMON, Config.init());
    }
}
