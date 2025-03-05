package bronze.level1.test_17247.kotlin

import kotlin.math.abs

fun main() {
    val n = readln().split(" ")

    val target = Array(2) { IntArray(2) }
    var index = 0
    for (i in 1..n[0].toInt()) {
        val m = readln().split(" ")
        for (j in 1..n[1].toInt()) {
            if (m[j - 1].toInt() == 1) {
                target[index][0] = i
                target[index++][1] = j
            }
        }
    }

    print(abs(target[0][0] - target[1][0]) + abs(target[0][1] - target[1][1]))
}
