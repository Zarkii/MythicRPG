package com.example.MythicRPG;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

import static com.example.MythicRPG.Main.MODID;

public class ModItemAxe extends ItemAxe {
    public static Item amethystAxe;
    protected ModItemAxe(ToolMaterial p_i45327_1_,String itemName) {
        super(p_i45327_1_);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setTextureName(MODID + ":" + itemName);
        this.setUnlocalizedName(itemName);
    }
}
