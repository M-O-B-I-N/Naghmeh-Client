package mobin.shabanifar.naghmeh.features.verse.model

import kotlinx.serialization.Serializable

@Serializable
data class RandomVerse(
    val verses: List<String>,
    val poemId: Int,
    val poemTitle: String,
    val poetName: String,
    val poetId: Int
)
