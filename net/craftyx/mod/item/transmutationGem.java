package net.craftyx.mod.item;

import java.awt.Color;
import java.util.List;
import java.util.Timer;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.craftyx.mod.Craftyx;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.World;

public class transmutationGem extends Item {

	public transmutationGem(int id) {
		super(id);
		
		this.setMaxDamage(250);
		this.setCreativeTab(Craftyx.craftyxTab).setMaxStackSize(1); // stack.setItemDamage(stack.getItemDamage() + 1);
		
	}
	
	public void addInformation(ItemStack stack, EntityPlayer par2EntityPlayer, List list, boolean par4) {
		
		list.add("Break blocks with meteroite pick to repair it!");
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Craftyx.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
