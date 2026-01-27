package net.empire.plenaria.effect.custom;

import net.empire.plenaria.particle.custom.DrunkBubbleParticleOptions;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.particle.ParticleEffect;
import org.joml.Vector3f;

public class TipsyEffect extends StatusEffect {

    public TipsyEffect() {
        super(StatusEffectCategory.NEUTRAL, 0xC97A2E);
    }

    public static ParticleEffect getParticle(int color) {
        return new DrunkBubbleParticleOptions(
                new Vector3f(
                        ((color >> 16) & 0xFF) / 255f,
                        ((color >> 8) & 0xFF) / 255f,
                        (color & 0xFF) / 255f
                ),
                0.25f
        );
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true; // Fabric-equivalent van shouldApplyEffectTickThisTick
    }
}
