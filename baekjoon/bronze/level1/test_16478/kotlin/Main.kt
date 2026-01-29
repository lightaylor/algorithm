package baekjoon.bronze.level1.test_16478.kotlin

fun main() {
    val arr = readln().split(" ").map { it.toDouble() }
    print(arr[0] * arr[2] / arr[1])
}
