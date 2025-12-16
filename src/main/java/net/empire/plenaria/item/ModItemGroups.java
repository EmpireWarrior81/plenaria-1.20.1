package net.empire.plenaria.item;

import net.empire.plenaria.Plenaria;
import net.empire.plenaria.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ARTIFACTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Plenaria.MOD_ID, "plenaria"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.plenaria"))
                    .icon(() -> new ItemStack(ModItems.AVOCADO)).entries((displayContext, entries) -> {
                        entries.add(ModItems.AVOCADO);
                        entries.add(ModItems.CUCUMBER);
                        entries.add(ModItems.PICKLE);
                        entries.add(ModItems.EGGPLANT);
                        entries.add(ModItems.SMOKED_EGGPLANT);
                        entries.add(ModItems.SMOKED_TOMATO);
                        entries.add(ModItems.SMOKED_WHITE_EGGPLANT);
                        entries.add(ModItems.WHITE_EGGPLANT);
                        entries.add(ModItems.CORN_COB);
                        entries.add(ModItems.GINGER);
                        entries.add(ModItems.SQUID);
                        entries.add(ModItems.COOKED_SQUID);
                        entries.add(ModItems.GLOW_SQUID);
                        entries.add(ModItems.RAW_CALAMARI);
                        entries.add(ModItems.COOKED_CALAMARI);
                        entries.add(ModItems.CUT_AVOCADO);
                        entries.add(ModItems.CUT_CUCUMBER);
                        entries.add(ModItems.CUT_PICKLE);
                        entries.add(ModItems.CUT_EGGPLANT);
                        entries.add(ModItems.SMOKED_CUT_EGGPLANT);
                        entries.add(ModItems.MIDORI_ROLL);
                        entries.add(ModItems.MIDORI_ROLL_SLICE);
                        entries.add(ModItems.EGG_ROLL);
                        entries.add(ModItems.CHICKEN_ROLL);
                        entries.add(ModItems.CHICKEN_ROLL_SLICE);
                        entries.add(ModItems.PUFFERFISH_ROLL);
                        entries.add(ModItems.TROPICAL_ROLL);
                        entries.add(ModItems.RICE_BALL);
                        entries.add(ModItems.CALAMARI_ROLL);
                        entries.add(ModItems.CORN_DOUGH);
                        entries.add(ModItems.TORTILLA);
                        entries.add(ModItems.POPCORN);
                        entries.add(ModItems.TORTILLA_CHIPS);
                        entries.add(ModItems.ELOTE);
                        entries.add(ModItems.EMPANADA);
                        entries.add(ModItems.BEEF_BURRITO);
                        entries.add(ModItems.MUTTON_SANDWICH);
                        entries.add(ModItems.AVOCADO_TOAST);
                        entries.add(ModItems.CREAMED_CORN);
                        entries.add(ModItems.CHICKEN_TACO);
                        entries.add(ModItems.PORK_WRAP);
                        entries.add(ModItems.FISH_TACO);
                        entries.add(ModItems.HEARTY_SALAD);
                        entries.add(ModItems.EGGPLANT_PARMESAN);
                        entries.add(ModItems.EGGPLANT_BURGER);
                        entries.add(ModItems.SPICY_CURRY);
                        entries.add(ModItems.POACHED_EGGPLANTS);
                        entries.add(ModBlocks.EXOTIC_ROLL_MEDLEY);
                        entries.add(ModBlocks.EGGPLANT_PARMESAN_BLOCK);
                        entries.add(ModBlocks.WILD_CORN);
                        entries.add(ModBlocks.WILD_EGGPLANTS);
                        entries.add(ModBlocks.WILD_CUCUMBERS);
                        entries.add(ModBlocks.AVOCADO_PIT);
                        entries.add(ModBlocks.AVOCADO_LOG);
                        entries.add(ModBlocks.AVOCADO_WOOD);
                        entries.add(ModBlocks.AVOCADO_SAPLING);
                        entries.add(ModBlocks.AVOCADO_LEAVES);
                        entries.add(ModBlocks.FRUITING_AVOCADO_LEAVES);

                    }).build());

public static void registerItemGroups() {
    Plenaria.LOGGER.info("Registering Item Groups for " + Plenaria.MOD_ID);
}
}
