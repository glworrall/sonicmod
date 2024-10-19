package net.mcreator.sonicmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.sonicmod.network.SonicmodModVariables;

public class Skilll1OnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(SonicmodModVariables.PLAYER_VARIABLES).IsSonic == true) {
			if (entity.getData(SonicmodModVariables.PLAYER_VARIABLES).SpinDash == true) {
				{
					SonicmodModVariables.PlayerVariables _vars = entity.getData(SonicmodModVariables.PLAYER_VARIABLES);
					_vars.spindashcharge = entity.getData(SonicmodModVariables.PLAYER_VARIABLES).spindashcharge + 1;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
