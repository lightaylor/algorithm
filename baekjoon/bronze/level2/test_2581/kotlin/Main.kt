package bronze.level2.test_2581.kotlin

import kotlin.math.sqrt

fun main() {
    val m = readln().toInt()
    val n = readln().toInt()

    var sum = 0
    var min = 0
    for (i in m..n) {
        if (isPrime(i)) {
            sum += i
            if (min == 0) min = i
        }
    }

    if (min > 0) {
        println(sum)
        print(min)
    } else print(-1)
}

fun isPrime(n: Int): Boolean {
    if (n < 2) return false

    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}
