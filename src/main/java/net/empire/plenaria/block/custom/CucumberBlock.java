package net.empire.plenaria.block.custom;

import net.empire.plenaria.block.ModBlocks;
import net.empire.plenaria.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.block.Block;
import net.minecraft.world.BlockView;

public class CucumberBlock extends CropBlock {

    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            VoxelShapes.cuboid(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), // 2px
            VoxelShapes.cuboid(0.0D, 0.0D, 0.0D, 1.0D, 0.1875D, 1.0D), // 3px
            VoxelShapes.cuboid(0.0D, 0.0D, 0.0D, 1.0D, 0.3125D, 1.0D), // 5px
            VoxelShapes.cuboid(0.0D, 0.0D, 0.0D, 1.0D, 0.4375D, 1.0D), // 7px
            VoxelShapes.cuboid(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D),    // 8px
            VoxelShapes.cuboid(0.0D, 0.0D, 0.0D, 1.0D, 0.5625D, 1.0D), // 9px
            VoxelShapes.cuboid(0.0D, 0.0D, 0.0D, 1.0D, 0.5625D, 1.0D), // 9px
            VoxelShapes.cuboid(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D)   // 10px
    };

    public CucumberBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.CUCUMBER_SEEDS;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, net.minecraft.block.ShapeContext context) {
        return SHAPE_BY_AGE[state.get(getAgeProperty())];
    }
}
