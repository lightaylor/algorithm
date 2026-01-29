package baekjoon.bronze.level2.test_2577.kotlin

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val sum = (a * b * c).toString()
    val arr = IntArray(10)
    for (c in sum.toCharArray()) {
        arr[c.digitToInt()]++
    }

    for (i in 0..9) println(arr[i])
}
