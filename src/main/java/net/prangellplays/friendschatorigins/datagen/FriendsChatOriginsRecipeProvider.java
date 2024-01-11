package net.prangellplays.friendschatorigins.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.prangellplays.friendschatorigins.FriendsChatOrigins;
import net.prangellplays.friendschatorigins.registry.FriendsChatOriginsItems;

import java.util.function.Consumer;

public class FriendsChatOriginsRecipeProvider extends FabricRecipeProvider {
    public FriendsChatOriginsRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        // AZURE SMITHING TEMPLATE & ARMOR & TOOL SET UPGRADES
        offerSmithingTrimRecipe(exporter, FriendsChatOriginsItems.WEAPON_UPGRADE_SMITHING_TEMPLATE, new Identifier(FriendsChatOrigins.MOD_ID, "weapon_upgrade_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(FriendsChatOriginsItems.WEAPON_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.NETHERITE_SWORD), Ingredient.ofItems(FriendsChatOriginsItems.CLAWS), RecipeCategory.MISC, FriendsChatOriginsItems.WEREWOLF_CLAWS)
                .criterion(hasItem(FriendsChatOriginsItems.CLAWS), conditionsFromItem(FriendsChatOriginsItems.CLAWS)).offerTo(exporter, new Identifier(FriendsChatOrigins.MOD_ID, "werewolf_claws_smithing"));
    }
}