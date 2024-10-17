// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelegg_bomber<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "egg_bomber"), "main");
	private final ModelPart wingL;
	private final ModelPart wingR;
	private final ModelPart body;
	private final ModelPart launcher;

	public Modelegg_bomber(ModelPart root) {
		this.wingL = root.getChild("wingL");
		this.wingR = root.getChild("wingR");
		this.body = root.getChild("body");
		this.launcher = root.getChild("launcher");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition wingL = partdefinition.addOrReplaceChild("wingL", CubeListBuilder.create(),
				PartPose.offset(9.3F, 10.0F, -0.5F));

		PartDefinition cube_r1 = wingL.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(30, 51).addBox(-3.5F, -2.0F, -4.5F, 7.0F, 4.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9599F, 3.1416F, 0.0F));

		PartDefinition wingR = partdefinition.addOrReplaceChild("wingR", CubeListBuilder.create(),
				PartPose.offset(-10.2F, 10.0F, -0.5F));

		PartDefinition cube_r2 = wingR
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(30, 51).addBox(-3.0F, -2.0F, -4.5F, 7.0F, 4.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-6.0F, -24.0F, -6.0F, 12.0F, 24.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition launcher = partdefinition.addOrReplaceChild("launcher", CubeListBuilder.create().texOffs(0, 35)
				.addBox(-2.2F, -29.0F, -3.0F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		wingL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		launcher.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}