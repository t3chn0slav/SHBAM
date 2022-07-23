package net.technoslav.shbam.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.technoslav.shbam.MBV;
import net.technoslav.shbam.itemgroup.ModItemGroup;

public class ModPressurePlateBlock {

    public static final Block QUARTZ_PRESSURE_PLATE = registerBlock("quartz_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.STONE).mapColor(MapColor.OFF_WHITE)
                    .strength(0.5f).requiresTool().noCollision()
                    .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);

    public static final Block CHISELED_QUARTZ_PRESSURE_PLATE = registerBlock("chiseled_quartz_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.STONE).mapColor(MapColor.OFF_WHITE)
                            .strength(0.5f).requiresTool().noCollision()
                            .sounds(BlockSoundGroup.STONE)), ModItemGroup.BLOCK_VARIATIONS);






    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MBV.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MBV.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModPressurePlateBlocks() {
        MBV.LOGGER.info("Registering ModPressurePlateBlocks for "+ MBV.MOD_ID);
    }
}
