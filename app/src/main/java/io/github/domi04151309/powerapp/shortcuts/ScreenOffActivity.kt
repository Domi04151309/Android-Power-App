package io.github.domi04151309.powerapp.shortcuts

import android.app.Activity
import android.os.Bundle
import io.github.domi04151309.powerapp.PowerOptions

class ScreenOffActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        PowerOptions(this).turnOffScreen()
        finish()
    }

}