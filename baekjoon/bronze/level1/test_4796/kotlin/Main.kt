package baekjoon.bronze.level1.test_4796.kotlin

fun main() {

    var index = 1
    while (true) {
        val input = readln().split(" ").map { it.toInt() }
        val l = input[0]
        val p = input[1]
        val v = input[2]

        if (l == 0 && p == 0 && v == 0) {
            break
        }

        val answer = v / p * l + (v % p).coerceAtMost(l)
        println("Case ${index++}: $answer")
    }
}
