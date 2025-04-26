package mobin.shabanifar.naghmeh.features.poem.api

import io.ktor.client.request.get
import io.ktor.client.request.parameter
import mobin.shabanifar.naghmeh.common.NetworkResult
import mobin.shabanifar.naghmeh.common.PaginatedResponse
import mobin.shabanifar.naghmeh.common.RequestHandler
import mobin.shabanifar.naghmeh.features.poem.model.PoemsOfCategoryRequest
import mobin.shabanifar.naghmeh.features.poem.model.PoemsOfCategoryResponse

class PoemApiImpl(
    private val requestHandler: RequestHandler,
    private val baseUrl: String
) : PoemApi {

    override suspend fun poemsOfCategory(
        request: PoemsOfCategoryRequest
    ): NetworkResult<PaginatedResponse<PoemsOfCategoryResponse>> {
        return requestHandler.executeRequest {
            get("$baseUrl/poem/getPoemsOfCategory") {
                parameter("categoryName", request.categoryName)
                parameter("poetName", request.poetName)
                parameter("page", request.page)
                parameter("pageSize", request.pageSize)
            }
        }
    }
}
