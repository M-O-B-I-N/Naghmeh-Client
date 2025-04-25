package mobin.shabanifar.naghmeh.features.poet.data.repository

import mobin.shabanifar.naghmeh.features.poet.data.api.PoetApi
import mobin.shabanifar.naghmeh.features.poet.data.model.Category
import mobin.shabanifar.naghmeh.features.poet.data.model.FamousPoet
import mobin.shabanifar.naghmeh.features.poet.data.model.PoetImageResponse
import mobin.shabanifar.naghmeh.features.poet.data.model.PoetWithBirthYear
import mobin.shabanifar.naghmeh.features.poet.data.model.PoetWithImagesResponse
import mobin.shabanifar.naghmeh.server.NetworkResult

class PoetRepositoryImpl(private val poetApi: PoetApi) : PoetRepository {
    override suspend fun getPoetsByCentury(century: Int): NetworkResult<List<PoetWithBirthYear?>> {
        return poetApi.getPoetsByCentury(century)
    }

    override suspend fun getWorksOfPoet(poetName: String): NetworkResult<List<Category>> {
        return poetApi.getWorksOfPoet(poetName)
    }

    override suspend fun getTop8FamousPoets(): NetworkResult<List<FamousPoet>> {
        return poetApi.getTop8FamousPoets()
    }

    override suspend fun getPoetWithImages(poetId: Int): NetworkResult<PoetWithImagesResponse> {
        return poetApi.getPoetWithImages(poetId)
    }

    override suspend fun getPoetImages(poetId: Int): NetworkResult<PoetImageResponse> {
        return poetApi.getPoetImages(poetId)
    }
}