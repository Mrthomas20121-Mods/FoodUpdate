package mrthomas20121.food_update.init;

import mrthomas20121.food_update.FoodUpdate;
import mrthomas20121.food_update.FoodUpdateItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = FoodUpdate.mod_id, bus=Mod.EventBusSubscriber.Bus.MOD)
public class FUItems {

    public static final ItemGroup itemGroup = new FoodUpdateItemGroup();

    public static Item golden_cooked_beef;
    public static Item golden_cooked_chicken;
    public static Item golden_cooked_cod;
    public static Item golden_cooked_mutton;
    public static Item golden_cooked_porkshop;
    public static Item golden_cooked_rabbit;
    public static Item golden_cooked_salmon;
    public static Item golden_cookie;
    public static Item red_potatoes;
    public static Item sugar_beet;
    public static Item red_potatoes_seeds;
    public static Item sugar_beet_seeds;

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerItems(RegistryEvent.Register<net.minecraft.item.Item> event) {

        IForgeRegistry<net.minecraft.item.Item> r = event.getRegistry();

        // register item blocks
        FUBlocks.blocks.forEach(block -> register(r, block));

        red_potatoes_seeds = registerCropItem(r, FUBlocks.red_potatoes, "red_potatoes_seeds");
        sugar_beet_seeds = registerCropItem(r, FUBlocks.sugar_beet, "sugar_beet_seeds");
        golden_cooked_beef = registerGoldenFood(r, "golden_cooked_beef");
        golden_cooked_chicken = registerGoldenFood(r, "golden_cooked_chicken");
        golden_cooked_cod = registerGoldenFood(r, "golden_cooked_cod");
        golden_cooked_mutton = registerGoldenFood(r, "golden_cooked_mutton");
        golden_cooked_porkshop = registerGoldenFood(r, "golden_cooked_porkchop");
        golden_cooked_rabbit = registerGoldenFood(r, "golden_cooked_rabbit");
        golden_cooked_salmon = registerGoldenFood(r, "golden_cooked_salmon");
        golden_cookie = registerGoldenFood(r, "golden_cookie");
        red_potatoes = registerFoodItem(r, Foods.POTATO, "red_potatoes");
        sugar_beet = registerFoodItem(r, Foods.BEETROOT, "sugar_beet");
    }

    private static Item registerCropItem(IForgeRegistry<Item> r, Block block, String name) {
        return register(r, new BlockNamedItem(block, createGroup()).setRegistryName(new ResourceLocation(FoodUpdate.mod_id, name)));
    }

    private static Item registerGoldenFood(IForgeRegistry<Item> r, String name) {
        return register(r, new Item(createGroup().rarity(Rarity.RARE).food(FUFoods.golden)).setRegistryName(new ResourceLocation(FoodUpdate.mod_id, name)));
    }

    // food item
    private static Item registerFoodItem(IForgeRegistry<Item> r, Food food, String name) {
        return register(r, new Item(createGroup().food(food)).setRegistryName(new ResourceLocation(FoodUpdate.mod_id, name)));
    }

    // normal item
    private static Item register(IForgeRegistry<Item> r, String name) {
        return register(r, new Item(createGroup())).setRegistryName(new ResourceLocation(FoodUpdate.mod_id, name));
    }

    private static Item.Properties createGroup() {
        return new Item.Properties().tab(FUItems.itemGroup);
    }

    private static void register(IForgeRegistry<Item> r, Block block) {
        register(r, new BlockItem(block, new Item.Properties()).setRegistryName(block.getRegistryName()));
    }

    private static Item register(IForgeRegistry<Item> r, Item item) {
        r.register(item);
        return item;
    }
}
