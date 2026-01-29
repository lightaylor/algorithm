package baekjoon.bronze.level1.test_2693.kotlin

fun main() {
    val n = readln().toInt()

    for (i in 1..n) {
        var arr = readln().split(" ").map { it.toInt() }.sorted()
        println(arr[7])
    }
}
