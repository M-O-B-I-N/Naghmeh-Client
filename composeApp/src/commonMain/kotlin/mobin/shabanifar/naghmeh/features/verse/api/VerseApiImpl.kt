package mobin.shabanifar.naghmeh.features.verse.api

import io.ktor.client.request.get
import io.ktor.client.request.parameter
import mobin.shabanifar.naghmeh.common.NetworkResult
import mobin.shabanifar.naghmeh.common.PaginatedResponse
import mobin.shabanifar.naghmeh.common.RequestHandler
import mobin.shabanifar.naghmeh.features.verse.model.AdvancedVerseSearchRequest
import mobin.shabanifar.naghmeh.features.verse.model.AdvancedVerseSearchResponse
import mobin.shabanifar.naghmeh.features.verse.model.RandomVerse
import mobin.shabanifar.naghmeh.features.verse.model.VerseOfPoem

class VerseApiImpl(
    private val requestHandler: RequestHandler,
    private val baseUrl: String
) : VerseApi {

    override suspend fun advancedVerseSearch(
        request: AdvancedVerseSearchRequest
    ): NetworkResult<PaginatedResponse<AdvancedVerseSearchResponse>> {
        return requestHandler.executeRequest {
            get("$baseUrl/verse/advancedVerseSearch") {
                parameter("verseText", request.verseText)
                parameter("poetName", request.poetName)
                parameter("categoryName", request.categoryName)
                parameter("excludePoetName", request.excludePoetName)
                parameter("page", request.page)
                parameter("pageSize", request.pageSize)
            }
        }
    }

    override suspend fun getRandomVerse(): NetworkResult<RandomVerse> {
        return requestHandler.executeRequest {
            get("$baseUrl/verse/getRandomVerse")
        }
    }

    override suspend fun getVersesOfPoem(poetName: String, categoryName: String, poemTitle: String): NetworkResult<List<VerseOfPoem>> {
        return requestHandler.executeRequest {
            get("$baseUrl/verse/getVersesOfPoem") {
                parameter("poetName", poetName)
                parameter("categoryName", categoryName)
                parameter("poemTitle", poemTitle)
            }
        }
    }
}
