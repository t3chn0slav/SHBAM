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

public class ModSlabBlocks {

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.BLACK)
                    .strength(1.5f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE)
                    .strength(2.0f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block MOSSY_CRACKED_STONE_BRICK_SLAB = registerBlock("mossy_cracked_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.BLACK)
                    .strength(1.5f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CRACKED_END_STONE_BRICK_SLAB = registerBlock("cracked_end_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.PALE_YELLOW)
                    .strength(3.0f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(3.0f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(3.0f, 6.0f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.OFF_WHITE)
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

    public static void registerModSlabBlocks() {
        MBV.LOGGER.info("Registering ModSlabBlocks for "+ MBV.MOD_ID);
    }
}
