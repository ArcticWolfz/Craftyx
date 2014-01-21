package net.craftyx.mod.item;

import net.craftyx.mod.Craftyx;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ObsidianStick extends Item {

	public ObsidianStick(int id) {
		super(id);
		
		this.setCreativeTab(Craftyx.craftyxTab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Craftyx.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
