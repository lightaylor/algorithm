package baekjoon.bronze.level1.test_1934.kotlin

fun main() {
    val n = readln().toInt()

    for (i in 0 until n) {
        val num = readln().split(" ").map { it.toInt() }
        val lcm = lcm(num[0], num[1])
        println(lcm)
    }
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun lcm(a: Int, b: Int): Int {
    return a / gcd(a, b) * b
}
