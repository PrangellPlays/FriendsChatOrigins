package net.prangellplays.friendschatorigins.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.prangellplays.friendschatorigins.FriendsChatOrigins;

public class FriendsChatOriginsModelLayers {
    public static final EntityModelLayer CODE_ENTITY =
            new EntityModelLayer(new Identifier(FriendsChatOrigins.MOD_ID, "code_entity"), "main");
}