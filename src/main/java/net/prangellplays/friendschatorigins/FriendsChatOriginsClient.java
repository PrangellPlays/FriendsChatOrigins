package net.prangellplays.friendschatorigins;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.world.World;
import net.prangellplays.friendschatorigins.client.PlasmythicElytraRenderer;
import net.prangellplays.friendschatorigins.screen.FriendsChatOriginsHandlers;
import net.prangellplays.friendschatorigins.screen.WeaponTableScreen;

public class FriendsChatOriginsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HandledScreens.register(FriendsChatOriginsHandlers.WEAPON_TABLE_SCREEN_HANDLER, WeaponTableScreen::new);

        LivingEntityFeatureRendererRegistrationCallback.EVENT.register((entityType, entityRenderer, registrationHelper, context) -> {
            if (entityRenderer.getModel() instanceof PlayerEntityModel) {
                registrationHelper.register(new PlasmythicElytraRenderer<>(entityRenderer, context.getModelLoader()));
            }
        });
    }
}
