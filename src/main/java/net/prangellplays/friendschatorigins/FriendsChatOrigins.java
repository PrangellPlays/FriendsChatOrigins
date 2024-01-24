package net.prangellplays.friendschatorigins;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import net.prangellplays.friendschatorigins.callbacks.FriendsChatOriginsCallbacks;
import net.prangellplays.friendschatorigins.effect.FriendsChatOriginsEffects;
import net.prangellplays.friendschatorigins.particle.FriendsChatOriginsParticles;
import net.prangellplays.friendschatorigins.recipe.FriendsChatOriginsRecipe;
import net.prangellplays.friendschatorigins.registry.FriendsChatOriginsBlockEntities;
import net.prangellplays.friendschatorigins.registry.FriendsChatOriginsBlocks;
import net.prangellplays.friendschatorigins.registry.FriendsChatOriginsItems;
import net.prangellplays.friendschatorigins.screen.FriendsChatOriginsHandlers;
import net.prangellplays.friendschatorigins.util.FriendsChatOriginsLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class FriendsChatOrigins implements ModInitializer {
	public static final String MOD_ID = "friendschatorigins";
	public static final Logger LOGGER = LoggerFactory.getLogger("friendschatorigins");

	@Override
	public void onInitialize() {
		FriendsChatOriginsItems.registerFriendsChatOriginsItems();
		FriendsChatOriginsLootTableModifiers.modifyLootTables();
		FriendsChatOriginsHandlers.registerScreenHandler();
		FriendsChatOriginsBlockEntities.registerBlockEntities();
		FriendsChatOriginsBlocks.registerFriendsChatOriginsBlocks();
		FriendsChatOriginsRecipe.registerRecipes();
		FriendsChatOriginsCallbacks.registerCallbacks();
		FriendsChatOriginsEffects.registerEffects();
		FriendsChatOriginsParticles.registerParticles();
	}
	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}