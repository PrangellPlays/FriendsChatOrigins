package net.prangellplays.friendschatorigins.block.entity;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
//import net.prangellplays.friendschatorigins.recipe.WeaponTableRecipe;
import net.prangellplays.friendschatorigins.registry.FriendsChatOriginsBlockEntities;
import net.prangellplays.friendschatorigins.screen.WeaponTableScreenHandler;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Optional;

//import static net.prangellplays.friendschatorigins.registry.FriendsChatOriginsBlockEntities.WEAPON_TABLE_BLOCK_ENTITY;

public class WeaponTableBlockEntity { //extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {
 //   private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(4, ItemStack.EMPTY);

  //  private static final int INPUT_SLOT1 = 0;
  //  private static final int INPUT_SLOT2 = 1;
  //  private static final int INPUT_SLOT3 = 2;
  //  private static final int OUTPUT_SLOT = 3;

  //  protected final PropertyDelegate propertyDelegate;
  //  private int progress = 0;
  //  private int maxProgress = 200;

 //   public WeaponTableBlockEntity(BlockPos pos, BlockState state) {
  //      super(WEAPON_TABLE_BLOCK_ENTITY, pos, state);
   //     this.propertyDelegate = new PropertyDelegate() {
    //        @Override
     //       public int get(int index) {
     //           return switch (index) {
     //               case 0 -> WeaponTableBlockEntity.this.progress;
     //               case 1 -> WeaponTableBlockEntity.this.maxProgress;
    //                default -> 0;
     //           };
    //        }

    //        @Override
     //       public void set(int index, int value) {
     //           switch (index) {
      //              case 0 -> WeaponTableBlockEntity.this.progress = value;
      //              case 1 -> WeaponTableBlockEntity.this.maxProgress = value;
     //           }
     //       }

    //        @Override
   //         public int size() {
    //            return 2;
    //        }
   //     };
  //  }

 //   @Override
  //  public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
  //      buf.writeBlockPos(this.pos);
  //  }

   // @Override
   // public Text getDisplayName() {
  //      return Text.literal("Weapon Table");
   // }

  //  @Override
  //  public DefaultedList<ItemStack> getItems() {
 //       return inventory;
 //   }

  //  @Override
  //  protected void writeNbt(NbtCompound nbt) {
 //       super.writeNbt(nbt);
  //      Inventories.writeNbt(nbt, inventory);
  //      nbt.putInt("weapon_table.progress", progress);
 //   }

//    @Override
 //   public void readNbt(NbtCompound nbt) {
 //       super.readNbt(nbt);
 //       Inventories.readNbt(nbt, inventory);
  //      progress = nbt.getInt("weapon_table.progress");
 //   }

  //  @Nullable
  //  @Override
  //  public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
  //      return new WeaponTableScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
  //  }

  //  public void tick(World world, BlockPos pos, BlockState state) {
 //       if(world.isClient()) {
 //           return;
 //       }

  //      if(isOutputSlotEmptyOrReceivable()) {
   //         if(this.hasRecipe()) {
    //            this.increaseCraftProgress();
   //             markDirty(world, pos, state);

  //              if (hasCraftingFinished()) {
  //                  this.craftItem();
  //                  this.resetProgress();
    //            }
   //         } else {
   //             this.resetProgress();
   //         }
    //    } else {
   //         this.resetProgress();
   //         markDirty(world, pos, state);
   //     }
 //   }

 //   private void resetProgress() {
  //      this.progress = 0;
//    }

 //   private void craftItem() {
     //   Optional<RecipeEntry<WeaponTableRecipe>> recipe = getCurrentRecipe();

   //     this.removeStack(INPUT_SLOT1, 1);
    //    this.removeStack(INPUT_SLOT2, 1);
   //     this.removeStack(INPUT_SLOT3, 1);

       // this.setStack(OUTPUT_SLOT, new ItemStack(recipe.get().value().getResult(null).getItem(),
       //         getStack(OUTPUT_SLOT).getCount() + recipe.get().value().getResult(null).getCount()));
 //   }

   // private boolean hasCraftingFinished() {
  //      return progress >= maxProgress;
  //  }

   // private void increaseCraftProgress() {
  //      progress++;
  //  }

  //  @Override
  //  public void markDirty() {
 //      assert world != null;
 //       world.updateListeners(pos, getCachedState(), getCachedState(), 3);
 //       super.markDirty();
 //   }

 //   private boolean hasRecipe() {
    //    Optional<RecipeEntry<WeaponTableRecipe>> recipe = getCurrentRecipe();

     //   return recipe.isPresent() && canInsertAmountIntoOutputSlot(recipe.get().value().getResult(null))
      //          && canInsertItemIntoOutputSlot(recipe.get().value().getResult(null).getItem());
  //  }

//    private Optional<RecipeEntry<WeaponTableRecipe>> getCurrentRecipe() {
 //       SimpleInventory inv = new SimpleInventory(this.size());
  //      for(int i = 0; i < this.size(); i++) {
   //         inv.setStack(i, this.getStack(i));
   //     }

   //     return Objects.requireNonNull(getWorld()).getRecipeManager().getFirstMatch(WeaponTableRecipe.Type.INSTANCE, inv, getWorld());


 //   }

 //   private boolean canInsertItemIntoOutputSlot(Item item) {
  //      return this.getStack(OUTPUT_SLOT).getItem() == item || this.getStack(OUTPUT_SLOT).isEmpty() && this.getStack(BUCKET).getItem() == item || this.getStack(BUCKET).isEmpty();
//    }

 //   private boolean canInsertAmountIntoOutputSlot(ItemStack result) {
 //       return this.getStack(OUTPUT_SLOT).getCount() + result.getCount() <= getStack(OUTPUT_SLOT).getMaxCount() && this.getStack(BUCKET).getCount() + 1 <= getStack(BUCKET).getMaxCount();
 //   }

  //  private boolean isOutputSlotEmptyOrReceivable() {
   //     return this.getStack(OUTPUT_SLOT).isEmpty() || this.getStack(OUTPUT_SLOT).getCount() < this.getStack(OUTPUT_SLOT).getMaxCount() && this.getStack(BUCKET).isEmpty() || this.getStack(BUCKET).getCount() < this.getStack(BUCKET).getMaxCount();
  //      return false;
  //  }
}