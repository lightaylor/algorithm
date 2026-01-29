package baekjoon.bronze.level1.test_24416.kotlin

fun main() {
    val n = readln().toInt()
    print(fib(n).toString() + " " + fibonacci(n).toString())
}

fun fib(n: Int): Int {
    return if (n == 1 || n == 2) 1
    else (fib(n - 1) + fib(n - 2));
}

fun fibonacci(n: Int): Int {
    return n - 2
}
