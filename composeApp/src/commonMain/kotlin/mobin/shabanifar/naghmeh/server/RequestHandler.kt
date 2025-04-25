package mobin.shabanifar.naghmeh.server

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.statement.HttpResponse
import io.ktor.http.HttpStatusCode
import kotlinx.io.IOException
import kotlinx.serialization.SerializationException

class RequestHandler(val client: HttpClient) {
    suspend inline fun <reified T> executeRequest(
        crossinline apiCall: suspend HttpClient.() -> HttpResponse
    ): NetworkResult<T> {
        return try {
            val response = apiCall(client)
            when (response.status) {
                HttpStatusCode.OK -> {
                    val wrapped: DataWrapper<T> = response.body()
                    NetworkResult.Success(wrapped.data)
                }

                else -> {
                    NetworkResult.Error(
                        Exception("API call failed"),
                        "Request failed with status: ${response.status.value}"
                    )
                }
            }
        } catch (e: Exception) {
            when (e) {
                is IOException -> NetworkResult.Error(e, "Network error: ${e.message}")
                is SerializationException -> NetworkResult.Error(e, "Parsing error: ${e.message}")
                else -> NetworkResult.Error(e, "Unknown error: ${e.message}")
            }
        }
    }
}
