package baekjoon.bronze.level2.test_1919.kotlin

import kotlin.math.abs

fun main() {
    val a = readln().toCharArray()
    val b = readln().toCharArray()

    val alphabetA = Array(26) { 0 }
    val alphabetB = Array(26) { 0 }
    for (i in a) {
        alphabetA[i - 'a'] += 1
    }

    for (i in b) {
        alphabetB[i - 'a'] += 1
    }

    var count = 0
    for (i in 0..25) {
        count += abs(alphabetA[i] - alphabetB[i])
    }

    print(count)
}
