package baekjoon.bronze.level1.test_1357.kotlin

fun main() {
    val arr = readln().split(" ")
    val a = StringBuilder(arr[0]).reverse().toString().toInt()
    val b = StringBuilder(arr[1]).reverse().toString().toInt()

    val sum = a + b
    print(StringBuilder(sum.toString()).reverse().toString().toInt())
}
