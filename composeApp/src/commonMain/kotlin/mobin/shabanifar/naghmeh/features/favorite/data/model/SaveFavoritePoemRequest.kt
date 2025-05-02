package mobin.shabanifar.naghmeh.features.favorite.data.model

import kotlinx.serialization.Serializable

@Serializable
data class SaveFavoritePoemRequest(
    val poemId: Int
)
