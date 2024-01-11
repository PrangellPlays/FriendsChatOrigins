package net.prangellplays.friendschatorigins.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WeaponUpgradeSmithingTemplateItem extends Item {
    public WeaponUpgradeSmithingTemplateItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        {
            tooltip.add(Text.literal("Weapon Upgrade").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("Applies to:").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("Weapons").formatted(Formatting.BLUE));
            tooltip.add(Text.literal("Ingredients:").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("Mythical Drops").formatted(Formatting.BLUE));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
