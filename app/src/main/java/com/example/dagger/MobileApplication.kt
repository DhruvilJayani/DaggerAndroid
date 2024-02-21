package com.example.dagger

import android.app.Application

class MobileApplication : Application() {

    lateinit var mobile: MobileComponent

    override fun onCreate() {
        super.onCreate()
        mobile = initDagger()
    }

    private fun initDagger() : MobileComponent =
        DaggerMobileComponent.create()

}