package me.chronir.epflr.mixin;

import me.chronir.epflr.config.Config;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.CombatRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(CombatRules.class)
public class CombatRulesMixin {

    /**
     * @author ChJW0S
     * @reason none
     */
    @Overwrite
    public static float getDamageAfterMagicAbsorb(float dmg, float epf) {
        float correctedEPF = Mth.clamp(epf, 0.0f, Config.getEPFLimitValue());
        return dmg * (1.0F - correctedEPF / Config.getEPFFactorValue());
    }

}
