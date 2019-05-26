package com.example.marvelviewpagerlivedata

import android.app.Activity
import android.app.Application
import com.example.marvelviewpagerlivedata.DI.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


class MarvelApplication: Application(), HasActivityInjector {

    @Inject
    lateinit var  activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().application(this).build().inject(this)

    }

    override fun activityInjector(): DispatchingAndroidInjector<Activity>? {
        return activityDispatchingAndroidInjector
    }
}