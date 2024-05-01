package net.termiteqc.entity.client;

import net.minecraft.client.model.QuadrupedModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.termiteqc.entity.custom.DiamondSheepEntity;

@OnlyIn(Dist.CLIENT)
public class ModModelSpecialFur<T extends DiamondSheepEntity> extends QuadrupedModel<T> {
    private float headXRot;

    public ModModelSpecialFur(ModelPart pRoot) {
        super(pRoot, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
    }

    public static LayerDefinition createFurLayer() {
        MeshDefinition $$0 = new MeshDefinition();
        PartDefinition $$1 = $$0.getRoot();
        $$1.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.6F)), PartPose.offset(0.0F, 6.0F, -8.0F));
        $$1.addOrReplaceChild("body", CubeListBuilder.create().texOffs(28, 8).addBox(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, new CubeDeformation(1.75F)), PartPose.offsetAndRotation(0.0F, 5.0F, 2.0F, 1.5707964F, 0.0F, 0.0F));
        CubeListBuilder $$2 = CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.5F));
        $$1.addOrReplaceChild("right_hind_leg", $$2, PartPose.offset(-3.0F, 12.0F, 7.0F));
        $$1.addOrReplaceChild("left_hind_leg", $$2, PartPose.offset(3.0F, 12.0F, 7.0F));
        $$1.addOrReplaceChild("right_front_leg", $$2, PartPose.offset(-3.0F, 12.0F, -5.0F));
        $$1.addOrReplaceChild("left_front_leg", $$2, PartPose.offset(3.0F, 12.0F, -5.0F));
        return LayerDefinition.create($$0, 64, 32);
    }

    public void prepareMobModel(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pPartialTick) {
        super.prepareMobModel(pEntity, pLimbSwing, pLimbSwingAmount, pPartialTick);
        this.head.y = 6.0F + pEntity.getHeadEatPositionScale(pPartialTick) * 9.0F;
        this.headXRot = pEntity.getHeadEatAngleScale(pPartialTick);
    }

    public void setupAnim(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
        super.setupAnim(pEntity, pLimbSwing, pLimbSwingAmount, pAgeInTicks, pNetHeadYaw, pHeadPitch);
        this.head.xRot = this.headXRot;
    }
}