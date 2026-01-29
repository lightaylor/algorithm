package baekjoon.bronze.level1.test_11653.kotlin

fun main() {
    var n = readln().toInt()

    while (n > 1) {
        for (i in 2..n) {
            if (n % i == 0) {
                n /= i
                println(i)
                break;
            }
        }
    }
}
