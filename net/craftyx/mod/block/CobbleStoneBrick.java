package net.craftyx.mod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.craftyx.mod.Craftyx;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class CobbleStoneBrick extends Block{

	public CobbleStoneBrick(int id, Material material) {
		super(id, material);
		
		this.setHardness(3F);
		this.setResistance(4F);
		this.setLightValue(0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setCreativeTab(Craftyx.craftyxTab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon =  iconRegister.registerIcon(Craftyx.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
