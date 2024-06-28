package net.gloomii.mccourse.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gloomii.mccourse.MCCourseMod;
import net.gloomii.mccourse.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {


    /**
     * This method creates and registers a custom item group in the Minecraft creative inventory using the FabricAPI.
     * This item group will have a unique name, display name, icon, and a list of items and blocks it contains.
     * <p>
     * <b>Steps:</b>
     *
     * <ul>
     *   <li><b>Define the Constant:</b>
     *   <pre>{@code
     *   public static final ItemGroup PINK_GARNET_GROUP = ...
     *   }</pre>
     *   A constant to hold our custom item group.
     *   </li>
     *
     *   <li><b>Register the Item Group:</b>
     *   <pre>{@code
     *   Registry.register(Registries.ITEM_GROUP,
     *       new Identifier(MCCourseMod.MOD_ID, "pink_garnet_group"), ...
     *   );
     *   }</pre>
     *   Registers the item group with Minecraft, giving it a unique ID.
     *   </li>
     *
     *   <li><b>Build the Item Group:</b>
     *   <pre>{@code
     *   FabricItemGroup.builder()
     *       .displayName(Text.translatable("itemgroup.pink_garnet_group"))
     *       .icon(() -> new ItemStack(ModItems.PINK_GARNET))
     *       .entries((displayContext, entries) -> {
     *           entries.add(ModItems.PINK_GARNET);
     *           entries.add(ModItems.RAW_PINK_GARNET);
     *           entries.add(ModBlocks.PINK_GARNET_BLOCK);
     *           entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
     *       }).build()
     *   }</pre>
     *   Uses a builder to set the display name, icon, and items/blocks for the group.
     *   </li> </ul>
     */
    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCCourseMod.MOD_ID, "pink_garnet_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pink_garnet_group"))
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.METAL_DETECTOR);

                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);
                        entries.add(ModBlocks.END_STONE_PINK_GARNET_ORE);
                        entries.add(ModBlocks.NETHER_PINK_GARNET_ORE);

                    }).build());

    public static void registerItemGroups() {

    }
}
