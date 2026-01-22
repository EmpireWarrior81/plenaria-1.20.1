package net.empire.plenaria.mixin;

import net.empire.plenaria.access.FoodDataEntityAccess;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {

    @Shadow
    protected HungerManager hungerManager;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void plenaria$storeEntity(CallbackInfo ci) {
        ((FoodDataEntityAccess) hungerManager)
                .plenaria$setEntity((PlayerEntity)(Object)this);
    }
}
