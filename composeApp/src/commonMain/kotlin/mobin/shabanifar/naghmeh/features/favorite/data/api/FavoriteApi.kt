package mobin.shabanifar.naghmeh.features.favorite.data.api

import mobin.shabanifar.naghmeh.features.favorite.data.model.SaveFavoritePoemRequest

interface FavoriteApi {
    suspend fun saveFavoritePoem(request: SaveFavoritePoemRequest)
}
