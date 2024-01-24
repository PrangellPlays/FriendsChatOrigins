package net.prangellplays.friendschatorigins.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class DeepCutsEffect extends StatusEffect {
    protected DeepCutsEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.damage(entity.getWorld().getDamageSources().dragonBreath(), 0.7f);
    }


    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
