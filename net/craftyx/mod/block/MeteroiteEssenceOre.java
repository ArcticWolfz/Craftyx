package net.craftyx.mod.block;

import java.util.Random;

import org.lwjgl.input.Keyboard;

import net.craftyx.mod.Craftyx;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MeteroiteEssenceOre extends Block{

	public int i = 0;
	
	public MeteroiteEssenceOre(int par1, Material par2Material) {
		super(par1, par2Material);
		this.blockHardness = 10;
		this.blockResistance = 10;
		this.setCreativeTab(Craftyx.craftyxTab);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		
		if (player.inventory.currentItem == Craftyx.transmutationGem.itemID && !Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) && !Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
			player.addChatMessage("Recharge");
		} else if(player.inventory.currentItem == Craftyx.transmutationGemCore.itemID) {
			player.addChatMessage("working");
			world.setBlockToAir(x, y, z);
		}
		
		return true;
	}
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return 0;
	}
	
	@Override
	public void onBlockHarvested(World world, int x, int y, int z, int par5, EntityPlayer player) {
		if (player.inventory.currentItem == Craftyx.transmutationGemCore.itemID) {
			player.addChatMessage("Harvested");
			//DropItem(Craftyx.transmutationGem, x, y, z, world);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon =  iconRegister.registerIcon(Craftyx.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
	public boolean recipe(EntityPlayer player) {
		if (player.inventory.hasItemStack(new ItemStack(Craftyx.transmutationCore, 1)) && player.inventory.hasItemStack(new ItemStack(Craftyx.transmutationShard, 4)) && player.inventory.hasItemStack(new ItemStack(Craftyx.enderShard, 4))) {
			return true;
		} else {
			return false;
		}
	}
	public void DropItem(Item itemdropped, int x, int y, int z, World world) {
		ItemStack stack = new ItemStack(itemdropped, 1);
		EntityItem item = new EntityItem(world, x, y, z, stack);
		world.spawnEntityInWorld(item);
	}

}
