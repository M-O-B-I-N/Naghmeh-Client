package mobin.shabanifar.naghmeh

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.accept
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import mobin.shabanifar.naghmeh.server.RequestHandler
import org.koin.dsl.module

val networkModule = module {
    single { provideBaseUrl() }
    single { RequestHandler(get()) }
    single {
        HttpClient(get<HttpClientEngineFactory<*>>().create()) {
            install(ContentNegotiation) {
                json(
                    Json {
                        ignoreUnknownKeys = true
                        isLenient = true
                    }
                )
            }
            defaultRequest {
                contentType(ContentType.Application.Json)
                accept(ContentType.Application.Json)
            }
        }
    }
}

// Provide base URL for the API
fun provideBaseUrl() = "http://10.0.2.2:2003/api"
