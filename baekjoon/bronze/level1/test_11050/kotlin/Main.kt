package baekjoon.bronze.level1.test_11050.kotlin

fun main() {
    val arr = readln().split(" ").map { it.toInt() }
    print(factory(arr[0]) / (factory(arr[0] - arr[1]) * factory(arr[1])))
}

fun factory(n: Int): Int {
    var sum = 1

    for (i in 2..n) {
        sum *= i
    }
    return sum
}
