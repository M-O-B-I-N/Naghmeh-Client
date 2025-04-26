package mobin.shabanifar.naghmeh.features.poem.model

data class PoemsOfCategoryRequest (
    val poetName: String,
    val categoryName: String,
    val page: Int,
    val pageSize: Int
)