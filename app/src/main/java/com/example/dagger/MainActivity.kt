package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mobile: Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        DaggerMobileComponent.create().getMobileInstance().turnOnMobile()

//        DaggerMobileComponent.create().inject(this)
//        airPlane.turnOnAirplane()


       // (application as MobileApplication).mobile.inject(this)

//
//        val mobile = Mobile(Battery(),locking
//            SimCard(ServiceProvider()),
//            Display()).turnOnMobile()


    }
}