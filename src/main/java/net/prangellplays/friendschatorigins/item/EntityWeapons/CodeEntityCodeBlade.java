package net.prangellplays.friendschatorigins.item.EntityWeapons;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.prangellplays.friendschatorigins.registry.FriendsChatOriginsItems;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CodeEntityCodeBlade extends SwordItem {
    public CodeEntityCodeBlade(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!target.getEquippedStack(EquipmentSlot.OFFHAND).isOf(FriendsChatOriginsItems.CPV2)) {
            target.dropStack(target.getEquippedStack(EquipmentSlot.MAINHAND));
            target.setStackInHand(Hand.MAIN_HAND, Items.AIR.getDefaultStack());
            target.dropStack(target.getEquippedStack(EquipmentSlot.OFFHAND));
            target.setStackInHand(Hand.OFF_HAND, Items.AIR.getDefaultStack());
            target.takeKnockback(1.0F, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
        }
        target.disablesShield();
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        {
            stack.addHideFlag(ItemStack.TooltipSection.MODIFIERS);
            tooltip.add(Text.literal(" ").formatted(Formatting.RESET));
            tooltip.add(Text.literal("When in Main Hand:").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("24 Attack Damage").formatted(Formatting.DARK_GREEN));
        }
    }
}