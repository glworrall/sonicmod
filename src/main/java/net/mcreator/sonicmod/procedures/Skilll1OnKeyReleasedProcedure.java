package net.mcreator.sonicmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.sonicmod.network.SonicmodModVariables;

public class Skilll1OnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double yaw = 0;
		double X = 0;
		double Z = 0;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, (int) entity.getData(SonicmodModVariables.PLAYER_VARIABLES).spindashcharge, true, true));
		entity.setDeltaMovement(new Vec3((entity.getLookAngle().x), 0, (entity.getLookAngle().z)));
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
	}
}
