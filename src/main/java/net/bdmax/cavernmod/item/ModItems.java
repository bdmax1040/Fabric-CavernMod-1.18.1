package net.bdmax.cavernmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.bdmax.cavernmod.CavernMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item COIN = registerItem("coin",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CavernMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CavernMod.LOGGER.info("Registering Mod Items for " + CavernMod.MOD_ID);
    }

}
