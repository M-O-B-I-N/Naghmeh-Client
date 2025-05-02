package mobin.shabanifar.naghmeh.features.favorite.data.repository

import mobin.shabanifar.naghmeh.features.favorite.data.model.SaveFavoritePoemRequest

interface FavoriteRepository {
    suspend fun saveFavoritePoem(request: SaveFavoritePoemRequest)
}
