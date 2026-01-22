package net.empire.plenaria.effect;

import net.empire.plenaria.Plenaria;
import net.empire.plenaria.effect.custom.IntoxicationEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final StatusEffect INTOXICATION = Registry.register(
            Registries.STATUS_EFFECT,
            new Identifier(Plenaria.MOD_ID, "intoxication"),
            new IntoxicationEffect()
    );

    public static void registerModEffects() {

    }
}
