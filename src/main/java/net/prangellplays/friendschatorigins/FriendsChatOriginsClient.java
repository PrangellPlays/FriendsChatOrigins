package net.prangellplays.friendschatorigins;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.world.World;
import net.prangellplays.friendschatorigins.screen.FriendsChatOriginsHandlers;
import net.prangellplays.friendschatorigins.screen.WeaponTableScreen;

public class FriendsChatOriginsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HandledScreens.register(FriendsChatOriginsHandlers.WEAPON_TABLE_SCREEN_HANDLER, WeaponTableScreen::new);
    }
}