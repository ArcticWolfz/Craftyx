package net.craftyx.mod;

import java.util.Timer;
import java.util.TimerTask;

import net.craftyx.mod.item.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.ICraftingHandler;

 public class TransmutationDyeCraftingHandler implements ICraftingHandler {

@Override
public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
for (int i = 0; i < craftMatrix.getSizeInventory(); i++)
{
if (craftMatrix.getStackInSlot(i) != null)
{
ItemStack j = craftMatrix.getStackInSlot(i);
if (j.getItem() != null && j.getItem() == Craftyx.transmutationDye)
{
ItemStack k = new ItemStack(Craftyx.transmutationDye, 2, (j.getItemDamage() + 1));
if (k.getItemDamage() >= k.getMaxDamage()) {
k.stackSize--;
}
craftMatrix.setInventorySlotContents(i, k);
}
}
}
}

@Override
public void onSmelting(EntityPlayer player, ItemStack item) {
	
}
}