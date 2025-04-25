package mobin.shabanifar.naghmeh

import org.koin.core.module.Module
import org.koin.dsl.module

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()

actual fun httpEngineModule(): Module = module {

}