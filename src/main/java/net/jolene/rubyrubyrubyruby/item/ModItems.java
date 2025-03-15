package net.jolene.rubyrubyrubyruby.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jolene.rubyrubyrubyruby.RubyRubyRubyRuby;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RubyRubyRubyRuby.MOD_ID,"ruby")))));
    public static final Item RUBY_PURSE = registerItem("ruby_purse", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RubyRubyRubyRuby.MOD_ID,"ruby_purse")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RubyRubyRubyRuby.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RubyRubyRubyRuby.LOGGER.info("Registering Mod Items for " + RubyRubyRubyRuby.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RUBY);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(RUBY_PURSE);
        });
    }
}
