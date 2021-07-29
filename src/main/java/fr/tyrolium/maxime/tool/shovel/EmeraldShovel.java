package fr.tyrolium.maxime.tool.shovel;

import fr.tyrolium.maxime.InfoMod;
import fr.tyrolium.maxime.MainMod;
import fr.tyrolium.maxime.init.MaterialMod;
import net.minecraft.item.ItemSpade;

public class EmeraldShovel extends ItemSpade {
    public static String name = "emerald_shovel";
    public EmeraldShovel() {
        super(MaterialMod.EMERALD_TOOL);
        setUnlocalizedName(name);
        setTextureName(InfoMod.MOD_TEXTURE+name);
        setCreativeTab(MainMod.tyromod);
    }
}