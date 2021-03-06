package com.sammekleijn.koinfragmentcrash

import android.app.Application
import com.sammekleijn.koinfragmentcrash.koin.fragmentModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.fragment.koin.fragmentFactory
import org.koin.core.Koin
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(applicationContext)
            modules(fragmentModule)
            fragmentFactory()
        }
    }
}