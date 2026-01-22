package net.empire.plenaria.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.minecraft.text.Text;

import java.util.List;

public class BowlReturningFoodItem extends Item {

    private final String tooltipKey;

    public BowlReturningFoodItem(Settings settings, String tooltipKey) {
        super(settings);
        this.tooltipKey = tooltipKey;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (!world.isClient) {
            if (stack.isEmpty()) {
                return new ItemStack(Items.BOWL);
            }

            if (user instanceof PlayerEntity player && !player.getAbilities().creativeMode) {
                player.giveItemStack(new ItemStack(Items.BOWL));
            }
        }

        return result;
    }
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);

        if (tooltipKey != null && !tooltipKey.isEmpty()) {
            tooltip.add(Text.translatable(tooltipKey).formatted(Formatting.BLUE));
        }
    }

}
