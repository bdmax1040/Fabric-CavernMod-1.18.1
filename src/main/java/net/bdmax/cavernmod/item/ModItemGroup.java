package net.bdmax.cavernmod.item;

import net.bdmax.cavernmod.CavernMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CAVERN = FabricItemGroupBuilder.build(new Identifier(CavernMod.MOD_ID, "cavern"),
            () -> new ItemStack(ModItems.GOLD_COIN));
}
