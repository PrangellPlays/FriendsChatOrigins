package net.prangellplays.friendschatorigins.mixin.api;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.prangellplays.friendschatorigins.FriendsChatOrigins;
import net.prangellplays.friendschatorigins.events.FriendsChatOriginsEvents;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class ShieldDisabledMixin {

    private void shieldDisabledEvent(LivingEntity attacker, CallbackInfo ci) {
        FriendsChatOriginsEvents.SHIELD_DISABLED.invoker().shieldDisabled(PlayerEntity.class.cast(this), attacker);
    }
}
