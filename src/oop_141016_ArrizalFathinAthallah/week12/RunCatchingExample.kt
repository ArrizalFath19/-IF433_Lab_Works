package oop_141016_ArrizalFathinAthallah.week12

fun mani() {
    println("=== TEST RUNCATHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    val safeValue = result.getOrElse {-1}
    println("Safe Value (getOrElse): $safeValue")

    val recovered = result.recover {0}.getOrNull()
    println("Recovered Value: &$recovered")
}

