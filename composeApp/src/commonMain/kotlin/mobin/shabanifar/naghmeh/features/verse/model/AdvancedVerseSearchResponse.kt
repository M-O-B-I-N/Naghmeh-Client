package mobin.shabanifar.naghmeh.features.verse.model

import kotlinx.serialization.Serializable

@Serializable
data class AdvancedVerseSearchResponse(
    val poetName: String?,
    val categoryName: String?,
    val poemTitle: String?,
    val matchedVerse: VerseWithContext
)
