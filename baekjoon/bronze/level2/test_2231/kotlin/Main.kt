package bronze.level2.test_2231.kotlin

fun main() {
    val n = readln().toInt()
    var value = 1

    while (value < n) {
        val sumOfDigits = value.toString().sumOf { it.digitToInt() }
        if (sumOfDigits + value == n) {
            print(value)
            return
        }
        value++
    }

    print(0)
}
