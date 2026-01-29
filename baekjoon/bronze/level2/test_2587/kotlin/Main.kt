package baekjoon.bronze.level2.test_2587.kotlin

fun main() {
    val arr = arrayListOf<Int>()
    var sum = 0;
    for (i in 1..5) {
        val num = readln().toInt()
        arr.add(num)
        sum += num
    }
    arr.sort()

    println(sum / 5)
    print(arr[2])
}
