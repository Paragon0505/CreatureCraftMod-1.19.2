package net.copperfox.creaturecraftmod.item;

import net.copperfox.creaturecraftmod.CreatureCraftMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {


    public static final Item SELESTEEL = registerItem("selesteel", new Item(new FabricItemSettings().group(ModItemGroup.CREATURECRAFT)));
    public static final Item TRITANIUM = registerItem("tritanium", new Item(new FabricItemSettings().group(ModItemGroup.CREATURECRAFT)));
    public static final Item LEATHER_SWORD = registerItem("leather_sword",
            new Item(new FabricItemSettings().group(ModItemGroup.CREATURECRAFT).rarity(Rarity.EPIC)));
    public static final Item MAGNIUM_INGOT = registerItem("magnium_ingot", new Item(new FabricItemSettings().group(ModItemGroup.CREATURECRAFT)));
    public static final Item CHAIN_MAIL = registerItem("chain_mail", new Item(new FabricItemSettings().group(ModItemGroup.CREATURECRAFT)));


    private  static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CreatureCraftMod.MOD_ID, name), item);
    }


    public static void registerModItems()   {
        CreatureCraftMod.LOGGER.debug("Registering Mod Items for " + CreatureCraftMod.MOD_ID);
    }
}
