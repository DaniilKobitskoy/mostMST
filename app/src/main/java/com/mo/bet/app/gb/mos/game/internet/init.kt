package com.mo.bet.app.gb.mos.game.internet

import android.app.Application
import com.onesignal.OneSignal

class init: Application() {

    override fun onCreate() {
        super.onCreate()
        try {

            OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
            OneSignal.initWithContext(this)
            OneSignal.setAppId(savekey.key)
        } catch (e: Exception) {
        }
    }


}