package com.example.dagger

import dagger.Module
import dagger.Provides

@Module
class BatteryModule {

    @Provides
    fun povideBattery():Battery{
        return Battery()
    }

}