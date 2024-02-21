package com.example.dagger

import android.util.Log
import javax.inject.Inject

class AirPlane @Inject constructor(val battery: Battery, val display: Display) {

    init {
        battery.displayBatteryPower()
        display.turnOnScreen()

        Log.i("TAGY", "Airplane is created successfully")

    }

    fun turnOnAirplane(){
        Log.i("TAGY", "Airplane is Turned ON")
    }



}