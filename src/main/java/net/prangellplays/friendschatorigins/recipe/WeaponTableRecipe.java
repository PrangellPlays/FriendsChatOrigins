package net.prangellplays.friendschatorigins.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.world.World;

import java.util.List;

//public class WeaponTableRecipe implements Recipe<SimpleInventory> {
    //private final ItemStack output;
    //private final List<Ingredient> recipeItems;

   // public WeaponTableRecipe(List<Ingredient> ingredients, ItemStack itemStack) {
  //      this.output = itemStack;
 //       this.recipeItems = ingredients;
  //  }

  //  @Override
  //  public boolean matches(SimpleInventory inventory, World world) {
  //      if(world.isClient()) {
   ///         return false;
  //      }

  //      return recipeItems.get(0).test(inventory.getStack(0)) && recipeItems.get(1).test(inventory.getStack(1)) && recipeItems.get(2).test(inventory.getStack(2));
  //  }

  //  @Override
  //  public ItemStack craft(SimpleInventory inventory, DynamicRegistryManager registryManager) {
  //      return output;
  //  }

  //  @Override
  //  public boolean fits(int width, int height) {
  //      return true;
  //  }

 //   @Override
 //   public ItemStack getResult(DynamicRegistryManager registryManager) {
 //       return output;
  //  }

  //  @Override
   // public DefaultedList<Ingredient> getIngredients() {
   //     DefaultedList<Ingredient> list = DefaultedList.ofSize(this.recipeItems.size());
   //     list.addAll(recipeItems);
   //     return list;
  //  }

 //   @Override
 //   public RecipeSerializer<?> getSerializer() {
 //       return Serializer.INSTANCE;
  //  }

  //  @Override
 //   public RecipeType<?> getType() {
  //      return Type.INSTANCE;
  //  }

  //  public static class Type implements RecipeType<WeaponTableRecipe> {
   //     public static final Type INSTANCE = new Type();
  //      public static final String ID = "freezer";
 ///   }

  //  public static class Serializer implements RecipeSerializer<WeaponTableRecipe> {
 //       public static final Serializer INSTANCE = new Serializer();
  //      public static final String ID = "weapon_table";

   //     public static final Codec<WeaponTableRecipe> CODEC = RecordCodecBuilder.create(in -> in.group(
    //            validateAmount(Ingredient.EMPTY, 9).fieldOf("ingredients").forGetter(WeaponTableRecipe::getIngredients),
    //            ItemStack.CODEC.fieldOf("output").forGetter(r -> r.output)
    //    ).apply(in, WeaponTableRecipe::new));

    //    private static Codec<List<Ingredient>> validateAmount(Codec<Ingredient> delegate, int max) {
    //        return Codecs.validate(Codecs.validate(
    //                delegate.listOf(), list -> list.size() > max ? DataResult.error(() -> "Recipe has too many ingredients!") : DataResult.success(list)
    //        ), list -> list.isEmpty() ? DataResult.error(() -> "Recipe has no ingredients!") : DataResult.success(list));
    //    }

   //     @Override
   //     public Codec<WeaponTableRecipe> codec() {
  //          return CODEC;
   //     }

    //    @Override
    //    public WeaponTableRecipe read(PacketByteBuf buf) {
    //        DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);
//
  //          for(int i = 0; i < inputs.size(); i++) {
  //              inputs.set(i, Ingredient.fromPacket(buf));
   //         }

    //        ItemStack output = buf.readItemStack();
   //         return new WeaponTableRecipe(inputs, output);
   //     }

   //     @Override
  //      public void write(PacketByteBuf buf, WeaponTableRecipe recipe) {
   //         buf.writeInt(recipe.getIngredients().size());

  //          for (Ingredient ingredient : recipe.getIngredients()) {
  //              ingredient.write(buf);
   //         }

  //          buf.writeItemStack(recipe.getResult(null));
 //       }
  //  }
//}