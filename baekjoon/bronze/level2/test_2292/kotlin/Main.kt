package baekjoon.bronze.level2.test_2292.kotlin

fun main() {
    val n = readln().toInt()

    var m = 1
    var count = 1
    while (m < n) {
        m += (6 * count)
        count++
    }

    print(count)
}
