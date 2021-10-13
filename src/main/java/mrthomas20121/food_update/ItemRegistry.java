package mrthomas20121.food_update;

import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = FoodUpdate.mod_id, bus=Mod.EventBusSubscriber.Bus.MOD)
public class ItemRegistry {

    public static final ItemGroup itemGroup = new FoodUpdateItemGroup();

    public static Item golden_cooked_beef;
    public static Item golden_cooked_chicken;
    public static Item golden_cooked_cod;
    public static Item golden_cooked_mutton;
    public static Item golden_cooked_porkshop;
    public static Item golden_cooked_rabbit;
    public static Item golden_cooked_salmon;
    public static Item golden_cookie;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();
        r.registerAll(
                golden_cooked_beef = registerItem("food_update:golden_cooked_beef"),
                golden_cooked_chicken = registerItem("food_update:golden_cooked_chicken"),
                golden_cooked_cod = registerItem("food_update:golden_cooked_cod"),
                golden_cooked_mutton = registerItem("food_update:golden_cooked_mutton"),
                golden_cooked_porkshop = registerItem("food_update:golden_cooked_porkchop"),
                golden_cooked_rabbit = registerItem("food_update:golden_cooked_rabbit"),
                golden_cooked_salmon = registerItem("food_update:golden_cooked_salmon"),
                golden_cookie = registerItem("food_update:golden_cookie")
        );
    }

    private static Item registerItem(String item_name) {
        return new Item(new Item.Properties().food(Foods.GOLDEN_CARROT).rarity(Rarity.RARE).tab(itemGroup)).setRegistryName(item_name);
    }
}
