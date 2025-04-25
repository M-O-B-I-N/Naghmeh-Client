package mobin.shabanifar.naghmeh

import android.app.Application
import mobin.shabanifar.naghmeh.di.appModule
import mobin.shabanifar.naghmeh.features.poet.data.di.poetModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Start Koin
        startKoin {
            androidContext(this@MyApplication)
            modules(
                httpEngineModule(),
                networkModule,
                poetModule,
                appModule
            )
        }
    }
}

