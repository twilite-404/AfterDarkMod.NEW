package net.twilite.afterdark.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab AFTER_DARK_TAB = new CreativeModeTab("afterdarktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BONE_SHARD.get());
        }
    };
}
