package mobin.shabanifar.naghmeh

import org.koin.core.module.Module

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect fun httpEngineModule(): Module
