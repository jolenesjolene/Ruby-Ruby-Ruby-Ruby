package net.jolene.rubyrubyrubyruby.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jolene.rubyrubyrubyruby.RubyRubyRubyRuby;
import net.jolene.rubyrubyrubyruby.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_RUBY_RUBY_RUBY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RubyRubyRubyRuby.MOD_ID, "ruby_ruby_ruby_ruby"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBY))
                    .displayName(Text.translatable("itemgroup.rubyrubyrubyruby.ruby_ruby_ruby_ruby"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModItems.RUBY_PURSE);

                    }).build());




    public static void registerItemGroups() {
        RubyRubyRubyRuby.LOGGER.info("Registering Items for " + RubyRubyRubyRuby.MOD_ID);
    }
}
