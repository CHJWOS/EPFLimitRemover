package me.chronir.epflimitremover;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(EPFLimitRemover.MODID)
public class EPFLimitRemover
{

    public static final String MODID = "epflimitremover";

    private static final Logger LOGGER = LogUtils.getLogger();

    public EPFLimitRemover(FMLJavaModLoadingContext context)
    {

    }
}
