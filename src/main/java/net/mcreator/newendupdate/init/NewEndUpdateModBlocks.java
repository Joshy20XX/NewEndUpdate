
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newendupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.newendupdate.block.EndideaPortalBlock;
import net.mcreator.newendupdate.block.EndBiomeTestPortalBlock;
import net.mcreator.newendupdate.NewEndUpdateMod;

public class NewEndUpdateModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NewEndUpdateMod.MODID);
	public static final RegistryObject<Block> ENDIDEA_PORTAL = REGISTRY.register("endidea_portal", () -> new EndideaPortalBlock());
	public static final RegistryObject<Block> END_BIOME_TEST_PORTAL = REGISTRY.register("end_biome_test_portal", () -> new EndBiomeTestPortalBlock());
}
