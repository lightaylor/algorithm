package bronze.level2.test_1009.kotlin

fun main() {
    val remain = arrayOf(
        arrayOf(1, 1, 1, 1),
        arrayOf(2, 4, 8, 6),
        arrayOf(3, 9, 7, 1),
        arrayOf(4, 6, 4, 6),
        arrayOf(5, 5, 5, 5),
        arrayOf(6, 6, 6, 6),
        arrayOf(7, 9, 3, 1),
        arrayOf(8, 4, 2, 6),
        arrayOf(9, 1, 9, 1),
        arrayOf(10)
    )

    val t = readln().toInt()
    for (i in 1..t) {
        var (a, b) = readln().split(" ").map { it.toInt() }
        a = if (a % 10 == 0) 9 else (a % 10) - 1
        b = (b - 1) % remain[a].size
        println(remain[a][b])
    }
}
