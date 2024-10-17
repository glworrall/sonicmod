
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
public record Skill3Message(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<Skill3Message> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(SonicmodMod.MODID, "key_skill_3"));
	public static final StreamCodec<RegistryFriendlyByteBuf, Skill3Message> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, Skill3Message message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new Skill3Message(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<Skill3Message> type() {
		return TYPE;
	}

	public static void handleData(final Skill3Message message, final IPayloadContext context) {
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
		SonicmodMod.addNetworkMessage(Skill3Message.TYPE, Skill3Message.STREAM_CODEC, Skill3Message::handleData);
	}
}
