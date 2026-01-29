package baekjoon.bronze.level1.test_11005.kotlin

import java.util.*

fun main() {
    val n = readln().split(" ")
    print(Integer.toString(n[0].toInt(), n[1].toInt())
        .uppercase(Locale.getDefault()))
}
