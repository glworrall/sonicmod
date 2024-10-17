
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sonicmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.sonicmod.SonicmodMod;

public class SonicmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SonicmodMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SONIC_MOD = REGISTRY.register("sonic_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sonicmod.sonic_mod")).icon(() -> new ItemStack(Blocks.DIAMOND_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(SonicmodModItems.SONIC_HELMET.get());
				tabData.accept(SonicmodModItems.SONIC_CHESTPLATE.get());
				tabData.accept(SonicmodModItems.SONIC_LEGGINGS.get());
				tabData.accept(SonicmodModItems.SONIC_BOOTS.get());
			}).withSearchBar().build());
}
