package com.ssblur.template

import com.ssblur.unfocused.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object Template : ModInitializer("template") {
    const val MODID = "template"
    val LOGGER: Logger = LoggerFactory.getLogger(id)

    fun init() {
        LOGGER.info("Unfocused Mod Template loaded...")
    }

    fun clientInit() {
        LOGGER.info("Unfocused Mod Template loaded...")
    }
}