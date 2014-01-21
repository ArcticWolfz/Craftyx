package net.craftyx.mod;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		//if(fuel.itemID == Craftyx.hybridminiummeteroiteBlock.blockID) return 550;
		//if(fuel.itemID == Craftyx.uffc.itemID) return 9999999;
		return 0;
	}

}
