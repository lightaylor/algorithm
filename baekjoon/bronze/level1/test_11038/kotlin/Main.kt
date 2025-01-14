package bronze.level1.test_11038.kotlin

import kotlin.math.abs

fun main() {
    var input = readln()

    while (input != "0 0 0") {
        val n = input.split(" ").map { it.toInt() - 1 }

        val arr = IntArray(n[0] + 1)
        for (i in 0..n[0]) {
            arr[i] = readln().toInt()
        }

        var max = 0
        var index = 0;
        for (i in n[1]..n[2]) {
            val abs = abs(arr[i] - arr[i + 1])

            if (max <= abs) {
                index = i + 1
                max = abs
            }
        }

        println(index)
        input = readln()
    }
}
