package me.chronir.epflr.config;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class Config {


    @ExpectPlatform
    public static double getMinKbMultiplierValue() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static double getMaxKbMultiplierValue() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static int getEPFLimitValue() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static int getEPFFactorValue() {
        throw new AssertionError();
    }

}
