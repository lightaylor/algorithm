package bronze.level2.test_1159.kotlin

import java.util.*

fun main() {
    val n = readln().toInt()

    val map = TreeMap<Char, Int>()
    for (i in 1..n) {
        val word = readln().first()
        map[word] = map.getOrDefault(word, 0) + 1
    }

    val answer = StringBuilder()
    for (word in map.keys) {
        if (map[word]!! >= 5) {
            answer.append(word)
        }
    }

    print(answer.ifEmpty { "PREDAJA" })
}
