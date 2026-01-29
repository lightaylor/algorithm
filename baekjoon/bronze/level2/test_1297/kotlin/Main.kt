package baekjoon.bronze.level2.test_1297.kotlin

import kotlin.math.sqrt

fun main() {
    val arr = readln().split(" ")
    val d = arr[0].toInt()
    val h = arr[1].toInt()
    val w = arr[2].toInt()

    val k = d / sqrt((h * h + w * w).toDouble())
    print("${(k * h).toInt()} ${(k * w).toInt()}")
}
