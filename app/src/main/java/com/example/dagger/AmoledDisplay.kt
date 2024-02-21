package com.example.dagger

import android.util.Log
import javax.inject.Inject

class AmoledDisplay @Inject constructor():Display {

    override fun turnOnScreen() {
        Log.i("TAGY", "AMOLED Display Created")
    }

}
