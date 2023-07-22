
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newendupdate.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewEndUpdateModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(NewEndUpdateModBlocks.CHEESE_BLOCK.get().asItem());
			tabData.accept(NewEndUpdateModItems.CHEESE.get());
		}
	}
}
