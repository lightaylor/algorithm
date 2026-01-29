package baekjoon.bronze.level1.test_1546.kotlin

fun main() {
    val n = readln().toInt()
    var scores = readln().split(" ").map { it.toDouble() }

    scores = scores.sorted()
    var sum = 0.0
    for (i in 0..<n) {
        sum += scores[i] / scores[n - 1] * 100
    }

    print(sum / scores.size)
}
