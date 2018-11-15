package com.example.MythicRPG;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import java.util.Random;

import static com.example.MythicRPG.ModItem.*;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{

    public static final String MODID = "mr";
    public static final String VERSION = "1.0";


    //zrób coś z tym !!!!!!!

    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        amethyst = new ModItem("amethyst");
        GameRegistry.registerItem(amethyst,"amethyst");

        amethystOre = new ModBlock(Material.rock,"amethystOre",amethyst);
        GameRegistry.registerBlock(amethystOre,"amethystOre");
        amethystOre.setHardness(6.0f);
        amethystOre.setHarvestLevel("pickaxe",2);
        GameRegistry.registerWorldGenerator(new ModWorldGenerator(amethystOre,3),0);

        amethystSword = new ModItemSword(amethystMaterial,"amethystSword");
        GameRegistry.registerItem(amethystSword,"amethystSword");




    }

    }




