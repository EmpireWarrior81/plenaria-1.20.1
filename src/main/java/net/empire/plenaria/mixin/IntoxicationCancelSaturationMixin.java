package net.empire.plenaria.mixin;

import net.empire.plenaria.access.FoodDataEntityAccess;
import net.empire.plenaria.effect.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.HungerManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(HungerManager.class)
public class IntoxicationCancelSaturationMixin implements FoodDataEntityAccess {

    @Unique
    private LivingEntity plenaria$entity;

    @ModifyVariable(
            method = "add",
            at = @At("HEAD"),
            index = 1,
            argsOnly = true
    )

    private int plenaria$modifySaturation(int value) {
        if (plenaria$entity != null && plenaria$entity.hasStatusEffect(ModEffects.INTOXICATION)) {
            return (int) 0.0F;
        }
        int saturation = 0;
        return saturation;
    }


    @Override
    public void plenaria$setEntity(LivingEntity entity) {
        this.plenaria$entity = entity;
    }
}
