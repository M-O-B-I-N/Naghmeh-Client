package mobin.shabanifar.naghmeh.features.favorite.data.di

import mobin.shabanifar.naghmeh.features.favorite.data.api.FavoriteApi
import mobin.shabanifar.naghmeh.features.favorite.data.api.FavoriteApiImpl
import mobin.shabanifar.naghmeh.features.favorite.data.repository.FavoriteRepository
import mobin.shabanifar.naghmeh.features.favorite.data.repository.FavoriteRepositoryImpl
import org.koin.dsl.module

val favoriteModule = module {
    single<FavoriteApi> { FavoriteApiImpl(get(), get()) }
    single<FavoriteRepository> { FavoriteRepositoryImpl(get()) }
}
