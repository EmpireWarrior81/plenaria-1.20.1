package net.empire.plenaria.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModFoods {

    public static final FoodComponent AVOCADO =
            new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build();
    public static final FoodComponent CUCUMBER =
            new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build();
    public static final FoodComponent PICKLE =
            new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build();
    public static final FoodComponent EGGPLANT =
            new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build();
    public static final FoodComponent SMOKED_EGGPLANT =
            new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).build();
    public static final FoodComponent SMOKED_TOMATO =
            new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build();
    public static final FoodComponent SMOKED_WHITE_EGGPLANT =
            new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).build();
    public static final FoodComponent WHITE_EGGPLANT =
            new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent CORN_COB =
            new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent GINGER =
            new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build();
    public static final FoodComponent SQUID =
            new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent COOKED_SQUID =
            new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build();
    public static final FoodComponent GLOW_SQUID =
            new FoodComponent.Builder().hunger(2).saturationModifier(0.2f)
                    .statusEffect(new StatusEffectInstance
                            (StatusEffects.GLOWING, 40, 1), 1.0f).snack().build();
    public static final FoodComponent RAW_CALAMARI =
            new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build();
    public static final FoodComponent COOKED_CALAMARI =
            new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).build();

    public static final FoodComponent CUT_AVOCADO =
            new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).snack().build();
    public static final FoodComponent CUT_CUCUMBER =
            new FoodComponent.Builder().hunger(1).saturationModifier(0.3f).snack().build();
    public static final FoodComponent CUT_PICKLE =
            new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).snack().build();
    public static final FoodComponent CUT_EGGPLANT =
            new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build();
    public static final FoodComponent SMOKED_CUT_EGGPLANT =
            new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).snack().build();

    public static final FoodComponent MIDORI_ROLL =
            new FoodComponent.Builder().hunger(14).saturationModifier(0.7f).build();
    public static final FoodComponent MIDORI_ROLL_SLICE =
            new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).snack().build();
    public static final FoodComponent EGG_ROLL =
            new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).snack().build();
    public static final FoodComponent CHICKEN_ROLL =
            new FoodComponent.Builder().hunger(16).saturationModifier(0.8f).build();
    public static final FoodComponent CHICKEN_ROLL_SLICE =
            new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).snack().build();
    public static final FoodComponent PUFFERFISH_ROLL =
            new FoodComponent.Builder().hunger(7).saturationModifier(0.6f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 1), 1.0f)
                    .snack().build();

    public static final FoodComponent TROPICAL_ROLL =
            new FoodComponent.Builder().hunger(7).saturationModifier(0.6f).snack().build();
    public static final FoodComponent RICE_BALL =
            new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).snack().build();
    public static final FoodComponent CALAMARI_ROLL =
            new FoodComponent.Builder().hunger(7).saturationModifier(0.6f).snack().build();

    public static final FoodComponent CORN_DOUGH =
            new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build();
    public static final FoodComponent TORTILLA =
            new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build();
    public static final FoodComponent POPCORN =
            new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).snack().build();
    public static final FoodComponent TORTILLA_CHIPS =
            new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).snack().build();
    public static final FoodComponent ELOTE =
            new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build();
    public static final FoodComponent EMPANADA =
            new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build();
    public static final FoodComponent BEEF_BURRITO =
            new FoodComponent.Builder().hunger(14).saturationModifier(0.7f).build();
    public static final FoodComponent MUTTON_SANDWICH =
            new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build();
    public static final FoodComponent AVOCADO_TOAST =
            new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build();
    public static final FoodComponent CREAMED_CORN =
            new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build();
    public static final FoodComponent CHICKEN_TACO =
            new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build();
    public static final FoodComponent PORK_WRAP =
            new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build();
    public static final FoodComponent FISH_TACO =
            new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build();
    public static final FoodComponent HEARTY_SALAD =
            new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).statusEffect
                    (new StatusEffectInstance(
                            ModEffects.NOURISHMENT.get(),
                            FoodValues.LONG_DURATION,
                            0), 1.0f).build();
    public static final FoodComponent EGGPLANT_PARMESAN =
            new FoodComponent.Builder().hunger(12).saturationModifier(0.9f).statusEffect
                    (new StatusEffectInstance(
                            ModEffects.NOURISHMENT.get(),
                            FoodValues.LONG_DURATION,
                            0), 1.0f).build();
    public static final FoodComponent EGGPLANT_BURGER =
            new FoodComponent.Builder().hunger(12).saturationModifier(0.7f).build();
    public static final FoodComponent SPICY_CURRY =
            new FoodComponent.Builder().hunger(12).saturationModifier(1.3f).statusEffect
                            (new StatusEffectInstance(
                                    ModEffects.NOURISHMENT.get(),
                                    FoodValues.LONG_DURATION,
                                    0), 1.0f).build();
    public static final FoodComponent POACHED_EGGPLANTS =
            new FoodComponent.Builder().hunger(8).saturationModifier(1.0f).statusEffect
                            (new StatusEffectInstance(
                                    ModEffects.NOURISHMENT.get(),
                                    FoodValues.LONG_DURATION,
                                    0), 1.0f).build();




}
