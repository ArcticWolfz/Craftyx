package net.craftyx.mod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.craftyx.mod.Craftyx;
import net.craftyx.mod.item.transmutationGem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TransmutationCore extends Block{

	public TransmutationCore(int id, Material material) {
		super(id, material);
		
		this.setHardness(2F);
		this.setResistance(2F);
		this.setLightValue(0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setCreativeTab(Craftyx.craftyxTab);
	}
	
	
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon =  iconRegister.registerIcon(Craftyx.modid + ":" + this.getUnlocalizedName().substring(5));
}
	}
	
