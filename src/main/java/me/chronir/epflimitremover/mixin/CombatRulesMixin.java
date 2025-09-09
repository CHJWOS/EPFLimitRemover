package me.chronir.epflimitremover.mixin;

import net.minecraft.world.damagesource.CombatRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(CombatRules.class)
public class CombatRulesMixin {

    @ModifyArg(method = "getDamageAfterMagicAbsorb", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/Mth;clamp(FFF)F"), index = 2)
    private static float a(float p_14037_) {
        return 25.0F;
    }
}
