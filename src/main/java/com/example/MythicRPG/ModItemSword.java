package com.example.MythicRPG;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

import static com.example.MythicRPG.Main.MODID;

public class ModItemSword extends ItemSword {

    public static Item amethystSword;
    public static Item amethystAndGarnetSword;

    public ModItemSword(ToolMaterial p_i45356_1_,String itemName) {
        super(p_i45356_1_);
        this.setUnlocalizedName(itemName);
        this.setTextureName(MODID + ":" + itemName);
        this.setCreativeTab(CreativeTabs.tabCombat);

    }
}
