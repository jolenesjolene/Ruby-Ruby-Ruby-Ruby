package net.jolene.rubyrubyrubyruby.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jolene.rubyrubyrubyruby.RubyRubyRubyRuby;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            AbstractBlock.Settings.create().strength(3f)
                    .sounds(BlockSoundGroup.STONE).instrument(NoteBlockInstrument.BANJO));

    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RubyRubyRubyRuby.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RubyRubyRubyRuby.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }

    public static void registerModBlocks() {
        RubyRubyRubyRuby.LOGGER.info("Registering Mod Blocks for " + RubyRubyRubyRuby.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(RUBY_BLOCK);
        });
    }
}
