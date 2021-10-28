package mrthomas20121.food_update.init;

import mrthomas20121.food_update.FoodUpdate;
import mrthomas20121.food_update.blocks.BlockCropPotato;
import mrthomas20121.food_update.blocks.BlockCropSugarBeet;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = FoodUpdate.mod_id)
public class FUBlocks {

    public static ArrayList<Block> blocks = new ArrayList<>();

    public static Block red_potatoes = new BlockCropPotato(AbstractBlock.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)).setRegistryName(new ResourceLocation(FoodUpdate.mod_id, "red_potatoes_crop"));
    public static Block sugar_beet = new BlockCropSugarBeet(AbstractBlock.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)).setRegistryName(new ResourceLocation(FoodUpdate.mod_id, "sugar_beet_crop"));

    public static void init() {
        registerCrop(red_potatoes);
        registerCrop(sugar_beet);
    }

    private static void registerCrop(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        blocks.add(block);
    }
}
