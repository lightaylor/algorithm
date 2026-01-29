package baekjoon.bronze.level1.test_1037.kotlin

fun main() {
    val n = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }.sorted()

    print(arr.first() * arr.last())
}
