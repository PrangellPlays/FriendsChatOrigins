package net.prangellplays.friendschatorigins.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.prangellplays.friendschatorigins.FriendsChatOrigins;
import net.prangellplays.friendschatorigins.block.WeaponTableBlock;

public class FriendsChatOriginsBlocks {

    public static final Block WEAPON_TABLE = registerBlock("weapon_table",
            new WeaponTableBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()), ItemGroups.FUNCTIONAL);


        private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group) {
            registerBlockItem(name, block, group);
            return Registry.register(Registries.BLOCK, new Identifier(FriendsChatOrigins.MOD_ID, name), block);
        }

        private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
            Item item = Registry.register(Registries.ITEM, new Identifier(FriendsChatOrigins.MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings()));
            ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
            return item;
        }

        public static void registerFriendsChatOriginsBlocks() {
            FriendsChatOrigins.LOGGER.info("Registering ModBlocks for " + FriendsChatOrigins.MOD_ID);
        }
}
