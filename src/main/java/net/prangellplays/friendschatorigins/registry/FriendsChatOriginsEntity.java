package net.prangellplays.friendschatorigins.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prangellplays.friendschatorigins.FriendsChatOrigins;
import net.prangellplays.friendschatorigins.entity.CodeEntity;

public class FriendsChatOriginsEntity {
    public static final EntityType<CodeEntity> CODE_ENTITY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(FriendsChatOrigins.MOD_ID, "code_entity"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CodeEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 2f)).build());

    public static void registerModEntities() {
        FriendsChatOrigins.LOGGER.info("Registering Entities for " + FriendsChatOrigins.MOD_ID);
    }

}