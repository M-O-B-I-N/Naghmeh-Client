package mobin.shabanifar.naghmeh.server

sealed class NetworkResult<out T> {
    data class Success<T>(val data: T) : NetworkResult<T>()
    data class Error(
        val exception: Throwable,
        val errorMessage: String? = null
    ) : NetworkResult<Nothing>()

    data object Loading : NetworkResult<Nothing>()
}
