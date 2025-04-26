package mobin.shabanifar.naghmeh.features.poem.api

import mobin.shabanifar.naghmeh.common.NetworkResult
import mobin.shabanifar.naghmeh.common.PaginatedResponse
import mobin.shabanifar.naghmeh.features.poem.model.PoemsOfCategoryRequest
import mobin.shabanifar.naghmeh.features.poem.model.PoemsOfCategoryResponse

interface PoemApi {
    suspend fun poemsOfCategory(
        request: PoemsOfCategoryRequest
    ): NetworkResult<PaginatedResponse<PoemsOfCategoryResponse>>
}
