package mobin.shabanifar.naghmeh.features.poet.data.api

import mobin.shabanifar.naghmeh.features.poet.data.model.Category
import mobin.shabanifar.naghmeh.features.poet.data.model.FamousPoet
import mobin.shabanifar.naghmeh.features.poet.data.model.PoetImageResponse
import mobin.shabanifar.naghmeh.features.poet.data.model.PoetWithBirthYear
import mobin.shabanifar.naghmeh.features.poet.data.model.PoetWithImagesResponse
import mobin.shabanifar.naghmeh.server.NetworkResult

interface PoetApi {
    suspend fun getPoetsByCentury(century: Int): NetworkResult<List<PoetWithBirthYear?>>
    suspend fun getWorksOfPoet(poetName: String): NetworkResult<List<Category>>
    suspend fun getTop8FamousPoets(): NetworkResult<List<FamousPoet>>
    suspend fun getPoetWithImages(poetId: Int): NetworkResult<PoetWithImagesResponse>
    suspend fun getPoetImages(poetId: Int): NetworkResult<PoetImageResponse>
}
