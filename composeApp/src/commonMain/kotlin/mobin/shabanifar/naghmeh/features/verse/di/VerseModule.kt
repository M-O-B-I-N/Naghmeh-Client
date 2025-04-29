package mobin.shabanifar.naghmeh.features.verse.di

import mobin.shabanifar.naghmeh.features.verse.api.VerseApi
import mobin.shabanifar.naghmeh.features.verse.api.VerseApiImpl
import mobin.shabanifar.naghmeh.features.verse.repository.VerseRepository
import mobin.shabanifar.naghmeh.features.verse.repository.VerseRepositoryImpl
import org.koin.dsl.module

val verseModule = module {
    single<VerseApi> { VerseApiImpl(get(), get()) }
    single<VerseRepository> { VerseRepositoryImpl(get()) }
}
