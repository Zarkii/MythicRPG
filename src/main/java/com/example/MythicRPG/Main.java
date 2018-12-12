package com.example.MythicRPG;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.S04PacketEntityEquipment;

import static com.example.MythicRPG.ModBlock.*;
import static com.example.MythicRPG.ModItem.*;
import static com.example.MythicRPG.ModItemArmor.diamondNecklace;
import static com.example.MythicRPG.ModItemAxe.amethystAxe;
import static com.example.MythicRPG.ModItemPickaxe.amethystPickaxe;
import static com.example.MythicRPG.ModItemSword.amethystAndGarnetSword;
import static com.example.MythicRPG.ModItemSword.amethystSword;
import static com.example.MythicRPG.ModItemArmor.saintNecklace;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{

    public static final String MODID = "mr";
    public static final String VERSION = "1.0";


    public int AddArmor(String armor){
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }


    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //bloki,itemy,konfiguracja
        amethyst = new ModItem("amethyst");
        GameRegistry.registerItem(amethyst,"amethyst");

        amethystOre = new ModBlock(Material.rock,"amethystOre",amethyst);
        GameRegistry.registerBlock(amethystOre,"amethystOre");
        amethystOre.setHardness(6.0f);
        amethystOre.setHarvestLevel("pickaxe",2);

        amethystSword = new ModItemSword(amethystMaterial,"amethystSword");
        GameRegistry.registerItem(amethystSword,"amethystSword");

        amethystPickaxe = new ModItemPickaxe(amethystMaterial,"amethystPickaxe");
        GameRegistry.registerItem(amethystPickaxe,"amethystPickaxe");

        amethystAxe = new ModItemAxe(amethystMaterial,"amethystAxe");
        GameRegistry.registerItem(amethystAxe,"amethystaxe");

        amethystBlock = new ModBlock(Material.iron,"amethystBlock",null);
        amethystBlock.setHardness(6.0f);
        amethystBlock.setHarvestLevel("pickaxe",2);
        GameRegistry.registerBlock(amethystBlock,"amethystBlock");

        garnet = new ModItem("garnet");
        GameRegistry.registerItem(garnet,"garnet");

        garnetOre = new ModBlock(Material.rock,"garnetOre",garnet);
        GameRegistry.registerBlock(garnetOre,"garnetOre");
        garnetOre.setHarvestLevel("pickaxe",2);
        garnetOre.setHardness(6.0f);

        amethystAndGarnetSword = new ModItemSword(amethystAndGarnetMaterial,"amethystAndGarnetSword");
        GameRegistry.registerItem(amethystAndGarnetSword,"amethystAndGarnetSword");

        garnetBlock = new ModBlock(Material.iron,"garnetBlock",garnet);
        GameRegistry.registerBlock(garnetBlock,"garnetBlock");
        garnetOre.setHarvestLevel("pickaxe",2);
        garnetOre.setHardness(8.0f);


        diamondNecklace = new ModItemArmor(ItemArmor.ArmorMaterial.DIAMOND,AddArmor("diamondNecklace"),1,"diamondNecklace");
        GameRegistry.registerItem(diamondNecklace,"diamondNecklace");






            }

    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //proxy,gui,entity,tileentity,packet registering


        GameRegistry.addRecipe(new ItemStack(ModItemSword.amethystSword,1),new Object[]{" A "," A "," S ",'A',ModItem.amethyst,'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ModItemPickaxe.amethystPickaxe,1),new Object[]{"AAA"," S "," S ",'A',ModItem.amethyst,'S',Items.stick});
        GameRegistry.addRecipe(new ItemStack(ModItemAxe.amethystAxe,1),new Object[]{" AA"," SA"," S ",'A',ModItem.amethyst,'S',Items.stick});
        GameRegistry.addRecipe(new ItemStack(ModItemAxe.amethystAxe,1),new Object[]{"AA ","AS "," S ",'A',ModItem.amethyst,'S',Items.stick});
        GameRegistry.addRecipe(new ItemStack(ModBlock.amethystBlock,1),new Object[]{"AAA","AAA","AAA",'A',ModItem.amethyst});
        GameRegistry.addRecipe(new ItemStack(ModItemSword.amethystAndGarnetSword,1),new Object[]{" AG"," AG","  S",'A',ModItem.amethyst,'S', Items.stick,'G',ModItem.garnet});
        GameRegistry.addRecipe(new ItemStack(ModBlock.garnetBlock,1),new Object[]{"GGG","GGG","GGG",'G',ModItem.garnet});

        GameRegistry.registerWorldGenerator(new ModWorldGenerator(amethystOre,3),0);
        GameRegistry.registerWorldGenerator(new ModWorldGenerator(garnetOre,7),0);


    }

    }




