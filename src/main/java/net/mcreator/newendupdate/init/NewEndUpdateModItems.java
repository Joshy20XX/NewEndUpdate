
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newendupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.newendupdate.item.ZombieSlayerItem;
import net.mcreator.newendupdate.item.EndwoodstickItem;
import net.mcreator.newendupdate.item.CheeseItem;
import net.mcreator.newendupdate.NewEndUpdateMod;

public class NewEndUpdateModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NewEndUpdateMod.MODID);
	public static final RegistryObject<Item> ENDWOODSTICK = REGISTRY.register("endwoodstick", () -> new EndwoodstickItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> ZOMBIE_SLAYER = REGISTRY.register("zombie_slayer", () -> new ZombieSlayerItem());
}
