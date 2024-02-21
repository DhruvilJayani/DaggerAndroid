package com.example.dagger

import dagger.Module
import dagger.Provides

@Module
class AmoledDisplayModule {

    @Provides
    fun providesAmoledDisplay(amoledDisplay: AmoledDisplay):Display{
        return AmoledDisplay()
    }

}