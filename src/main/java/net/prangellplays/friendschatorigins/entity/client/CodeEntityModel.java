package net.prangellplays.friendschatorigins.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.HostileEntity;
import net.prangellplays.friendschatorigins.entity.CodeEntity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class CodeEntityModel<T extends CodeEntity> extends SinglePartEntityModel<T> {
	private final ModelPart Body;

	public CodeEntityModel(ModelPart root) {
		this.Body = root.getChild("Body");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Body = modelPartData.addChild("Body", ModelPartBuilder.create().uv(14, 3).cuboid(7.0F, -2.0F, 0.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(12, 11).cuboid(5.0F, -2.0F, 0.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(26, 61).cuboid(6.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 61).cuboid(6.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(22, 61).cuboid(6.0F, 2.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(20, 61).cuboid(6.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(4, 12).cuboid(5.0F, -2.0F, 1.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(12, 3).cuboid(7.0F, -2.0F, 1.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(18, 61).cuboid(6.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(60, 60).cuboid(6.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(12, 36).cuboid(7.0F, 4.0F, 1.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(10, 36).cuboid(7.0F, 4.0F, 0.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 4).cuboid(5.0F, 11.0F, 0.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(60, 53).cuboid(7.0F, 13.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 13).cuboid(6.0F, 12.0F, 0.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 11).cuboid(5.0F, 10.0F, 0.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(10, 10).cuboid(5.0F, 10.0F, 1.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 0).cuboid(5.0F, 11.0F, 1.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 12).cuboid(6.0F, 12.0F, 1.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(60, 52).cuboid(7.0F, 13.0F, 1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 12).cuboid(1.3F, -5.3F, -4.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 33).cuboid(3.0F, -3.3F, -4.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(54, 10).cuboid(1.3F, -5.3F, -3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 30).cuboid(3.0F, -3.3F, -3.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(54, 6).cuboid(1.3F, -5.3F, -4.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 27).cuboid(3.0F, -3.3F, -4.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(54, 2).cuboid(1.3F, -5.3F, -3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 24).cuboid(3.0F, -3.3F, -3.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(16, 15).cuboid(3.0F, 13.0F, -4.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(12, 16).cuboid(1.0F, 13.0F, -4.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(58, 61).cuboid(2.0F, 13.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 61).cuboid(2.0F, 15.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 61).cuboid(2.0F, 17.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 61).cuboid(2.0F, 17.0F, -3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(10, 16).cuboid(1.0F, 13.0F, -3.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 16).cuboid(3.0F, 13.0F, -3.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(50, 61).cuboid(2.0F, 15.0F, -3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 61).cuboid(2.0F, 13.0F, -3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 32).cuboid(3.0F, 7.0F, -3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(32, 36).cuboid(3.0F, 7.0F, -4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 24).cuboid(1.0F, 1.0F, -4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 61).cuboid(3.0F, 3.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 17).cuboid(2.0F, 2.0F, -4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(14, 14).cuboid(1.0F, 0.0F, -4.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(14, 13).cuboid(1.0F, 0.0F, -3.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 20).cuboid(1.0F, 1.0F, -3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 16).cuboid(2.0F, 2.0F, -3.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(32, 61).cuboid(3.0F, 3.0F, -3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 16).cuboid(1.0F, 1.0F, -4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 61).cuboid(3.0F, 3.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 15).cuboid(2.0F, 2.0F, -4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(14, 12).cuboid(1.0F, 0.0F, -4.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(14, 11).cuboid(1.0F, 0.0F, -3.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 12).cuboid(1.0F, 1.0F, -3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 14).cuboid(2.0F, 2.0F, -3.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 61).cuboid(3.0F, 3.0F, -3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(58, 49).cuboid(-5.7F, -9.3F, 2.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 45).cuboid(-4.0F, -7.3F, 2.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(58, 45).cuboid(-5.7F, -9.3F, 3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 42).cuboid(-4.0F, -7.3F, 3.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(58, 41).cuboid(-5.7F, -9.3F, 2.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 39).cuboid(-4.0F, -7.3F, 2.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(58, 37).cuboid(-5.7F, -9.3F, 3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 36).cuboid(-4.0F, -7.3F, 3.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(20, 11).cuboid(-4.0F, 9.0F, 2.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(20, 1).cuboid(-6.0F, 9.0F, 2.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 9).cuboid(-5.0F, 9.0F, 2.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 8).cuboid(-5.0F, 11.0F, 2.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 62).cuboid(-5.0F, 13.0F, 2.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 7).cuboid(-5.0F, 13.0F, 3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(6, 19).cuboid(-6.0F, 9.0F, 3.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(4, 19).cuboid(-4.0F, 9.0F, 3.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 6).cuboid(-5.0F, 11.0F, 3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(6, 62).cuboid(-5.0F, 9.0F, 3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(6, 38).cuboid(-4.0F, 3.0F, 3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(38, 4).cuboid(-4.0F, 3.0F, 2.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(38, 0).cuboid(-6.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 1).cuboid(-4.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 21).cuboid(-5.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(18, 0).cuboid(-6.0F, -4.0F, 2.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 18).cuboid(-6.0F, -4.0F, 3.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 38).cuboid(-6.0F, -3.0F, 3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 20).cuboid(-5.0F, -2.0F, 3.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 0).cuboid(-4.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 36).cuboid(-6.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 62).cuboid(-4.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 19).cuboid(-5.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 17).cuboid(-6.0F, -4.0F, 2.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 55).cuboid(1.3F, -5.3F, 3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 51).cuboid(3.0F, -3.3F, 3.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(32, 55).cuboid(1.3F, -5.3F, 4.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(50, 52).cuboid(3.0F, -3.3F, 4.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(28, 55).cuboid(1.3F, -5.3F, 3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 48).cuboid(3.0F, -3.3F, 3.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(24, 55).cuboid(1.3F, -5.3F, 4.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 52).cuboid(3.0F, -3.3F, 4.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(6, 24).cuboid(3.0F, 13.0F, 3.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 5).cuboid(1.0F, 13.0F, 3.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 30).cuboid(2.0F, 13.0F, 3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 62).cuboid(2.0F, 15.0F, 3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 29).cuboid(2.0F, 17.0F, 3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 28).cuboid(2.0F, 17.0F, 4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(4, 24).cuboid(1.0F, 13.0F, 4.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 24).cuboid(3.0F, 13.0F, 4.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 62).cuboid(2.0F, 15.0F, 4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 27).cuboid(2.0F, 13.0F, 4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(20, 39).cuboid(3.0F, 7.0F, 4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(14, 39).cuboid(3.0F, 7.0F, 3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(38, 28).cuboid(1.0F, 1.0F, 3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 22).cuboid(3.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 29).cuboid(2.0F, 2.0F, 3.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(22, 4).cuboid(1.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(22, 3).cuboid(1.0F, 0.0F, 4.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 38).cuboid(1.0F, 1.0F, 4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 28).cuboid(2.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(22, 62).cuboid(3.0F, 3.0F, 4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(26, 38).cuboid(1.0F, 1.0F, 3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 21).cuboid(3.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 27).cuboid(2.0F, 2.0F, 3.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(22, 2).cuboid(1.0F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(22, 1).cuboid(1.0F, 0.0F, 4.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(38, 24).cuboid(1.0F, 1.0F, 4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 26).cuboid(2.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 20).cuboid(3.0F, 3.0F, 4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 55).cuboid(-2.7F, 8.7F, 8.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 50).cuboid(-1.0F, 10.7F, 8.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(54, 54).cuboid(-2.7F, 8.7F, 9.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 50).cuboid(-1.0F, 10.7F, 9.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(20, 21).cuboid(-1.0F, 15.0F, 8.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(12, 21).cuboid(-3.0F, 15.0F, 8.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(20, 62).cuboid(-2.0F, 15.0F, 8.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 19).cuboid(-2.0F, 17.0F, 8.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 18).cuboid(-2.0F, 19.0F, 8.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(18, 62).cuboid(-2.0F, 19.0F, 9.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(10, 21).cuboid(-3.0F, 15.0F, 9.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 21).cuboid(-1.0F, 15.0F, 9.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 17).cuboid(-2.0F, 17.0F, 9.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 16).cuboid(-2.0F, 15.0F, 9.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 38).cuboid(-1.0F, -3.0F, 9.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(22, 38).cuboid(-1.0F, -3.0F, 8.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(38, 16).cuboid(-3.0F, 3.0F, 8.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(12, 62).cuboid(-1.0F, 5.0F, 8.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 25).cuboid(-2.0F, 4.0F, 8.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(18, 9).cuboid(-3.0F, 2.0F, 8.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(18, 8).cuboid(-3.0F, 2.0F, 9.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(16, 38).cuboid(-3.0F, 3.0F, 9.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 24).cuboid(-2.0F, 4.0F, 9.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 11).cuboid(-1.0F, 5.0F, 9.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 14).cuboid(-4.7F, 6.7F, -5.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(12, 51).cuboid(-3.0F, 8.7F, -5.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(12, 56).cuboid(-4.7F, 6.7F, -4.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(50, 49).cuboid(-3.0F, 8.7F, -4.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(18, 25).cuboid(-3.0F, 13.0F, -5.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(16, 25).cuboid(-5.0F, 13.0F, -5.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 39).cuboid(-4.0F, 13.0F, -5.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 38).cuboid(-4.0F, 15.0F, -5.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(38, 62).cuboid(-4.0F, 17.0F, -5.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 37).cuboid(-4.0F, 17.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(14, 25).cuboid(-5.0F, 13.0F, -4.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 23).cuboid(-3.0F, 13.0F, -4.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 36).cuboid(-4.0F, 15.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 62).cuboid(-4.0F, 13.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 16).cuboid(-3.0F, -5.0F, -4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 12).cuboid(-3.0F, -5.0F, -5.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(12, 40).cuboid(-3.0F, -5.0F, -4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(10, 40).cuboid(-3.0F, -5.0F, -5.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 8).cuboid(-5.0F, 1.0F, -5.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 33).cuboid(-3.0F, 3.0F, -5.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 32).cuboid(-4.0F, 2.0F, -5.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 12).cuboid(-5.0F, 0.0F, -5.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 11).cuboid(-5.0F, 0.0F, -4.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 40).cuboid(-5.0F, 1.0F, -4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 31).cuboid(-4.0F, 2.0F, -4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 32).cuboid(-3.0F, 3.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 4).cuboid(-5.0F, 1.0F, -5.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(32, 62).cuboid(-3.0F, 3.0F, -5.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 30).cuboid(-4.0F, 2.0F, -5.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 10).cuboid(-5.0F, 0.0F, -5.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 0).cuboid(-5.0F, 0.0F, -4.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 0).cuboid(-5.0F, 1.0F, -4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 48).cuboid(-4.0F, 2.0F, -4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 31).cuboid(-3.0F, 3.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 46).cuboid(-7.7F, 4.7F, -4.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 9).cuboid(-6.0F, 6.7F, -4.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(56, 42).cuboid(-7.7F, 4.7F, -3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 6).cuboid(-6.0F, 6.7F, -3.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(12, 27).cuboid(-6.0F, 11.0F, -4.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(10, 27).cuboid(-8.0F, 11.0F, -4.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(50, 62).cuboid(-7.0F, 11.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 49).cuboid(-7.0F, 13.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 48).cuboid(-7.0F, 15.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 62).cuboid(-7.0F, 15.0F, -3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 27).cuboid(-8.0F, 11.0F, -3.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(26, 23).cuboid(-6.0F, 11.0F, -3.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 47).cuboid(-7.0F, 13.0F, -3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 46).cuboid(-7.0F, 11.0F, -3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 40).cuboid(-6.0F, -7.0F, -3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 40).cuboid(-6.0F, -7.0F, -4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 32).cuboid(-6.0F, -7.0F, -3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(32, 40).cuboid(-6.0F, -7.0F, -4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 40).cuboid(-8.0F, -1.0F, -4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 62).cuboid(-6.0F, 1.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 35).cuboid(-7.0F, 0.0F, -4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 26).cuboid(-8.0F, -2.0F, -4.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(26, 7).cuboid(-8.0F, -2.0F, -3.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 28).cuboid(-8.0F, -1.0F, -3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 34).cuboid(-7.0F, 0.0F, -3.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 41).cuboid(-6.0F, 1.0F, -3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 24).cuboid(-8.0F, -1.0F, -4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 40).cuboid(-6.0F, 1.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 48).cuboid(-7.0F, 0.0F, -4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(26, 6).cuboid(-8.0F, -2.0F, -4.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(26, 5).cuboid(-8.0F, -2.0F, -3.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 20).cuboid(-8.0F, -1.0F, -3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 33).cuboid(-7.0F, 0.0F, -3.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 62).cuboid(-6.0F, 1.0F, -3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 42).cuboid(4.0F, 7.0F, -1.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 40).cuboid(4.0F, 7.0F, -2.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 2).cuboid(2.0F, 17.0F, -2.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 40).cuboid(2.0F, 15.0F, -2.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 39).cuboid(2.0F, 13.0F, -2.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 52).cuboid(2.0F, 14.0F, -2.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 62).cuboid(2.0F, 14.0F, -1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 1).cuboid(2.0F, 17.0F, -1.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 38).cuboid(2.0F, 15.0F, -1.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(38, 48).cuboid(2.0F, 13.0F, -1.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 18).cuboid(4.0F, 1.0F, -2.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 54).cuboid(2.0F, 1.0F, -2.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 56).cuboid(2.0F, 1.0F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 13).cuboid(4.0F, 1.0F, -1.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(38, 40).cuboid(2.0F, -3.0F, -2.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 51).cuboid(4.0F, -1.0F, -2.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 37).cuboid(3.0F, -2.0F, -2.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(26, 9).cuboid(2.0F, -4.0F, -2.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(26, 8).cuboid(2.0F, -4.0F, -1.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 36).cuboid(2.0F, -3.0F, -1.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 36).cuboid(3.0F, -2.0F, -1.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 50).cuboid(4.0F, -1.0F, -1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 4).cuboid(0.0F, 2.0F, -4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(4, 42).cuboid(0.0F, 2.0F, -5.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 29).cuboid(0.0F, -4.0F, -5.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(14, 57).cuboid(-2.0F, -4.0F, -5.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(6, 57).cuboid(-2.0F, -4.0F, -4.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 29).cuboid(0.0F, -4.0F, -4.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 28).cuboid(-2.0F, 12.0F, -5.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 45).cuboid(-2.0F, 10.0F, -5.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 44).cuboid(-2.0F, 8.0F, -5.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 55).cuboid(-2.0F, 9.0F, -5.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 54).cuboid(-2.0F, 9.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 23).cuboid(-2.0F, 12.0F, -4.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 43).cuboid(-2.0F, 10.0F, -4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 42).cuboid(-2.0F, 8.0F, -4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 42).cuboid(-2.0F, -8.0F, -5.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 62).cuboid(0.0F, -6.0F, -5.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 48).cuboid(-1.0F, -7.0F, -5.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 4).cuboid(-2.0F, -9.0F, -5.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 3).cuboid(-2.0F, -9.0F, -4.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 0).cuboid(-2.0F, -8.0F, -4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 41).cuboid(-1.0F, -7.0F, -4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 53).cuboid(0.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(16, 42).cuboid(-1.0F, 7.0F, 4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 12).cuboid(-1.0F, 7.0F, 3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(6, 29).cuboid(2.0F, 1.0F, 3.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 57).cuboid(0.0F, 1.0F, 3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 57).cuboid(0.0F, 1.0F, 4.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(4, 29).cuboid(2.0F, 1.0F, 4.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-3.0F, 17.0F, 3.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(16, 49).cuboid(-3.0F, 15.0F, 3.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 49).cuboid(-3.0F, 13.0F, 3.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(58, 62).cuboid(-3.0F, 14.0F, 3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 57).cuboid(-3.0F, 14.0F, 4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 26).cuboid(-3.0F, 17.0F, 4.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(4, 49).cuboid(-3.0F, 15.0F, 4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 48).cuboid(-3.0F, 13.0F, 4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 8).cuboid(0.0F, -4.0F, 3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 56).cuboid(2.0F, -2.0F, 3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 47).cuboid(1.0F, -3.0F, 3.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 25).cuboid(0.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 24).cuboid(0.0F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(6, 42).cuboid(0.0F, -4.0F, 4.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 46).cuboid(1.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 62).cuboid(2.0F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(22, 42).cuboid(-3.0F, 6.0F, 2.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 20).cuboid(-3.0F, 6.0F, 1.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(14, 30).cuboid(-3.0F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(46, 57).cuboid(-5.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 57).cuboid(-5.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 12).cuboid(-3.0F, 0.0F, 2.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 11).cuboid(-10.0F, 16.0F, 1.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 49).cuboid(-10.0F, 14.0F, 1.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(38, 49).cuboid(-10.0F, 12.0F, 1.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 60).cuboid(-10.0F, 13.0F, 1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(60, 62).cuboid(-10.0F, 13.0F, 2.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 10).cuboid(-10.0F, 16.0F, 2.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 49).cuboid(-10.0F, 14.0F, 2.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 49).cuboid(-10.0F, 12.0F, 2.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(18, 42).cuboid(-5.0F, -5.0F, 1.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 59).cuboid(-3.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(26, 49).cuboid(-4.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 0).cuboid(-5.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 29).cuboid(-5.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 16).cuboid(-5.0F, -5.0F, 2.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(22, 49).cuboid(-4.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 58).cuboid(-3.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 28).cuboid(-3.0F, 4.0F, -2.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 24).cuboid(-3.0F, 4.0F, -3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(10, 3).cuboid(-3.0F, -2.0F, -3.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 53).cuboid(-5.0F, -2.0F, -3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 53).cuboid(-5.0F, -2.0F, -2.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(6, 9).cuboid(-3.0F, -2.0F, -2.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(10, 2).cuboid(-5.0F, 14.0F, -3.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 9).cuboid(-5.0F, 12.0F, -3.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 8).cuboid(-5.0F, 10.0F, -3.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(60, 49).cuboid(-5.0F, 11.0F, -3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(60, 48).cuboid(-5.0F, 11.0F, -2.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(10, 1).cuboid(-5.0F, 14.0F, -2.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 48).cuboid(-5.0F, 12.0F, -2.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 7).cuboid(-5.0F, 10.0F, -2.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 20).cuboid(-5.0F, -7.0F, -3.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(60, 47).cuboid(-3.0F, -5.0F, -3.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 6).cuboid(-4.0F, -6.0F, -3.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 10).cuboid(-5.0F, -8.0F, -3.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 9).cuboid(-5.0F, -8.0F, -2.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 16).cuboid(-5.0F, -7.0F, -2.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(32, 9).cuboid(-4.0F, -6.0F, -2.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(60, 46).cuboid(-3.0F, -5.0F, -2.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 63).cuboid(-1.0F, 7.0F, -7.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 16).cuboid(0.0F, 4.0F, -7.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 12).cuboid(-2.0F, 4.0F, -7.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 63).cuboid(-1.0F, 4.0F, -7.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(26, 63).cuboid(-1.0F, 4.0F, -6.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(12, 44).cuboid(-2.0F, 4.0F, -6.1F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(10, 44).cuboid(0.0F, 4.0F, -6.1F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 63).cuboid(-1.0F, 7.0F, -6.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 8).cuboid(0.0F, 4.0F, -7.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(22, 63).cuboid(-1.0F, 7.0F, -7.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 44).cuboid(-2.0F, 4.0F, -7.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(58, 6).cuboid(-8.6F, 4.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(6, 58).cuboid(-8.6F, 7.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 31).cuboid(-8.6F, 4.0F, -1.0F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 31).cuboid(-8.6F, 4.0F, 1.0F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 2).cuboid(-7.6F, 7.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(2, 58).cuboid(-7.6F, 4.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 31).cuboid(-7.6F, 4.0F, -1.0F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 27).cuboid(-7.6F, 4.0F, 1.0F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 63).cuboid(-1.0F, 4.0F, -7.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(64, 0).cuboid(-1.0F, 1.0F, -7.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 46).cuboid(0.0F, -2.0F, -7.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 64).cuboid(-1.0F, -2.0F, -7.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(46, 0).cuboid(-2.0F, -2.0F, -6.1F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 63).cuboid(-1.0F, -2.0F, -6.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 46).cuboid(0.0F, -2.0F, -6.1F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(60, 63).cuboid(-1.0F, 1.0F, -6.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(16, 58).cuboid(-8.6F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 15).cuboid(-8.6F, -2.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 34).cuboid(-8.6F, -2.0F, 1.0F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 11).cuboid(-8.6F, -2.0F, -1.0F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 14).cuboid(-7.6F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 58).cuboid(-7.6F, -2.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 4).cuboid(-7.6F, -2.0F, 1.0F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 0).cuboid(-7.6F, -2.0F, -1.0F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(38, 44).cuboid(-2.0F, 4.0F, -6.25F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(50, 63).cuboid(-1.0F, 4.0F, -6.25F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 63).cuboid(-1.0F, 7.0F, -6.25F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 36).cuboid(0.0F, 4.0F, -6.25F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(58, 33).cuboid(5.3F, -8.3F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 21).cuboid(7.0F, -6.3F, 0.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(58, 29).cuboid(5.3F, -8.3F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 18).cuboid(7.0F, -6.3F, 1.0F, 1.0F, 2.9F, 0.0F, new Dilation(0.0F))
		.uv(46, 31).cuboid(-2.0F, -2.0F, -7.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Body_r1 = Body.addChild("Body_r1", ModelPartBuilder.create().uv(12, 48).cuboid(-0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, -4.8F, -7.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData Body_r2 = Body.addChild("Body_r2", ModelPartBuilder.create().uv(48, 49).cuboid(-0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, -4.8F, -6.1F, -0.1745F, 0.0F, 0.0F));

		ModelPartData Body_r3 = Body.addChild("Body_r3", ModelPartBuilder.create().uv(0, 50).cuboid(-0.7458F, -11.5224F, -3.2152F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(50, 0).cuboid(-0.8323F, -11.7686F, -2.1834F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(4.8F, 5.7764F, -5.0108F, -0.2565F, -0.4155F, 0.0395F));

		ModelPartData Body_r4 = Body.addChild("Body_r4", ModelPartBuilder.create().uv(4, 45).cuboid(1.7683F, -1.6174F, -2.2955F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(6, 45).cuboid(0.8317F, -1.7826F, -2.3045F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.0292F, -4.7044F, -3.0198F, -2.8457F, -0.3058F, 2.7341F));

		ModelPartData Body_r5 = Body.addChild("Body_r5", ModelPartBuilder.create().uv(16, 45).cuboid(1.012F, 0.8901F, -0.9045F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 45).cuboid(1.888F, 1.11F, -0.9956F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.8329F, -7.4307F, 3.527F, 2.9755F, 0.6527F, 2.8104F));

		ModelPartData Body_r6 = Body.addChild("Body_r6", ModelPartBuilder.create().uv(2, 50).cuboid(-0.4406F, 0.9121F, 0.5013F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(50, 3).cuboid(-0.5594F, 1.0879F, 1.4987F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.6538F, -7.262F, 6.6791F, 3.0543F, -0.3142F, 3.1416F));

		ModelPartData Body_r7 = Body.addChild("Body_r7", ModelPartBuilder.create().uv(4, 50).cuboid(-0.1161F, -5.2468F, -1.076F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(6, 50).cuboid(0.0431F, -5.3878F, -0.0989F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.0377F, -0.6743F, 7.2021F, 3.0064F, 0.5264F, -3.1192F));

		ModelPartData Body_r8 = Body.addChild("Body_r8", ModelPartBuilder.create().uv(22, 45).cuboid(1.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-8.6F, -4.8F, 0.5F, 0.0F, 0.0F, 0.1745F));

		ModelPartData Body_r9 = Body.addChild("Body_r9", ModelPartBuilder.create().uv(24, 45).cuboid(1.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-7.6F, -4.8F, 0.5F, 0.0F, 0.0F, 0.1745F));

		ModelPartData Body_r10 = Body.addChild("Body_r10", ModelPartBuilder.create().uv(26, 45).cuboid(1.6F, 1.0F, 0.6F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 45).cuboid(0.6F, 1.0F, 0.6F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.5811F, -7.0884F, -7.6F, -0.1145F, -0.9552F, 0.3055F));

		ModelPartData Body_r11 = Body.addChild("Body_r11", ModelPartBuilder.create().uv(8, 50).cuboid(0.0431F, 2.3878F, -0.4989F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(10, 50).cuboid(0.0431F, 7.3878F, -0.4989F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(14, 50).cuboid(-0.1161F, 7.2468F, -1.476F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(16, 50).cuboid(-0.1161F, 2.2468F, -1.476F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.0377F, 7.3743F, 7.2021F, -3.0064F, 0.5264F, 3.1192F));

		ModelPartData Body_r12 = Body.addChild("Body_r12", ModelPartBuilder.create().uv(18, 50).cuboid(-0.5594F, -4.0879F, 1.4987F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(46, 47).cuboid(-0.5594F, 0.9121F, 1.4987F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 0).cuboid(-0.4406F, 1.0879F, 0.5013F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(20, 50).cuboid(-0.4406F, -3.9121F, 0.5013F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.6538F, 13.962F, 6.6791F, -3.0543F, -0.3142F, -3.1416F));

		ModelPartData Body_r13 = Body.addChild("Body_r13", ModelPartBuilder.create().uv(46, 3).cuboid(1.788F, -4.11F, -0.7956F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 34).cuboid(1.788F, 0.8901F, -0.7956F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 37).cuboid(1.012F, 1.1099F, -0.2045F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 46).cuboid(1.012F, -3.8901F, -0.2045F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.8329F, 14.1308F, 3.527F, -2.9755F, 0.6527F, -2.8104F));

		ModelPartData Body_r14 = Body.addChild("Body_r14", ModelPartBuilder.create().uv(46, 6).cuboid(0.3683F, -4.0826F, -1.3955F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 9).cuboid(0.3683F, 0.9174F, -1.3955F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 12).cuboid(-0.5683F, -3.9174F, -1.4045F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 19).cuboid(-0.5683F, 1.0826F, -1.4045F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.0261F, 13.6939F, -3.0632F, 3.0027F, -0.3058F, -2.7341F));

		ModelPartData Body_r15 = Body.addChild("Body_r15", ModelPartBuilder.create().uv(46, 15).cuboid(1.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 18).cuboid(1.0F, 3.5F, -0.5F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-7.6F, 11.5F, 0.5F, 0.0F, 0.0F, -0.1745F));

		ModelPartData Body_r16 = Body.addChild("Body_r16", ModelPartBuilder.create().uv(20, 46).cuboid(1.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 27).cuboid(1.0F, 3.5F, -0.5F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-8.6F, 11.5F, 0.5F, 0.0F, 0.0F, -0.1745F));

		ModelPartData Body_r17 = Body.addChild("Body_r17", ModelPartBuilder.create().uv(46, 40).cuboid(1.6F, 1.0F, 0.6F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 21).cuboid(1.6F, -4.0F, 0.6F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 24).cuboid(0.6F, -4.0F, 0.6F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 43).cuboid(0.6F, 1.0F, 0.6F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.5811F, 13.7884F, -7.6F, 0.1145F, -0.9552F, -0.3055F));

		ModelPartData Body_r18 = Body.addChild("Body_r18", ModelPartBuilder.create().uv(22, 50).cuboid(-0.6571F, 4.0587F, -1.0278F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 50).cuboid(-0.6571F, 9.0587F, -1.0278F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 3).cuboid(-0.5706F, 8.8125F, -2.0596F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(26, 50).cuboid(-0.5706F, 3.8125F, -2.0596F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(4.8F, 5.7764F, -5.0108F, 0.2565F, -0.4155F, -0.0395F));

		ModelPartData Body_r19 = Body.addChild("Body_r19", ModelPartBuilder.create().uv(28, 50).cuboid(-0.5F, 3.5F, 1.0F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 50).cuboid(-0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 11.5F, -6.1F, 0.1745F, 0.0F, 0.0F));

		ModelPartData Body_r20 = Body.addChild("Body_r20", ModelPartBuilder.create().uv(32, 50).cuboid(-0.5F, 3.5F, 1.0F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 50).cuboid(-0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 11.5F, -7.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData Body_r21 = Body.addChild("22_r1", ModelPartBuilder.create().uv(60, 40).cuboid(3.0F, -1.5F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(58, 55).cuboid(-1.0F, -2.4F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(60, 42).cuboid(3.0F, -1.5F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(58, 57).cuboid(-1.0F, -2.4F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F)), ModelTransform.of(5.5F, -7.3F, 1.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r22 = Body.addChild("22_r2", ModelPartBuilder.create().uv(58, 27).cuboid(1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(58, 31).cuboid(1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(5.8F, -7.3F, 1.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r23 = Body.addChild("0_r1", ModelPartBuilder.create().uv(44, 20).cuboid(-0.0488F, -9.5488F, -6.6302F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 24).cuboid(-2.0488F, -9.5488F, -6.6302F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(32, 63).cuboid(-1.0488F, -9.5488F, -6.6302F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 63).cuboid(-1.0488F, -6.5488F, -6.6302F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 61).cuboid(-1.0488F, -0.5488F, -6.6302F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(62, 62).cuboid(-1.0488F, -3.5488F, -6.6302F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 42).cuboid(-2.0488F, -3.5488F, -6.6302F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 24).cuboid(-0.0488F, -3.5488F, -6.6302F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.1512F, 7.5488F, -0.3698F, -3.1416F, -0.3142F, 3.1416F));

		ModelPartData Body_r24 = Body.addChild("0_r2", ModelPartBuilder.create().uv(44, 28).cuboid(-0.0488F, -9.5488F, -6.6302F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 63).cuboid(-1.0488F, -6.5488F, -6.6302F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(38, 63).cuboid(-1.0488F, -9.5488F, -6.6302F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 44).cuboid(-2.0488F, -9.5488F, -6.6302F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 63).cuboid(-1.0488F, -3.5488F, -6.6302F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 36).cuboid(-2.0488F, -3.5488F, -6.6302F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(10, 63).cuboid(-1.0488F, -0.5488F, -6.6302F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 40).cuboid(-0.0488F, -3.5488F, -6.6302F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0488F, 7.5488F, 0.6302F, -3.1416F, -0.3142F, 3.1416F));

		ModelPartData Body_r25 = Body.addChild("0_r3", ModelPartBuilder.create().uv(32, 27).cuboid(-8.7204F, -9.5488F, -4.8496F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 31).cuboid(-8.7204F, -9.5488F, -2.8496F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 7).cuboid(-8.7204F, -6.5488F, -3.8496F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 58).cuboid(-8.7204F, -9.5488F, -3.8496F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 29).cuboid(-8.7204F, -3.5488F, -4.8496F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 29).cuboid(-8.7204F, -3.5488F, -2.8496F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(52, 57).cuboid(-8.7204F, -3.5488F, -3.8496F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(54, 57).cuboid(-8.7204F, -0.5488F, -3.8496F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.9512F, 7.5488F, -0.3698F, -3.1416F, 0.0349F, 3.1416F));

		ModelPartData Body_r26 = Body.addChild("0_r4", ModelPartBuilder.create().uv(0, 33).cuboid(-7.0488F, -9.5488F, -0.6302F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(2, 33).cuboid(-7.0488F, -9.5488F, 1.3698F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 8).cuboid(-7.0488F, -9.5488F, 0.3698F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 9).cuboid(-7.0488F, -6.5488F, 0.3698F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 29).cuboid(-7.0488F, -3.5488F, -0.6302F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 29).cuboid(-7.0488F, -3.5488F, 1.3698F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 4).cuboid(-7.0488F, -0.5488F, 0.3698F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 57).cuboid(-7.0488F, -3.5488F, 0.3698F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.1488F, 7.5488F, 0.4302F, -3.0132F, -0.3117F, 3.102F));

		ModelPartData Body_r27 = Body.addChild("0_r5", ModelPartBuilder.create().uv(4, 33).cuboid(-8.7204F, -9.5488F, -4.8496F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(6, 33).cuboid(-8.7204F, -9.5488F, -2.8496F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 11).cuboid(-8.7204F, -6.5488F, -3.8496F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 58).cuboid(-8.7204F, -9.5488F, -3.8496F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 16).cuboid(-8.7204F, -3.5488F, -2.8496F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 30).cuboid(-8.7204F, -3.5488F, -4.8496F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(56, 57).cuboid(-8.7204F, -3.5488F, -3.8496F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 58).cuboid(-8.7204F, -0.5488F, -3.8496F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0488F, 7.5488F, -0.3698F, -3.1416F, 0.0349F, 3.1416F));

		ModelPartData Body_r28 = Body.addChild("0_r6", ModelPartBuilder.create().uv(16, 33).cuboid(-7.0488F, -9.5488F, -0.6302F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 33).cuboid(-7.0488F, -9.5488F, 1.3698F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 58).cuboid(-7.0488F, -9.5488F, 0.3698F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 10).cuboid(-7.0488F, -6.5488F, 0.3698F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 29).cuboid(-7.0488F, -3.5488F, 1.3698F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 29).cuboid(-7.0488F, -3.5488F, -0.6302F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 0).cuboid(-7.0488F, -0.5488F, 0.3698F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 1).cuboid(-7.0488F, -3.5488F, 0.3698F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.1488F, 7.5488F, 0.2302F, -3.0132F, -0.3117F, 3.102F));

		ModelPartData Body_r29 = Body.addChild("0_r7", ModelPartBuilder.create().uv(32, 44).cuboid(0.5095F, -9.3743F, 0.2726F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 32).cuboid(-1.4905F, -9.3743F, 0.2726F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 63).cuboid(-0.4905F, -9.3743F, 0.2726F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 63).cuboid(-0.4905F, -6.3743F, 0.2726F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 63).cuboid(-0.5254F, -6.3743F, -0.7268F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 44).cuboid(0.4746F, -9.3743F, -0.7268F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 44).cuboid(-1.5254F, -9.3743F, -0.7268F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(46, 63).cuboid(-0.5254F, -9.3743F, -0.7268F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 63).cuboid(-0.4905F, -3.3743F, 0.2726F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(26, 42).cuboid(0.5095F, -3.3743F, 0.2726F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(4, 63).cuboid(-0.4905F, -0.3743F, 0.2726F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 42).cuboid(-1.4905F, -3.3743F, 0.2726F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 28).cuboid(-1.5254F, -3.3743F, -0.7268F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(6, 63).cuboid(-0.5254F, -0.3743F, -0.7268F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 63).cuboid(-0.5254F, -3.3743F, -0.7268F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 32).cuboid(0.4746F, -3.3743F, -0.7268F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.0377F, 7.3743F, 7.2021F, 3.1416F, 0.4014F, -3.1416F));

		ModelPartData Body_r30 = Body.addChild("0_r8", ModelPartBuilder.create().uv(22, 33).cuboid(-0.4699F, -5.0F, -1.329F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 33).cuboid(-0.4699F, -5.0F, 0.671F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 12).cuboid(-0.4699F, -2.0F, -0.329F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 33).cuboid(0.5301F, -5.0F, -1.329F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 13).cuboid(0.5198F, -2.0F, -0.671F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 33).cuboid(0.5198F, -5.0F, 0.329F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 16).cuboid(-0.4699F, -5.0F, -0.329F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 17).cuboid(0.5301F, -5.0F, -0.329F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 31).cuboid(-0.4699F, 1.0F, -1.329F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 3).cuboid(-0.4699F, 1.0F, -0.329F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 58).cuboid(-0.4699F, 4.0F, -0.329F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 4).cuboid(-0.4699F, 1.0F, 0.671F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 4).cuboid(0.4699F, 4.0F, -0.671F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 11).cuboid(0.4699F, 1.0F, -1.671F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 15).cuboid(0.4699F, 1.0F, 0.329F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 5).cuboid(0.4699F, 1.0F, -0.671F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.5F, 3.0F, -6.5F, 0.0F, -0.8029F, 0.0F));

		ModelPartData Body_r31 = Body.addChild("0_r9", ModelPartBuilder.create().uv(40, 44).cuboid(0.2474F, -7.7764F, -0.1093F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 40).cuboid(-1.7526F, -7.7764F, -0.1093F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(52, 63).cuboid(-0.7526F, -7.7764F, -0.1093F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 63).cuboid(-0.7526F, -4.7764F, -0.1093F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 63).cuboid(-0.7188F, -4.7764F, -1.1858F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 44).cuboid(0.2812F, -7.7764F, -1.1858F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 44).cuboid(-1.7188F, -7.7764F, -1.1858F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(58, 63).cuboid(-0.7188F, -7.7764F, -1.1858F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(14, 63).cuboid(-0.7526F, -1.7764F, -0.1093F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(14, 43).cuboid(-1.7526F, -1.7764F, -0.1093F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(16, 63).cuboid(-0.7526F, 1.2236F, -0.1093F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(20, 43).cuboid(0.2474F, -1.7764F, -0.1093F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 0).cuboid(-1.7188F, -1.7764F, -1.1858F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(18, 63).cuboid(-0.7188F, 1.2236F, -1.1858F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(20, 63).cuboid(-0.7188F, -1.7764F, -1.1858F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 4).cuboid(0.2812F, -1.7764F, -1.1858F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(4.8F, 5.7764F, -5.0108F, 0.0F, -0.5585F, 0.0F));

		ModelPartData Body_r32 = Body.addChild("57_r1", ModelPartBuilder.create().uv(30, 21).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 53).cuboid(-2.0F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.5F, -5.0F, -2.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r33 = Body.addChild("56_r1", ModelPartBuilder.create().uv(0, 0).cuboid(0.5F, 0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 1).cuboid(0.5F, 0.5F, -1.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-3.5F, 14.5F, -2.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r34 = Body.addChild("55_r1", ModelPartBuilder.create().uv(4, 53).cuboid(-0.5F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(6, 53).cuboid(-0.5F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, 0.5F, -2.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r35 = Body.addChild("54_r1", ModelPartBuilder.create().uv(10, 53).cuboid(-2.0F, 1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(14, 53).cuboid(-2.0F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, 6.0F, -3.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r36 = Body.addChild("61_r1", ModelPartBuilder.create().uv(36, 57).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(38, 57).cuboid(-2.0F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.5F, -3.0F, 2.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r37 = Body.addChild("60_r1", ModelPartBuilder.create().uv(0, 8).cuboid(0.5F, 0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 0).cuboid(0.5F, 0.5F, -1.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-8.5F, 16.5F, 2.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r38 = Body.addChild("59_r1", ModelPartBuilder.create().uv(42, 57).cuboid(-0.5F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 57).cuboid(-0.5F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, 2.5F, 2.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r39 = Body.addChild("58_r1", ModelPartBuilder.create().uv(48, 57).cuboid(-2.0F, 1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(50, 57).cuboid(-2.0F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, 8.0F, 1.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r40 = Body.addChild("53_r1", ModelPartBuilder.create().uv(20, 57).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(22, 57).cuboid(-2.0F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -2.0F, 4.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r41 = Body.addChild("52_r1", ModelPartBuilder.create().uv(0, 6).cuboid(0.5F, 0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 7).cuboid(0.5F, 0.5F, -1.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, 17.5F, 4.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r42 = Body.addChild("51_r1", ModelPartBuilder.create().uv(26, 57).cuboid(-0.5F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(28, 57).cuboid(-0.5F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, 3.5F, 4.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r43 = Body.addChild("50_r1", ModelPartBuilder.create().uv(32, 57).cuboid(-2.0F, 4.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 57).cuboid(-2.0F, 4.5F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, 9.0F, 3.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r44 = Body.addChild("45_r1", ModelPartBuilder.create().uv(2, 57).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(4, 57).cuboid(-2.0F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, -6.0F, -4.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r45 = Body.addChild("44_r1", ModelPartBuilder.create().uv(0, 4).cuboid(0.5F, 0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 5).cuboid(0.5F, 0.5F, -1.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 12.5F, -4.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r46 = Body.addChild("43_r1", ModelPartBuilder.create().uv(8, 57).cuboid(-0.5F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(10, 57).cuboid(-0.5F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -1.5F, -4.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r47 = Body.addChild("42_r1", ModelPartBuilder.create().uv(16, 57).cuboid(-2.0F, 1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(18, 57).cuboid(-2.0F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, 4.0F, -5.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r48 = Body.addChild("49_r1", ModelPartBuilder.create().uv(56, 48).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 50).cuboid(-2.0F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -1.0F, -1.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r49 = Body.addChild("47_r1", ModelPartBuilder.create().uv(56, 52).cuboid(-0.5F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 56).cuboid(-0.5F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(4.5F, 3.5F, -1.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r50 = Body.addChild("48_r1", ModelPartBuilder.create().uv(0, 2).cuboid(0.5F, 0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 3).cuboid(0.5F, 0.5F, -1.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, 17.5F, -1.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r51 = Body.addChild("46_r1", ModelPartBuilder.create().uv(56, 56).cuboid(-2.0F, 1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 57).cuboid(-2.0F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(5.5F, 9.0F, -2.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r52 = Body.addChild("41_r1", ModelPartBuilder.create().uv(56, 16).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 18).cuboid(-2.0F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 20).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 22).cuboid(-2.0F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-7.5F, 1.0F, -3.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r53 = Body.addChild("40_r1", ModelPartBuilder.create().uv(56, 24).cuboid(-2.0F, 1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 26).cuboid(-2.0F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 28).cuboid(-2.0F, 1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 30).cuboid(-2.0F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.5F, -5.0F, -4.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r54 = Body.addChild("38_r1", ModelPartBuilder.create().uv(65, 46).cuboid(3.0F, -1.5F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(54, 59).cuboid(-1.0F, -2.4F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(60, 18).cuboid(3.0F, -1.5F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(56, 59).cuboid(-1.0F, -2.4F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-7.5F, 5.7F, -3.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r55 = Body.addChild("38_r2", ModelPartBuilder.create().uv(56, 40).cuboid(1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 44).cuboid(1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-7.2F, 5.7F, -3.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r56 = Body.addChild("17_r1", ModelPartBuilder.create().uv(38, 55).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(40, 55).cuboid(-2.0F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(42, 55).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 55).cuboid(-2.0F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.5F, 3.0F, -4.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r57 = Body.addChild("16_r1", ModelPartBuilder.create().uv(46, 55).cuboid(-2.0F, 1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 55).cuboid(-2.0F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(50, 55).cuboid(-2.0F, 1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 0).cuboid(-2.0F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, -3.0F, -5.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r58 = Body.addChild("14_r1", ModelPartBuilder.create().uv(60, 12).cuboid(3.0F, -1.5F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(46, 59).cuboid(-1.0F, -2.4F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(14, 60).cuboid(3.0F, -1.5F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(48, 59).cuboid(-1.0F, -2.4F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.5F, 7.7F, -4.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r59 = Body.addChild("14_r2", ModelPartBuilder.create().uv(56, 10).cuboid(1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(56, 12).cuboid(1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.2F, 7.7F, -4.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r60 = Body.addChild("33_r1", ModelPartBuilder.create().uv(54, 34).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 36).cuboid(-2.0F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, 5.0F, 9.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r61 = Body.addChild("32_r1", ModelPartBuilder.create().uv(54, 42).cuboid(-2.0F, 1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 44).cuboid(-2.0F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -1.0F, 8.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r62 = Body.addChild("30_r1", ModelPartBuilder.create().uv(60, 28).cuboid(3.0F, -1.5F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(60, 30).cuboid(-1.0F, -2.4F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(60, 32).cuboid(3.0F, -1.5F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(60, 34).cuboid(-1.0F, -2.4F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, 9.7F, 9.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r63 = Body.addChild("30_r2", ModelPartBuilder.create().uv(54, 52).cuboid(1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 55).cuboid(1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.2F, 9.7F, 9.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r64 = Body.addChild("29_r1", ModelPartBuilder.create().uv(4, 55).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(6, 55).cuboid(-2.0F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 55).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(10, 55).cuboid(-2.0F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(32, 53).cuboid(-2.0F, 0.5F, -7.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 53).cuboid(-2.0F, 0.5F, -8.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(36, 53).cuboid(-2.0F, 0.5F, -7.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(38, 53).cuboid(-2.0F, 0.5F, -8.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, 3.0F, 4.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r65 = Body.addChild("28_r1", ModelPartBuilder.create().uv(18, 55).cuboid(-2.0F, 1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(20, 55).cuboid(-2.0F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(44, 53).cuboid(-2.0F, 1.5F, -7.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(46, 53).cuboid(-2.0F, 1.5F, -6.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(4.5F, 9.0F, 3.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r66 = Body.addChild("26_r1", ModelPartBuilder.create().uv(34, 59).cuboid(3.0F, -1.5F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(60, 6).cuboid(-1.0F, -2.4F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(36, 59).cuboid(3.0F, -1.5F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(8, 60).cuboid(-1.0F, -2.4F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(38, 59).cuboid(3.0F, -1.5F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(60, 8).cuboid(-1.0F, -2.4F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(40, 59).cuboid(3.0F, -1.5F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(10, 60).cuboid(-1.0F, -2.4F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(18, 59).cuboid(3.0F, -1.5F, -7.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(58, 59).cuboid(-1.0F, -2.4F, -7.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(20, 59).cuboid(3.0F, -1.5F, -8.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(0, 60).cuboid(-1.0F, -2.4F, -8.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(22, 59).cuboid(3.0F, -1.5F, -7.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(60, 0).cuboid(-1.0F, -2.4F, -7.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(24, 59).cuboid(3.0F, -1.5F, -8.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(2, 60).cuboid(-1.0F, -2.4F, -8.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, -4.3F, 4.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r67 = Body.addChild("26_r2", ModelPartBuilder.create().uv(22, 55).cuboid(1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(26, 55).cuboid(1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 55).cuboid(1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 55).cuboid(1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 0).cuboid(1.0F, -1.5F, -7.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 4).cuboid(1.0F, -1.5F, -8.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 8).cuboid(1.0F, -1.5F, -7.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(12, 54).cuboid(1.0F, -1.5F, -8.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.8F, -4.3F, 4.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r68 = Body.addChild("37_r1", ModelPartBuilder.create().uv(54, 16).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 18).cuboid(-2.0F, 0.5F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 20).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-5.5F, -1.0F, 2.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r69 = Body.addChild("36_r1", ModelPartBuilder.create().uv(54, 26).cuboid(-2.0F, 1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 28).cuboid(-2.0F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, 5.0F, 2.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r70 = Body.addChild("34_r1", ModelPartBuilder.create().uv(60, 2).cuboid(3.0F, -1.5F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(26, 59).cuboid(-1.0F, -2.4F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(4, 60).cuboid(3.0F, -1.5F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(28, 59).cuboid(-1.0F, -2.4F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(60, 4).cuboid(3.0F, -1.5F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(30, 59).cuboid(-1.0F, -2.4F, 0.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(6, 60).cuboid(3.0F, -1.5F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F))
		.uv(32, 59).cuboid(-1.0F, -2.4F, -1.0F, 0.9F, 1.6F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-5.5F, -8.3F, 3.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r71 = Body.addChild("34_r2", ModelPartBuilder.create().uv(58, 35).cuboid(1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(58, 39).cuboid(1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(58, 43).cuboid(1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(58, 47).cuboid(1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-5.2F, -8.3F, 3.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData Body_r72 = Body.addChild("25_r1", ModelPartBuilder.create().uv(20, 53).cuboid(-2.0F, 0.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(22, 53).cuboid(-2.0F, 0.5F, -1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(5.5F, 13.0F, 1.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData Body_r73 = Body.addChild("24_r1", ModelPartBuilder.create().uv(28, 53).cuboid(-2.0F, 1.5F, 0.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(30, 53).cuboid(-2.0F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(8.5F, 6.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return null;
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}