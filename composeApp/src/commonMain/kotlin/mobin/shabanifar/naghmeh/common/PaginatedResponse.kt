package mobin.shabanifar.naghmeh.common

import kotlinx.serialization.Serializable

@Serializable
data class PaginatedResponse<T>(
    val results: List<T>,
    val totalCount: Long
)
