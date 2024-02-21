package com.example.dagger

import android.util.Log



class Battery  {
    init {
        Log.i("TAGY", "Battery Created")
    }

    fun displayBatteryPower(){
        Log.i("TAGY", "Battery is 100%")
    }
}