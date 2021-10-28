package mrthomas20121.food_update.blocks;

import mrthomas20121.food_update.init.FUItems;
import net.minecraft.block.PotatoBlock;
import net.minecraft.util.IItemProvider;

import javax.annotation.Nonnull;

public class BlockCropPotato extends PotatoBlock {

    public BlockCropPotato(Properties properties) {
        super(properties);
    }

    @Nonnull
    @Override
    protected IItemProvider getBaseSeedId() {
        return FUItems.red_potatoes_seeds;
    }
}
