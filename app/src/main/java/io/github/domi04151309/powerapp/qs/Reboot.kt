package io.github.domi04151309.powerapp.qs

import android.annotation.TargetApi
import android.os.Build
import android.service.quicksettings.TileService
import io.github.domi04151309.powerapp.PowerOptions

@TargetApi(Build.VERSION_CODES.N)
class Reboot : TileService() {

    override fun onClick() {
        if (!isLocked) {
            PowerOptions(this).reboot()
        }
    }
}