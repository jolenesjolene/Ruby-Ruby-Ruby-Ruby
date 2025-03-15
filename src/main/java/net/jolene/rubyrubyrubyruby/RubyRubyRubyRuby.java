package net.jolene.rubyrubyrubyruby;

import net.fabricmc.api.ModInitializer;

import net.jolene.rubyrubyrubyruby.block.ModBlocks;
import net.jolene.rubyrubyrubyruby.item.ModItemGroups;
import net.jolene.rubyrubyrubyruby.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubyRubyRubyRuby implements ModInitializer {
	public static final String MOD_ID = "rubyrubyrubyruby";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}