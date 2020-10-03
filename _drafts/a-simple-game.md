---
tags: [ libgdx ]
description: "port the libgdx sample to kotlin"
---

Implement libgdx ["A Simple Game"](https://github.com/libgdx/libgdx/wiki/A-Simple-Game) in kotlin.

<!--more-->

**Desktop Launcher**

``` kotlin
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
```

**Game**

``` kotlin
package org.ktxapp.game

import com.badlogic.gdx.Game

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class game1 : Game() {
    override fun create() {
        setScreen(FirstScreen())
    }
}
```

**First Screen**

``` kotlin
package org.ktxapp.game

import com.badlogic.gdx.Screen

/** First screen of the application. Displayed after the application is created.  */
class FirstScreen : Screen {
    override fun show() {
        // Prepare your screen here.
    }

    override fun render(delta: Float) {
        // Draw your screen here. "delta" is the time since last render in seconds.
    }

    override fun resize(width: Int, height: Int) {
        // Resize your screen here. The parameters represent the new window size.
    }

    override fun pause() {
        // Invoked when your application is paused.
    }

    override fun resume() {
        // Invoked when your application is resumed after pause.
    }

    override fun hide() {
        // This method is called when another screen replaces this one.
    }

    override fun dispose() {
        // Destroy screen's assets here.
    }
}
```
