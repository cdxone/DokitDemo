package com.example.dokitdemo

import android.app.Application
import androidx.multidex.MultiDexApplication
import com.didichuxing.doraemonkit.DoKit

class MyApp : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        DoKit.Builder(this).build()
    }
}