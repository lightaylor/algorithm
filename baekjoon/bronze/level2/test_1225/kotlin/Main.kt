package bronze.level2.test_1225.kotlin

fun main() {
    val (a, b) = readln().split(" ")

    var sum: Long = 0;
    for (i in a) {
        for (j in b) {
            sum += i.digitToInt().toLong() * j.digitToInt().toLong()
        }
    }

    print(sum)
}
