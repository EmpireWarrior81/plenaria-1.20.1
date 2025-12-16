package net.empire.plenaria.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class BowlReturningFoodItem extends Item {

    public BowlReturningFoodItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (!world.isClient) {
            // als stack op is, geef bowl terug
            if (stack.isEmpty()) {
                return new ItemStack(Items.BOWL);
            }

            // anders drop / geef bowl tenzij Creative mode
            if (user instanceof PlayerEntity player && !player.getAbilities().creativeMode) {
                player.giveItemStack(new ItemStack(Items.BOWL));
            }
        }

        return result;
    }
}
