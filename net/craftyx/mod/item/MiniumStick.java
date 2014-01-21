package net.craftyx.mod.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.craftyx.mod.Craftyx;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MiniumStick extends Item {

	public MiniumStick(int id) {
		super(id);
		
		this.setCreativeTab(Craftyx.craftyxTab).setMaxStackSize(6);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Craftyx.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}