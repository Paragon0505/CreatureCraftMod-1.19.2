package net.copperfox.creaturecraftmod.item;

import net.copperfox.creaturecraftmod.CreatureCraftMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CREATURECRAFT = FabricItemGroupBuilder.build(new Identifier(CreatureCraftMod.MOD_ID,
            "creaturecraft"), () -> new ItemStack(ModItems.TRITANIUM));
}
