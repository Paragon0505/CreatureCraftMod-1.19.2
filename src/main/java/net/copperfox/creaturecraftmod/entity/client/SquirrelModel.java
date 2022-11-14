package net.copperfox.creaturecraftmod.entity.client;

import net.copperfox.creaturecraftmod.CreatureCraftMod;
import net.copperfox.creaturecraftmod.entity.custom.SquirrelEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SquirrelModel extends AnimatedGeoModel<SquirrelEntity> {
    @Override
    public Identifier getModelResource(SquirrelEntity object) {
        return new Identifier(CreatureCraftMod.MOD_ID, "geo/squirrel.geo.json");
    }

    @Override
    public Identifier getTextureResource(SquirrelEntity object) {
        return new Identifier(CreatureCraftMod.MOD_ID, "textures/entity/squirreltexturewhite.png");
    }

    @Override
    public Identifier getAnimationResource(SquirrelEntity animatable) {
        return new Identifier(CreatureCraftMod.MOD_ID, "animations/squirrel.animation.json");
    }
}
