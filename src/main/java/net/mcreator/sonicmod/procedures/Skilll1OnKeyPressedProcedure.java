package net.mcreator.sonicmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.sonicmod.network.SonicmodModVariables;

public class Skilll1OnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(SonicmodModVariables.PLAYER_VARIABLES).IsSonic == true) {
			if (entity.getData(SonicmodModVariables.PLAYER_VARIABLES).SpinDash == true) {
				if (entity.getData(SonicmodModVariables.PLAYER_VARIABLES).spindashcharge <= entity.getData(SonicmodModVariables.PLAYER_VARIABLES).Spindashmax) {
					{
						SonicmodModVariables.PlayerVariables _vars = entity.getData(SonicmodModVariables.PLAYER_VARIABLES);
						_vars.spindashcharge = entity.getData(SonicmodModVariables.PLAYER_VARIABLES).spindashcharge + 1;
						_vars.syncPlayerVariables(entity);
					}
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("Spindash" + entity.getData(SonicmodModVariables.PLAYER_VARIABLES).spindashcharge)), false);
				}
			} else {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("Spindash" + entity.getData(SonicmodModVariables.PLAYER_VARIABLES).spindashcharge)), false);
			}
		}
	}
}
