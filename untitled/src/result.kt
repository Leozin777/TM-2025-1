sealed class result {
    data class Success(val data: String) : result()
    data class Failure(val message: String) : result()
}