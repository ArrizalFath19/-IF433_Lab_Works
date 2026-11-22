package oop_141016_ArrizalFathinAthallah.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)
