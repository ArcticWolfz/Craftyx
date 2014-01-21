package net.craftyx.mod;
 
import java.util.Random;

import ibxm.Player;
import net.craftyx.mod.block.CobbleStoneBrick;
import net.craftyx.mod.block.HybridMiniumMeteroiteBlock;
import net.craftyx.mod.block.MeteroiteEssenceOre;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.craftyx.mod.block.*;
import net.craftyx.mod.item.*;
import net.craftyx.mod.recipe.GemTransmutationReg;
import net.craftyx.mod.recipe.RecipeReg;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
@Mod(modid = Craftyx.modid, name = "Craftyx", version = "0.0.1 Beta")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Craftyx {
       
        public static final String modid = "craftyx";
       
        public static Block meteroiteBlock;
        public static Block miniumBlock;
        public static Block meteroiteOre;
        public static Block miniumOre;
        public static Block MeteroiteEssenceOre;
        public static Block hybridminiummeteroiteBlock;
        public static Block blockmeteroiteessence;
        public static Block meteroiteOrchid;
        public static Block miniumGlass;
        public static Block cobblestoneBrick;
        public static Block enderBlock;
        public static Block transmutationAltar;
        public static Block transmutationPillar;
        public static Block transmutatedDirt;
        public static Block transmutationCore;
        
        //items
        public static Item meteroiteGem;
        public static Item miniumGem;
        public static Item transmutationGem;
        public static Item meteroitePickaxe;
        public static Item meteroiteSword;
        public static Item miniumStick;
        public static Item enderShard;
        public static Item enderDust;
        public static Item transmutationShard;
        public static Item transmutationGemCore;
        public static Item obsidianStick;
        public static Item obsidianShard;
        public static Item uffc;
        public static Item transmutationDye;
        public static Item repairRing;
        
        //fluid
        public static Material materialMeteroiteEssence;
        
        public static int idFluidMeteroiteEssence = 974;
        
        public static Fluid fluidmeteroiteEssence;
        //biome
        public static BiomeGenBase biomeTransmutation;
        //------
        public static final EnumToolMaterial toolMaterialMeteroite = net.minecraftforge.common.EnumHelper.addToolMaterial("MeteroiteToolMaterial", 3, 3500, 28.0F, 8F, 30);
       
        public static CreativeTabs craftyxTab;

		public static Object instance;
       
        @EventHandler
        public void load(FMLInitializationEvent e) {
                craftyxTab = new CreativeTabs("craftyx"){
                        @SideOnly(Side.CLIENT)
                        public int getTabIconItemIndex(){
                                return Craftyx.transmutationGem.itemID;
                        }
                };
                
                GameRegistry.registerFuelHandler(new FuelHandler());
                
                //RecipeReg.Load();
                
                GameRegistry.registerWorldGenerator(new WorldGeneratorCraftyx());
                //Tab Name
                LanguageRegistry.instance().addStringLocalization(craftyxTab.getTranslatedTabLabel(), "Craftyx");
                
                //fluid materials
                
                materialMeteroiteEssence = MaterialLiquid.lava;
                
                //fluids
                fluidmeteroiteEssence = new Fluid("meteroiteEssence").setBlockID(idFluidMeteroiteEssence);
                FluidRegistry.registerFluid(fluidmeteroiteEssence);
                               
               
                //fluid block
                
                blockmeteroiteessence = new BlockMoltenMiniumFluid(idFluidMeteroiteEssence).setUnlocalizedName("fluidmeteroiteessence");
                meteroiteBlock = new MeteroiteBlock(975, Material.rock).setUnlocalizedName("meteroiteBlock");
                meteroiteOre = new MeteroiteOre(976, Material.rock).setUnlocalizedName("meteroiteOre");
                miniumBlock = new MiniumBlock(977, Material.rock).setUnlocalizedName("miniumBlock");
                miniumOre = new MiniumOre(978, Material.rock).setUnlocalizedName("miniumOre");
                hybridminiummeteroiteBlock = new HybridMiniumMeteroiteBlock(979, Material.cactus).setUnlocalizedName("hybridminiummeteroiteBlock");
                meteroiteOrchid = new MeteroiteOrchid(980, Material.grass).setUnlocalizedName("meteroiteOrchid");
                miniumGlass = new InvisibleGlass(982, Material.glass).setUnlocalizedName("miniumGlass");
                cobblestoneBrick = new CobbleStoneBrick(983, Material.rock).setUnlocalizedName("cobblestoneBrick");
                enderBlock = new EnderBlock(984, Material.rock).setUnlocalizedName("enderBlock");
                transmutationAltar = new TransmutationAltar(989, Material.wood).setUnlocalizedName("transmutationAltar");
                transmutatedDirt = new TransmutatedDirt(990, Material.ground).setUnlocalizedName("transmutatedDirt");
                MeteroiteEssenceOre = new MeteroiteEssenceOre(991, Material.rock).setUnlocalizedName("meteroiteEssenceOre");
                	//transmutationPillar = new TransmutationPillar(991, Material.rock).setUnlocalizedName("transmutationPillar");
                	//transmutationCore = new TransmutationCore(992, Material.rock).setUnlocalizedName("transmutationCore");
                //------
                //biome
                biomeTransmutation = new BiomeGenTransmutation(198).setBiomeName("Transmutation").setDisableRain().setMinMaxHeight(-1F, 1F).setTemperatureRainfall(-0F, 0.2F);
                //------
                GameRegistry.addBiome(biomeTransmutation);
                //------
                //Items
                meteroiteGem = new meteroitegem(8600).setUnlocalizedName("meteroitegem");
                miniumGem = new MiniumGem(8601).setUnlocalizedName("miniumGem");
                meteroitePickaxe = new MeteroitePickaxe(8602, toolMaterialMeteroite).setUnlocalizedName("meteroitepickaxe");
                miniumStick = new MiniumStick(8603).setUnlocalizedName("miniumstick");
                transmutationGem = new transmutationGem(8604).setUnlocalizedName("transmutationgem");
                meteroiteSword = new MeteroiteSword(8605, toolMaterialMeteroite).setUnlocalizedName("meteroiteSword");
                enderShard = new EnderShard(8606).setUnlocalizedName("enderShard");
                enderDust = new EnderDust(8607).setUnlocalizedName("enderDust");
                transmutationShard = new  TransmutationShard(8608).setUnlocalizedName("transmutationShard");
                transmutationGemCore = new TransmutationGemCore(8609).setUnlocalizedName("transmutationCore");
                obsidianStick = new ObsidianStick(8611).setUnlocalizedName("obsidianStick");
                obsidianShard = new ObsidianShard(8613).setUnlocalizedName("obsidianShard");
                	//uffc = new UFFC(8614).setUnlocalizedName("uffc");
                transmutationDye = new TransmutationDye(8615).setUnlocalizedName("transmutationDye");
                	//repairRing = new RepairRing(8616).setUnlocalizedName("repairRing");
                
                //Blocks
                registerBlock(meteroiteBlock, meteroiteBlock.getUnlocalizedName(), "Meteroite Block");
                registerBlock(meteroiteOre, meteroiteOre.getUnlocalizedName(), "Meteroite Ore");
                registerBlock(miniumBlock, miniumBlock.getUnlocalizedName(), "Minium Block");
                registerBlock(miniumOre, miniumOre.getUnlocalizedName(), "Minium Ore");
                registerBlock(blockmeteroiteessence, blockmeteroiteessence.getUnlocalizedName(), "Meteroite Essence");
                registerBlock(hybridminiummeteroiteBlock, hybridminiummeteroiteBlock.getUnlocalizedName(),"Hybrid Minium Meteroite Block");
                registerBlock(meteroiteOrchid, meteroiteOrchid.getUnlocalizedName(),"Meteroite Orchid");
                registerBlock(miniumGlass, miniumGlass.getUnlocalizedName(), "Minium Glass");
                registerBlock(cobblestoneBrick, cobblestoneBrick.getUnlocalizedName(), "Cobblestone Brick");
                registerBlock(enderBlock, enderBlock.getUnlocalizedName(), "Ender Block");
                registerBlock(transmutationAltar, transmutationAltar.getUnlocalizedName(), "Transmutation Altar");
                registerBlock(transmutatedDirt, transmutatedDirt.getUnlocalizedName(), "Transmutated Dirt");
                registerBlock(MeteroiteEssenceOre, MeteroiteEssenceOre.getUnlocalizedName(), "Meteroite Essence Ore");
                	//registerBlock(transmutationPillar, transmutationPillar.getUnlocalizedName(), "Transmutation Pillar");
                	//registerBlock(transmutationCore, transmutationCore.getUnlocalizedName(), "Transmutation Core");
                
                // Register CraftingHandler
                GameRegistry.registerCraftingHandler(new TransmutationDyeCraftingHandler());
                GameRegistry.registerCraftingHandler(new TransmutationGemCraftingHandler());
             // Register Done  
                //Items
                registerItem(meteroiteGem, "Meteroite Gem");
                registerItem(miniumGem, "Minium Gem");
                registerItem(meteroitePickaxe, "Meteroite Pickaxe");
                registerItem(miniumStick, "Meteroite Stick");
                registerItem(transmutationGem, "Transmutation Gem");
                registerItem(meteroiteSword, "Meteroite Sword");
                registerItem(enderShard, "Ender Shard");
                registerItem(transmutationShard, "Transmutation Shard");
                registerItem(enderDust, "Ender Dust"); 
                registerItem(transmutationGemCore, "Transmutation Gem Core");
                registerItem(obsidianStick, "Obsidian Stick");
                registerItem(obsidianShard, "Obsidian Shard");
                	//registerItem(uffc, "UnlimitedFuelForCheaters");
                registerItem(transmutationDye, "Transmutation Dye");
                
                RecipeReg.Load();
                
                GemTransmutationReg.Load();
        }
       
        public void registerBlock(Block block, String string, String name) {
                GameRegistry.registerBlock(block, block.getUnlocalizedName());
                LanguageRegistry.addName(block, name);
        }
       
        public void registerItem(Item item, String name) {
                GameRegistry.registerItem(item,item.getUnlocalizedName());
                LanguageRegistry.addName(item, name);
        }
 
}