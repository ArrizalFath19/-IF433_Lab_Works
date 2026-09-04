package oop_141016_ArrizalFathinAthallah.week01

fun main(args: Array<String>) {
    // Variable definition
    val radius = 7.0
    val pi = 3.14


    var area = pi * radius * radius

    println("Radius: $radius , Area:  $area")

    println(checkSize(area))
}

fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"
}