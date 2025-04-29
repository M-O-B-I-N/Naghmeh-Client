package mobin.shabanifar.naghmeh.features.verse.model

import kotlinx.serialization.Serializable

@Serializable
data class VerseOfPoem(
    val poemId: Int,
    val vorder: Int,
    val position: Int,
    val text: String?
)
