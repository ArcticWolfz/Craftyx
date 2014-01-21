package net.craftyx.mod.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.craftyx.mod.Craftyx;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class MeteroiteOrchid extends BlockFlower{

	public MeteroiteOrchid(int id, Material material) {
		super(id, material);
		
		this.setHardness(0.0F);
		this.setResistance(0F);
		this.setLightValue(0F);
		this.setStepSound(Block.soundMetalFootstep);
		this.setCreativeTab(Craftyx.craftyxTab);
	}
	
	public int idDropped(int par1, Random par2Random, int par3)
	{
	    return Craftyx.transmutationDye.itemID;
	}
	 
	public int quantityDropped(Random par1Random)
	{
	    return 1;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon =  iconRegister.registerIcon(Craftyx.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
