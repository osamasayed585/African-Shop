package com.visionstech.africanshop.data.di.modules

import android.os.Handler
import android.os.Looper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {

    @Provides
    fun providerHandler(): Handler {
        return android.os.Handler(Looper.myLooper()!!)
    }
}
