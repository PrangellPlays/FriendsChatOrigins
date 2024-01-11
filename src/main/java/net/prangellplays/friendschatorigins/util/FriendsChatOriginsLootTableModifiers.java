package net.prangellplays.friendschatorigins.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.prangellplays.friendschatorigins.registry.FriendsChatOriginsItems;

public class FriendsChatOriginsLootTableModifiers {
    private static final Identifier ANCIENT_CITY_TREASURE_ID = new Identifier("minecraft", "chests/ancient_city");

    public static void  modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(ANCIENT_CITY_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 5% of the time
                        .with(ItemEntry.builder(FriendsChatOriginsItems.WEAPON_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); // Drops 1-1 of the item
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}