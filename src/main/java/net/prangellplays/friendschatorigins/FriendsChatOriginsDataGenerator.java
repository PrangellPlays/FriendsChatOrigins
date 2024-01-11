package net.prangellplays.friendschatorigins;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.prangellplays.friendschatorigins.datagen.FriendsChatOriginsRecipeProvider;

public class FriendsChatOriginsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(FriendsChatOriginsRecipeProvider::new);
	}
}
