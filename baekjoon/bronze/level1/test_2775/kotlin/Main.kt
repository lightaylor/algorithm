package baekjoon.bronze.level1.test_2775.kotlin

fun main() {
    val tc = readln().toInt()

    val apt = Array(15) { IntArray(15) }
    for (a in 0..14) {
        for (b in 1..14) {
            if (a == 0) {
                apt[a][b] = b + apt[a][b - 1]
            } else {
                apt[a][b] = apt[a - 1][b] + if (b > 1) apt[a][b - 1] else 0
            }
        }
    }

    for (i in 1..tc) {
        val a = readln().toInt()
        val b = readln().toInt()
        println(apt[a - 1][b])
    }
}
