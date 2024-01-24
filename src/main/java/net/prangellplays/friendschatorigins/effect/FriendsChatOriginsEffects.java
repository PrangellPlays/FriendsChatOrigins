package net.prangellplays.friendschatorigins.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prangellplays.friendschatorigins.FriendsChatOrigins;

public class FriendsChatOriginsEffects {

    public static StatusEffect CPV2;
    public static StatusEffect DEEP_CUTS;
    public static StatusEffect CODE;

    public static StatusEffect registerCPV2Effect(String name){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(FriendsChatOrigins.MOD_ID, name),
                new CPV2Effect(StatusEffectCategory.BENEFICIAL, 1476624));
    }
    public static StatusEffect registerDEEPCUTSEffect(String name){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(FriendsChatOrigins.MOD_ID, name),
                new DeepCutsEffect(StatusEffectCategory.BENEFICIAL, 13500416));
    }
    public static StatusEffect registerCODEEffect(String name){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(FriendsChatOrigins.MOD_ID, name),
                new CodeEffect(StatusEffectCategory.BENEFICIAL, 1476624));
    }

    public static void registerEffects(){
        CPV2 = registerCPV2Effect("cpv2");
        DEEP_CUTS = registerDEEPCUTSEffect("deep_cuts");
        CODE = registerCODEEffect("code");
    }

}