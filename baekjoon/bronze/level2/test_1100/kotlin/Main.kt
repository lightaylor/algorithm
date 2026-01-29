package baekjoon.bronze.level2.test_1100.kotlin

fun main() {
    val arr = Array(8) { CharArray(8) }
    var count = 0

    for (i in 0..7) {
        arr[i] = readln().toCharArray()

        for (j in 0..7) {
            if (arr[i][j] != 'F') {
                continue
            }

            if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
                count++
            }
        }
    }

    print(count)
}
