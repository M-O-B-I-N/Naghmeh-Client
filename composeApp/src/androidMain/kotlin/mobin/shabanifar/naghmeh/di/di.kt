package mobin.shabanifar.naghmeh.di

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import mobin.shabanifar.naghmeh.platformModule
import mobin.shabanifar.naghmeh.ui.HomeViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    viewModelOf(::HomeViewModel)
    single { provideKtorClient(get()) }
    single { provideBaseUrl() }
    platformModule()
    single {
        HttpClient(OkHttp) {
            install(ContentNegotiation) {
                json(Json { ignoreUnknownKeys = true })
            }
        }
    }
}

// Provide Ktor client
fun provideKtorClient(engine: HttpClientEngineFactory<*>): HttpClient {
    return HttpClient(engine) {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                isLenient = true
                prettyPrint = true
            })
        }
    }
}


// Provide base URL for the API
fun provideBaseUrl() = "http://10.0.2.2:2003/"
