package net.prangellplays.friendschatorigins.entity;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;

public class FriendsChatOriginsDamageSources {

    public static DamageSource trueDamage(PlayerEntity attacker) {
        var damageSources = attacker.getDamageSources();
        return damageSources.create(FriendsChatOriginsDamageTypes.TRUE_DAMAGE, attacker);
    }

}