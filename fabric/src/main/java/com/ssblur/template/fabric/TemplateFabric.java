package com.ssblur.template.fabric;

import com.ssblur.template.Template;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class TemplateFabric implements ModInitializer, ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Template.INSTANCE.clientInit();
    }

    @Override
    public void onInitialize() {
        Template.INSTANCE.init();
    }
}
