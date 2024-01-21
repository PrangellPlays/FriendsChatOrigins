package net.prangellplays.friendschatorigins.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prangellplays.friendschatorigins.FriendsChatOrigins;
import net.prangellplays.friendschatorigins.block.entity.WeaponTableBlockEntity;

public class FriendsChatOriginsBlockEntities {
    //public static final BlockEntityType<WeaponTableBlockEntity> WEAPON_TABLE_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(FriendsChatOrigins.MOD_ID, "weapon_table_be"), FabricBlockEntityTypeBuilder.create(WeaponTableBlockEntity::new, FriendsChatOriginsBlocks.WEAPON_TABLE).build());

    public static void registerBlockEntities() {
        FriendsChatOrigins.LOGGER.info("Registering Block Entities for " + FriendsChatOrigins.MOD_ID);
    }
}