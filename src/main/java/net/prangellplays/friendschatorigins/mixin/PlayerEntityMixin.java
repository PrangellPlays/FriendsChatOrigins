package net.prangellplays.friendschatorigins.mixin;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.player.PlayerEntity;
import net.prangellplays.friendschatorigins.entity.FriendsChatOriginsDamageSources;
import net.prangellplays.friendschatorigins.registry.FriendsChatOriginsItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {

    @Redirect(method = "attack", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/damage/DamageSources;playerAttack(Lnet/minecraft/entity/player/PlayerEntity;)Lnet/minecraft/entity/damage/DamageSource;"))
    public DamageSource playerAttackProxy(DamageSources instance, PlayerEntity attacker) {
        var stack = attacker.getMainHandStack();

        if (stack.isOf(FriendsChatOriginsItems.PLASMYTHIC_BLADE)) {
            return FriendsChatOriginsDamageSources.trueDamage(attacker);
        }

        return instance.playerAttack(attacker);
    }

}