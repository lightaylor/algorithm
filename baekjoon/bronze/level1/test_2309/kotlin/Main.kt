package baekjoon.bronze.level1.test_2309.kotlin

fun main() {
    val arr = IntArray(9)
    var sum = 0

    for (i in 0..8) {
        val value = readln().toInt()
        arr[i] = value
        sum += value
    }
    arr.sort()

    var left = 0
    var right = 8
    while (sum - 100 != arr[left] + arr[right]) {
        if (sum - 100 > arr[left] + arr[right]) {
            left++
        } else {
            right--
        }
    }

    for (i in 0..8) {
        if (i != left && i != right) {
            println(arr[i])
        }
    }
}
