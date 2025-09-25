package me.chronir.epflr.mixin;


import me.chronir.epflr.config.Config;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.ProtectionEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ProtectionEnchantment.class)
public class ProtectionEnchantmentMixin {

    /**
     * @author ChJW0S
     * @reason none
     */
    @Overwrite
    public static double getExplosionKnockbackAfterDampener(LivingEntity livingEntity, double kb) {
        int blastProtectionLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.BLAST_PROTECTION, livingEntity);
        if (blastProtectionLevel > 0) {
            double minKbMultiplier = livingEntity.isShiftKeyDown() ? Config.getMinKbMultiplierValue() : 0.0D;
            double maxKbMultiplier = livingEntity.isShiftKeyDown() ? Config.getMaxKbMultiplierValue() : 1.0D;
            kb *= Mth.clamp(1.0D - blastProtectionLevel * 0.15D, minKbMultiplier, maxKbMultiplier);
        }

        return kb;
    }

}
