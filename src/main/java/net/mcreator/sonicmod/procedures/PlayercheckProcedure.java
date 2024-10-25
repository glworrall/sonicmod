package net.mcreator.sonicmod.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.sonicmod.network.SonicmodModVariables;
import net.mcreator.sonicmod.init.SonicmodModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlayercheckProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == SonicmodModItems.SONIC_BOOTS.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == SonicmodModItems.SONIC_LEGGINGS.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == SonicmodModItems.SONIC_CHESTPLATE.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == SonicmodModItems.SONIC_HELMET.get()) {
						{
							SonicmodModVariables.PlayerVariables _vars = entity.getData(SonicmodModVariables.PLAYER_VARIABLES);
							_vars.IsSonic = true;
							_vars.syncPlayerVariables(entity);
						}
					}
				}
			}
		}
		if (entity.getData(SonicmodModVariables.PLAYER_VARIABLES).IsSonic == true) {
			{
				SonicmodModVariables.PlayerVariables _vars = entity.getData(SonicmodModVariables.PLAYER_VARIABLES);
				_vars.SpinDash = true;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
