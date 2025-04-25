package mobin.shabanifar.naghmeh.features.poet.data.model

import kotlinx.serialization.Serializable

@Serializable
data class FamousPoet(
    val id: Int,
    val name: String?,
    val description: String?
)