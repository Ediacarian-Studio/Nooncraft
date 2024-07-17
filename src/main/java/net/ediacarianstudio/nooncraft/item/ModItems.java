package net.ediacarianstudio.nooncraft.item;

import net.ediacarianstudio.nooncraft.Nooncraft;
import net.ediacarianstudio.nooncraft.item.custom.CultistBookItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, Nooncraft.MODID);

    public static final Supplier<Item> GENERIC_RUBBISH_BOOK = ITEMS.register("generic_rubbish_book",
            () -> new CultistBookItem(new Item.Properties()).
                    setHoverText("generic_rubbish_book.intro").
                    setHoverTextDetailed("generic_rubbish_book.detailed"));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
