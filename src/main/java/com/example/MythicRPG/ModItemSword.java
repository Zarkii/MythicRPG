package com.example.MythicRPG;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

import static com.example.MythicRPG.Main.MODID;

public class ModItemSword extends ItemSword {

    public ModItemSword(ToolMaterial p_i45356_1_,String itemName) {
        super(p_i45356_1_);
        this.setUnlocalizedName(itemName);
        this.setTextureName(MODID + ":" + itemName);
        this.setCreativeTab(CreativeTabs.tabCombat);

    }
}
