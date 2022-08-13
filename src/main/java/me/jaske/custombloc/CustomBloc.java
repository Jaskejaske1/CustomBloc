package me.jaske.custombloc;

import me.jaske.custombloc.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomBloc implements ModInitializer {
    public static final String MOD_ID = "custombloc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {

        ModItems.registerModItems();
    }
}
