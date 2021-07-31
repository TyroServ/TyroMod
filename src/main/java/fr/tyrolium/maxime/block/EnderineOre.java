package fr.tyrolium.maxime.block;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class EnderineOre extends Block {

    public static String name = "enderine_ore";

    public EnderineOre()
    {
        super(Material.anvil);
        setCreativeTab(MainMod.tyromod);
        setHarvestLevel("pickaxe", 1);
        setHardness(5.0F);
        setResistance(10.0F);
        setBlockName(name);
        setBlockTextureName(InfoMod.MOD_TEXTURE+name);
    }
}