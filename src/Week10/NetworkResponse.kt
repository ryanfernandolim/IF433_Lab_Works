package Week10

data class ApiResponse<T>(val status: String, val data: T)