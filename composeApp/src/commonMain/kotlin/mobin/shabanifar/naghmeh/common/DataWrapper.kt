package mobin.shabanifar.naghmeh.common

import kotlinx.serialization.Serializable

@Serializable
data class DataWrapper<T>(
    val data: T
)
