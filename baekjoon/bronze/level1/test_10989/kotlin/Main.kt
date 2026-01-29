package baekjoon.bronze.level1.test_10989.kotlin

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val maxValue = 10000
    val count = IntArray(maxValue + 1)

    repeat(n) {
        val num = reader.readLine().toInt()
        count[num]++
    }

    for (i in 1..maxValue) {
        repeat(count[i]) {
            writer.write("$i\n")
        }
    }

    writer.close()
    reader.close()
}
