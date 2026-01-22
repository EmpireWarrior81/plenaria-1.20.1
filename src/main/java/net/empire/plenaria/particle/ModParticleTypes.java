package net.empire.plenaria.particle;

import net.empire.plenaria.Plenaria;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticleTypes {

    public static final DefaultParticleType FOG = FabricParticleTypes.simple();

    public static final DefaultParticleType DRUNK_BUBBLE = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(Plenaria.MOD_ID, "fog"), FOG);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(Plenaria.MOD_ID, "drunk_bubble"), DRUNK_BUBBLE);
    }
}
