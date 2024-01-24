package net.prangellplays.friendschatorigins;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.world.World;
import net.prangellplays.friendschatorigins.entity.client.CodeEntityModel;
import net.prangellplays.friendschatorigins.entity.client.CodeEntityRenderer;
import net.prangellplays.friendschatorigins.entity.client.FriendsChatOriginsModelLayers;
import net.prangellplays.friendschatorigins.particle.CODEParticle;
import net.prangellplays.friendschatorigins.particle.CPV2Particle;
import net.prangellplays.friendschatorigins.particle.DeepCutsParticle;
import net.prangellplays.friendschatorigins.particle.FriendsChatOriginsParticles;
import net.prangellplays.friendschatorigins.registry.FriendsChatOriginsEntity;
import net.prangellplays.friendschatorigins.screen.FriendsChatOriginsHandlers;
import net.prangellplays.friendschatorigins.screen.WeaponTableScreen;

public class FriendsChatOriginsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HandledScreens.register(FriendsChatOriginsHandlers.WEAPON_TABLE_SCREEN_HANDLER, WeaponTableScreen::new);

        ParticleFactoryRegistry.getInstance().register(FriendsChatOriginsParticles.CODE_PARTICLE, CODEParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FriendsChatOriginsParticles.CPV2_PARTICLE, CPV2Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FriendsChatOriginsParticles.DEEP_CUTS_PARTICLE, DeepCutsParticle.Factory::new);

        EntityRendererRegistry.register(FriendsChatOriginsEntity.CODE_ENTITY, CodeEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(FriendsChatOriginsModelLayers.CODE_ENTITY, CodeEntityModel::getTexturedModelData);
    }
}
