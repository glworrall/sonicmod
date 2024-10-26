package net.mcreator.sonicmod.procedures;

import net.minecraft.world.entity.Mob;
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
		if (entity instanceof Mob _entity)
			_entity.getNavigation().stop();
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, (int) entity.getData(SonicmodModVariables.PLAYER_VARIABLES).spindashcharge, false, true));
		X = 1;
		for (int index0 = 0; index0 < (int) entity.getData(SonicmodModVariables.PLAYER_VARIABLES).spindashcharge; index0++) {
			entity.push((entity.getLookAngle().x), 0, (entity.getLookAngle().z));
			X = X + 1;
		}
		if (X == entity.getData(SonicmodModVariables.PLAYER_VARIABLES).spindashcharge) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			X = 1;
		}
	}
}
