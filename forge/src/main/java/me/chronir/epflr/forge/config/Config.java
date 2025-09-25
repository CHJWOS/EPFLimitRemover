package me.chronir.epflr.forge.config;

import net.minecraftforge.common.ForgeConfigSpec;


public class Config {

    public static ForgeConfigSpec.IntValue EPF_LIMIT;
    public static ForgeConfigSpec.IntValue EPF_FACTOR;
    public static ForgeConfigSpec.DoubleValue KB_MULTIPLIER_MIN;
    public static ForgeConfigSpec.DoubleValue KB_MULTIPLIER_MAX;

    public static ForgeConfigSpec init() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("EPF Limit",
                "20 = vanilla");
        EPF_LIMIT = builder.defineInRange("EPFLimit", 20, 0, Integer.MAX_VALUE);

        builder.comment("Factor of EPF",
                "25 = vanilla");
        EPF_FACTOR = builder.defineInRange("EPFFactor", 25, 0, Integer.MAX_VALUE);

        builder.push("explosion");

        builder.comment("Explosion Knockback multiplier min value.",
                        "0.0 = vanilla");
        KB_MULTIPLIER_MIN = builder.defineInRange("MinKbMultiplier", 0.0D, -Double.MAX_VALUE, Double.MAX_VALUE);

        builder.comment("Explosion Knockback multiplier max value.",
                "1.0 = vanilla");
        KB_MULTIPLIER_MAX = builder.defineInRange("MaxKbMultiplier", 1.0D, -Double.MAX_VALUE, Double.MAX_VALUE);


        builder.pop();

        return builder.build();
    }
}
