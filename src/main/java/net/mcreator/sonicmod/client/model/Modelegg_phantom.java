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
public class Modelegg_phantom<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("sonicmod", "modelegg_phantom"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart left_wing;
	public final ModelPart left_wing_tip;
	public final ModelPart right_wing;
	public final ModelPart right_wing_tip;
	public final ModelPart tail;
	public final ModelPart tail2;

	public Modelegg_phantom(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.left_wing = root.getChild("left_wing");
		this.left_wing_tip = root.getChild("left_wing_tip");
		this.right_wing = root.getChild("right_wing");
		this.right_wing_tip = root.getChild("right_wing_tip");
		this.tail = root.getChild("tail");
		this.tail2 = root.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 19.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 20.25F, -8.0F));
		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(23, 12).addBox(5.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 17.0F, -8.0F));
		PartDefinition left_wing_tip = partdefinition.addOrReplaceChild("left_wing_tip", CubeListBuilder.create().texOffs(16, 24).addBox(17.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.5F, 17.0F, -8.0F));
		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(23, 12).mirror().addBox(-11.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.5F, 17.0F, -8.0F));
		PartDefinition right_wing_tip = partdefinition.addOrReplaceChild("right_wing_tip", CubeListBuilder.create().texOffs(16, 24).mirror().addBox(-30.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(8.5F, 17.0F, -8.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(3, 20).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 17.0F, 1.0F));
		PartDefinition tail2 = partdefinition.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(4, 29).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 17.5F, 7.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		left_wing_tip.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		right_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		right_wing_tip.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		tail2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
