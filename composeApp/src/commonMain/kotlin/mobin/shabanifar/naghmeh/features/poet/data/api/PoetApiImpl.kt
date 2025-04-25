package mobin.shabanifar.naghmeh.features.poet.data.api

import io.ktor.client.request.get
import io.ktor.client.request.parameter
import mobin.shabanifar.naghmeh.features.poet.data.model.Category
import mobin.shabanifar.naghmeh.features.poet.data.model.FamousPoet
import mobin.shabanifar.naghmeh.features.poet.data.model.PoetImageResponse
import mobin.shabanifar.naghmeh.features.poet.data.model.PoetWithBirthYear
import mobin.shabanifar.naghmeh.features.poet.data.model.PoetWithImagesResponse
import mobin.shabanifar.naghmeh.server.NetworkResult
import mobin.shabanifar.naghmeh.server.RequestHandler


class PoetApiImpl(
    private val requestHandler: RequestHandler,
    private val baseUrl: String,
) : PoetApi {
    override suspend fun getPoetsByCentury(century: Int): NetworkResult<List<PoetWithBirthYear?>> {
        return requestHandler.executeRequest {
            get("$baseUrl/poet/getPoetsByCentury") {
                parameter("century", century)
            }
        }
    }

    override suspend fun getWorksOfPoet(poetName: String): NetworkResult<List<Category>> {
        return requestHandler.executeRequest {
            get("$baseUrl/poet/getWorksOfPoet") {
                parameter("poetName", poetName)
            }
        }
    }

    override suspend fun getTop8FamousPoets(): NetworkResult<List<FamousPoet>> {
        return requestHandler.executeRequest {
            get("$baseUrl/poet/getTop8FamousPoets")
        }
    }

    override suspend fun getPoetWithImages(poetId: Int): NetworkResult<PoetWithImagesResponse> {
        return requestHandler.executeRequest {
            get("$baseUrl/poet/$poetId/with-images")
        }
    }

    override suspend fun getPoetImages(poetId: Int): NetworkResult<PoetImageResponse> {
        return requestHandler.executeRequest {
            get("$baseUrl/poet/$poetId/images")
        }
    }
}

