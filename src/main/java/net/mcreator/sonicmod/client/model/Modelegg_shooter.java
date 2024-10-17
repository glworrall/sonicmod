package net.mcreator.sonicmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelegg_shooter<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("sonicmod", "modelegg_shooter"), "main");
	public final ModelPart gun;
	public final ModelPart body;
	public final ModelPart thruster;

	public Modelegg_shooter(ModelPart root) {
		this.gun = root.getChild("gun");
		this.body = root.getChild("body");
		this.thruster = root.getChild("thruster");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition gun = partdefinition.addOrReplaceChild("gun", CubeListBuilder.create(), PartPose.offset(0.1F, 17.4833F, -4.25F));
		PartDefinition cube_r1 = gun.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(11, 13).addBox(-0.5F, 0.5167F, -2.75F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-0.5F, -3.4833F, -2.75F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -0.4833F, -4.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(-1.0F, -1.0833F, -3.75F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r2 = gun.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(18, 16).addBox(-0.4833F, -3.5F, -2.75F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(22, 8).addBox(-0.4833F, 0.5F, -2.75F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.3562F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, 1.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 24)
				.addBox(2.5F, -1.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(7, 21).addBox(2.5F, 6.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.9F, 13.5F, 0.5F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(15, 5).addBox(3.5F, -0.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(22, 0).addBox(3.5F, -8.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition thruster = partdefinition.addOrReplaceChild("thruster",
				CubeListBuilder.create().texOffs(15, 0).addBox(-1.4F, -8.0F, 3.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2).addBox(-0.4F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		gun.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		thruster.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
