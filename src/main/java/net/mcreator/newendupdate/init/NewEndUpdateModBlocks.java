
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newendupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.newendupdate.block.CheeseBlockBlock;
import net.mcreator.newendupdate.NewEndUpdateMod;

public class NewEndUpdateModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NewEndUpdateMod.MODID);
	public static final RegistryObject<Block> CHEESE_BLOCK = REGISTRY.register("cheese_block", () -> new CheeseBlockBlock());
}
