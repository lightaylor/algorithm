package baekjoon.bronze.level2.test_1978.kotlin

fun main() {
    val n = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }

    var answer = 0;
    for (i in 0..<n) {
        val num = arr[i]
        var count = 0;

        for (j in 2..num) {
            if (num % j == 0) {
                count++
            }
        }

        if (count == 1) {
            answer++
        }
    }
    print(answer)
}
