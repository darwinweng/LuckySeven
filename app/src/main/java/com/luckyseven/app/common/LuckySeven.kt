package com.luckyseven.app.common

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class LuckySeven: Application() {

    override fun onCreate() {
        super.onCreate()

        context = this
    }

    companion object {
        val TAG: String = "LuckySeven"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }
}