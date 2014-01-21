package net.craftyx.mod.block;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.craftyx.mod.Craftyx;
import net.craftyx.mod.item.transmutationGem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TransmutationPillar extends Block{

	public TransmutationPillar(int id, Material material) {
		super(id, material);
		
		this.setHardness(2F);
		this.setResistance(2F);
		this.setLightValue(0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setCreativeTab(Craftyx.craftyxTab);
		
	}
	
	private static final ResourceLocation resourceloc2 = new ResourceLocation("");
	   
	   
	   
	   private void renderModelTransmutationPillar(float x, float y, float z, float scale)
	   {
	      GL11.glPushMatrix();
	      GL11.glDisable(GL11.GL_LIGHTING);
	      
	      GL11.glTranslatef(x,  y,  z);
	      GL11.glScalef(scale, scale, scale);
	      GL11.glRotatef(180f, 0f, 1f, 0f);
	      
	      FMLClientHandler.instance().getClient().renderEngine.bindTexture(resourceloc2);
	      
	      ModelTransmutationPillar.render();
	      
	      GL11.glEnable(GL11.GL_LIGHTING);
	      GL11.glPopMatrix();
	      
	      ResourceLocation rl = new ResourceLocation("craftyx:textures/blocks/pillar.png");
	      Minecraft.getMinecraft().renderEngine.bindTexture(rl);
	   }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon =  iconRegister.registerIcon(Craftyx.modid + ":" + this.getUnlocalizedName().substring(5));
}
}
	
