package baekjoon.bronze.level1.test_28702.kotlin

fun main() {
    var check = 0
    var num = 0
    for (i in 0..2) {
        val text = readln()
        if (isNumeric(text)) {
            check = i
            num = text.toInt()
            break
        }
    }

    num += (3 - check)
    if (num % 15 == 0) {
        print("FizzBuzz")
    } else if (num % 3 == 0) {
        print("Fizz")
    } else if (num % 5 == 0) {
        print("Buzz")
    } else {
        print(num)
    }
}

fun isNumeric(text: String): Boolean {
    return try {
        text.toInt()
        true
    } catch (e: NumberFormatException) {
        false
    }
}
