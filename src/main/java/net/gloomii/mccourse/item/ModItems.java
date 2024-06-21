package net.gloomii.mccourse.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gloomii.mccourse.MCCourseMod;
import net.gloomii.mccourse.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    /**
     * <b>Represents a custom item called Pink Garnet.</b>
     * <p>
     * This item is initialized and registered with Minecraft's item registry
     * using predefined item settings via {@link #registerItem(String, Item)}.
     * It can be accessed statically via {@code PINK_GARNET}.
     * </p>
     */
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new FabricItemSettings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new FabricItemSettings()));

    /**
     * <b>Registers a new item with the specified name and item settings.</b>
     *
     * @param name The name of the item to register.
     * @param item The item instance to register.
     * @return The registered item.
     */
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    /**
     * <b>Adds custom items to the Fabric item group entries.</b>
     *
     * <p>This method stores all "ingredient" items together as entries. These items can then be
     * added to Minecraft's existing Ingredients tab.</p>
     *
     * <p>{@code entries.add()} passing through item name from {@code public static final Item ITEM_NAME}
     *
     * @param entries The Fabric item group entries.
     * @see #registerModItems()
     */
    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        //entries.add
        entries.add(PINK_GARNET);
        entries.add(RAW_PINK_GARNET);

        entries.add(ModBlocks.PINK_GARNET_BLOCK);
        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
    }

    /**
     * <p><b>This method initializes/registers all the mod items that will be used within the application.
     * It should be called during the mod initialization phase.</b>
     * <p>Specifically, it registers the
     * {@link ItemGroupEvents#modifyEntriesEvent} for the Ingredients tab and attaches the
     * {@link #itemGroupIngredients} method to it.</p>
     *
     * <p>This effectively adds all custom item entries defined in {@link #itemGroupIngredients} to the Ingredients tab.</p>
     *
     * @see #itemGroupIngredients(FabricItemGroupEntries)
     */
    public static void registerModItems() {
        MCCourseMod.LOGGER.info("Registering Mod Items for " + MCCourseMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
