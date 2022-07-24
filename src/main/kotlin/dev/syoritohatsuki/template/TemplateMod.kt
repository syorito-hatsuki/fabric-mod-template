package dev.syoritohatsuki.template

import com.mojang.logging.LogUtils
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger

object TemplateMod : ModInitializer {
    val LOGGER: Logger = LogUtils.getLogger()

    override fun onInitialize() {
        LOGGER.info("Template initialized")
    }
}