package mobin.shabanifar.naghmeh.features.favorite.data.repository

import mobin.shabanifar.naghmeh.features.favorite.data.api.FavoriteApi
import mobin.shabanifar.naghmeh.features.favorite.data.model.SaveFavoritePoemRequest

class FavoriteRepositoryImpl(val api: FavoriteApi) : FavoriteRepository {
    override suspend fun saveFavoritePoem(request: SaveFavoritePoemRequest) {
        api.saveFavoritePoem(request)
    }
}
