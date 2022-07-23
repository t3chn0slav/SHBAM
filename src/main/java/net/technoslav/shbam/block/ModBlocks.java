package net.technoslav.shbam.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.technoslav.shbam.MBV;
import net.technoslav.shbam.itemgroup.ModItemGroup;

public class ModBlocks {

    public static final Block MOSSY_CRACKED_STONE_BRICKS = registerBlock("mossy_cracked_stone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(1.5f,6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.PALE_YELLOW)
                    .strength(3.0f,6.0f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);






    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MBV.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MBV.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        MBV.LOGGER.info("Registering ModBlocks for "+ MBV.MOD_ID);
    }
}
