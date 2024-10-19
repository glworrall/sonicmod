package net.mcreator.sonicmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.sonicmod.network.SonicmodModVariables;

public class Skilll1OnKeyReleasedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double yaw = 0;
		yaw = entity.getYRot();
		entity.setDeltaMovement(
				new Vec3((SonicmodModVariables.MapVariables.get(world).spindashcharge * 90 * Math.cos((yaw + 90) * (Math.PI / 180))), 0, (SonicmodModVariables.MapVariables.get(world).spindashcharge * 90 * Math.cos((yaw + 90) * (Math.PI / 180)))));
	}
}
