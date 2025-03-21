package bronze.level2.test_2711.kotlin

fun main() {
    val n = readln().toInt()

    for (i in 1..n) {
        val arr = readln().split(" ")

        for (c in 0..<arr[1].length) {
            if (c != arr[0].toInt() - 1) print(arr[1][c])
        }
        println()
    }
}
