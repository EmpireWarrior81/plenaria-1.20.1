package net.empire.plenaria.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

import java.util.function.Supplier;

public class EggplantFeastBlock extends Block {

    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final IntProperty SERVINGS = IntProperty.of("servings", 0, 4);

    public final Supplier<Item> servingItem;
    public final boolean hasLeftovers;

    protected static final VoxelShape[] SHAPES = new VoxelShape[]{
            Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 1.0, 14.0),
            Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 6.0, 14.0),
            Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 7.0, 14.0),
            Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 7.0, 14.0),
            Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 7.0, 14.0)
    };

    public EggplantFeastBlock(Settings settings, Supplier<Item> servingItem, boolean hasLeftovers) {
        super(settings);
        this.servingItem = servingItem;
        this.hasLeftovers = hasLeftovers;

        this.setDefaultState(this.stateManager.getDefaultState()
                .with(FACING, Direction.NORTH)
                .with(SERVINGS, getMaxServings())
        );
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, SERVINGS);
    }

    public int getMaxServings() {
        return 4;
    }

    public ItemStack getServingItem(BlockState state) {
        return new ItemStack((ItemConvertible) this.servingItem.get());
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPES[state.get(SERVINGS)];
    }


    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {

        ActionResult result = takeServing(world, pos, state, player, hand);

        return (world.isClient && result.isAccepted())
                ? ActionResult.SUCCESS
                : result;
    }


    protected ActionResult takeServing(World world, BlockPos pos, BlockState state,
                                       PlayerEntity player, Hand hand) {

        int servings = state.get(SERVINGS);
        ItemStack heldStack = player.getStackInHand(hand);


        if (servings <= 0) {
            Block.dropStack(world, pos, new ItemStack(Items.BOWL));
            world.playSound(null, pos, SoundEvents.BLOCK_WOOD_BREAK,
                    SoundCategory.PLAYERS, 0.8F, 0.8F);

            world.removeBlock(pos, false);
            return ActionResult.SUCCESS;
        }


        Item requiredContainer = Items.BOWL;

        if (heldStack.isOf(requiredContainer)) {


            world.setBlockState(pos, state.with(SERVINGS, servings - 1), 3);


            ItemStack serving = getServingItem(state);
            if (!player.getInventory().insertStack(serving)) {
                player.dropItem(serving, false);
            }


        if (!player.isCreative()) {
            heldStack.decrement(1);
        }


            if (world.getBlockState(pos).get(SERVINGS) == 0 && !hasLeftovers) {
                Block.dropStack(world, pos, new ItemStack(Items.BOWL));
                world.removeBlock(pos, false);
            }

            world.playSound(null, pos, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
                    SoundCategory.BLOCKS, 1.0F, 1.0F);

            return ActionResult.SUCCESS;
        }


        if (!world.isClient) {
            player.sendMessage(Text.literal("You need a bowl to eat this."), true);
        }

        return ActionResult.PASS;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState()
                .with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down())
                .isSideSolidFullSquare(world, pos.down(), Direction.UP);
    }
}
