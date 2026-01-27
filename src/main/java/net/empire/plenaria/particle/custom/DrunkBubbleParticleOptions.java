package net.empire.plenaria.particle.custom;

import net.empire.plenaria.particle.ModParticleTypes;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import org.joml.Vector3f;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;


import java.util.Locale;

public record DrunkBubbleParticleOptions(Vector3f color, float scale) implements ParticleEffect {

    public static final Factory<DrunkBubbleParticleOptions> FACTORY = new Factory<>() {
        @Override
        public DrunkBubbleParticleOptions read(ParticleType<DrunkBubbleParticleOptions> type, StringReader reader)
                throws CommandSyntaxException {

            reader.expect(' ');
            float r = reader.readFloat();
            reader.expect(' ');
            float g = reader.readFloat();
            reader.expect(' ');
            float b = reader.readFloat();
            reader.expect(' ');
            float scale = reader.readFloat();

            return new DrunkBubbleParticleOptions(new Vector3f(r, g, b), scale);
        }

        @Override
        public DrunkBubbleParticleOptions read(ParticleType<DrunkBubbleParticleOptions> type, PacketByteBuf buf) {
            return new DrunkBubbleParticleOptions(
                    new Vector3f(buf.readFloat(), buf.readFloat(), buf.readFloat()),
                    buf.readFloat()
            );
        }
    };

    @Override
    public ParticleType<?> getType() {
        return ModParticleTypes.DRUNK_BUBBLE;
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
        return String.format(Locale.ROOT, "drunk_bubble %.2f %.2f %.2f %.2f",
                color.x(), color.y(), color.z(), scale);
    }
}
