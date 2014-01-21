package net.craftyx.mod.recipe;

import net.craftyx.mod.Craftyx;
import net.craftyx.mod.FuelHandler;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeReg {
	
	public static void Load() {
        //Smelting
        FurnaceRecipes.smelting().addSmelting(Craftyx.miniumOre.blockID, new ItemStack(Craftyx.miniumGem, 2), 0.1F);
        FurnaceRecipes.smelting().addSmelting(Craftyx.meteroiteOre.blockID, new ItemStack(Craftyx.meteroiteGem, 2), 0.1F);
        FurnaceRecipes.smelting().addSmelting(Craftyx.hybridminiummeteroiteBlock.blockID, new ItemStack(Craftyx.transmutationShard, 3), 0.1F);
        
        //End Of Smelting
        
        //Obsidian Stick
        GameRegistry.addRecipe(new ItemStack(Craftyx.obsidianStick, 1), new Object[]{
            "x", "x", 'x', Craftyx.obsidianShard
      });
        //Obsdian Shard
        GameRegistry.addRecipe(new ItemStack(Craftyx.obsidianShard, 5), new Object[]{
            "x", "x", 'x', Block.obsidian
      });
        
        //CRAFTING stick
        GameRegistry.addRecipe(new ItemStack(Craftyx.miniumStick, 1), new Object[]{
         " x ", "tct", " m ", 'x', Craftyx.meteroiteGem, 't', Craftyx.miniumGem, 'm', Craftyx.transmutationGem, 'c', Item.stick
   });
        ItemStack Pickaxee = new ItemStack(Craftyx.meteroitePickaxe);
        Pickaxee.addEnchantment(Enchantment.efficiency, 5);
        Pickaxee.addEnchantment(Enchantment.fortune, 5);
        Pickaxee.addEnchantment(Enchantment.unbreaking, 5);
        //craft pickaxe enchanted
       GameRegistry.addRecipe(Pickaxee, new Object[]{
            "sxs", "ttt", "cmc", 'x', Craftyx.transmutationGem, 't', Craftyx.meteroiteGem, 'm', Craftyx.miniumStick, 's', Craftyx.enderShard, 'c', Craftyx.obsidianShard
      });
        //craft pickaxe not enchanted
       GameRegistry.addRecipe(new ItemStack (Craftyx.meteroitePickaxe), new Object[]{
                " x ", "ttt", " m ", 'x', Craftyx.transmutationGem, 't', Craftyx.meteroiteGem, 'm', Craftyx.miniumStick
          });
        
        ItemStack Swordd = new ItemStack(Craftyx.meteroiteSword);
        Swordd.addEnchantment(Enchantment.sharpness, 5);
        Swordd.addEnchantment(Enchantment.fireAspect, 5);
        Swordd.addEnchantment(Enchantment.unbreaking, 5);
      //craft sword enchanted
        GameRegistry.addRecipe(Swordd, new Object[]{
            "sxs", "vtv", "cmc", 'x', Craftyx.transmutationGem, 't', Craftyx.miniumGem, 'm', Craftyx.miniumStick, 'c', Craftyx.meteroiteGem, 's', Craftyx.enderShard, 'v', Craftyx.obsidianShard
      });
      //craft sword not encha
        GameRegistry.addRecipe(new ItemStack (Craftyx.meteroiteSword), new Object[]{
            " x ", " t ", "cmc", 'x', Craftyx.transmutationGem, 't', Craftyx.miniumGem, 'm', Craftyx.miniumStick, 'c', Craftyx.meteroiteGem
      });
      //craft Miniumblock
        GameRegistry.addRecipe(new ItemStack(Craftyx.miniumBlock, 1), new Object[]{
            "xxx", "xtx", "xxx", 'x', Craftyx.miniumGem, 't', Craftyx.transmutationGem
      });
        
      //craft Miniumblock to minium
        GameRegistry.addRecipe(new ItemStack(Craftyx.miniumGem, 8), new Object[]{
            "x", 'x', Craftyx.miniumBlock
      });
      //craft Meteroiteblock to meteroite
        GameRegistry.addRecipe(new ItemStack(Craftyx.meteroiteGem, 8), new Object[]{
            "x", 'x', Craftyx.meteroiteBlock
      });
      //craft Meteroiteblock
        GameRegistry.addRecipe(new ItemStack(Craftyx.meteroiteBlock, 1), new Object[]{
            "xxx", "xtx", "xxx", 'x', Craftyx.meteroiteGem, 't', Craftyx.transmutationGem
      });
        
      //craft hybridminiumMeteroiteblock
        GameRegistry.addRecipe(new ItemStack(Craftyx.hybridminiummeteroiteBlock, 1), new Object[]{
            "mei", "mci", "mei", 'm', Craftyx.meteroiteGem, 'e', Craftyx.enderShard, 'c',/* DONT USE IT  */ Craftyx.transmutationGem, 'i', Craftyx.miniumGem
      });
        
      //craft transmutationgem
        GameRegistry.addRecipe(new ItemStack(Craftyx.transmutationGem, 1), new Object[]{
            "ese", "scs", "ese", 'e', Craftyx.enderShard, 's', Craftyx.transmutationShard, 'c', Craftyx.transmutationGemCore
      });
        
      //craft invisibleglass
        GameRegistry.addRecipe(new ItemStack(Craftyx.miniumGlass, 8), new Object[]{
            "xcx", "xtx", "xcx", 'x', Craftyx.miniumGem, 't', Craftyx.transmutationGem, 'c', Craftyx.meteroiteGem
      });
        
        //craft eye of ender
        GameRegistry.addRecipe(new ItemStack(Item.eyeOfEnder, 2), new Object[]{
            "xxx", "xtx", "xxx", 'x', Craftyx.enderShard, 't', Craftyx.transmutationGem
      });
        
      //craft ender pearl
        GameRegistry.addRecipe(new ItemStack(Item.enderPearl, 4), new Object[]{
            " x ", "xtx", " x ", 'x', Craftyx.enderShard, 't', Craftyx.transmutationGem
      });
        
      //craft endershard
        GameRegistry.addRecipe(new ItemStack(Craftyx.enderShard, 8), new Object[]{
            "xdc", "dbd", "cdx", 'd', Craftyx.enderDust, 'b', Craftyx.enderBlock, 'x', Craftyx.miniumGem, 'c', Craftyx.meteroiteGem
      });
        
      //craft cobblebrick
        GameRegistry.addRecipe(new ItemStack(Craftyx.cobblestoneBrick, 4), new Object[]{
            "xx", "xx", 'x', Block.cobblestone
      });
        
      //craft cobblebrick9
        GameRegistry.addRecipe(new ItemStack(Craftyx.cobblestoneBrick, 9), new Object[]{
            "xxx", "xxx", "xxx", 'x', Block.cobblestone
      });
        
      //craft transmutationcore
        GameRegistry.addRecipe(new ItemStack(Craftyx.transmutationGemCore, 1), new Object[]{
            "eme", "mnm", "vmv", 'e', Craftyx.enderDust, 'm', Craftyx.miniumGem, 'n', Craftyx.enderBlock, 'v', Item.netherStar
      });
        
      //craft endershard to dust
        GameRegistry.addRecipe(new ItemStack(Craftyx.enderDust, 1), new Object[]{
            " ", "e", 'e', Craftyx.enderShard
      });
        
      //craft enderdust
        GameRegistry.addRecipe(new ItemStack(Craftyx.enderDust, 9), new Object[]{
            "ifi", "fmf", "ifi", 'i', Craftyx.meteroiteGem, 'f', Craftyx.miniumGem, 'm', Craftyx.enderBlock
      });
        
      //craft enderBlock
        GameRegistry.addRecipe(new ItemStack(Craftyx.enderBlock, 1), new Object[]{
        "xxx", "xcx", "xxx", 'x', Item.enderPearl, 'c', Craftyx.miniumGem
      });
      //craft transmutationdye
        ItemStack transmutationdyefromflower = new ItemStack(Craftyx.transmutationDye);
        transmutationdyefromflower.setItemDamage(2);
        //-------------------
        GameRegistry.addRecipe(transmutationdyefromflower, new Object[]{
        "x", 'x', Craftyx.meteroiteOrchid
      });
        
        //Testing Chamber
        
        //Testing Chamber #1 -transmutationgem
        /*ItemStack dmgtg1 = new ItemStack(Craftyx.transmutationGem);
        dmgtg1.setItemDamage(1);
        
        ItemStack dmgtg2 = new ItemStack(Craftyx.transmutationGem);
        dmgtg2.setItemDamage(2);
        //-----------------
        GameRegistry.addRecipe(new ItemStack(Craftyx.transmutationGem, 1), new Object[]{
            "eee", "ece", "eee", 'c', dmgtg1, 'e', Craftyx.enderShard
          });
        //-----------------
        GameRegistry.addRecipe(dmgtg1, new Object[]{
            "eee", "ece", "eee", 'c', dmgtg2, 'e', Craftyx.enderShard
          });*/
        //Testing Chamber #2 -transmutationdye
        ItemStack dmgtd1 = new ItemStack(Craftyx.transmutationDye);
        dmgtd1.setItemDamage(1);
        
        ItemStack dmgtd2 = new ItemStack(Craftyx.transmutationDye);
        dmgtd2.setItemDamage(2);
        //-----------------
        GameRegistry.addRecipe(new ItemStack(Craftyx.transmutationGem, 1), new Object[]{
            "eee", "ece", "eee", 'c', dmgtd1, 'e', Craftyx.enderShard
          });
        //-----------------
        GameRegistry.addRecipe(dmgtd1, new Object[]{
            "eee", "ece", "eee", 'c', dmgtd2, 'e', Craftyx.enderShard
          });
        //Testing Chamber
	}
	
}
