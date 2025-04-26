package mobin.shabanifar.naghmeh.features.poem.model

import kotlinx.serialization.Serializable

@Serializable
data class PoemsOfCategoryResponse(
    val id: Int,
    val title: String?,
    val url: String?
)
