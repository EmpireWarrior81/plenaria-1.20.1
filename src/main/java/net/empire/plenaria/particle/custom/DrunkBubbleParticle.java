package net.empire.plenaria.particle.custom;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;

public class DrunkBubbleParticle extends SpriteBillboardParticle  {
    protected DrunkBubbleParticle(ClientWorld level, double x, double y, double z, double motionX, double motionY, double motionZ) {
        super(level, x, y, z, motionX, motionY, motionZ);

        this.scale(2.0F);
        this.setBoundingBoxSpacing(0.25F, 0.25F);

        this.maxAge = this.random.nextInt(50) + 30;

        this.velocityMultiplier = 3.0E-6F;
        this.velocityX = motionX;
        this.velocityY = motionY + ((double) this.random.nextFloat() / 500.0D);
        this.velocityZ = motionZ;
    }

    @Override
    public void tick() {
        this.prevPosX = this.x;
        this.prevPosY = this.y;
        this.prevPosZ = this.z;

        if (this.age++ < this.maxAge && this.alpha > 0.0F) {
            this.velocityX += (this.random.nextFloat() / 2500.0F) * (this.random.nextBoolean() ? 1 : -1);
            this.velocityY += (this.random.nextFloat() / 2500.0F) * (this.random.nextBoolean() ? 1 : -1);
            this.velocityY -= this.gravityStrength;
            this.move(this.velocityX, this.velocityY, this.velocityZ);

            if (this.age >= this.maxAge - 60 && this.alpha > 0.01F) {
                this.alpha -= 0.02F;
            }
        } else {
            this.markDead();
        }
    }


    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Factory implements ParticleFactory<DrunkBubbleParticleOptions> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {this.spriteProvider = spriteProvider;}

        @Override
        public Particle createParticle(DrunkBubbleParticleOptions options, ClientWorld world, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            DrunkBubbleParticle particle = new DrunkBubbleParticle(world, x, y + 0.3D, z, 0.0, 0.002, 0.0);
            particle.setAlpha(0.6F);
            particle.setColor(options.color().x, options.color().y, options.color().z);
            particle.scale(options.scale());
            particle.setSprite(this.spriteProvider);
            return particle;
        }
    }
}