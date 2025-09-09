package me.chronir.epfremover;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(EPFRemover.MODID)
public class EPFLimitRemover
{

    public static final String MODID = "epflimitremover";

    private static final Logger LOGGER = LogUtils.getLogger();

    public EPFRemover(FMLJavaModLoadingContext context)
    {

    }
}
