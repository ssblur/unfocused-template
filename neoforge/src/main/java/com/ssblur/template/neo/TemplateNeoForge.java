package com.ssblur.template.neo;

import com.ssblur.template.Template;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;

@Mod(Template.MODID)
public final class TemplateNeoForge {
    public TemplateNeoForge() {
        Template.INSTANCE.init();
        if (FMLEnvironment.dist == Dist.CLIENT) {
            Template.INSTANCE.clientInit();
        }
    }
}
