package net.prangellplays.friendschatorigins.block;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.prangellplays.friendschatorigins.block.entity.WeaponTableBlockEntity;
import net.prangellplays.friendschatorigins.registry.FriendsChatOriginsBlockEntities;

public class WeaponTableBlock { //extends BlockWithEntity implements BlockEntityProvider {
   // public WeaponTableBlock(Settings settings) {
      //  super(settings);
 //   }

   // @Override
    //public BlockRenderType getRenderType(BlockState state) {
        //return BlockRenderType.MODEL;
    //}

  //  @Nullable
   // @Override
   // public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
  //      return new WeaponTableBlockEntity(pos, state);
  //  }

   // @Override
   // public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
    //    if (state.getBlock() != newState.getBlock()) {
     //       BlockEntity blockEntity = world.getBlockEntity(pos);
      //      if (blockEntity instanceof WeaponTableBlockEntity) {
       //         ItemScatterer.spawn(world, pos, (WeaponTableBlockEntity)blockEntity);
       //         world.updateComparators(pos,this);
       //     }
       //     super.onStateReplaced(state, world, pos, newState, moved);
    //    }
 //   }

   // @Override
  //  public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
  //      if (!world.isClient) {
   //         NamedScreenHandlerFactory screenHandlerFactory = ((WeaponTableBlockEntity) world.getBlockEntity(pos));

     //       if (screenHandlerFactory != null) {
    //            player.openHandledScreen(screenHandlerFactory);
    //        }
   //     }

//        return ActionResult.SUCCESS;
 //   }

 //   @Nullable
//    @Override
 //   public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
 //       return checkType(type, WEAPON_TABLE_BLOCK_ENTITY, WeaponTableBlockEntity::tick);
  //  }
}