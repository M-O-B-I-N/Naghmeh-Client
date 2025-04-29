package mobin.shabanifar.naghmeh.features.verse.repository

import mobin.shabanifar.naghmeh.common.NetworkResult
import mobin.shabanifar.naghmeh.common.PaginatedResponse
import mobin.shabanifar.naghmeh.features.verse.api.VerseApi
import mobin.shabanifar.naghmeh.features.verse.model.AdvancedVerseSearchRequest
import mobin.shabanifar.naghmeh.features.verse.model.AdvancedVerseSearchResponse
import mobin.shabanifar.naghmeh.features.verse.model.RandomVerse
import mobin.shabanifar.naghmeh.features.verse.model.VerseOfPoem

class VerseRepositoryImpl(val api: VerseApi) : VerseRepository {
    override suspend fun advancedVerseSearch(
        request: AdvancedVerseSearchRequest
    ): NetworkResult<PaginatedResponse<AdvancedVerseSearchResponse>> {
        return api.advancedVerseSearch(request)
    }

    override suspend fun getRandomVerse(): NetworkResult<RandomVerse> {
        return api.getRandomVerse()
    }

    override suspend fun getVersesOfPoem(
        poetName: String,
        categoryName: String,
        poemTitle: String
    ): NetworkResult<List<VerseOfPoem>> {
        return api.getVersesOfPoem(
            poetName = poetName,
            categoryName = categoryName,
            poemTitle = poemTitle
        )
    }
}
