package com.example.MythicRPG;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import static com.example.MythicRPG.Main.MODID;

public class ModItem extends Item {


    public static Item amethyst;

    public static ToolMaterial amethystMaterial = EnumHelper.addToolMaterial("amethystMaterial",3,1000,10.0f,4.0f,10);
    public static ToolMaterial amethystAndGarnetMaterial = EnumHelper.addToolMaterial("amethystAndGarnetMaterial",3,1800,13.0f,
            5.5f,10);

    public static Item garnet;

    //public static ItemArmor.ArmorMaterial saintArmorMaterial = EnumHelper.addArmorMaterial("saintArmorMaterial",14,)




    public ModItem(String itemName){
        this.setUnlocalizedName(itemName);
        this.setTextureName(MODID + ":" + itemName);
        this.setCreativeTab(CreativeTabs.tabMisc);

    }
}
