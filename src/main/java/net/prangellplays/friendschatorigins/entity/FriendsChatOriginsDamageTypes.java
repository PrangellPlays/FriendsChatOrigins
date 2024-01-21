package net.prangellplays.friendschatorigins.entity;

import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.prangellplays.friendschatorigins.FriendsChatOrigins;

public class FriendsChatOriginsDamageTypes {
    static RegistryKey<DamageType> TRUE_DAMAGE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, new Identifier(FriendsChatOrigins.MOD_ID, "true_damage"));

    public static void bootstrap(Registerable<DamageType> damageTypeRegisterable) {
        damageTypeRegisterable.register(TRUE_DAMAGE, new DamageType("player", 0.1f));
    }
}