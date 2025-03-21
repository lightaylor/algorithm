package bronze.level2.test_2675.kotlin

fun main() {
    val n = readln().toInt()

    for (i in 1..n) {
        val arr = readln().split(" ")
        val r = arr[0].toInt()
        val s = arr[1]

        for (c in s.toCharArray()) {
            for (j in 1..r) print(c)
        }
        println()
    }
}
