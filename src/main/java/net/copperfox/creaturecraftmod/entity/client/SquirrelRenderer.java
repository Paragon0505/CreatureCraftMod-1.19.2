package net.copperfox.creaturecraftmod.entity.client;

import net.copperfox.creaturecraftmod.CreatureCraftMod;
import net.copperfox.creaturecraftmod.entity.custom.SquirrelEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SquirrelRenderer extends GeoEntityRenderer<SquirrelEntity> {
    public SquirrelRenderer(EntityRendererFactory.Context cxt) {
        super(cxt, new SquirrelModel());
        this.shadowRadius = 0.2f;
    }

    @Override
    public Identifier getTextureResource(SquirrelEntity animatable) {
        return new Identifier(CreatureCraftMod.MOD_ID, "textures/entity/squirreltexturewhite.png");
    }

    @Override
    public RenderLayer getRenderType(SquirrelEntity animatable, float partialTick,
                                     MatrixStack poseStack, @Nullable VertexConsumerProvider bufferSource,
                                     @Nullable VertexConsumer buffer, int packedLight, Identifier texture) {
        poseStack.scale(1.2f, 1.2f, 1.2f);

        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
