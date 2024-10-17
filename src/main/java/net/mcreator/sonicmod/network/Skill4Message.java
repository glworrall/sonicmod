
package net.mcreator.sonicmod.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.mcreator.sonicmod.SonicmodMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record Skill4Message(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<Skill4Message> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(SonicmodMod.MODID, "key_skill_4"));
	public static final StreamCodec<RegistryFriendlyByteBuf, Skill4Message> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, Skill4Message message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new Skill4Message(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<Skill4Message> type() {
		return TYPE;
	}

	public static void handleData(final Skill4Message message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		SonicmodMod.addNetworkMessage(Skill4Message.TYPE, Skill4Message.STREAM_CODEC, Skill4Message::handleData);
	}
}
