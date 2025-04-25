package mobin.shabanifar.naghmeh.features.poet.data.di

import mobin.shabanifar.naghmeh.features.poet.data.api.PoetApi
import mobin.shabanifar.naghmeh.features.poet.data.api.PoetApiImpl
import mobin.shabanifar.naghmeh.features.poet.data.repository.PoetRepository
import mobin.shabanifar.naghmeh.features.poet.data.repository.PoetRepositoryImpl
import org.koin.dsl.module

val poetModule = module {
    single<PoetApi> { PoetApiImpl(get(), get()) }
    single<PoetRepository> { PoetRepositoryImpl(get()) }
}
