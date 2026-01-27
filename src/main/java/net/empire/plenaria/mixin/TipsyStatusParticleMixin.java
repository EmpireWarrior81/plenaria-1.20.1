package net.empire.plenaria.mixin;

import net.empire.plenaria.effect.ModEffects;
import net.empire.plenaria.effect.custom.TipsyEffect;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class TipsyStatusParticleMixin {

    @Inject(method = "tickStatusEffects", at = @At("HEAD"))
    private void plenaria$spawnTipsyParticles(CallbackInfo ci) {
        LivingEntity self = (LivingEntity)(Object)this;

        if (self.getWorld().isClient && self.hasStatusEffect(ModEffects.TIPSY)) {
            World world = self.getWorld();

            world.addParticle(
                    TipsyEffect.getParticle(0xC97A2E),
                    self.getX() + (world.random.nextDouble() - 0.5),
                    self.getY() + 1.0,
                    self.getZ() + (world.random.nextDouble() - 0.5),
                    0.0, 0.01, 0.0
            );
        }
    }
}
