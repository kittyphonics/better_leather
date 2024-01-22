package com.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.item.*;
import net.minecraft.tag.TagKey;
import net.minecraft.util.*;
import net.minecraft.util.registry.*;

public class better_leather implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("better_leather");

	public static final Item PATCHWORK_FLESH = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

	public static final TagKey<Item> MUSHROOMS = TagKey.of(Registry.ITEM_KEY, new Identifier("better_leather", "mushrooms"));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("better_leather", "patchwork_flesh"), PATCHWORK_FLESH);
			
		LOGGER.info("Hello Fabric world!");
	}

}
