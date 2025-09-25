package me.chronir.epflr.config.forge;

import static me.chronir.epflr.forge.config.Config.*;

public class ConfigImpl {

    public static int getEPFFactorValue() {
        return EPF_FACTOR.get();
    }

    public static int getEPFLimitValue() {
        return EPF_LIMIT.get();
    }

    public static double getMinKbMultiplierValue() {
        return KB_MULTIPLIER_MIN.get();
    }

    public static double getMaxKbMultiplierValue() {
        return KB_MULTIPLIER_MAX.get();
    }

}
