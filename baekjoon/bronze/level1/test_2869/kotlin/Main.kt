package bronze.level1.test_2869.kotlin

import kotlin.math.ceil

fun main() {
    val input = readln().split(" ").map { it.toDouble() }
    val a = input[0]
    val b = input[1]
    val v = input[2]

    val answer = ceil((v - a) / (a - b)) + 1
    print(answer.toInt())
}
