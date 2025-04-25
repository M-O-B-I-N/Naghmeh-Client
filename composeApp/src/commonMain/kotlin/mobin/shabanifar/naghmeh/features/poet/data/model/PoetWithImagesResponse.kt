package mobin.shabanifar.naghmeh.features.poet.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PoetWithImagesResponse(
    val poetId: Int,
    val poetName: String,
    val description: String?,
    val images: List<String>
)