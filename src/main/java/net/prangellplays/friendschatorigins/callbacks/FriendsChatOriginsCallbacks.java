package net.prangellplays.friendschatorigins.callbacks;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.prangellplays.friendschatorigins.events.FriendsChatOriginsEvents;
import org.joml.Vector3d;

public class FriendsChatOriginsCallbacks {

    public static void registerCallbacks() {
        FriendsChatOriginsEvents.SHIELD_BLOCKED.register(FriendsChatOriginsCallbacks::onShieldBlock);
    }

    // Logic for blocking
    private static void onShieldBlock(PlayerEntity user, DamageSource source, float amount) {
        Entity sourceEntity = source.getSource();
        if (sourceEntity instanceof LivingEntity attacker) blockLivingEntity(user, attacker);
        if (sourceEntity instanceof ProjectileEntity projectile) blockProjectile(user, source.getSource(), projectile);
    }

    // Logic for blocking a living entity
    private static void blockLivingEntity(PlayerEntity user, LivingEntity attacker) {
        }

    // Logic for blocking a projectile
    private static void blockProjectile(PlayerEntity user, Entity damageCauser, ProjectileEntity projectile) {

        Vector3d motion = new Vector3d(user.getX() - damageCauser.getX(), 0.0f, user.getZ() - damageCauser.getZ()).absolute();
        projectile.setVelocity(motion.x(), -1.5f, motion.z());
    }

}