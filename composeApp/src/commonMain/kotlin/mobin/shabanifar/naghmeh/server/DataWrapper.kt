package mobin.shabanifar.naghmeh.server

import kotlinx.serialization.Serializable

@Serializable
data class DataWrapper<T>(
    val data: T
)