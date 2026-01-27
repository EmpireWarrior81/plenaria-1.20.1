package net.empire.plenaria.mixin;

import net.empire.plenaria.effect.ModEffects;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.math.MathHelper;
import org.joml.Quaternionf;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class TipsyCameraMixin {

    @Shadow @Final
    private MinecraftClient client;

    @Inject(
            method = "renderWorld",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/render/Camera;update(Lnet/minecraft/world/BlockView;Lnet/minecraft/entity/Entity;ZZF)V",
                    shift = At.Shift.AFTER
            )
    )
    private void applyTipsyEffect(float tickDelta, long limitTime, MatrixStack matrices, CallbackInfo ci) {
        ClientPlayerEntity player = client.player;

        if (player != null && player.hasStatusEffect(ModEffects.TIPSY)) {
            float distortionScale = client.options.getDistortionEffectScale().getValue().floatValue();
            if (distortionScale > 0f) {
                StatusEffectInstance effect = player.getStatusEffect(ModEffects.TIPSY);
                int strength = Math.min(effect.getAmplifier(), 11);
                float scaledStrength = strength * distortionScale;

                float ticks = player.age + tickDelta;


                matrices.multiply(new Quaternionf().fromAxisAngleDeg(
                        0f, 1f, 0f,
                        MathHelper.cos(3 + ticks * 0.0295f) * scaledStrength
                ));


                matrices.multiply(new Quaternionf().fromAxisAngleDeg(
                        1f, 0f, 1f,
                        MathHelper.sin(27 + ticks * 0.0132f) * scaledStrength
                ));


                float x = MathHelper.sin(ticks * 0.00253f) * (scaledStrength / 100f);
                float z = MathHelper.cos(ticks * 0.00784f) * (scaledStrength / 100f);
                matrices.translate(x, 0f, z);
            }
        }
    }
}
