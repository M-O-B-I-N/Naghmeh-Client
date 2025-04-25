package mobin.shabanifar.naghmeh.di

import mobin.shabanifar.naghmeh.ui.HomeViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    viewModelOf(::HomeViewModel)
}

