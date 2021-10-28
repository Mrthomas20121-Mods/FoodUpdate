package mrthomas20121.food_update;

import mrthomas20121.food_update.init.FUBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(FoodUpdate.mod_id)
public class FoodUpdate {

	public static final String mod_id = "food_update";
	public static final Logger LOGGER = LogManager.getLogger();

	public FoodUpdate() {
		FUBlocks.init();
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientStuff);
	}

	public void clientStuff(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(FUBlocks.sugar_beet, RenderType.cutout());
		RenderTypeLookup.setRenderLayer(FUBlocks.red_potatoes, RenderType.cutout());
	}
}
