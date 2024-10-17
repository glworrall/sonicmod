
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sonicmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.sonicmod.client.model.Modelegg_slammer;
import net.mcreator.sonicmod.client.model.Modelegg_shooter;
import net.mcreator.sonicmod.client.model.Modelegg_phantom;
import net.mcreator.sonicmod.client.model.Modelegg_bomber;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SonicmodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelegg_phantom.LAYER_LOCATION, Modelegg_phantom::createBodyLayer);
		event.registerLayerDefinition(Modelegg_bomber.LAYER_LOCATION, Modelegg_bomber::createBodyLayer);
		event.registerLayerDefinition(Modelegg_shooter.LAYER_LOCATION, Modelegg_shooter::createBodyLayer);
		event.registerLayerDefinition(Modelegg_slammer.LAYER_LOCATION, Modelegg_slammer::createBodyLayer);
	}
}
