package baekjoon.bronze.level1.test_1259.kotlin

fun main() {
    var input = readln()

    while (input != "0") {
        val arr = input.toCharArray()

        var answer = "yes"
        for (i in 0 until arr.size / 2) {
            if (arr[i] != arr[arr.size - i - 1]) {
                answer = "no"
                break
            }
        }

        println(answer)
        input = readln()
    }
}
