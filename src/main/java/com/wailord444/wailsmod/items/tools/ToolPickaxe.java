package com.wailord444.wailsmod.items.tools;

import com.wailord444.wailsmod.Main;
import com.wailord444.wailsmod.init.ModItems;
import com.wailord444.wailsmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
        import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{
    public ToolPickaxe(String name, ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}