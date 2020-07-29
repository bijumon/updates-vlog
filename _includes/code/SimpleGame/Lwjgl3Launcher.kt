package org.ktxapp.game.lwjgl3.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import org.ktxapp.game.game1

/** Launches the desktop (LWJGL3) application.  */
object Lwjgl3Launcher {
    @JvmStatic
    fun main(args: Array<String>) {
        createApplication()
    }

    private fun createApplication(): Lwjgl3Application {
        return Lwjgl3Application(game1(), defaultConfiguration)
    }

    private val defaultConfiguration: Lwjgl3ApplicationConfiguration
        private get() {
            val configuration = Lwjgl3ApplicationConfiguration()
            configuration.setTitle("KTXApp")
            configuration.setWindowedMode(640, 480)
            configuration.setWindowIcon("libgdx128.png", "libgdx64.png", "libgdx32.png")
            return configuration
        }
}