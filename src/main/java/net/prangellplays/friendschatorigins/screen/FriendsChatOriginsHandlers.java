package net.prangellplays.friendschatorigins.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.prangellplays.friendschatorigins.FriendsChatOrigins;

public class FriendsChatOriginsHandlers {
    public static final ScreenHandlerType<WeaponTableScreenHandler> WEAPON_TABLE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(FriendsChatOrigins.MOD_ID, "weapon_table"),
                    new ExtendedScreenHandlerType<>(WeaponTableScreenHandler::new));

    public static void registerScreenHandler() {
        FriendsChatOrigins.LOGGER.info("Register Screen Handlers for " + FriendsChatOrigins.MOD_ID);
    }
}
