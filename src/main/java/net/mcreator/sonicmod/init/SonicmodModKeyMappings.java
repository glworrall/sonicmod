
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sonicmod.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.sonicmod.network.Skilll1Message;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SonicmodModKeyMappings {
	public static final KeyMapping SKILLL_1 = new KeyMapping("key.sonicmod.skilll_1", GLFW.GLFW_KEY_R, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new Skilll1Message(0, 0));
				Skilll1Message.pressAction(Minecraft.getInstance().player, 0, 0);
				SKILLL_1_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SKILLL_1_LASTPRESS);
				PacketDistributor.sendToServer(new Skilll1Message(1, dt));
				Skilll1Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SKILL_2 = new KeyMapping("key.sonicmod.skill_2", GLFW.GLFW_KEY_F, "key.categories.misc");
	public static final KeyMapping SKILL_3 = new KeyMapping("key.sonicmod.skill_3", GLFW.GLFW_KEY_C, "key.categories.misc");
	public static final KeyMapping SKILL_4 = new KeyMapping("key.sonicmod.skill_4", GLFW.GLFW_KEY_Z, "key.categories.misc");
	public static final KeyMapping SKILL_5 = new KeyMapping("key.sonicmod.skill_5", GLFW.GLFW_KEY_X, "key.categories.misc");
	private static long SKILLL_1_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SKILLL_1);
		event.register(SKILL_2);
		event.register(SKILL_3);
		event.register(SKILL_4);
		event.register(SKILL_5);
	}

	@EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				SKILLL_1.consumeClick();
			}
		}
	}
}
