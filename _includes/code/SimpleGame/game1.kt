package org.ktxapp.game

import com.badlogic.gdx.Game

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class game1 : Game() {
    override fun create() {
        setScreen(FirstScreen())
    }
}