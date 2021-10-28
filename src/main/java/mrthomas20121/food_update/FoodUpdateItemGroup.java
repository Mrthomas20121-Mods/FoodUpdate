package mrthomas20121.food_update;

import mrthomas20121.food_update.init.FUItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class FoodUpdateItemGroup extends ItemGroup {

    public FoodUpdateItemGroup() {
        super("food_update");
    }

    @Nonnull
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(FUItems.golden_cooked_beef);
    }
}
