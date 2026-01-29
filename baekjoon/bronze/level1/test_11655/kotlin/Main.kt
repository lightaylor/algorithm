package baekjoon.bronze.level1.test_11655.kotlin

fun main() {
    val n = readln().toCharArray()

    val sb = StringBuilder()
    for (c in n) {
        var word = c
        if (c.code in 65..90) {
            word = if (c.code + 13 > 90) word - 13 else word + 13
        } else if (c.code in 97..122) {
            word = if (c.code + 13 > 122) word - 13 else word + 13
        }
        sb.append(word)
    }
    print(sb)
}
