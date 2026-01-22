package net.empire.plenaria.particle.custom;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import org.joml.Vector3f;

public record DrunkBubbleParticleOptions(Vector3f color, float scale) implements ParticleEffect {

    public Vector3f getColor() {
        return color;
    }

    public float getScale() {
        return scale;
    }

    @Override
    public ParticleType<?> getType() {
        return null;
    }

    @Override
    public void write(PacketByteBuf buf) {
        buf.writeFloat(color.x());
        buf.writeFloat(color.y());
        buf.writeFloat(color.z());
        buf.writeFloat(scale);
    }

    @Override
    public String asString() {
        return "DrunkBubbleParticleOptions[color=" + color + ", scale=" + scale + "]";
    }
}
