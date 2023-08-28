
package net.mcreator.newendupdate.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BeanItem extends Item {
	public BeanItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
