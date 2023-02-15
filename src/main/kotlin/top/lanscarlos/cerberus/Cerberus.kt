package top.lanscarlos.cerberus

import taboolib.common.platform.Platform
import taboolib.common.platform.Plugin
import taboolib.common.platform.function.info
import taboolib.module.metrics.Metrics
import taboolib.platform.BukkitPlugin

object Cerberus : Plugin() {

    val plugin by lazy {
        BukkitPlugin.getInstance()
    }

    lateinit var metrics: Metrics
        private set

    override fun onEnable() {
        info("Successfully running Cerberus!")
    }

    override fun onActive() {
        metrics = Metrics(17739, plugin.description.version, Platform.BUKKIT)

    }
}