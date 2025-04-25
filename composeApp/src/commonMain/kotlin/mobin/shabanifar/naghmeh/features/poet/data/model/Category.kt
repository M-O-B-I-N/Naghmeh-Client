package mobin.shabanifar.naghmeh.features.poet.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Category(
    val text: String?,
    val url: String?
)
