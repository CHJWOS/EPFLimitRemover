package me.chronir.epfremover.mixin;

import net.minecraft.world.damagesource.CombatRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(CombatRules.class)
public class CombatRulesMixin {
    
    @Redirect(method = "getDamageAfterMagicAbsorb", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/Mth;clamp(FFF)F"))
    private static float removeEPFLimit(float p_14037_, float p_14038_, float p_14039_) {
        return p_14037_;
    }
    
}
