package net.mcreator.sonicmod.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class Skilll1OnKeyReleasedProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Mob _entity)
			_entity.getNavigation().moveTo(x, y, z, 20);
	}
}
