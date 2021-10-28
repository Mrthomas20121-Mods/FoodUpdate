package mrthomas20121.food_update.blocks;

import mrthomas20121.food_update.init.FUItems;
import net.minecraft.block.BeetrootBlock;
import net.minecraft.util.IItemProvider;

import javax.annotation.Nonnull;

public class BlockCropSugarBeet extends BeetrootBlock {

    public BlockCropSugarBeet(Properties properties) {
        super(properties);
    }

    @Nonnull
    @Override
    protected IItemProvider getBaseSeedId() {
        return FUItems.sugar_beet_seeds;
    }
}
