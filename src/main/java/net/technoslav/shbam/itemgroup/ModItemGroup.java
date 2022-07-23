package net.technoslav.shbam.itemgroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.technoslav.shbam.MBV;
import net.technoslav.shbam.block.ModWallBlocks;

public class ModItemGroup {
    public static final ItemGroup BLOCK_VARIATIONS = FabricItemGroupBuilder.build(new Identifier(MBV.MOD_ID, "block_variations"),
            () -> new ItemStack(ModWallBlocks.PRISMARINE_BRICK_WALL));
}
