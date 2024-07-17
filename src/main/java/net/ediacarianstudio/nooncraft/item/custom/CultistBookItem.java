package net.ediacarianstudio.nooncraft.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;
import java.util.List;

public class CultistBookItem extends Item {
    private String HoverText = "";
    private String HoverTextDetailed = "";
    public CultistBookItem(Properties pProperties) {
        super(pProperties);
    }

    public CultistBookItem setHoverText(String key){
        this.HoverText = key;
        return this;
    }

    public CultistBookItem setHoverTextDetailed(String key){
        this.HoverTextDetailed = key;
        return this;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Component.translatable(HoverTextDetailed));
        } else {
            tooltip.add(Component.translatable(HoverText).append(Component.literal("\n [SHIFT+]")));
        }
    }
}

