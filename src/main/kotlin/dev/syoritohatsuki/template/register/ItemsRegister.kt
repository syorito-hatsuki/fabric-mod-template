package dev.syoritohatsuki.template.register

import dev.syoritohatsuki.template.TemplateMod.MOD_ID
import dev.syoritohatsuki.template.item.TemplateItem
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object ItemsRegister {
    private val ITEMS: MutableMap<Item, Identifier> = LinkedHashMap()

    val TEMPLATE_ITEM = TemplateItem().create("template_item")

    init {
        ITEMS.keys.forEach {
            Registry.register(Registry.ITEM, ITEMS[it], it)
        }
    }

    private fun Item.create(name: String) {
        ITEMS[this] = Identifier(MOD_ID, name)
    }
}
