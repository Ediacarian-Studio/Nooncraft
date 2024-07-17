package net.ediacarianstudio.nooncraft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.ediacarianstudio.nooncraft.Nooncraft.MODID;

public class ModCreativeModeTab {
    //CREATIVE_MODE_TABS is a DeferredRegister<CreativeModeTab>
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final Supplier<CreativeModeTab> NOONCRAFT_BOOKS_TAB = CREATIVE_MODE_TABS.register("nooncraft_books", () -> CreativeModeTab.builder()
            //Set the title of the tab. Don't forget to add a translation!
            .title(Component.translatable("itemGroup." + MODID + ".books"))
            //Set the icon of the tab.
            .icon(() -> new ItemStack(ModItems.GENERIC_RUBBISH_BOOK.get()))
            //Add your items to the tab.
            .displayItems((params, output) -> {
                output.accept(ModItems.GENERIC_RUBBISH_BOOK.get());
//                // Accepts an ItemLike. This assumes that MY_BLOCK has a corresponding item.
//                output.accept(MyBlocksClass.MY_BLOCK);
            })
            .build()
    );
}
