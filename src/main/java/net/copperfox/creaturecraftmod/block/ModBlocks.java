package net.copperfox.creaturecraftmod.block;

import net.copperfox.creaturecraftmod.CreatureCraftMod;
import net.copperfox.creaturecraftmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block MAGNIUM_ORE = registerBlock("magnium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).luminance(7).strength(4f).requiresTool(), UniformIntProvider.create(4, 8)), ModItemGroup.CREATURECRAFT);
    public static final Block CANDIDIUM = registerBlock("candidium",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.CREATURECRAFT);
    public static final Block CANDIDIUM_CIRCLE_BRICKS = registerBlock("candidium_circle_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.CREATURECRAFT);
    public static final Block CANDIDIUM_CIRCLE_PILLAR = registerBlock("candidium_circle_pillar",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.CREATURECRAFT);
    public static final Block CANDIDIUM_MIDDLE_CIRCLE = registerBlock("candidium_middle_circle",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.CREATURECRAFT);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(CreatureCraftMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(CreatureCraftMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlocks()  {
        CreatureCraftMod.LOGGER.debug("Registering ModBlocks for " + CreatureCraftMod.MOD_ID);
    }

}
