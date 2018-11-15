package com.example.MythicRPG;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

import static com.example.MythicRPG.Main.MODID;

public class ModBlock extends Block {

    public static Block amethystOre;
    public static Block amethystBlock;
    public static Block garnetOre;
    public static Block garnetBlock;
    private Item toDrop;
    public ModBlock(Material material, String BlockName, Item toDrop){
        super(material);
        this.setBlockName(BlockName);
        this.setBlockTextureName(MODID + ":" + BlockName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.toDrop = toDrop;

    }
    @Override
    public Item getItemDropped(int i, Random random, int j){
        if(toDrop != null){
            return toDrop;
        }
        else
            return Item.getItemFromBlock(this);
    }

}
