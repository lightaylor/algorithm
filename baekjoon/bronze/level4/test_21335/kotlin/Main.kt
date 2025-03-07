package bronze.level4.test_21335.kotlin

import kotlin.math.PI

fun main() {
    val n = readln().toDouble()
    val answer = 2 * PI * Math.sqrt(n / PI)
    print(String.format("%.9f", answer))
}
