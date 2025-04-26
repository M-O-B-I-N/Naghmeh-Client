package mobin.shabanifar.naghmeh.features.poem.repository

import mobin.shabanifar.naghmeh.common.NetworkResult
import mobin.shabanifar.naghmeh.common.PaginatedResponse
import mobin.shabanifar.naghmeh.features.poem.model.PoemsOfCategoryRequest
import mobin.shabanifar.naghmeh.features.poem.model.PoemsOfCategoryResponse

interface PoemRepository {
    suspend fun getPoemsOfCategory(
        request: PoemsOfCategoryRequest
    ): NetworkResult<PaginatedResponse<PoemsOfCategoryResponse>>
}
