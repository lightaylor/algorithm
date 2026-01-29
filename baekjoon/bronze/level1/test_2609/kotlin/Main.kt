package baekjoon.bronze.level1.test_2609.kotlin

fun main() {
    val n = readln().split(" ").map { it.toInt() }

    println(gcd(n[0], n[1]))
    print(lcm(n[0], n[1]))
}

fun lcm(a: Int, b: Int): Int {
    return a * b / gcd(a, b)
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}
