package oop_141016_ArrizalFathinAthallah.week12

fun mani() {
    println("=== TEST RUNCATHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}