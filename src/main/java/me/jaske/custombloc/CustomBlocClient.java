package me.jaske.custombloc;

import net.fabricmc.api.ClientModInitializer;

public class CustomBlocClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
    }
}
