package mobin.shabanifar.naghmeh.features.verse.model

import kotlinx.serialization.Serializable

@Serializable
data class AdvancedVerseSearchRequest(
    val verseText: String,
    val poetName: String? = null,
    val categoryName: String? = null,
    val excludePoetName: String? = null,
    val page: Int = 1,
    val pageSize: Int = 10
)
