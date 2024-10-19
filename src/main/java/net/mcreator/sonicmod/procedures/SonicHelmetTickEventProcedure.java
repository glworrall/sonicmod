package net.mcreator.sonicmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.sonicmod.network.SonicmodModVariables;
import net.mcreator.sonicmod.init.SonicmodModItems;
import net.mcreator.sonicmod.SonicmodMod;

public class SonicHelmetTickEventProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == SonicmodModItems.SONIC_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == SonicmodModItems.SONIC_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == SonicmodModItems.SONIC_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == SonicmodModItems.SONIC_BOOTS.get()) {
						SonicmodModVariables.MapVariables.get(world).IsSonic = true;
						SonicmodModVariables.MapVariables.get(world).syncData(world);
						SonicmodModVariables.MapVariables.get(world).SpinDash = true;
						SonicmodModVariables.MapVariables.get(world).syncData(world);
						SonicmodMod.LOGGER.info("Sonic");
					} else {
						SonicmodModVariables.MapVariables.get(world).IsSonic = false;
						SonicmodModVariables.MapVariables.get(world).syncData(world);
					}
				} else {
					SonicmodModVariables.MapVariables.get(world).IsSonic = false;
					SonicmodModVariables.MapVariables.get(world).syncData(world);
				}
			} else {
				SonicmodModVariables.MapVariables.get(world).IsSonic = false;
				SonicmodModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
