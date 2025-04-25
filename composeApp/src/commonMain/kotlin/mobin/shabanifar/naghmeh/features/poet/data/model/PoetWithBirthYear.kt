package mobin.shabanifar.naghmeh.features.poet.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PoetWithBirthYear(
    val id: Int,
    val name: String,
    val catId: Int?,
    val description: String?,
    val birthYear: Int?
)
