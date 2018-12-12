package com.example.MythicRPG;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import static com.example.MythicRPG.Main.MODID;



public class ModItemArmor extends ItemArmor {

    public static Item saintNecklace;
    public static Item diamondNecklace;

    public ModItemArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_,String ItemName) {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
        this.setUnlocalizedName(ItemName);
        this.setTextureName(MODID + ":" + ItemName);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


        if (player.getCurrentArmor(2)!=null){
            ItemStack plate = player.getCurrentArmor(2);
            if (plate.getItem()== ModItemArmor.diamondNecklace){
                player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(),40,3));
            }
        }}}



