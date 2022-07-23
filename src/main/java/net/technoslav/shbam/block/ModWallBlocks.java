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

public class ModWallBlocks {

    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.DIAMOND_BLUE)
                    .strength(1.5f,6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.DIAMOND_BLUE)
                    .strength(1.5f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.OFF_WHITE)
                    .strength(0.8f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.OFF_WHITE)
                    .strength(2.0f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.OFF_WHITE)
                    .strength(0.8f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.BLACK)
                    .strength(1.5f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE)
                    .strength(1.5f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block MOSSY_CRACKED_STONE_BRICK_WALL = registerBlock("mossy_cracked_stone_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE)
                    .strength(1.5f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CRACKED_END_STONE_BRICK_WALL = registerBlock("cracked_end_stone_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.PALE_YELLOW)
                    .strength(3.0f, 9.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CRACKED_DEEPSLATE_BRICK_WALL = registerBlock("cracked_deepslate_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(3.0f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CRACKED_DEEPSLATE_TILE_WALL = registerBlock("cracked_deepslate_tile_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(3.0f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.DIRT_BROWN)
                    .strength(1.5f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.OFF_WHITE)
                    .strength(1.5f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.STONE_GRAY)
                    .strength(1.5f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);






    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MBV.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MBV.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModWallBlocks() {
        MBV.LOGGER.info("Registering ModWallBlocks for "+ MBV.MOD_ID);
    }

}
