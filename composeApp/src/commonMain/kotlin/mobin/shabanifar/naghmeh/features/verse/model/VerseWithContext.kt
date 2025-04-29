package mobin.shabanifar.naghmeh.features.verse.model

import kotlinx.serialization.Serializable

@Serializable
data class VerseWithContext(
    val previousVerse: String?,
    val matchedVerse: String?,
    val nextVerse: String?
)
