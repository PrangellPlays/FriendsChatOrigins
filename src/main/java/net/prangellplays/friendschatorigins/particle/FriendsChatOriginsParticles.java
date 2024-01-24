package net.prangellplays.friendschatorigins.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prangellplays.friendschatorigins.FriendsChatOrigins;

public class FriendsChatOriginsParticles {
    public static final DefaultParticleType CODE_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType CPV2_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType DEEP_CUTS_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(FriendsChatOrigins.MOD_ID, "code_particle"),
                CODE_PARTICLE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(FriendsChatOrigins.MOD_ID, "cpv2_particle"),
                CPV2_PARTICLE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(FriendsChatOrigins.MOD_ID, "deep_cuts_particle"),
                DEEP_CUTS_PARTICLE);
    }
}
