package fr.tyrolium.maxime.tool.sword;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemSword;

public class TinSword extends ItemSword {
    public static String name = "tin_sword";
    public TinSword() {
        super(MaterialMod.TIN_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}
