// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelegg_slammer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "egg_slammer"), "main");
	private final ModelPart Gun;
	private final ModelPart wings;
	private final ModelPart body;

	public Modelegg_slammer(ModelPart root) {
		this.Gun = root.getChild("Gun");
		this.wings = root.getChild("wings");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Gun = partdefinition.addOrReplaceChild("Gun", CubeListBuilder.create().texOffs(0, 10).addBox(
				-0.5F, -6.0F, -11.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition wings = partdefinition.addOrReplaceChild("wings",
				CubeListBuilder.create().texOffs(9, 10)
						.addBox(-3.5F, -8.0F, 3.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 0)
						.addBox(1.5F, -8.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(9, 13)
						.addBox(-4.5F, -8.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-1.5F, -8.0F, -4.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Gun.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wings.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}