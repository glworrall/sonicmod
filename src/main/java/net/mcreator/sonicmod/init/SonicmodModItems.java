
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sonicmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.sonicmod.item.SonicItem;
import net.mcreator.sonicmod.SonicmodMod;

public class SonicmodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SonicmodMod.MODID);
	public static final DeferredItem<Item> SONIC_HELMET = REGISTRY.register("sonic_helmet", SonicItem.Helmet::new);
	public static final DeferredItem<Item> SONIC_CHESTPLATE = REGISTRY.register("sonic_chestplate", SonicItem.Chestplate::new);
	public static final DeferredItem<Item> SONIC_LEGGINGS = REGISTRY.register("sonic_leggings", SonicItem.Leggings::new);
	public static final DeferredItem<Item> SONIC_BOOTS = REGISTRY.register("sonic_boots", SonicItem.Boots::new);
	// Start of user code block custom items
	// End of user code block custom items
}
