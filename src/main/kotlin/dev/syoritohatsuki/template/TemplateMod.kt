package dev.syoritohatsuki.template

import com.mojang.logging.LogUtils
import dev.syoritohatsuki.template.register.ItemsRegister
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger

object TemplateMod : ModInitializer {

    val MOD_ID = "template"
    val LOGGER: Logger = LogUtils.getLogger()

    override fun onInitialize() {
        LOGGER.info("${javaClass.simpleName} initialized")
        ItemsRegister
    }
}