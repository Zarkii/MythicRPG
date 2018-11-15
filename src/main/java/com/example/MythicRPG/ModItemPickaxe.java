package com.example.MythicRPG;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

import static com.example.MythicRPG.Main.MODID;

public class ModItemPickaxe extends ItemPickaxe {

    public static Item amethystPickaxe;

    protected ModItemPickaxe(ToolMaterial p_i45347_1_,String itemName) {
        super(p_i45347_1_);
        this.setUnlocalizedName(itemName);
        this.setTextureName(MODID + ":" + itemName);
        this.setCreativeTab(CreativeTabs.tabTools);
    }
}
