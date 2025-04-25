package mobin.shabanifar.naghmeh

import android.app.Application
import mobin.shabanifar.naghmeh.di.appModule
import mobin.shabanifar.naghmeh.features.poet.data.di.poetModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class NaghmehApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Start Koin
        startKoin {
            androidContext(this@NaghmehApplication)
            modules(
                httpEngineModule(),
                networkModule,
                poetModule,
                appModule
            )
        }
    }
}
