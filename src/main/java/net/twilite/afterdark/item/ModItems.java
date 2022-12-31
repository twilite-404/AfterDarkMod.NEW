package net.twilite.afterdark.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.twilite.afterdark.AfterDark;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AfterDark.MOD_ID);

    public static final RegistryObject<Item> BONE_SHARD = ITEMS.register("bone_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.AFTER_DARK_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
