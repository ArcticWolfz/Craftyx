package net.craftyx.mod.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.craftyx.mod.Craftyx;
import net.craftyx.mod.item.meteroitegem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MeteroiteOre extends Block{

	public MeteroiteOre(int id, Material material) {
		super(id, material);
		
		this.setHardness(2.0F);
		this.setResistance(10F);
		this.setLightValue(1F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setCreativeTab(Craftyx.craftyxTab);
	}
	
	public int idDropped(int par1, Random par2Random, int par3)
	{
	    return Craftyx.meteroiteGem.itemID;
	}
	 
	public int quantityDropped(Random par1Random)
	{
	    return 1 + par1Random.nextInt(4);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon =  iconRegister.registerIcon(Craftyx.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
