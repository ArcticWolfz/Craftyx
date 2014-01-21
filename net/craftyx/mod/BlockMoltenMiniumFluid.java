package net.craftyx.mod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockMoltenMiniumFluid extends BlockFluidClassic{

	public BlockMoltenMiniumFluid(int id) {
		super(id, Craftyx.fluidmeteroiteEssence, Craftyx.materialMeteroiteEssence);
		
		this.setCreativeTab(Craftyx.craftyxTab);
		
	}
		
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister iconRegister) {
			this.blockIcon = iconRegister.registerIcon(Craftyx.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
