package net.gloomii.mccourse.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gloomii.mccourse.MCCourseMod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    /**
     * <b>Represents a custom block called Pink Garnet Block.</b>
     * <p>This item is initialized and registered with Minecraft's item/block registry
     * using predefined block settings via {@link #registerBlock(String, Block)}.
     * <p>It can be accessed statically via {@code PINK_GARNET_BLOCK}.</p>
     *
     * <p>
     * <b>There are two main options for creating blocks:</b>
     * <p>1. {@code FabricBlockSettings.create()} which allows you to call all sorts of different methods to specify
     * your block's properties; The block requires all of the following properties on top of additional
     * properties you want to specify:
     * {@code .instrument(Instrument instrument)}
     * {@code .hardness(float hardness)}
     * {@code .mapColor(DyeColor color)}
     * {@code .sounds(BlockSoundGroup group)}
     * </p>
     * <p>
     * <p>2. {@code FabricBlockSettings.copyOf(Blocks.BLOCK_NAME)} - This allows you to copy the properties of
     * existing blocks whilst still allowing overriding of block properties where it is wanted. Unspecified
     * properties will assume that of the copied block.
     *
     *
     * <p><b>Note:</b> You can middle click IRON_BLOCK to be taken to the Blocks.java class where you can view the source code</p>
     */
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    /**
     * <b>Represents a custom ExperienceDroppingBlock called Pink Garnet Ore.</b>
     * <p>This item is initialized and registered with Minecraft's item/block registry
     * using predefined block settings via {@link #registerBlock(String, Block)}.
     * <p>It can be accessed statically via {@code PINK_GARNET_ORE}.</p>
     *
     * <p>
     * The difference between {@code new Block} and {@code new ExperienceDroppingBlock} is that
     * one of them doesn't drop experience once mined and the other does.
     *
     * <p>When creating a new experience dropping box the only thing you need to specify is the min and max exp value
     * for your block via {@code block_code_here, UniformIntProvider.create(min, max)));}
     * </p>
     * <b>Note:</b> You can middle click ExperienceDroppingBlock to be taken to the ExperienceDroppingBlock.java class
     * where you can then middle click on it once again to view all the respective values for vanilla blocks</p>
     */

    public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE), UniformIntProvider.create(3, 6)));
    public static final Block DEEPSLATE_PINK_GARNET_ORE = registerBlock("deepslate_pink_garnet_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE), UniformIntProvider.create(3, 6)));
    public static final Block END_STONE_PINK_GARNET_ORE = registerBlock("end_stone_pink_garnet_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE), UniformIntProvider.create(3, 6)));
    public static final Block NETHER_PINK_GARNET_ORE = registerBlock("nether_pink_garnet_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK), UniformIntProvider.create(3, 6)));

    /**
     * <b>Helper method {@code registerBlock} registers a new block with the specified name and item settings.</b>
     *
     * @param name The name of the block to register.
     * @param block The item instance to register.
     * @return The registered item.
     */
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }

    /**
     * <b>Helper method {@code registerBlockItem} registers a new block item with the specified name and item settings.</b>
     * <p>This is important because while we can register blocks that can exist in the world,
     * it won't have an associated item with it. This helper method solves this issue.
     *
     * @param name The name of the block item to register.
     * @param block The block instance to register.
     * @return The registered item.
     */
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    /**
     * <b>Registers all mod blocks for the application.</b>
     *
     * <p>This method initializes and registers all the mod blocks that will be used within the application.
     * It should be called during the mod initialization phase. Specifically, it registers the
     */
    public static void registerModBlocks() {
        MCCourseMod.LOGGER.info("Registering ModBlocks for " + MCCourseMod.MOD_ID);
    }
}
