package mobin.shabanifar.naghmeh.features.verse.repository

import mobin.shabanifar.naghmeh.common.NetworkResult
import mobin.shabanifar.naghmeh.common.PaginatedResponse
import mobin.shabanifar.naghmeh.features.verse.model.AdvancedVerseSearchRequest
import mobin.shabanifar.naghmeh.features.verse.model.AdvancedVerseSearchResponse
import mobin.shabanifar.naghmeh.features.verse.model.RandomVerse
import mobin.shabanifar.naghmeh.features.verse.model.VerseOfPoem

interface VerseRepository {
    suspend fun advancedVerseSearch(
        request: AdvancedVerseSearchRequest
    ): NetworkResult<PaginatedResponse<AdvancedVerseSearchResponse>>

    suspend fun getRandomVerse(): NetworkResult<RandomVerse>

    suspend fun getVersesOfPoem(
        poetName: String,
        categoryName: String,
        poemTitle: String
    ): NetworkResult<List<VerseOfPoem>>
}
