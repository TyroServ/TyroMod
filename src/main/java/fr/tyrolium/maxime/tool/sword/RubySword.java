package fr.tyrolium.maxime.tool.sword;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemSword;

public class RubySword extends ItemSword {
    public static String name = "ruby_sword";
    public RubySword() {
        super(MaterialMod.RUBY_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}