package net.technoslav.shbam.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.technoslav.shbam.MBV;
import net.technoslav.shbam.itemgroup.ModItemGroup;

public class ModStairBlocks {

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs",
            new StairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).mapColor(MapColor.BLACK)
                    .strength(1.5f,6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            new StairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE)
                            .strength(1.5f,6.0f).requiresTool()
                            .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block MOSSY_CRACKED_STONE_BRICK_STAIRS = registerBlock("mossy_cracked_stone_brick_stairs",
            new StairsBlock(ModBlocks.MOSSY_CRACKED_STONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE)
                            .strength(1.5f,6.0f).requiresTool()
                            .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CRACKED_END_STONE_BRICK_STAIRS = registerBlock("cracked_end_stone_brick_stairs",
            new StairsBlock(ModBlocks.CRACKED_END_STONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).mapColor(MapColor.PALE_YELLOW)
                            .strength(3.0f,6.0f).requiresTool()
                            .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            new StairsBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).mapColor(MapColor.DEEPSLATE_GRAY)
                            .strength(3.0f,6.0f).requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs",
            new StairsBlock(Blocks.CRACKED_DEEPSLATE_TILES.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).mapColor(MapColor.DEEPSLATE_GRAY)
                            .strength(3.0f,6.0f).requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).mapColor(MapColor.OFF_WHITE)
                            .strength(0.8f).requiresTool()
                            .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);







    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MBV.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MBV.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModStairsBlocks() {
        MBV.LOGGER.info("Registering ModStairsBlocks for "+ MBV.MOD_ID);
    }
}
