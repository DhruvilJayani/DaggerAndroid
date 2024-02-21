package com.example.dagger

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor(){


    init {
        Log.i("TAGY", "Service Provider Created")
    }
    fun getServiceProvider(){
        Log.i("TAGY", "Service Provider Connected Successfully")
    }

}