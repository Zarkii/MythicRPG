package com.example.MythicRPG;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static com.example.MythicRPG.ModBlock.amethystBlock;
import static com.example.MythicRPG.ModBlock.amethystOre;
import static com.example.MythicRPG.ModItem.*;
import static com.example.MythicRPG.ModItemAxe.amethystAxe;
import static com.example.MythicRPG.ModItemPickaxe.amethystPickaxe;
import static com.example.MythicRPG.ModItemSword.amethystSword;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{

    public static final String MODID = "mr";
    public static final String VERSION = "1.0";


    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //bloki,itemy,konfiguracja
        amethyst = new ModItem("amethyst");
        GameRegistry.registerItem(amethyst,"amethyst");

        amethystOre = new ModBlock(Material.rock,"amethystOre",amethyst);
        GameRegistry.registerBlock(amethystOre,"amethystOre");
        amethystOre.setHardness(6.0f);
        amethystOre.setHarvestLevel("pickaxe",2);
        GameRegistry.registerWorldGenerator(new ModWorldGenerator(amethystOre,3),0);

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



    }

    }




