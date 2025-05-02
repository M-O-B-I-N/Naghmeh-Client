package mobin.shabanifar.naghmeh.features.favorite.data.api

import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType
import mobin.shabanifar.naghmeh.common.RequestHandler
import mobin.shabanifar.naghmeh.features.favorite.data.model.SaveFavoritePoemRequest

class FavoriteApiImpl(
    private val requestHandler: RequestHandler,
    private val baseUrl: String
) : FavoriteApi {
    override suspend fun saveFavoritePoem(request: SaveFavoritePoemRequest) {
        requestHandler.executeRequest<Unit> {
            post("$baseUrl/favorite/saveFavoritePoem") {
                contentType(ContentType.Application.Json)
                setBody("""{"poemId": ${request.poemId}}""")
            }
        }
    }
}
