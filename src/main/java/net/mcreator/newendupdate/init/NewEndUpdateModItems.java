
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newendupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.newendupdate.item.CheeseItem;
import net.mcreator.newendupdate.NewEndUpdateMod;

public class NewEndUpdateModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NewEndUpdateMod.MODID);
	public static final RegistryObject<Item> CHEESE_BLOCK = block(NewEndUpdateModBlocks.CHEESE_BLOCK);
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
