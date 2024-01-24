package net.prangellplays.friendschatorigins.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.prangellplays.friendschatorigins.FriendsChatOrigins;
import net.prangellplays.friendschatorigins.entity.CodeEntity;

public class CodeEntityRenderer extends MobEntityRenderer<CodeEntity, CodeEntityModel<CodeEntity>> {
    private static final Identifier TEXTURE = new Identifier(FriendsChatOrigins.MOD_ID, "textures/entity/code_entity.png");


    public CodeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CodeEntityModel<>(context.getPart(FriendsChatOriginsModelLayers.CODE_ENTITY)), 0.6f);
    }

    @Override
    public Identifier getTexture(CodeEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(CodeEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
            matrixStack.scale(1f, 1f, 1f);


        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}