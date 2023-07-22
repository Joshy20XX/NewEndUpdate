
package net.mcreator.newendupdate.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EndwoodstickItem extends Item {
	public EndwoodstickItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
