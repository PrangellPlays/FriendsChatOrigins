package net.prangellplays.friendschatorigins.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.prangellplays.friendschatorigins.FriendsChatOrigins;
import net.prangellplays.friendschatorigins.item.*;

public class FriendsChatOriginsItems {
    public static final Item WEAPON_UPGRADE_SMITHING_TEMPLATE = registerItem("weapon_upgrade_smithing_template", new WeaponUpgradeSmithingTemplateItem(new FabricItemSettings().fireproof().rarity(Rarity.RARE)));
    public static final Item WEREWOLF_CLAWS = registerItem("werewolf_claws", new WerewolfClawsItem(FriendsChatOriginsToolMaterials.WEREWOLF, 12, -2, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item PLASMYTHIC_BLADE = registerItem("plasmythic_blade", new PlasmythicBladeItem(FriendsChatOriginsToolMaterials.MYTHICAL, 11, -2, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item CLAWS = registerItem("claws", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));

    private static void addItemsToBuildingItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToColoredItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToFunctionalItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToRedstoneItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
    }
    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries){
        entries.add(WEREWOLF_CLAWS);
        entries.add(PLASMYTHIC_BLADE);
    }
    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries){
        entries.add(WEAPON_UPGRADE_SMITHING_TEMPLATE);
        entries.add(CLAWS);
    }
    private static void addItemsToSpawnItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToOperatorItemGroup(FabricItemGroupEntries entries){
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FriendsChatOrigins.MOD_ID, name), item);
    }

    public static void registerFriendsChatOriginsItems() {
        FriendsChatOrigins.LOGGER.info("Registering Mod Items for " + FriendsChatOrigins.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(FriendsChatOriginsItems::addItemsToBuildingItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(FriendsChatOriginsItems::addItemsToColoredItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(FriendsChatOriginsItems::addItemsToNaturalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(FriendsChatOriginsItems::addItemsToFunctionalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(FriendsChatOriginsItems::addItemsToRedstoneItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(FriendsChatOriginsItems::addItemsToToolsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(FriendsChatOriginsItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(FriendsChatOriginsItems::addItemsToFoodItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(FriendsChatOriginsItems::addItemsToIngredientsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(FriendsChatOriginsItems::addItemsToSpawnItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(FriendsChatOriginsItems::addItemsToOperatorItemGroup);
    }
}
