package baekjoon.bronze.level1.test_9093.kotlin

fun main() {
    val n = readln().toInt()

    for (i in 1..n) {
        val str = readln().split(" ")
        val sb = StringBuilder()
        for (s in str) {
            sb.append(s.reversed() + " ")
        }
        println(sb.toString().trim())
    }
}
