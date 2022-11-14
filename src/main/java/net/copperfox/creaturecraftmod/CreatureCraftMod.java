package net.copperfox.creaturecraftmod;

import net.copperfox.creaturecraftmod.block.ModBlocks;
import net.copperfox.creaturecraftmod.entity.ModEntities;
import net.copperfox.creaturecraftmod.entity.client.SquirrelRenderer;
import net.copperfox.creaturecraftmod.entity.custom.SquirrelEntity;
import net.copperfox.creaturecraftmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class CreatureCraftMod implements ModInitializer {
	//comment
	public static final String MOD_ID = "creaturecraftmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.SQUIRREL, SquirrelEntity.setAttributes());

		EntityRendererRegistry.register(ModEntities.SQUIRREL, SquirrelRenderer::new);
	}
}
