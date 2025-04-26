package mobin.shabanifar.naghmeh.features.poem.di

import mobin.shabanifar.naghmeh.features.poem.api.PoemApi
import mobin.shabanifar.naghmeh.features.poem.api.PoemApiImpl
import mobin.shabanifar.naghmeh.features.poem.repository.PoemRepository
import mobin.shabanifar.naghmeh.features.poem.repository.PoemRepositoryImpl
import org.koin.dsl.module


val poemModule = module {
    single<PoemApi> { PoemApiImpl(get(), get()) }
    single<PoemRepository> { PoemRepositoryImpl(get()) }
}