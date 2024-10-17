package net.mcreator.sonicmod.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.sonicmod.network.SonicmodModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class Skilll1OnKeyPressedProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (SonicmodModVariables.MapVariables.get(world).IsSonic == true) {
			if (SonicmodModVariables.MapVariables.get(world).SpinDash == true) {
				if (SonicmodModVariables.MapVariables.get(world).spindashcharge <= SonicmodModVariables.MapVariables.get(world).Spindashmax) {
					SonicmodModVariables.MapVariables.get(world).Spindashmax = SonicmodModVariables.MapVariables.get(world).spindashcharge + 1;
					SonicmodModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}
