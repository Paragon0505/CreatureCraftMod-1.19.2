package net.copperfox.creaturecraftmod.entity;

import net.copperfox.creaturecraftmod.CreatureCraftMod;
import net.copperfox.creaturecraftmod.entity.custom.SquirrelEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<SquirrelEntity> SQUIRREL = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(CreatureCraftMod.MOD_ID, "squirrel"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SquirrelEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.65f)).build());
}
